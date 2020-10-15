package ptv.services.ms_clients;

import org.hibernate.cache.spi.access.CachedDomainDataAccess;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ptv.services.ms_clients.entity.Addresses;
import ptv.services.ms_clients.entity.Clients;
import ptv.services.ms_clients.repository.ClientsRepository;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class MsClientsApplication  {   ///implements CommandLineRunner


    public static void main(String[] args) {
       SpringApplication.run(MsClientsApplication.class, args);
    }

//    @Autowired
//    ClientsRepository clientsRepository;
//    @Override
//    public void run(String... args) throws Exception {
//        Clients newClient =  new Clients("Хоучкин","Кирил","xxx",1);
//        Clients newClient1 =  new Clients("Ронкинян","Возген","xcx",1);
////        /        clientsRepository.saveAll(clients);
//        Addresses newAdr1 = new Addresses("Москва. Кремль");
//        Addresses newAdr2 = new Addresses("Пермь. Областная Администрация зырянского уезда");
//        List<Addresses> addresses = Arrays.asList(newAdr1,newAdr2);
//        Clients newClient2 =  new Clients("Перельсон","Мурад","xxx",1);
//        newClient2.setAddresses(addresses);
//        List<Clients> clients = Arrays.asList(newClient,newClient1,newClient2);
//
//        clientsRepository.saveAll(clients);
//
//
//        System.out.println(clientsRepository.findAll());
//    }
}
