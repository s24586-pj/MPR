package s24586.demo;

public class Konta {

    Klient klient;
    Saldo saldo;

    public Konta(Klient klient, Saldo saldo) {
        this.klient = klient;
        this.saldo = saldo;
    }

    public Klient getKlient() {
        return klient;
    }

    public void setKlient(Klient klient) {
        this.klient = klient;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(Saldo saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Konta{" +
                "klient=" + klient +
                ", saldo=" + saldo +
                '}';
    }
}
