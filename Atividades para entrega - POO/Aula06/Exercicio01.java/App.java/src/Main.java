import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o raio da circunferência: ");
        double raio = scanner.nextDouble();
        Circunferencia c = new Circunferencia(raio);

        System.out.print("Digite a base do retângulo: ");
        double base = scanner.nextDouble();

        System.out.print("Digite a altura do retângulo: ");
        double altura = scanner.nextDouble();
        Retangulo r = new Retangulo(base, altura);

        System.out.print("Digite a base do triângulo: ");
        double baseTri = scanner.nextDouble();

        System.out.print("Digite a altura do triângulo: ");
        double alturaTri = scanner.nextDouble();

        Triangulo t = new Triangulo(baseTri, alturaTri);

        System.out.println("\n=== RESULTADOS ===");
        c.mostra();
        r.mostra();
        t.mostra();

        scanner.close();
    }
}