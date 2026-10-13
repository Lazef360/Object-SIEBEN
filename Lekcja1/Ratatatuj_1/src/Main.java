class Pies{
    String imie;
    int wiek;
}
public class Main {
    public static void main(String[] args) {
        Pies mojPies = new Pies();
        mojPies.imie = "Japko";
        mojPies.wiek = 3;

        System.out.println("Pies: " + mojPies.imie + ", Wiek: " + mojPies.wiek + " Lata");
    }
}