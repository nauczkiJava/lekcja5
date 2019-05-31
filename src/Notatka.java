public class Notatka {
    Day dzienTygodnia;
    String wiadomosc;
    Osoba autor;

    public Notatka(Day dzienTygodnia, String wiadomosc,
                   String imie, String nazwisko) {
        this.dzienTygodnia = dzienTygodnia;
        this.wiadomosc = wiadomosc;
        this.autor = new Osoba(imie, nazwisko);
    }
}
