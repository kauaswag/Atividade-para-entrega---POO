public class Triangulo extends Forma {

    protected double base;
    protected double altura;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double area() {
        return base * altura;
    }

    @Override
    public double perimetro() {
        return 0;
    }

    @Override
    public void mostra() {
        System.out.println("Triângulo:");
        System.out.println("Base: " + base);
        System.out.println("Altura: " + altura);
        System.out.println("Área: " + area());
        System.out.println("----------------------");
    }
}
