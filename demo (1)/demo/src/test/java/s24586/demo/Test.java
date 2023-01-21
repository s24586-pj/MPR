package s24586.demo;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Test {

     Tranzakcje tranzakcje;

     @BeforeEach
       void Setup(){
        ListaZSaldem listaZSaldem = new ListaZSaldem();
        Rejestrator rejestrator = new Rejestrator();
        tranzakcje=new Tranzakcje(listaZSaldem,rejestrator);
     }

     @org.junit.jupiter.api.Test
    void CzyDodano(){
      Klient odczytanie = tranzakcje.Rejestracja(new Klient("1","Bartek"),new Saldo(500));
         {
             assertThat(odczytanie).hasToString("Dodano nowego Klienta");
         }



    }
}
