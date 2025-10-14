// Exemplo simples de record em Java
public class AulaPOO02 {

    // Criando um record chamado Pessoa
    // Ele armazena dados fixos: nome e idade
    public record Pessoa(String nome, int idade) { }

    public static void main(String[] args) {
        
        // Criando um objeto do tipo Pessoa
        Pessoa p1 = new Pessoa("Lucas", 19);
        Pessoa p2 = new Pessoa("Ana", 22);

        // Acessando os valores (usando métodos automáticos)
        System.out.println("Pessoa 1: " + p1.nome() + " - Idade: " + p1.idade());
        System.out.println("Pessoa 2: " + p2.nome() + " - Idade: " + p2.idade());

        // Comparando dois objetos record
        if (p1.equals(p2)) {
            System.out.println("São a mesma pessoa!");
        } else {
            System.out.println("Pessoas diferentes!");
        }

        // Exibindo o toString() automático do record
        System.out.println("Detalhes: " + p1);
    }
}
