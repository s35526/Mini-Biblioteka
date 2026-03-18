public class Ksiazka {
    private String tytul; ("1", "2", "3")
    private String autor; ("Sienkiewicz", "Prus", "Orwell")
    private int liczbaStron; ("900", "700", "300")
    private boolean dostepna; (true, false, true)
    public Ksiazka(String tytul, String autor, int liczbaStron, boolean dostepna) {

        this.tytul = tytul;
        this.autor = autor;
        this.liczbaStron = liczbaStron;
        this.dostepna = dostepna;

        // implementacja konstruktora
    }
    public void wypiszInfo() {
        System.out.println("Tytuł:" + tytul + ", Autor" + autor + ", Strony:" + liczbaStron + ", Dostępna: " + dostepna );

        public void wypozycz() {
            if (dostepna) {
                dostepna = false;
                System.out.println("Wypożyczono książkę: " + tytul);
                else
                    System.out.println("Książka " + tytul + "jest niedostępna.");
            }
        }
        public void zwroc() {
            dostepna =true;
            System.out.println("Zwrócono książkę: " + tytul)
        }
    }
}