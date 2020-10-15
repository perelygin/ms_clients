package ptv.services.ms_clients.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ptv.services.ms_clients.entity.Clients;
import ptv.services.ms_clients.entity.Passports;

import java.util.List;

public interface PassportsRepository extends JpaRepository<Passports,Integer> {
    List<Passports> findByPassportnumber(String passportNumber);

}
