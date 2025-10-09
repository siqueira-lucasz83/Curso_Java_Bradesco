//Básico de If, else if e else
import java.util.Scanner;

public class Teste01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite sua idade: ");
        int idade = input.nextInt();
        
        if (idade < 16) {
            System.out.println("Não pode votar.");
        } else if ((idade >= 16 && idade < 18) || (idade >= 70)) {
            System.out.println("Voto opcional.");
        } else {
            System.out.println("Voto obrigatório.");
        }
        
        input.close();
    }
}
