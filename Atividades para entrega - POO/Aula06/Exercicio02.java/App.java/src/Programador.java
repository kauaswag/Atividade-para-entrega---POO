public class Programador extends Empregado {

    private float qtdeHoras;
    private float valorHora;

    public Programador(String nome, String matricula, float qtdeHoras, float valorHora) {
        super(nome, matricula);
        this.qtdeHoras = qtdeHoras;
        this.valorHora = valorHora;
    }

    @Override
    public float calculaSalario() {
        return qtdeHoras * valorHora;
    }
}
