import java.util.Scanner;

public class CalculateMultiples {
    public static void main(String[] args) {
        int result = 0;
        int i = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        double first_number = input.nextInt();
        System.out.println("Digite outro numero: ");
        double second_number = input.nextInt();

        if ((first_number % second_number == 0) ||
                (second_number % first_number == 0)) {
            System.out.println("Os numeros sao multiplos");
        } else {
            System.out.println("Os numeros nao sao multiplos");
        }

    }
}
