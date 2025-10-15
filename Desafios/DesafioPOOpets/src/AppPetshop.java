import java.util.Scanner;

public class AppPetshop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MaquinaBanho maquina = new MaquinaBanho();
        int opcao;

        do {
            System.out.println("\n===== MENU PETSHOP =====");
            System.out.println("1. Colocar pet na máquina");
            System.out.println("2. Dar banho");
            System.out.println("3. Retirar pet");
            System.out.println("4. Abastecer água");
            System.out.println("5. Abastecer shampoo");
            System.out.println("6. Limpar máquina");
            System.out.println("7. Verificar nível de água");
            System.out.println("8. Verificar nível de shampoo");
            System.out.println("9. Verificar se há pet");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine(); // limpar buffer

            switch (opcao) {
                case 1 -> maquina.colocarPet();
                case 2 -> maquina.darBanho();
                case 3 -> maquina.retirarPet();
                case 4 -> maquina.abastecerAgua();
                case 5 -> maquina.abastecerShampoo();
                case 6 -> maquina.limparMaquina();
                case 7 -> maquina.verificarNivelAgua();
                case 8 -> maquina.verificarNivelShampoo();
                case 9 -> maquina.verificarPet();
                case 0 -> System.out.println("Encerrando o sistema...");
                default -> System.out.println("Opção inválida!");
            }
        } while (opcao != 0);

        sc.close();
    }
}
