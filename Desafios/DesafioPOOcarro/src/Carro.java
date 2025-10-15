public class Carro {
    private boolean ligado;
    private int marcha;
    private int velocidade;

    // Construtor — estado inicial do carro
    public Carro() {
        this.ligado = false;
        this.marcha = 0;
        this.velocidade = 0;
    }

    // Ligar o carro
    public void ligar() {
        if (ligado) {
            System.out.println("O carro já está ligado!");
        } else {
            ligado = true;
            System.out.println("Carro ligado com sucesso!");
        }
    }

    // Desligar o carro
    public void desligar() {
        if (!ligado) {
            System.out.println("O carro já está desligado!");
        } else if (velocidade == 0 && marcha == 0) {
            ligado = false;
            System.out.println("Carro desligado com segurança.");
        } else {
            System.out.println("Não é possível desligar o carro em movimento ou com marcha engatada!");
        }
    }

    // Acelerar
    public void acelerar() {
        if (!ligado) {
            System.out.println("O carro está desligado. Ligue o carro antes de acelerar.");
            return;
        }
        if (marcha == 0) {
            System.out.println("O carro está em ponto morto. Engate uma marcha para acelerar.");
            return;
        }

        int limiteMaximo = switch (marcha) {
            case 1 -> 20;
            case 2 -> 40;
            case 3 -> 60;
            case 4 -> 80;
            case 5 -> 100;
            case 6 -> 120;
            default -> 0;
        };

        if (velocidade >= limiteMaximo) {
            System.out.println("Velocidade máxima permitida para a " + marcha + "ª marcha atingida!");
        } else {
            velocidade++;
            System.out.println("Acelerando... Velocidade atual: " + velocidade + " km/h");
        }
    }

    // Frear
    public void frear() {
        if (!ligado) {
            System.out.println("O carro está desligado. Não dá pra frear.");
            return;
        }
        if (velocidade == 0) {
            System.out.println("O carro já está parado.");
        } else {
            velocidade--;
            System.out.println("Freando... Velocidade atual: " + velocidade + " km/h");
        }
    }

    // Trocar marcha
    public void trocarMarcha(int novaMarcha) {
        if (!ligado) {
            System.out.println("O carro está desligado. Ligue o carro antes de trocar de marcha.");
            return;
        }
        if (novaMarcha < 0 || novaMarcha > 6) {
            System.out.println("Marcha inválida! Escolha entre 0 e 6.");
            return;
        }
        if (Math.abs(novaMarcha - marcha) > 1) {
            System.out.println("Não é permitido pular marchas!");
            return;
        }
        marcha = novaMarcha;
        System.out.println("Marcha atual: " + marcha);
    }

    // Virar o carro
    public void virar(String direcao) {
        if (!ligado) {
            System.out.println("O carro está desligado. Não dá pra virar.");
            return;
        }
        if (velocidade < 1 || velocidade > 40) {
            System.out.println("Velocidade inválida para virar! (1-40 km/h)");
            return;
        }
        if (!direcao.equalsIgnoreCase("esquerda") && !direcao.equalsIgnoreCase("direita")) {
            System.out.println("Direção inválida! Escolha 'esquerda' ou 'direita'.");
            return;
        }
        System.out.println("Virando para " + direcao + "...");
    }

    // Verificar velocidade
    public void verificarVelocidade() {
        System.out.println("Velocidade atual: " + velocidade + " km/h");
    }
}
