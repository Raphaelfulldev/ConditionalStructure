import java.util.Locale;
import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int code = sc.nextInt();
        double quantity = sc.nextDouble();
        double total;

        if (code == 1 ){
            total = quantity * 4;
        }
        else if (code == 2){
            total = quantity * 4.5;
            System.out.printf(code + " - X-Salad\n");
            System.out.println("Qnts?");
        } else if (code == 3){
            total = quantity * 5;
            System.out.printf(code + " - X-Bacon\n");
            System.out.println("Qnts?");
        }
        else if (code == 4){
            total = quantity * 2;
            System.out.printf(code + " - Simple toast\n");
            System.out.println("Qnts?");;
        }
        else {
            total = quantity * 1.5;
            System.out.printf(code + " - Soda\n");
            System.out.println("Qnts?");
        }

        System.out.printf("Total: R$ %.2f\n", total);

        sc.close();
    }
}
