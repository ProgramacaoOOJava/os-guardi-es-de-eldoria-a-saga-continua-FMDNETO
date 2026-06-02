import java.util.ArrayList;
import java.util.List;
/**
 * Classe que representa um Mago no reino de Eldoria.
 * Herda de Personagem e implementa habilidades específicas de magia.
 */
public class Mago extends Personagem implements Auditavel {

    private List<String> acoesAuditadas;

    // * Construtor para criar um Mago.
    public Mago(String nome, int nivel, int pontosDeVida, double poderBase) {
        super(nome, "Mago", nivel, pontosDeVida, poderBase);
        this.acoesAuditadas = new ArrayList<>();
    }

    @Override
    public void registrarAcao(String acao) {
        acoesAuditadas.add(acao);
    }

    @Override
    public void auditarAcoes() {
        System.out.println("=== AÇÕES AUDITADAS ===");
        for (String acao : acoesAuditadas) {
            System.out.println(acao);
        }
    }


    /**
     * Sobrescrita do método usarHabilidade() específica para Magos.
     * Demonstra polimorfismo e vinculação dinâmica.
     */
    @Override
    public void usarHabilidade() {
        System.out.println(getNome() + " conjura uma poderosa magia de fogo!");
    }
}

