import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        String dia;

        switch (x) {
            case 1 -> dia = "Domingo";
            case 2 -> dia = "Segunda";
            case 3 -> dia = "Terca";
            case 4 -> dia = "Quarta";
            case 5 -> dia = "Quinta";
            case 6 -> dia = "Sexta";
            case 7 -> dia = "Sabado";
            default -> {
                dia = "Valor invalido";
                sc.close();
            }
        }
        System.out.println( "Dia da semana =" + dia);
    }
}