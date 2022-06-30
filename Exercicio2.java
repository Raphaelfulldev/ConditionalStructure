import java.util.Locale;
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();


        if (a % 2 == 0) { //%2 == 0 é utilizado para saber se o número é impar ou par.
            System.out.printf("Par = %d\n", a);
        } else System.out.printf("Impar = %d\n", a);

        sc.close();

    }
}
