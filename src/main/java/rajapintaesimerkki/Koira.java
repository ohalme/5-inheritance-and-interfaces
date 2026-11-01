package rajapintaesimerkki;

//JOS LUOKAN PITÄÄ TOETUTTAA RAJAPINTA ON KÄYTETTÄVÄ SANAA
//IMPLEMENTS

public class Koira implements Aantelee {

    private String nimi;

    public String aantele() {
        return "hauhau";
    }

    public String getNimi() {
        return nimi;
    }

    public void setNimi(String nimi) {
        this.nimi = nimi;
    }

}
