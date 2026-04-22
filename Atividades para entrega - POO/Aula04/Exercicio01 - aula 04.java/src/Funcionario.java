public class Funcionario {
    private int cracha;
    private float salario;
    private String cargo;


    Funcionario (){
        cargo = "assistente";

    }

    Funcionario (int c, float s, String car){
        cracha = c;
        salario = s;
        cargo = car;
    }

    float getSalario (){
        return salario;
    }

    void setSalario (float s){
        this.salario = s;
    }
    void calculaAumento (float percentual){
        float aumento = (salario * percentual);
        salario = salario + aumento;
    }
    void calculaAumento (int tempo){
        float aumento = 150 * tempo;
        salario = salario + aumento;     
    }
    void ajustaSalario (Funcionario func){
        if (func.salario > this.salario){
            this.salario = func.salario;
        }
    }
    Funcionario duplicar (){
        Funcionario copia = new Funcionario();
        copia.cracha = this.cracha;
        copia.salario = this.salario;
        copia.cargo = this.cargo;
        return copia;

    }

    void imprimeDados (){
        System.out.println("Cracha: " + cracha);
        System.out.println("Salario: " + salario);
        System.out.println("Cargo: " + cargo);
    }
}