public class AulaQA {

    // Exemplo 1: soma simples
    public static int somar(int a, int b) {
        return a + b;
    }

    // Exemplo 2: validação de idade
    public static boolean validaIdade(int idade) {
        return idade >= 18;
    }

    // Exemplo 3: verifica se uma string é vazia
    public static boolean isVazio(String texto) {
        return texto == null || texto.isEmpty();
    }

    public static void main(String[] args) {
        // Testando soma
        System.out.println("2 + 3 = " + somar(2, 3));
        System.out.println("-1 + 1 = " + somar(-1, 1));
        System.out.println("0 + 0 = " + somar(0, 0));

        // Testando validação de idade
        System.out.println("Idade 20 é válida? " + validaIdade(20));
        System.out.println("Idade 15 é válida? " + validaIdade(15));

        // Testando string vazia
        System.out.println("\"\" é vazia? " + isVazio(""));
        System.out.println("\"Lucas\" é vazia? " + isVazio("Lucas"));
        System.out.println("null é vazia? " + isVazio(null));
    }
}

// Exemplo de teste unitário com JUnit
/*
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class AulaQATest {

    @Test
    public void testSomar() {
        assertEquals(5, AulaQA.somar(2, 3));
        assertEquals(0, AulaQA.somar(-1, 1));
    }

    @Test
    public void testValidaIdade() {
        assertTrue(AulaQA.validaIdade(20));
    }

    @Test
    public void testIsVazio() {
        assertTrue(AulaQA.isVazio(""));
        assertTrue(AulaQA.isVazio(null));
    }
}
*/
