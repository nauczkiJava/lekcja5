public class Tshirt {
    Kolor kolor;
    Rozmiar rozmiar;
    double cena;

    public Tshirt(Kolor kolor, Rozmiar rozmiar, double cena) {
        this.kolor = kolor;
        this.rozmiar = rozmiar;
        this.cena = cena;
    }

    void wypiszInfo() {
        System.out.println("Kolor: " + kolor +
                "\nRozmiar: " + rozmiar + "\nCena: " + cena);
    }
}
