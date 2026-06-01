public class Curandeiro {
    // * Construtor para criar um Curandeiro.
    public Curandeiro(String nome, int nivel, int pontosDeVida, double poderBase) {
        super(nome, "Curandeiro", nivel, pontosDeVida, poderBase);
    }

    /**
     * Sobrescrita do método usarHabilidade() específica para Curandeiros.
     * Demonstra polimorfismo e vinculação dinâmica.
     */
    @Override
    public void usarHabilidade() {
        System.out.println(getNome() + " lança um feitiço de cura para restaurar a saúde!");
    }
}
