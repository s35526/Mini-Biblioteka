public class Czytelnik {
    private String imie;
    private String nazwisko;
    private int NumerKarty;
    private boolean liczbaWypozyczen;

    public Ksiazka(String imie, String nazwisko, int NumerKarty, int liczbaWypozyczen) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.NumerKarty = NumerKarty;
        this.liczbaWypozyczen = liczbaWypozyczen;
    }

    public void wypiszDane() {
        System.out.println("Czytelnik:" + imie + " " + nazwisko + ", nr karty: " + numerKarty + ", wypożyczone książki: " + liczbaWypozyczen );
    }

    public void zwiekszLiczbeWypozyczen() {
        zwiekszLiczbeWypozyczen++;
        System.out.println("Liczba wypożyczeń czytelnika" + imie + "wzrosła do: " + liczbaWypozyczen);
    }

    public void zmiejszLiczbeWypozyczen() {
        if (liczbaWypozyczen > 0) {
            liczbaWypozyczen--;
            System.out.println("Licza wypożyczeń czytelnika" + imie + "zmalała do" + liczbaWypozyczen);
        } else {
            System.out.println("Czytelnik" + imie + " nie ma aktualnie wypożyczonych książek.");
        }
    }
}
