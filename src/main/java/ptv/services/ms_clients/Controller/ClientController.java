package ptv.services.ms_clients.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ptv.services.ms_clients.Service.ClientService;
import ptv.services.ms_clients.entity.Clients;
import ptv.services.ms_clients.repository.PassportsRepository;

import java.util.List;
import java.util.Map;

@RestController
public class ClientController {
    private final ClientService clientService;


    @Autowired
    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    @PostMapping(value = "/clients")
    public ResponseEntity<?> create(@RequestBody Clients client) {
        clientService.create(client);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping(value = "/clients") //теперь мы обрабатываем GET запросы.
    public ResponseEntity<List<Clients>> read() {
        final List<Clients> clients = clientService.readAll();

        return clients != null &&  !clients.isEmpty()
                ? new ResponseEntity<>(clients, HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @GetMapping(value = "/clients/{lastname}")
    /*Данный метод будет принимать запросы на uri вида /clients/{name}, где вместо {name}
    может быть любое строковое значение.
    Данное значение, впоследствии, передается переменной int id — параметру метода.*/
    public ResponseEntity<List<Clients>> readByName(@PathVariable(value = "lastname") String  name) {
//        System.out.println("dcdcdcd "+name);
        final List<Clients> clients = clientService.readByName(name);

        return clients != null &&  !clients.isEmpty()
                ? new ResponseEntity<>(clients, HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @GetMapping(value = "/clients/passports/{passport}")
    /*Данный метод будет принимать запросы на uri вида /clients/passports/{passport}, где вместо {passport}
    может быть любое строковое значение.
    Данное значение, впоследствии, передается переменной int id — параметру метода.*/
    public ResponseEntity<List<Clients>> getClientsByPassport(@PathVariable(value = "passport") String  passportNumber) {

//        System.out.println("dcdcdcd "+name);

        final List<Clients> clients = clientService.getClientsByPassport(passportNumber);

        return clients != null &&  !clients.isEmpty()
                ? new ResponseEntity<>(clients, HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}
