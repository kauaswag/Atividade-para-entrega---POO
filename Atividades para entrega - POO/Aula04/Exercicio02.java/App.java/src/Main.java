public class Main {
    public static void main(String[] args) {

        ContaConsumo conta1 = new ContaConsumo();
        conta1.imprimeDados();
        conta1.pagarConta();
        conta1.imprimeDados();

        System.out.println("\n----------------------\n");

        ContaConsumo conta2 = new ContaConsumo("Energia elétrica", 500.00);
        conta2.imprimeDados();

        conta2.pagarConta(11);

        conta2.imprimeDados();

        System.out.println("\n----------------------\n");

        conta2.pagarConta(1);
    }
}
