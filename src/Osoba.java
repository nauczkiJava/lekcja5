public class Osoba {
    private String imie;
    private String nazwisko;

    public Osoba(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    public String przedstawSie() {
         return this.imie + " " + this.nazwisko;
    }
}
