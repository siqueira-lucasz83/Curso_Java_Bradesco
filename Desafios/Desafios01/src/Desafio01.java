import java.util.Scanner; 

public class Desafio01 {
    public static void main(String[] args) throws Exception {
        Scanner var = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = var.nextLine();
        System.out.println( "Digite o ano que você nasceu: ");
        int ano = var.nextInt();
        int idade = 2025 - ano;
        System.out.printf("Olá %s, você terá %d anos em 2025.", nome, idade);
        var.close();
    }
}
