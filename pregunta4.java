import java.util.Scanner;

public class pregunta4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero, factorial = 1;

        System.out.println("ingrsa un numero para calcular su factorial:");
        numero = scanner.nextInt();

        int i = 1;
        while (i <= numero) {
            factorial *= i;
            i++;
        }
        System.out.println("el factorial de " + numero + " es " + factorial);
        }



    }
