import java.util.Scanner;

public class Desafio04{
    public static void main(String[] args){
        Scanner var = new Scanner(System.in);

        System.out.println("Digite o nome da primeira pessoa: ");
        String pessoa1 = var.nextLine();
        System.out.println("Agora digite a primeira idade: ");
        int idade1 = var.nextInt();
        var.nextLine();
        System.out.println("Digite o nome da segunda pessoa: ");
        String pessoa2 = var.nextLine();
        System.out.println("Digite a segunda idade: ");
        int idade2 = var.nextInt();
        int diferenca = idade1 - idade2;

        System.out.printf("A diferença de idade da primeira pessoa, %s, para a segunda, %s, é %d anos", pessoa1, pessoa2, diferenca);

        var.close();
    }
}