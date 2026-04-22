public class Main {

    public static void main(String[] args) {
        
        Torneio t1 = new Torneio("Campeonato Escolar", 12);


        Torneio t2 = new Torneio();
        t2.setNome("Torneio Regional");
        t2.setIdade(25);

        t1.imprimirDados();
        t2.imprimirDados();
    }
}