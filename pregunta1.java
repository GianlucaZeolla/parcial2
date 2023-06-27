import java.util.Scanner;


public class ExamenSegundoParcial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("ingrese un numero: ");
        int numero = scanner.nextInt();

        if (numero > 0) {
            System.out.println("es positivo ");
        } else{
           if (numero < 0) {
                System.out.println(" negativo ");
            } else {
                System.out.println(" es 0");

                scanner.close();


            }
        }
    }
}

