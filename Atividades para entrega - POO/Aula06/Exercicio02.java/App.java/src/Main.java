import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println(" ANALISTA ");
        System.out.print("Nome: ");
        String nomeA = scanner.nextLine();

        System.out.print("Matrícula: ");
        String matA = scanner.nextLine();

        System.out.print("Quantos projetos? ");
        int n = scanner.nextInt();

        float[] valores = new float[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Valor do projeto " + (i + 1) + ": ");
            valores[i] = scanner.nextFloat();
        }

        Analista analista = new Analista(nomeA, matA, valores);

        scanner.nextLine();

        System.out.println(" PROGRAMADOR ");
        System.out.print("Nome: ");
        String nomeP = scanner.nextLine();

        System.out.print("Matrícula: ");
        String matP = scanner.nextLine();

        System.out.print("Quantidade de horas: ");
        float horas = scanner.nextFloat();

        System.out.print("Valor por hora: ");
        float valorHora = scanner.nextFloat();

        Programador programador = new Programador(nomeP, matP, horas, valorHora);

        System.out.println("RESULTADOS ");

        System.out.println("Analista:");
        System.out.println("Nome: " + analista.getNome());
        System.out.println("Matrícula: " + analista.getMatricula());
        System.out.println("Salário: " + analista.calculaSalario());

        System.out.println("----------------------");

        System.out.println("Programador:");
        System.out.println("Nome: " + programador.getNome());
        System.out.println("Matrícula: " + programador.getMatricula());
        System.out.println("Salário: " + programador.calculaSalario());

        scanner.close();
    }
}
