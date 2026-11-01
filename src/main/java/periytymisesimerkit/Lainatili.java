package periytymisesimerkit;

//Lainatili peliyryy tili-luokasta
//Jos periytymisestä muistaa vain yhden asian
//tämön tunnin jälkeen - niin se pitää olla extends avainsana

public class Lainatili extends Tili {

    private double korko;
    private int lainaAikaVuosina;

    public Lainatili() {

    }

    public Lainatili(double korko, int lainaAikaVuosina) {
        this.korko = korko;
        this.lainaAikaVuosina = lainaAikaVuosina;
    }

    public Lainatili(double saldo, String nimi, String tilinumero, double korko, int lainaAikaVuosina) {
        // super kutsuu yliluokkaa ja tässä sen konstruktoria
        super(saldo, nimi, tilinumero);
        this.korko = korko;
        this.lainaAikaVuosina = lainaAikaVuosina;
    }

    public double getKorko() {
        return korko;
    }

    public void setKorko(double korko) {
        this.korko = korko;
    }

    public int getLainaAikaVuosina() {
        return lainaAikaVuosina;
    }

    public void setLainaAikaVuosina(int lainaAikaVuosina) {
        this.lainaAikaVuosina = lainaAikaVuosina;
    }

}
