package s24586.demo;


import org.springframework.stereotype.Component;

@Component
public class Tranzakcje {

     private ListaZSaldem listaZSaldem;
     private Rejestrator rejestrator;

      double stankonta;

    public Tranzakcje(ListaZSaldem listaZSaldem, Rejestrator rejestrator) {
        this.listaZSaldem = listaZSaldem;
        this.rejestrator = rejestrator;
    }

    public Klient Rejestracja(Klient klient, Saldo saldo){
       listaZSaldem.DodajNoweKonto(new Konta(klient,saldo));
        System.out.println("Dodano nowego Klienta");
        return klient;
    }
    public Klient Odczytanie(String idKlienta){
        System.out.println(rejestrator.OdczytpoID(idKlienta));
        return null;
    }
    public double Wyplacenie(Konta konta, double ile){
        stankonta=konta.getSaldo() -ile;

        if(stankonta>0){
            System.out.println("Nie masz takich pieniedzy");
        }
        return stankonta;
    }
    public double ZlecebuePrzelwu(Konta konta,double ile,String NoweKonto){
        stankonta=konta.getSaldo() -ile;

        if(stankonta>0){
            System.out.println("Nie masz takich pieniedzy");
        }
        System.out.println("udalo ci sie przelac");
        return ile;
    }


}
