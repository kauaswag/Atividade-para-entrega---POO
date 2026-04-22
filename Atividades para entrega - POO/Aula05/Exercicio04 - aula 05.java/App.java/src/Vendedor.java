public class Vendedor {

    private float vendas;
    private float salario;
    private String nome;
    private int falta;

    public Vendedor(float vendas, float salario, String nome, int falta) {
        this.vendas = vendas;
        this.salario = salario;
        this.nome = nome;
        this.falta = falta;
    }

    public float getVendas() {
        return vendas;
    }

    public float getSalario() {
        return salario;
    }

    public String getNome() {
        return nome;
    }

    public int getFalta() {
        return falta;
    }

    public void setVendas(float vendas) {
        this.vendas = vendas;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setFalta(int falta) {
        this.falta = falta;
    }

    public float calcularComissao() {
        if (vendas >= 1000 && vendas < 2000) {
            return vendas * 0.10f;
        } else if (vendas >= 2000) {
            return vendas * 0.15f;
        } else {
            return 0;
        }
    }

    public float descontoFalta() {
        return (salario / 30) * falta;
    }

    public float calcularSalario() {
        return salario + calcularComissao() - descontoFalta();
    }

    public void imprimirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Vendas: " + vendas);
        System.out.println("Salário base: " + salario);
        System.out.println("Faltas: " + falta);
        System.out.println("Comissão: " + calcularComissao());
        System.out.println("Desconto por faltas: " + descontoFalta());
        System.out.println("Salário final: " + calcularSalario());
        System.out.println("==");
    }
}