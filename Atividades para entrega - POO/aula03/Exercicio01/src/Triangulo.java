public class Triangulo {
    float base;
    float altura;


Triangulo(float b, float a){
    base = b;
    altura = a;
}  

    Triangulo(){}

void imprimeDados() {
        System.out.println("Base: " + base);
        System.out.println("Altura: " + altura);
}

float calcularArea() {
        return (base * altura) / 2;
}

}