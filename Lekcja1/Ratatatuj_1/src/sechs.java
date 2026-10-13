class Uzytkownik {
    String login;
    boolean czyAktywny;

    public void wyswietlStatus() {
        if (czyAktywny) {
            System.out.println("Użytkownik " + login + " jest zalogowany.");
        } else {System.out.println("Użytkownik " + login + " jest nieaktywny.");
        }
    }
}


public class sechs {
    public static void main(String[] args) {
Uzytkownik user = new Uzytkownik();
user.login = "Anna99";
user.czyAktywny = true;
user.wyswietlStatus();

    }
}