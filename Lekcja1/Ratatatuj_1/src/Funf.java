class KontoBankowe{
private double saldo;
public double getSaldo(){return saldo;}

    public void setSaldo(double noweSaldo) {
        if (noweSaldo>= 0){
            this.saldo = noweSaldo;
        }
    }
}

public class Funf {
    public static void main(String[] args) {

        KontoBankowe konto = new KontoBankowe();
        konto.setSaldo(1500.50);
        System.out.println("Stan konta: " + konto.getSaldo() + " zł");
    }
}