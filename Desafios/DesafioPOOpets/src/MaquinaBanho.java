public class MaquinaBanho {
    private int nivelAgua;
    private int nivelShampoo;
    private boolean temPet;
    private boolean petLimpo;

    // Construtor — estado inicial da máquina
    public MaquinaBanho() {
        this.nivelAgua = 30;      // capacidade máxima
        this.nivelShampoo = 10;   // capacidade máxima
        this.temPet = false;
        this.petLimpo = false;
    }

    // Colocar pet na máquina
    public void colocarPet() {
        if (temPet) {
            System.out.println("Não é possível colocar outro pet. Tem um pet na máquina!");
        } else if (!petLimpo && (nivelAgua < 3 || nivelShampoo < 1)) {
            System.out.println("A máquina precisa ser limpa antes de colocar outro pet!");
        } else {
            temPet = true;
            petLimpo = false;
            System.out.println("Pet colocado na máquina com sucesso!");
        }
    }

    // Dar banho no pet
    public void darBanho() {
        if (!temPet) {
            System.out.println("Não há pet na máquina!");
            return;
        }
        if (nivelAgua < 10 || nivelShampoo < 2) {
            System.out.println("Recursos insuficientes para dar banho. Abasteça água e shampoo.");
            return;
        }
        nivelAgua -= 10;
        nivelShampoo -= 2;
        petLimpo = true;
        System.out.println("Banho realizado com sucesso!");
    }

    // Retirar pet da máquina
    public void retirarPet() {
        if (!temPet) {
            System.out.println("Não há pet na máquina para retirar!");
            return;
        }
        if (!petLimpo) {
            System.out.println("O pet não está limpo! Será necessário limpar a máquina antes de usar novamente.");
        } else {
            System.out.println("Pet retirado da máquina com sucesso!");
        }
        temPet = false;
        petLimpo = false;
    }

    // Abastecer 2 litros de água
    public void abastecerAgua() {
        if (nivelAgua + 2 > 30) {
            System.out.println("Não é possível abastecer. Capacidade máxima de água atingida!");
            nivelAgua = 30;
        } else {
            nivelAgua += 2;
            System.out.println("Água abastecida. Nível atual: " + nivelAgua + " litros");
        }
    }

    // Abastecer 2 litros de shampoo
    public void abastecerShampoo() {
        if (nivelShampoo + 2 > 10) {
            System.out.println("Não é possível abastecer. Capacidade máxima de shampoo atingida!");
            nivelShampoo = 10;
        } else {
            nivelShampoo += 2;
            System.out.println("Shampoo abastecido. Nível atual: " + nivelShampoo + " litros");
        }
    }

    // Limpar máquina
    public void limparMaquina() {
        if (nivelAgua < 3 || nivelShampoo < 1) {
            System.out.println("Recursos insuficientes para limpeza!");
            return;
        }
        nivelAgua -= 3;
        nivelShampoo -= 1;
        petLimpo = true;
        System.out.println("Máquina limpa com sucesso!");
    }

    // Consultas
    public void verificarNivelAgua() {
        System.out.println("Nível de água: " + nivelAgua + " litros");
    }

    public void verificarNivelShampoo() {
        System.out.println("Nível de shampoo: " + nivelShampoo + " litros");
    }

    public void verificarPet() {
        if (temPet) {
            System.out.println("Há um pet na máquina. Limpo? " + petLimpo);
        } else {
            System.out.println("Não há pet na máquina.");
        }
    }
}
