import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

// ==========================
// INTERFACES FUNCIONAIS E PAGAMENTO
// ==========================

// Interface funcional para filtros
@FunctionalInterface
interface Filtro {
    boolean aplicar(String s);
}

// Interface de pagamento com default e static
interface Pagamento {
    void processar(double valor);

    default void validar(double valor) {
        if (valor <= 0) System.out.println("Valor inválido!");
        else System.out.println("Valor válido.");
    }

    static void imprimirRecibo(double valor) {
        System.out.println("Recibo: R$" + valor);
    }
}

// Classe de pagamento concreta
class PagamentoPix implements Pagamento {
    @Override
    public void processar(double valor) {
        System.out.println("Pagamento via Pix de R$" + valor);
    }
}

// Interface para reembolso
interface Reembolsavel {
    void reembolsar(double valor);
}

// Classe que implementa Pagamento e Reembolsavel
class PagamentoCartao implements Pagamento, Reembolsavel {
    @Override
    public void processar(double valor) {
        System.out.println("Pagamento via Cartão de R$" + valor);
    }

    @Override
    public void reembolsar(double valor) {
        System.out.println("Reembolso via Cartão de R$" + valor);
    }
}

// ==========================
// CLASSE PRINCIPAL – AULAPOO04
// ==========================
public class AulaPOO04 {

    public static void main(String[] args) {

        // --- Parte 1: Usando pagamento e métodos default/static ---
        Pagamento pix = new PagamentoPix();
        pix.validar(100);       // usa método default
        pix.processar(100);
        Pagamento.imprimirRecibo(100); // chama método static

        PagamentoCartao cartao = new PagamentoCartao();
        cartao.processar(250);
        cartao.reembolsar(50);

        System.out.println("=================================");

        // --- Parte 2: Lambda com interface funcional ---
        Filtro comecaComA = s -> s.startsWith("A");
        Filtro maiorQueCinco = s -> s.length() > 5;

        System.out.println(comecaComA.aplicar("Abacaxi"));  // true
        System.out.println(maiorQueCinco.aplicar("Maçã"));  // false

        System.out.println("=================================");

        // --- Parte 3: Streams + filtro ---
        List<String> produtos = Arrays.asList("abacaxi", "banana", "ameixa", "maçã", "amora");

        // Filtrar produtos que começam com "A"
        List<String> filtrados = produtos.stream()
                .filter(s -> comecaComA.aplicar(s))
                .collect(Collectors.toList());
        System.out.println("Produtos que começam com A: " + filtrados);

        // Filtrar produtos com mais de 5 letras
        List<String> longas = produtos.stream()
                .filter(s -> maiorQueCinco.aplicar(s))
                .collect(Collectors.toList());
        System.out.println("Produtos com mais de 5 letras: " + longas);

        System.out.println("=================================");

        // --- Parte 4: Transformando strings com lambda + Function ---
        Function<String, String> primeiraMaiuscula = s ->
                Character.toUpperCase(s.charAt(0)) + s.substring(1);

        List<String> produtosFormatados = produtos.stream()
                .map(primeiraMaiuscula)
                .collect(Collectors.toList());

        System.out.println("Produtos formatados: " + produtosFormatados);

        System.out.println("=================================");

        // --- Parte 5: Mini desafio ---
        // Filtrar produtos que terminam com "a" e colocar em maiúsculas
        List<String> terminamComA = produtos.stream()
                .filter(s -> s.endsWith("a"))
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println("Produtos terminando com 'a' em maiúsculas: " + terminamComA);
    }
}
