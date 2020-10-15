package ptv.services.ms_clients.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Passports {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer idpassports;
    private String passportnumber;

    public Passports() {
    }

    public Passports(String passportnumber) {
        this.passportnumber = passportnumber;
    }



    public String getPassportnumber() {
        return passportnumber;
    }

    public void setPassportnumber(String passportnumber) {
        this.passportnumber = passportnumber;
    }

    @Override
    public String toString() {
        return "Passports{" +
                "idpassports=" + idpassports +
                ", passportnumber='" + passportnumber + '\'' +
                '}';
    }
}
