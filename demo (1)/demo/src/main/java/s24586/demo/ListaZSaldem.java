package s24586.demo;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Component
public class ListaZSaldem {

    List<Konta>listaZSaldem=new ArrayList<>();

    public ListaZSaldem(){
        listaZSaldem.add(new Konta(new Klient("1","Maciej"),new Saldo(500)));
        listaZSaldem.add(new Konta(new Klient("2","Kuba"),new Saldo(1500)));
        listaZSaldem.add(new Konta(new Klient("3","Magda"),new Saldo(2500)));
    }

    public List<Konta> getListaZSaldem() {
        return listaZSaldem;
    }
    public void DodajNoweKonto(Konta konta){
        listaZSaldem.add(konta);
    }
    public void WypiszKlienta(String idKlienta){
        listaZSaldem.stream().map(Konta::toString).equals(idKlienta);
    }




}
