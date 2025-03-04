import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) throws InterruptedException {
        Scanner teclado = new Scanner(System.in);
        teclado.useLocale(Locale.US);
        Random ran = new Random();
        int n1 = ran.nextInt(10) + 1, n2 = ran.nextInt(10) + 1;
        String signo;
        double resultado = 0;
        System.out.println("Escriba uno de los siguientes simbolos: " +
                "\n| 1. + | 2. - | 3. * |\n| 4. / | 5. ^ | 6. % |");
        signo = teclado.next();
        System.out.println("Los numeros a operar son: \n" + n1 + " | " + n2);
        switch (signo) {
            case "+" -> {
                resultado = n1 + n2;
            }
            case "-" -> {
                resultado = n1 - n2;
            }
            case "*" -> {
                resultado = n1 * n2;
            }
            case "/" -> {
                resultado = n1 / n2;
            }
            case "^" -> {
                resultado = Math.pow(n1, n2);
            }
            case "%" -> {
                resultado = n1 % n2;
            }
        }
        System.out.print("El resultado es ");
        Thread.sleep(1000);
        for (int i = 0; i < 3; i++) {
            System.out.print(". ");
            Thread.sleep(1000);
        }
        System.out.print("\n" + resultado);
    }
}
