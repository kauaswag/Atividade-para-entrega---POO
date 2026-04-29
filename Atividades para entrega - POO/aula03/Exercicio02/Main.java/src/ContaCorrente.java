public class ContaCorrente {

    private String nome;
    private float saldo;
    private float limite;
    private char tipo;


    public ContaCorrente(String nome, float saldo, float limite, char tipo) {
        this.nome = nome;
        this.saldo = saldo;
        this.limite = limite;
        this.tipo = tipo;
    }

    public ContaCorrente(String nome, float saldo, char tipo) {
        this.nome = nome;
        this.saldo = saldo;
        this.tipo = tipo;
        this.limite = 0;
    }


    public ContaCorrente() {}

    public void cadastraDados(String nome, float saldo, float limite, char tipo) {
        this.nome = nome;
        this.saldo = saldo;
        this.limite = limite;
        this.tipo = tipo;
    }


    public String imprimeDados() {
        return "Nome: " + nome +
               "\nSaldo: " + saldo +
               "\nLimite: " + limite +
               "\nTipo: " + tipo +
               "\n----------------------";
    }

    public void depositar(float valor) {
        if (valor > 0) {
            saldo += valor;
        }
    }

    public void sacar(float valor) {
        if (valor > 0 && saldo + limite >= valor) {
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }
}