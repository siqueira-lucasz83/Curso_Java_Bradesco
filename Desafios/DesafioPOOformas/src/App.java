import java.util.*;

// ===== Interface =====
interface Forma {
    double calcularArea();
}

// ===== Classes concretas =====
class Quadrado implements Forma {
    private double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return lado * lado;
    }
}

class Retangulo implements Forma {
    private double base;
    private double altura;

    public Retangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return base * altura;
    }
}

class Circulo implements Forma {
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * raio * raio;
    }
}

class Triangulo implements Forma {
    private double base;
    private double altura;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return (base * altura) / 2;
    }
}

// ===== Classe principal =====
public class App {
    public static void main(String[] args) {
        List<Forma> formas = Arrays.asList(
            new Quadrado(5),
            new Retangulo(4, 6),
            new Circulo(3),
            new Triangulo(4, 5)
        );

        System.out.println("===== Cálculo de áreas =====");
        for (Forma forma : formas) {
            System.out.println(
                forma.getClass().getSimpleName() + " - Área: " + forma.calcularArea()
            );
        }
    }
}
