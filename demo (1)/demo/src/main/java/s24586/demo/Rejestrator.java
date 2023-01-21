package s24586.demo;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Component
public class Rejestrator {

    List<Klient> Zarejestrowani = new ArrayList<>();


    public Rejestrator(){
        Zarejestrowani.add(new Klient("1","Maciej"));
        Zarejestrowani.add(new Klient("2","Kuba"));
        Zarejestrowani.add(new Klient("3","Magda"));
        Zarejestrowani.add(new Klient("4","Dawid"));
        Zarejestrowani.add(new Klient("5","Paulina"));
    }

    public List<Klient> getZarejestrowani() {
        return Zarejestrowani;
    }
     public Optional<Klient>OdczytpoID(String id){
        return Zarejestrowani.stream().filter(klient -> klient.getIdKlienta().equals(id)).findFirst();
     }
}
