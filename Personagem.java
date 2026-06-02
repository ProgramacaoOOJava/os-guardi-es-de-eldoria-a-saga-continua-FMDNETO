
import java.util.Objects;

/**
 * Classe base para representar personagens do reino de Eldoria.
 * Aplica conceitos de encapsulamento, herança e polimorfismo.
 */
public abstract class Personagem {
    // Atributos privados (encapsulamento)
    private String nome;
    private String classe;
    private int nivel;
    private int pontosDeVida;
    private double poderBase;
    

    // * Construtor que inicializa todos os atributos do personagem.
    public Personagem(String nome, String classe, int nivel, int pontosDeVida, double poderBase) {
        this.nome = nome;
        this.classe = classe;
        this.pontosDeVida = pontosDeVida;
        this.poderBase = poderBase;
        this.nivel = nivel;
        
    }

    // Getters
    public String getNome() {
        return nome;
    }
    public String getClasse() {
        return classe;
    }
    public int getPontosDeVida() {
        return pontosDeVida;
    }
    public int getNivel() {
        return nivel;
    }
    public double getPoderBase() {
        return poderBase;
    }
    
    // Setters com validações
    public void setNome(String nome) {
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("O nome do personagem não pode ser vazio.");
        }
        this.nome = nome;
    }
    public void setClasse(String classe) {
        if (classe == null || classe.trim().isEmpty()) {
            throw new IllegalArgumentException("A classe do personagem não pode ser vazia.");
        }
        this.classe = classe;
    }
    public void setPontosDeVida(int pontosDeVida) {
        if (pontosDeVida < 0) {
            throw new IllegalArgumentException("Os pontos de vida não podem ser negativos.");
        }
        this.pontosDeVida = pontosDeVida;
    }
    public void setNivel(int nivel) {
        if (nivel < 1) {
            throw new IllegalArgumentException("O nível do personagem deve ser pelo menos 1.");
        }
        this.nivel = nivel;
    }
    public void setPoderBase(double poderBase) {
        if (poderBase < 0) {
            throw new IllegalArgumentException("O poder base não pode ser negativo.");
        }
        this.poderBase = poderBase;
    }


    // * Criar métodos que define os pontos de vida do personagem.
    public void definirPontosDeVida(int pontosDeVida) {
        if (pontosDeVida < 0) {
            throw new IllegalArgumentException("Os pontos de vida não podem ser negativos.");
        }
        this.pontosDeVida = pontosDeVida;
    }


    /**
     * Criar método que define a habilidade do personagem.
     * Deve ser sobrescrito pelas subclasses para implementar comportamentos específicos.
     */
    public abstract void usarHabilidade();

    //Método que exibe informações do personagem, incluindo nome, classe, nível, pontos de vida e poder base.
    public void exibirStatus(){
        System.out.println("=== STATUS DO PERSONAGEM ===");
        System.out.println("Nome: " + nome);
        System.out.println("Classe: " + classe);
        System.out.println("Nível: " + nivel);
        System.out.println("Pontos de Vida: " + pontosDeVida);
        System.out.println("Poder Base: " + poderBase); 
    }

    //método protegido (protected) chamado atribuirBencao(double valor), que aumenta poderBase.
    protected void atribuirBencao(double valor) {
        if (valor < 0) {
            throw new IllegalArgumentException("O valor da bênção não pode ser negativo.");
        }
        this.poderBase += valor;
        System.out.println(nome + " recebeu uma bênção! Poder base aumentado para: " + poderBase);
    }
        

    /**
     * Sobrescrita do método toString() para exibir informações do personagem.
     * return String formatada com todos os atributos do personagem
     */
    @Override
    public String toString() {
        return String.format("Personagem: %s, Classe: %s, Nível: %d, Pontos de Vida: %d, Poder Base: %.2f",
                nome, classe, nivel, pontosDeVida, poderBase);
    }

    /**
     * Sobrescrita do método equals() para comparar personagens.
     * Dois personagens são considerados iguais se tiverem o mesmo nome e classe.
     * @param obj Objeto a ser comparado
     * @return true se os personagens forem iguais, false caso contrário
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Personagem that = (Personagem) obj;
        return Objects.equals(nome, that.nome) && Objects.equals(classe, that.classe);
    }

    /**
     * Sobrescrita do método hashCode() para ser consistente com equals().
     * @return Código hash baseado no nome e classe
     */
    @Override
    public int hashCode() {
        return Objects.hash(nome, classe);
    }
}

