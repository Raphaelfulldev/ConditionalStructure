import java.util.Locale;
import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double salario = sc.nextDouble();
        double imposto;

        if (salario <= 2000){
            imposto = 0.0;

        }
        else if (salario <= 3000){
            imposto = (salario - 2000) * 0.08 ;
//            System.out.println(imposto);
        }
        else if (salario <= 4500){
            imposto = (salario - 3000) * 0.18 + 1000 * 0.08 ;
//            System.out.println(imposto);
        }
        else {
            imposto = (salario - 4500) * 0.28 + 1500 * 0.18 + 1000 * 0.08;
//            System.out.println(imposto);
        }
        if (imposto == 0){
            System.out.printf("Imposto zero = ", imposto);
        }
        System.out.println(imposto);


        sc.close();
    }
}