package ptv.services.ms_clients.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ptv.services.ms_clients.entity.Clients;
import ptv.services.ms_clients.entity.Passports;

import java.util.List;

public interface ClientsRepository extends JpaRepository<Clients,Integer> {
    List<Clients> findAll();
    List<Clients> findByFamily(String lastname);
    List<Clients> findByPassports(Passports passports);
}
