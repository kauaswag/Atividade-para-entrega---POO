import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("CONTA 1");

        System.out.print("Nome: ");
        String nome1 = scanner.nextLine();

        System.out.print("Saldo inicial: ");
        float saldo1 = scanner.nextFloat();

        System.out.print("Limite: ");
        float limite1 = scanner.nextFloat();

        System.out.print("Tipo (C/P): ");
        char tipo1 = scanner.next().charAt(0);

        ContaCorrente c1 = new ContaCorrente(nome1, saldo1, limite1, tipo1);

        c1.depositar(100);
        c1.sacar(50);

        scanner.nextLine();

        System.out.println("CONTA 2");

        ContaCorrente c2 = new ContaCorrente();

        System.out.print("Nome: ");
        String nome2 = scanner.nextLine();

        System.out.print("Saldo inicial: ");
        float saldo2 = scanner.nextFloat();

        System.out.print("Limite: ");
        float limite2 = scanner.nextFloat();

        System.out.print("Tipo (C/P): ");
        char tipo2 = scanner.next().charAt(0);

        c2.cadastraDados(nome2, saldo2, limite2, tipo2);

        c2.depositar(200);
        c2.sacar(80);

        System.out.println("RESULTADOS");
        System.out.println(c1.imprimeDados());
        System.out.println(c2.imprimeDados());

        scanner.close();
    }
}
