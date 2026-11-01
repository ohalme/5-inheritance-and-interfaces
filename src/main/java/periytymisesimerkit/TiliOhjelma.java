package periytymisesimerkit;

public class TiliOhjelma {
    public static void main(String[] args) {
        // LUODAAN YKSI TILI
        Tili tili = new Tili();

        tili.setNimi("Oskar Halme");
        tili.setSaldo(500);
        tili.setTilinumero("FI18230217");

        // LUODAAN LAINATILI

        Tili lainaTili = new Lainatili();
        lainaTili.setSaldo(39900);
        System.out.println("Lainaa tuolla tilillä on: " + lainaTili.getSaldo());

        // VOIDAAN SELVITTÄÄ OLION AJONAIKAINEN TYYPPI INSTANCEOF AVAINSANALLA

        if (lainaTili instanceof Tili) {

            System.out.println("Tili on tyypiltään TILI");
        }

    }

}
