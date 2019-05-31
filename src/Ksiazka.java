public class Ksiazka {
    private int iloscStron;
    private String tytul;
    private String rodzaj;
    private Osoba autor;

    public Ksiazka(int iloscStron, String tytul, String rodzaj, String imie,
                   String nazwisko) {
        this.iloscStron = iloscStron;
        this.tytul = tytul;
        this.rodzaj = rodzaj;
        this.autor = new Osoba(imie,nazwisko);
    }

    public int getIloscStron() {
        return this.iloscStron;
    }

    public String getTytul() {
        return this.tytul;
    }

    public String getRodzaj() {
        return this.rodzaj;
    }

    public String getAutor() {
        return this.autor.przedstawSie();
    }

}
