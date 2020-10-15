package ptv.services.ms_clients.entity;

import javax.persistence.*;
import java.util.Arrays;
import java.util.List;

@Entity
public class Clients {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private  Integer idclient;

    private  String family;
    private  String name;
    private  String Comments;

    private  Integer Idclienttype;

    @OneToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JoinColumn(name ="idclient")
    private List<Passports> passports;


    @OneToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JoinColumn(name ="idclient")
    private List<Addresses> addresses;


    public Clients() {
    }

    public Clients(String family, String name, String comments, Integer idclienttype) {
        this.family = family;
        this.name = name;
        Comments = comments;
        Idclienttype = idclienttype;
    }

    @Override
    public String toString() {
        return "\nClients{" +
                "idClient=" + idclient +
                ", family='" + family + '\'' +
                ", name='" + name + '\'' +
                ", Comments='" + Comments + '\'' +
                ", idClientType=" + Idclienttype +
                " "+passports.toString()+
                '}';
    }
     public Integer getIdclienttype() {
        return Idclienttype;
    }

    public void setIdclienttype(Integer idclienttype) {
        Idclienttype = idclienttype;
    }
    public List<Passports> getPassports() {
        return passports;
    }

    public void setPassports(List<Passports> passports) {
        this.passports = passports;
    }
    public void setPassports(String passports) {
        Passports psp = new Passports(passports);
        List<Passports> psps = Arrays.asList(psp);
        this.passports = psps;

    }

    public List<Addresses> getAddresses() {
        return addresses;
    }
    public Integer getIdClient() {
        return idclient;
    }

    public void setIdClient(Integer idClient) {
        this.idclient = idClient;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getComments() {
        return Comments;
    }

    public void setComments(String comments) {
        Comments = comments;
    }

    public void setAddresses(List<Addresses> addresses) {
        this.addresses = addresses;
    }
}
