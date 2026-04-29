import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Paciente p1 = new Paciente();

        System.out.println("PACIENTE 1");
        System.out.print("Nome: ");
        p1.setNome(scanner.nextLine());

        System.out.print("RG: ");
        p1.setRg(scanner.nextLine());

        System.out.print("Endereço: ");
        p1.setEndereco(scanner.nextLine());

        System.out.print("Telefone: ");
        p1.setTelefone(scanner.nextLine());

        System.out.print("Data de nascimento: ");
        p1.setDataNascimento(scanner.nextLine());

        System.out.print("Profissão: ");
        p1.setProfissao(scanner.nextLine());

        System.out.println("PACIENTE 2");

        System.out.print("Nome: ");
        String nome = scanner.nextLine();

        Paciente p2 = new Paciente(nome);

        System.out.print("RG: ");
        p2.setRg(scanner.nextLine());

        System.out.print("Endereço: ");
        p2.setEndereco(scanner.nextLine());

        System.out.print("Telefone: ");
        p2.setTelefone(scanner.nextLine());

        System.out.print("Data de nascimento: ");
        p2.setDataNascimento(scanner.nextLine());

        System.out.print("Profissão: ");
        p2.setProfissao(scanner.nextLine());

        System.out.println("\n=== RESULTADOS ===");
        p1.mostrar();
        p2.mostrar();

        scanner.close();
    }
}
