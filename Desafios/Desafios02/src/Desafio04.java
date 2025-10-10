//Recebe um número inicial, depois outros N números, e só continua enquanto o resto da divisão for diferente de 0

import java.util.Scanner;

public class Desafio04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número inicial: ");
        int numeroInicial = sc.nextInt();

        while (true) {
            System.out.print("Digite outro número: ");
            int numero = sc.nextInt();

            if (numero == 0) {
                System.out.println("Encerrando... número 0 digitado.");
                break;
            }

            if (numero % numeroInicial == 0) {
                System.out.println("O número " + numero + " é múltiplo de " + numeroInicial + ". Encerrando execução.");
                break;
            } else {
                System.out.println("O número " + numero + " NÃO é múltiplo de " + numeroInicial + ". Continue...");
            }
        }

        sc.close();
    }
}
