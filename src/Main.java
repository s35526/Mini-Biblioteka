public class Main {
    public static void main(String[] args) {

ksiazka k1 = new ksiazka ("Potop"," Henryk Sienkiewicz", 900, true);
ksiazka k2 = new ksiazka ("Lalka", "Bolesław Prus", 700, false);
ksiazka k3 = new ksiazka ("1984", "George Orwell", 300, true);

k1.wypiszInfo();
k1.wypozycz();
k1.wypisz.Info();
k1.zwroc();

    }
Czytelnik c1 = new Czytelnik("Jan", "Nowak", 1000, 0);
Czytelnik c2 = new Czytelnik("Asia", "Bąk", 2000, 2);

c1.wypiszDane();
c1.zwiekszLiczbeWypozyczen();

c2.wypiszDane();
c2.zmiejszLiczbeWypozyczen();

Biblioteka biblioteka = new Biblioteka(10);
        biblioteka.dodajKsiazke(k1);
        biblioteka.dodajKsiazke(k2);
        biblioteka.dodajKsiazke(k3);

        System.out.println("Dostępne książki przed wypożyczeniem:");
        biblioteka.wypiszDostepneKsiazki();
        System.out.println("Liczba dostępnych: " + biblioteka.policzDostepneKsiazki());

        // Scenariusz wypożyczenia
        System.out.println("\n=== Wypożyczanie ===");
        biblioteka.wypozyczKsiazke("Potop", c1);   
        biblioteka.wypozyczKsiazke("Lalka", c2);   

        System.out.println("\n=== Dostępne książki po wypożyczeniu ===");
        biblioteka.wypiszDostepneKsiazki();
        System.out.println("Liczba dostępnych: " + biblioteka.policzDostepneKsiazki());

        // Zwrot 
        System.out.println("\n=== Zwrot książki ===");
        biblioteka.zwrocKsiazke("Potop", c1);

        System.out.println("\n=== Dostępne książki po zwrocie ===");
        biblioteka.wypiszDostepneKsiazki();
        System.out.println("Liczba dostępnych: " + biblioteka.policzDostepneKsiazki());

        // Stan czytelników 
        System.out.println("\n=== Stan czytelników ===");
        c1.wypiszDane();
        c2.wypiszDane();
    }

