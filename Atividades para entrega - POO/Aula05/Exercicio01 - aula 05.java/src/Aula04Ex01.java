public class Aula04Ex01 {
    public static void main(String[] args) {
        Funcionario func01 = new Funcionario();
        func01.imprimeDados();

        Funcionario func02 = new Funcionario(1234,2000, "Vendedor");
        func02.imprimeDados();

        func01.setSalario (5000);
        func01.calculaAumento(0.1f);
        func01.imprimeDados();

        func02.calculaAumento(5);
        func02.imprimeDados();

        func02.ajustaSalario(func01);
        func02.imprimeDados();

        Funcionario func03 = func02.duplicar();
        func03.imprimeDados();
        System.out.println("---Funcionário 3---");
        func03.imprimeDados();
    }
}
