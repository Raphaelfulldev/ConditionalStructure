import java.util.Locale;
import java.util.Scanner;

public class ExercicioResolvido2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double a, b, c, formula1, formula2, delta;
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();
        delta = Math.pow(b,2) - 4 * a * c;
        System.out.println("Delta = " + delta);
        formula1 = (-b + Math.sqrt(delta)) / (2*a);
        formula2 = (-b - Math.sqrt(delta)) / (2*a);

        if (a == 0 || delta < 0.0){
            System.out.println("Impossivel calcular");
        }
        else {
            System.out.printf("R1 = %.5f\n", formula1);
            System.out.printf("R2 = %.5f\n", formula2);

        }
        sc.close();
    }
}
