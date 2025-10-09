import java.util.Scanner;

public class Desafio02 {
    public static void main(String[] args) {
        Scanner var = new Scanner(System.in);

        System.out.print("Digite o valor de um lado do quadrado em metros: ");
        int lado = var.nextInt();
        int area = lado * lado;

        System.out.printf("A área do quadrado é %d metros quadrados", area);

        var.close();
    }
}