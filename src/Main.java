import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Jackpot {
    public static void main(String[] args) throws InterruptedException {
        Scanner teclado = new Scanner(System.in);
        teclado.useLocale(Locale.US);
        Random ran = new Random();
        String desicion;
        double dinero;
        int resultado;
        boolean estado = true;
        char SoN;
        System.out.println("\t***REGLAS***\n" +
                "A continuación aparecerá por pantalla un numero de forma aleatoria.\n" +
                "1. Si sale un 3, pierde todo su dinero y termina el juego. " +
                "\n2. Si sale 2, pierde la mitad del dinero y puede seguir jugando con esa cantidad o puede dejar de jugar." +
                "\n3. Si sale el 1, multiplica por dos su dinero y puede seguir jugando con esa cantidad o puede dejar de jugar." +
                "\nPresiona ENTER para continuar...");
        teclado.nextLine();
        System.out.println("Ingrese el monto (Menor a $50.000): ");
        dinero = teclado.nextInt();
        System.out.println("Dinero: " + dinero + "\nDesea jugar? 1. Si 2.No");
        desicion = teclado.next().toLowerCase();
        SoN = desicion.charAt(0);
        if(SoN == '1' || SoN=='s'){
            while (estado) {
                resultado = ran.nextInt(3) + 1;
                System.out.print("Y el resultado es ");
                Thread.sleep(1000);
                for (int i = 0; i < 3; i++) {
                    System.out.print(". ");
                    Thread.sleep(1000);
                }
                System.out.println("\n" + resultado);
                switch (resultado) {
                    case 1 -> {
                        dinero = dinero * 2;
                        System.out.println("Felicidades, su dinero ha sido duplicado. " +
                                "\n Dinero: " + dinero + "\n Desea volver a jugar? 1.Si 2.No");
                        desicion = teclado.next().toLowerCase();
                        SoN =  desicion.charAt(0);
                        if (SoN == '1' || SoN == 's') {
                            estado = true;
                        } else if (SoN == '2' || SoN == 'n') {
                            System.out.print("Menos mal, el siguiente numero iba a ser 3.");
                            estado = false;
                        } else {
                            System.out.print("Esa no es una opcion, por desobediente se cerrara el programa.");
                        }
                    }
                    case 2 -> {
                        dinero = dinero / 2;
                        System.out.println("Uy, su dinero ha sido dividido a la mitad." +
                                "\nDinero: "+ dinero + "\n Desea volver a jugar? 1.Si 2.No");
                        desicion = teclado.next().toLowerCase();
                        SoN =  desicion.charAt(0);
                        if (SoN == '1' || SoN == 's') {
                            estado = true;
                        } else if (SoN == '2' || SoN == 'n') {
                            System.out.print("Lastima, el siguiente numero iba a ser 1.");
                            estado = false;
                        } else {
                            System.out.print("Esa no es una opcion, por desobediente se cerrara el programa.");
                        }
                    }
                    case 3 -> {
                        dinero = dinero - dinero;
                        System.out.println("Chale, su dinero de perdio, lastima \n Gracias por usar el programa.");
                        estado = false;
                    }
                }
            }
        } else if ( SoN == '2' || SoN=='n'){
            System.out.println("Vale, gracias por usar el programa.");
        }
    }
}
