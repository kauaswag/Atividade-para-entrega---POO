import java.util.Scanner;

public class Data {
    int dia;
    int mes;
    int ano;


Data(int d, int m, int a){
    dia = d;
    mes = m;
    ano = a;
}

Data(){}

void cadastraDados(){
    Scanner leitorData = new Scanner(System.in);
        System.out.print("Digite o dia: ");
        dia = leitorData.nextInt();
        System.out.print("Digite o mês: ");
        mes = leitorData.nextInt();  
        System.out.print("Digite o ano: ");
        ano = leitorData.nextInt();
}

void imprimeData(){
    System.out.println("Dia: " + dia);
    System.out.println("Mês: " + mes);
    System.out.println("Ano: " + ano);
}
}