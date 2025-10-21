import java.util.*;

// ===== Interface comum para todos os serviços =====
interface CanalMensagem {
    void enviarMensagem(String mensagem);
}

// ===== Implementações concretas =====
class ServicoSMS implements CanalMensagem {
    @Override
    public void enviarMensagem(String mensagem) {
        System.out.println("📱 Enviando SMS: " + mensagem);
    }
}

class ServicoEmail implements CanalMensagem {
    @Override
    public void enviarMensagem(String mensagem) {
        System.out.println("📧 Enviando e-mail: " + mensagem);
    }
}

class ServicoWhatsApp implements CanalMensagem {
    @Override
    public void enviarMensagem(String mensagem) {
        System.out.println("💬 Enviando WhatsApp: " + mensagem);
    }
}

class ServicoRedesSociais implements CanalMensagem {
    @Override
    public void enviarMensagem(String mensagem) {
        System.out.println("🌐 Postando nas redes sociais: " + mensagem);
    }
}

// ===== Classe principal =====
public class App {
    public static void main(String[] args) {
        // Lista de serviços que implementam a mesma interface
        List<CanalMensagem> canais = Arrays.asList(
            new ServicoSMS(),
            new ServicoEmail(),
            new ServicoWhatsApp(),
            new ServicoRedesSociais()
        );

        // Mensagem genérica para todos os canais
        String mensagem = "🔥 Promoção imperdível! Descontos até 50%!";

        System.out.println("=== Enviando mensagens de marketing ===");
        for (CanalMensagem canal : canais) {
            canal.enviarMensagem(mensagem);
        }

        System.out.println("\n✅ Mensagem enviada com sucesso para todos os canais!");
    }
}
