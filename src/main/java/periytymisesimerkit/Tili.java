package periytymisesimerkit;

//tämä on periytymisessä tässä esimerkissä
//niin sanottu yliluokka eli super class
//kyseessä pankkitili

public class Tili {

    // palnkkitilin kentät
    private double saldo;
    private String nimi;
    private String tilinumero;

    public Tili() {

    }

    public Tili(double saldo, String nimi, String tilinumero) {
        this.saldo = saldo;
        this.nimi = nimi;
        this.tilinumero = tilinumero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getNimi() {
        return nimi;
    }

    public void setNimi(String nimi) {
        this.nimi = nimi;
    }

    public String getTilinumero() {
        return tilinumero;
    }

    public void setTilinumero(String tilinumero) {
        this.tilinumero = tilinumero;
    }

}
