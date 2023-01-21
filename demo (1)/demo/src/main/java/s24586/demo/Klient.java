package s24586.demo;



public class Klient {

    private String IdKlienta;
    private String Imie;

    public Klient(String idKlienta, String imie) {
        IdKlienta = idKlienta;
        Imie = imie;
    }

    public String getIdKlienta() {
        return IdKlienta;
    }

    public String getImie() {
        return Imie;
    }

    public void setImie(String imie) {
        Imie = imie;
    }

    public void setIdKlienta(String idKlienta) {
        IdKlienta = idKlienta;
    }

    @Override
    public String toString() {
        return "Klient{" +
                "IdKlienta='" + IdKlienta + '\'' +
                '}';
    }
}
