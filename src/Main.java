public class Main {

    public static void main(String[] args) {
        Ksiazka ojciecChrzestny = new Ksiazka(500, "Ojciec Chrzestny",
                Rodzaj.BELETRYSTYKA, "Mario", "Puzo");
        System.out.println("Zad 2:\nTytul tej ksiazki to: " + ojciecChrzestny.getTytul() +
                "\nJej rodzaj to: " + ojciecChrzestny.getRodzaj() + "\nJej autorem jest " +
                ojciecChrzestny.getAutor() + "\nLiczy ona " + ojciecChrzestny.getIloscStron() +
                " stron.");

        System.out.println("\nZad 3:");
        Kontakt[] ksiazka11 = new Kontakt[3];
        ksiazka11[0] = new Kontakt("Andrzej", "Duda",
                500000000, "andrzejduda@pis.com");
        ksiazka11[1] = new Kontakt("Bubbles", "Bubblowski",
                600000000, "bubbles@trailerpark.com");
        ksiazka11[2] = new Kontakt("Michael", "Scott",
                900000000, "michaelscott@dundermifflin.com");

        KsiazkaAdresowa numery = new KsiazkaAdresowa(ksiazka11);
        numery.wyswietlInformacje();

        System.out.println("Zad 4:");
        Tshirt koszulka = new Tshirt(Kolor.CZERWONY, Rozmiar.S, 15.0);
        koszulka.wypiszInfo();


        Notatka notatka = new Notatka(Day.PONIEDZIALEK,
                "SCHOWAJ SIE", "Mariusz", "Kowalski");
        System.out.println("\nZad 5:\nNotatka była napisana w: " + notatka.dzienTygodnia +
                "\nAutorem jest: " + notatka.autor.przedstawSie() + "\nJej tresc to: " +
                notatka.wiadomosc);


    }
}
