public interface Auditavel {
    /**
     * Defina uma interface chamada Auditavel, com os métodos:
     * registrarAcao(String acao)
     * auditarAcoes()
     * Apenas a classe MAGO deve implementar a interface Auditavel, registrando as ações realizadas por cada Mago e permitindo auditar essas ações posteriormente.
     */
    void registrarAcao(String acao);
    void auditarAcoes();
}
