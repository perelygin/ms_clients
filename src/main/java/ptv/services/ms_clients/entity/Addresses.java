package ptv.services.ms_clients.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Addresses {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer idaddress;
    private String Address;
    //    private Integer idclient;

    public Addresses() {
    }

    public Addresses(String address) {
        Address = address;
    }


    public Integer getIdaddress() {
        return idaddress;
    }

    public void setIdaddress(Integer idaddress) {
        this.idaddress = idaddress;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    @Override
    public String toString() {
        return "\nAddresses{" +
                "idaddress=" + idaddress +
                ", Addresses='" + Address + '\'' +
                '}';
    }
}
