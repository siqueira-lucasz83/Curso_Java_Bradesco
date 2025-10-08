// Usando o Scanner
import java.util.Scanner;

public class Teste02 {
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    System.out.println("Digite seu nome: ");
    String nome = entrada.nextLine();
    System.out.println("Digite sua idade: ");
    int idade = entrada.nextInt();

    // Jeito simples de mostrar a msg
    // System.out.println("Mn, seu nome é " + nome + " e vc tem " + idade + " anos");
    System.out.printf("Mn, seu nome é %s e vc tem %d anos%n", nome, idade);
    entrada.close();
    }
}