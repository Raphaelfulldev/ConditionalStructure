import java.util.Locale;
import java.util.Scanner;

public class Operadora {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int minutos = sc.nextInt();
        double conta = 50;

        if (minutos > 100) {
            conta = conta + (minutos - 100) * 2;
        }
        System.out.println("Valor a pagar: R$ = " + conta);


        sc.close();
    }
}