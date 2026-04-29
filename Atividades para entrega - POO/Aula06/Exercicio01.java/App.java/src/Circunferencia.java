public class Circunferencia extends Forma {

    private double raio;

    public Circunferencia(double raio) {
        this.raio = raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(raio, 2);
    }

    @Override
    public double perimetro() {
        return 2 * Math.PI * raio;
    }

    @Override
    public void mostra() {
        System.out.println("Circunferência:");
        System.out.println("Raio: " + raio);
        System.out.println("Área: " + area());
        System.out.println("Perímetro: " + perimetro());
        System.out.println("----------------------");
    }
}