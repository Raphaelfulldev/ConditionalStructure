import java.util.Scanner;

public class zz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        String dia;

        if (a == 1) {
            dia = "Domingo";
        } else if (a == 2) {
            dia = "Segunda";
        } else if (a == 3) {
            dia = "Terca";
        } else if (a == 4) {
            dia = "Quarta";
        } else if (a == 5) {
            dia = "Quinta";
        } else if (a == 6) {
            dia = "Sexta";
        }
        dia = "Sabado";
        System.out.println(dia);


    }
}