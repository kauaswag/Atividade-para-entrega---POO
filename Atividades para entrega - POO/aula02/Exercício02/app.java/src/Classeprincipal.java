import java.util.Scanner;

public class Classeprincipal {
    public static void main(String[] args) {

        Produto TipoProduto = new Produto();
        Scanner sc = new Scanner(System.in);

        // System.out.println("Digite a marca:");
        // TipoProduto.marca = sc.nextLine();

        // System.out.println("Digite o fabricante:");
        // TipoProduto.fabricante = sc.nextLine();

        // System.out.println("Digite o código de barras:");
        // TipoProduto.cod_barras = sc.nextLine();

        // System.out.println("Digite o preço:");
        // TipoProduto.preco = sc.nextFloat();

        System.out.println("--- Dados do produto ---");
        System.out.println("Marca: " + TipoProduto.marca);
        System.out.println("Fabricante: " + TipoProduto.fabricante);
        System.out.println("Código de barras: " + TipoProduto.cod_barras);
        System.out.println("Preço: " + TipoProduto.preco);

        Produto p2 = new Produto();
        p2.imprimeDados();

    }
}