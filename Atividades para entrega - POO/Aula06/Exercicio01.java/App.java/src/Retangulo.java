public class Retangulo extends Triangulo {

    public Retangulo(double base, double altura) {
        super(base, altura);
    }

    @Override
    public double area() {
        return base * altura;
    }

    @Override
    public double perimetro() {
        return 2 * (base + altura);
    }

    @Override
    public void mostra() {
        System.out.println("Retângulo:");
        System.out.println("Base: " + base);
        System.out.println("Altura: " + altura);
        System.out.println("Área: " + area());
        System.out.println("Perímetro: " + perimetro());
        System.out.println("----------------------");
    }
}