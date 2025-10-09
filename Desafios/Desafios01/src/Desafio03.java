import java.util.Scanner;

public class Desafio03{
    public static void main(String[] args){
        Scanner var = new Scanner(System.in);

        System.out.print("Digite o valor de um lado do retângulo em metros: ");
        int lado1 = var.nextInt();
        System.out.print("Digite o valor do outro lado do retângulo em metros: ");
        int lado2 = var.nextInt();
        int area = lado1 * lado2;

        System.out.printf("A área do retângulo é %d metros quadrados", area);

        var.close();
    }
}