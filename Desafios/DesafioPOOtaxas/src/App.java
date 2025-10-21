import java.util.*;

// ===== Interface =====
interface Tributavel {
    double calcularImposto();
}

// ===== Classes de produtos =====
class Alimentacao implements Tributavel {
    private double preco;

    public Alimentacao(double preco) {
        this.preco = preco;
    }

    @Override
    public double calcularImposto() {
        return preco * 0.01; // 1%
    }

    public double getPreco() {
        return preco;
    }
}

class SaudeBemEstar implements Tributavel {
    private double preco;

    public SaudeBemEstar(double preco) {
        this.preco = preco;
    }

    @Override
    public double calcularImposto() {
        return preco * 0.015; // 1.5%
    }

    public double getPreco() {
        return preco;
    }
}

class Vestuario implements Tributavel {
    private double preco;

    public Vestuario(double preco) {
        this.preco = preco;
    }

    @Override
    public double calcularImposto() {
        return preco * 0.025; // 2.5%
    }

    public double getPreco() {
        return preco;
    }
}

class Cultura implements Tributavel {
    private double preco;

    public Cultura(double preco) {
        this.preco = preco;
    }

    @Override
    public double calcularImposto() {
        return preco * 0.04; // 4%
    }

    public double getPreco() {
        return preco;
    }
}

// ===== Classe principal =====
public class App {
    public static void main(String[] args) {
        List<Tributavel> produtos = Arrays.asList(
            new Alimentacao(100),
            new Alimentacao(50),
            new SaudeBemEstar(200),
            new Vestuario(150),
            new Cultura(120)
        );

        System.out.println("===== Cálculo de tributos =====");
        double totalImpostos = 0;

        for (Tributavel produto : produtos) {
            double imposto = produto.calcularImposto();
            totalImpostos += imposto;
            System.out.println(produto.getClass().getSimpleName() + 
                               " - Preço: R$" + (produto instanceof Alimentacao ? ((Alimentacao)produto).getPreco() :
                                                  produto instanceof SaudeBemEstar ? ((SaudeBemEstar)produto).getPreco() :
                                                  produto instanceof Vestuario ? ((Vestuario)produto).getPreco() :
                                                  ((Cultura)produto).getPreco())
                               + " - Imposto: R$" + imposto);
        }

        System.out.println("---------------------------------");
        System.out.println("Total de impostos: R$" + totalImpostos);
    }
}
