import java.util.Locale;
import java.util.Scanner;

public class discount {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double value = sc.nextDouble();
        double discount = (value < 20)? value * 0.1 : value * 0.05;
        System.out.println("Discount " + discount);
    }
}