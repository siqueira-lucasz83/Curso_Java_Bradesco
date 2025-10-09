//Primeiro contato com o Switch e Case
 import java.util.Scanner;

public class Teste02{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== MENU DE OPÇÕES ===");
        System.out.println("1 - Jogar Xbox");
        System.out.println("2 - Assistir série");
        System.out.println("3 - Estudar Java");
        System.out.println("4 - Dormir");
        System.out.print("Escolha uma opção (1-4): ");

        int opcao = input.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Boa! Bora fazer uma gameplay louca!");
                break;
            case 2:
                System.out.println("Relaxar também é importante. Qual série você vai maratonar?");
                break;
            case 3:
                System.out.println("Excelente escolha! O futuro dev agradece.");
                break;
            case 4:
                System.out.println("Descanso é essencial. Aproveite o sono!");
                break;
            default:
                System.out.println("Opção inválida! Escolha um número de 1 a 4.");
                break;
        }

        input.close();
    }
}
