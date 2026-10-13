class LiczbaAnalityk {
    int SASA;
    boolean czyParzysta ;


    public void czyParzy() {
        if (this.SASA % 2 == 0)
        {this.czyParzysta = true;}
        else
        {this.czyParzysta = false;}}

    public void wyswietlParzystosc() {
        if (czyParzysta) 
        {System.out.println("Liczba " + SASA + " jest parzysta.");}
        else
        {System.out.println("Liczba " + SASA + " jest nieparzysta.");}}}


public class sieben { public static void main(String[] args) {
    LiczbaAnalityk liczba = new LiczbaAnalityk();
    liczba.SASA = 4;
    liczba.czyParzy();
    liczba.wyswietlParzystosc();



    }
}