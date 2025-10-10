//Mostra os números pares ou ímpares entre dois valores informados

import java.util.Scanner;

public class Desafio03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int inicio = sc.nextInt();

        System.out.print("Digite o segundo número (maior que o primeiro): ");
        int fim = sc.nextInt();

        System.out.print("Deseja ver números pares (P) ou ímpares (I)? ");
        char opcao = sc.next().toUpperCase().charAt(0);

        if (opcao == 'P') {
            System.out.println("Números pares no intervalo:");
            for (int i = inicio; i <= fim; i++) {
                if (i % 2 == 0) {
                    System.out.print(i + " ");
                }
            }
        } else if (opcao == 'I') {
            System.out.println("Números ímpares no intervalo:");
            for (int i = inicio; i <= fim; i++) {
                if (i % 2 != 0) {
                    System.out.print(i + " ");
                }
            }
        } else {
            System.out.println("Opção inválida!");
        }

        sc.close();
    }
}
