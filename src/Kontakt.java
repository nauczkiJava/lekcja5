public class Kontakt {

    private String imie;
    private String nazwisko;
    private long nrTel;
    private String email;

    public Kontakt(String imie, String nazwisko, long nrTel, String email) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.nrTel = nrTel;
        this.email = email;
    }

    void jakiToKontakt() {
        System.out.println("Imie: " + this.imie + "\nNazwisko: " + this.nazwisko + "\nNumer telefonu: " + nrTel + "\nE-mail: " + email+"\n");
    }
}
