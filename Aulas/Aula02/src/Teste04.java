//While e do while
import java.util.Scanner;

public class Teste04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int soma = 0;
        int numero;

        System.out.println("=== Soma de números (0 para parar) ===");

        do {
            System.out.print("Digite um número (0 para fazer a soma): ");
            numero = input.nextInt();
            soma += numero;
        } while (numero != 0);

        System.out.println("A soma dos números digitados é: " + soma);

        input.close();
    }
}
