// Básico de condicionais.
import java.util.Scanner;

public class Teste03{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Vou verificar se o número é positivo, negativo ou zero, blz?");
        System.out.print("Então digite um número: ");
        int numero = entrada.nextInt();

        if (numero > 0) {
            System.out.printf("O número %d é positivo%n", numero);
        } else if (numero < 0) {
            System.out.printf("O número %d é negativo%n", numero);
        } else {
            System.out.printf("O número %d é zero%n", numero);
        }
        
        System.out.println("É isso ae, tnhx");
        entrada.close();
    }
}