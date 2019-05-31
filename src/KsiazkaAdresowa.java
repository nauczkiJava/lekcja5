public class KsiazkaAdresowa {
    int iloscKontaktow = 0;
    Kontakt[] ksiazka1 = new Kontakt[3];

    public KsiazkaAdresowa(Kontakt[] ksiazka) {
        this.stworzKsiazke(ksiazka);
    }

    void stworzKsiazke(Kontakt[] ksiazka) {
        for (int i = 0; i < ksiazka.length; i++) {
            this.ksiazka1[i] = ksiazka[i];
            iloscKontaktow++;
        }
    }

    void wyswietlInformacje() {
        for (int i = 0; i < iloscKontaktow; i++) {
            ksiazka1[i].jakiToKontakt();
        }
    }
}
