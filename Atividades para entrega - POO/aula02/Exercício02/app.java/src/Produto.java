public class Produto {
    String marca;
    String fabricante;
    String cod_barras;
    float preco;

    public Produto() {}

    public Produto(String marca, String fabricante, String cod_barras, float preco) {
        this.marca = marca;
        this.fabricante = fabricante;
        this.cod_barras = cod_barras;
        this.preco = preco;
    }

    void imprimeDados() {
        System.out.println("--- Dados do produto ---");
        System.out.println("Marca: " + marca);
        System.out.println("Fabricante: " + fabricante);
        System.out.println("Código de barras: " + cod_barras);
        System.out.println("Preço: " + preco);
    }
    
    float calculaImposto(float p) {
        float imposto = preco *p;
        return imposto;
    }
}
