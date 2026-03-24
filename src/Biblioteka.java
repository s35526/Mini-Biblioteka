public class Biblioteka {
    private Ksiazka[] ksiazki; 
    private int liczbaKsiazek;

public Biblioteka(int pojemnosc) {
        this.ksiazki = new Ksiazka[pojemnosc];
        this.liczbaKsiazek = 0;
    }

public void dodajKsiazke(Ksiazka ksiazka) {
        if (liczbaKsiazek < ksiazki.length) {
            ksiazki[liczbaKsiazek] = ksiazka;
            liczbaKsiazek++;
            System.out.println("Dodano nową książkę.");
        } else {
            System.out.println("Brak miejsca w bibliotece!");
        }
    }

public void wypiszDostepneKsiazki() {
        System.out.println("Lista dostępnych książek:");
        for (int i = 0; i < liczbaKsiazek; i++) {
            if (ksiazki[i].isDostepna()) {
                ksiazki[i].wypiszInfo(); 
            }
        }
    }

    public Ksiazka znajdzKsiazkePoTytule(String tytul) {
        boolean znaleziona = false;
        for (int i = 0; i < liczbaKsiazek; i++) {
            if (ksiazki[i].getTytul().equals(tytul)) {
            System.out.println("Znaleziono książkę: ");
            ksiazki[i].wypiszInfo();
            znaleziona = true;
            break;
            }
        }
        if (!znaleziona) {
            System.out.println("Nie znaleziono książki" + tytul);
        }
    }

    public int policzDostepneKsiazki() {
        int dostepne = 0;
        for (int i = 0; i < liczbaKsiazek; i++) {
            if (ksiazki[i].isDostepna()) {
                dostepne++;
            }
        }
        return dostepne;
    }
}

