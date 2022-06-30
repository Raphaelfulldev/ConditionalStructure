import java.util.Locale;
import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int a, b;
        a = sc.nextInt();
        b = sc.nextInt();

        if ((a % b)  == 0 || (b % a)  == 0){
            System.out.println("are MULTIPLES");
        }
        else
            System.out.println("are not MULTIPLES");


        sc.close();
    }
}
