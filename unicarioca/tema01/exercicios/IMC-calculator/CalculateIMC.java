import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class CalculateIMC {

    public static void main(String[] args) throws IOException {
        // get from userinput
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // get weight
        System.out.print("Digite seu peso: ");
        double weight = Double.parseDouble(reader.readLine());

        // get height
        System.out.print("Digite sua height: ");
        double height = Double.parseDouble(reader.readLine());

        double imc = calculateIMC(weight, height);

        System.out.println("Seu IMC é: " + imc);

        String message = "";

        if (imc < 18.5) {
            message = "Você está abaixo do peso";
        } else if (imc >= 18.5 && imc <= 24.9) {
            message = "Você está no peso ideal";
        } else if (imc >= 25 && imc <= 29.9) {
            message = "Você está com sobrepeso";
        } else if (imc >= 30) {
            message = "Você está obeso";
        }

        System.out.println(message);

    }

    public static double calculateIMC(double weight, double height) {
        return weight / (height * height);
    }

}
