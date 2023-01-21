package s24586.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

     public DemoApplication(Tranzakcje tranzakcje) {

		 Klient Wypisania = tranzakcje.Rejestracja(
				 new Klient("5", "Kuba"), new Saldo(500));

		 System.out.println(Wypisania);

		 Klient Odczytanie = tranzakcje.Odczytanie("1");
		 System.out.println(Odczytanie);

		 double Wyplacanie = tranzakcje.Wyplacenie(new Konta(new Klient("1","Maciej"),new Saldo(1000)),100);
		 {
			 System.out.println(Wyplacanie);

		 }

		 double Wyplacanie = tranzakcje.Wyplacenie(new Konta(new Klient("1","Maciej"),new Saldo(1000)),100);
		 {
			 System.out.println(Wyplacanie);

		 }
	 }


	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
