import java.util.Locale;
import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        if (num >= 0) {
            System.out.println("Positive");
        } else System.out.println("Negative");

        sc.close();
    }


}
