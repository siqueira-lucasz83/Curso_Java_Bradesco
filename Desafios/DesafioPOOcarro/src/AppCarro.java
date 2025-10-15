import java.util.Scanner;

public class AppCarro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Carro carro = new Carro();
        int opcao;

        do {
            System.out.println("\n===== MENU CARRO =====");
            System.out.println("1. Ligar carro");
            System.out.println("2. Desligar carro");
            System.out.println("3. Acelerar");
            System.out.println("4. Frear");
            System.out.println("5. Trocar marcha");
            System.out.println("6. Virar");
            System.out.println("7. Verificar velocidade");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine(); // limpar buffer

            switch (opcao) {
                case 1 -> carro.ligar();
                case 2 -> carro.desligar();
                case 3 -> carro.acelerar();
                case 4 -> carro.frear();
                case 5 -> {
                    System.out.print("Digite a nova marcha (0-6): ");
                    int marcha = sc.nextInt();
                    carro.trocarMarcha(marcha);
                }
                case 6 -> {
                    System.out.print("Digite direção (esquerda/direita): ");
                    String dir = sc.nextLine();
                    carro.virar(dir);
                }
                case 7 -> carro.verificarVelocidade();
                case 0 -> System.out.println("Encerrando o sistema...");
                default -> System.out.println("Opção inválida!");
            }
        } while (opcao != 0);

        sc.close();
    }
}
