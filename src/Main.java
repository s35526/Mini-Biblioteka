public class Main {
    public static void main(String[] args) {

ksiazka k1 = new ksiazka ("Potop"," Henryk Sienkiewicz", 900, true);
ksiazka k2 = new ksiazka ("Lalka", "Bolesław Prus", 700, false);
ksiazka k3 - new ksiazka ("1984", "George Orwell", 300, true);

k1.wypiszInfo();
k1.wypozycz();
k1.wypisz.Info();
k1.zwroc();

    }
Czytelnik c1 = new Czytelnik("Jan", "Nowak", 1000, 0);
Czytelnik c2= new Czytelnik("Asia", "Bąk", 2000, 2);

c1.wypiszDane();
c1.zwiekszLiczbeWypozyczen();

c2.wypiszDane();
c2.zmiejszLiczbeWypozyczen();
}
