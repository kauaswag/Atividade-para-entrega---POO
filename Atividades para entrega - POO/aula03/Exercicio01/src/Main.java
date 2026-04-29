import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception {

        Triangulo t1 = new Triangulo();
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite a base do triângulo: ");
        t1.base = leitor.nextFloat();
        System.out.print("Digite a altura do triângulo: ");
        t1.altura = leitor.nextFloat();

        t1.imprimeDados();

        float area = t1.calcularArea();
        System.out.println("A área do triângulo é: " + area);


        Data DT = new Data();
        DT.imprimeData();
        DT.cadastraDados();

    }

}
