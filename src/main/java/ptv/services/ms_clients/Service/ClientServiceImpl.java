package ptv.services.ms_clients.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import ptv.services.ms_clients.entity.Addresses;
import ptv.services.ms_clients.entity.Clients;
import ptv.services.ms_clients.entity.Passports;
import ptv.services.ms_clients.repository.ClientsRepository;
import ptv.services.ms_clients.repository.PassportsRepository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ClientServiceImpl implements ClientService{
    @Autowired
    ClientsRepository clientsRepository;

    @Autowired
    PassportsRepository passportsRepository;

    @Override
    public void create(Clients client) {
        Addresses newAdr1 = new Addresses("Москва. Кремль. Дворец сьездов");
        Addresses newAdr2 = new Addresses("Пермь. Областная Администрация мценского уезда");
        List<Addresses> addresses = Arrays.asList(newAdr1,newAdr2);
////        Clients newClient =  new Clients("Рестфулов","Кизил","xxx",1);
////        newClient.setAddresses(addresses);
        client.setAddresses(addresses);
        List<Clients> clients = Arrays.asList(client);
        System.out.println(client);

        clientsRepository.saveAll(clients);
    }

    @Override
    public List<Clients> readAll() {
        return clientsRepository.findAll();
    }

    @Override
    public List<Clients> readByName(String lastname) {
        System.out.println("lastName "+ lastname);
        List<Clients> clients = clientsRepository.findByFamily(lastname);
        return clients;
    }


    @Override
    public List<Clients> getClientsByPassport(String passport) {
//        System.out.println("passport "+ passport);
        ArrayList<Clients> All_clients = new ArrayList<>();
        List<Passports> passp = passportsRepository.findByPassportnumber(passport);
        for (Passports psp:passp) {
//            System.out.println("passport "+ psp);
            List<Clients> clients = clientsRepository.findByPassports(psp);
            if(clients.size()>0){
                All_clients.add(clients.get(0));
            }
        }
        return All_clients;
    }
}
