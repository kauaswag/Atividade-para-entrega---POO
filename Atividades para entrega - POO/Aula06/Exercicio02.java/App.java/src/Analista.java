public class Analista extends Empregado {

    private float[] valorPorProjeto;

    public Analista(String nome, String matricula, float[] valorPorProjeto) {
        super(nome, matricula);
        this.valorPorProjeto = valorPorProjeto;
    }

    @Override
    public float calculaSalario() {
        float soma = 0;
        for (float valor : valorPorProjeto) {
            soma += valor;
        }
        return soma;
    }
}