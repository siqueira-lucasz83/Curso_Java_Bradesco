// Herança e polimorfismo

abstract sealed class Animal permits Cachorro, Gato {
    protected String nome;

    public Animal(String nome) {
        this.nome = nome;
    }

    public abstract void emitirSom();

    public void dormir() {
        System.out.println(nome + " está dormindo.");
    }
}

final class Cachorro extends Animal {
    public Cachorro(String nome) {
        super(nome);
    }

    @Override
    public void emitirSom() {
        System.out.println(nome + " está latindo: au au!");
    }

    protected void abanarRabo() {
        System.out.println(nome + " está abanando o rabo.");
    }
}

non-sealed class Gato extends Animal {
    public Gato(String nome) {
        super(nome);
    }

    @Override
    public void emitirSom() {
        System.out.println(nome + " está miando: miau!");
    }

    protected void arranhar() {
        System.out.println(nome + " está arranhando o sofá.");
    }
}

class GatoPersa extends Gato {
    public GatoPersa(String nome) {
        super(nome);
    }

    @Override
    public void emitirSom() {
        System.out.println(nome + " está miando baixinho: miiiau...");
    }
}

public class AulaPOO03 {
    public static void main(String[] args) {
        Cachorro c = new Cachorro("Rex");
        Gato g = new Gato("Luna");
        GatoPersa gp = new GatoPersa("Mimi");

        c.emitirSom();
        c.dormir();
        c.abanarRabo();

        System.out.println();

        g.emitirSom();
        g.dormir();
        g.arranhar();

        System.out.println();

        gp.emitirSom();
        gp.dormir();
    }
}
