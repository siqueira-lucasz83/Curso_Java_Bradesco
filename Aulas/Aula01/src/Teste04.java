//Operadores aritméticos e de atribuição
import java.util.Scanner; 

public class Teste04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); 

        System.out.print("Digite o primeiro número: ");
        int num1 = entrada.nextInt(); 
        System.out.print("Digite o segundo número: ");
        int num2 = entrada.nextInt();

        int soma = num1 + num2;           // soma
        int subtracao = num1 - num2;      // subtração
        int multiplicacao = num1 * num2;  // multiplicação
        int divisao = num1 / num2;        // divisão inteira
        int resto = num1 % num2;          // resto da divisão
        double divisaodecimal = (double) num1 / num2; // divisão com resultado decimal

        System.out.printf("%d + %d = %d%n", num1, num2, soma);
        System.out.printf("%d - %d = %d%n", num1, num2, subtracao);
        System.out.printf("%d * %d = %d%n", num1, num2, multiplicacao);
        System.out.printf("%d / %d = %d%n", num1, num2, divisao);
        System.out.printf("O resto da divisão de %d por %d é %d%n", num1, num2, resto);
        System.out.printf("Com duas casa decimais: %d / %d = %.2f%n", num1, num2, divisaodecimal);

        entrada.close(); 
    }
}
