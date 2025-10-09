//Bitwise operações com explicações simples
public class Teste05 {
    public static void main(String[] args) {

        int a = 5;  // em binário: 0101
        int b = 3;  // em binário: 0011

        System.out.println("=== Operadores Bitwise ===");
        System.out.println("a = " + a + " (0101)");
        System.out.println("b = " + b + " (0011)");
        System.out.println();

        // AND (&) – só dá 1 se os dois forem 1
        int and = a & b;
        System.out.println("a & b = " + and + "  // 0101 & 0011 = 0001 (1)");

        // OR (|) – dá 1 se pelo menos um for 1
        int or = a | b;
        System.out.println("a | b = " + or + "  // 0101 | 0011 = 0111 (7)");

        // XOR (^) – dá 1 se for diferente
        int xor = a ^ b;
        System.out.println("a ^ b = " + xor + "  // 0101 ^ 0011 = 0110 (6)");

        // NOT (~) – inverte todos os bits
        int notA = ~a;
        System.out.println("~a = " + notA + "  // inverte tudo (resultado depende do tamanho do número em bits)");

        // Shift Left (<<) – desloca bits pra esquerda (multiplica por 2)
        int leftShift = a << 1;
        System.out.println("a << 1 = " + leftShift + "  // move bits pra esquerda: 0101 -> 1010 (5 vira 10)");

        // Shift Right (>>) – desloca bits pra direita (divide por 2)
        int rightShift = a >> 1;
        System.out.println("a >> 1 = " + rightShift + "  // move bits pra direita: 0101 -> 0010 (5 vira 2)");

        System.out.println("\nExplicação simples:");
        System.out.println("- & (AND): só é 1 se os dois forem 1");
        System.out.println("- | (OR): é 1 se pelo menos um for 1");
        System.out.println("- ^ (XOR): é 1 se forem diferentes");
        System.out.println("- ~ (NOT): inverte todos os bits");
        System.out.println("- << : multiplica por 2");
        System.out.println("- >> : divide por 2");
    }
}
