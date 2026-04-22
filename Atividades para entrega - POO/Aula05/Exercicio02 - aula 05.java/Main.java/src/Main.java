import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Triangulo triangulo1 = new Triangulo(10, 5);

        Triangulo triangulo2 = new Triangulo();

        System.out.println("Digite a base do triângulo 2:");
        triangulo2.setBase(scanner.nextDouble());

        System.out.println("Digite a altura do triângulo 2:");
        triangulo2.setAltura(scanner.nextDouble());

        System.out.println("\nTriângulo 1:");
        triangulo1.imprimirDados();

        System.out.println("Triângulo 2:");
        triangulo2.imprimirDados();

        scanner.close();
    }
}
