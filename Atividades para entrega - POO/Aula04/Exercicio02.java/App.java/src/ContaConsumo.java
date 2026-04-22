public class ContaConsumo {

    private String tipoServico;
    private double valorFatura;
    private boolean estaPaga;

    public ContaConsumo() {
        this.tipoServico = "Não informado";
        this.valorFatura = 0.0;
        this.estaPaga = false;
    }

    public ContaConsumo(String tipoServico, double valorFatura) {
        this.tipoServico = tipoServico;
        this.valorFatura = valorFatura;
        this.estaPaga = false;
    }

    public void imprimeDados() {
        System.out.println("Tipo de serviço: " + tipoServico);
        System.out.println("Valor da fatura: R$ " + valorFatura);
        System.out.println("Status: " + (estaPaga ? "Paga" : "Pendente"));
    }

    public void pagarConta() {
        this.estaPaga = true;
        System.out.println("Conta paga à vista.");
    }

    public void pagarConta(int parcelas) {

        if (parcelas < 2 || parcelas > 12) {
            System.out.println("Quantidade de parcelas inválida para este serviço.");
            return;
        }

        double taxaJuros;

        if (parcelas >= 2 && parcelas <= 6) {
            taxaJuros = 0.10;
        } else {
            taxaJuros = 0.15;
        }

        double valorTotalComJuros = valorFatura + (valorFatura * taxaJuros);
        double valorParcela = valorTotalComJuros / parcelas;

        System.out.println("Parcelamento em " + parcelas + "x");
        System.out.printf("Valor de cada parcela: R$ %.2f%n", valorParcela);
        System.out.printf("Valor total com juros: R$ %.2f%n", valorTotalComJuros);
    }
}