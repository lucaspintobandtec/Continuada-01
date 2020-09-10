package br.com.bandtec.Continuada01;

public class App {

    public static void main(String[] args) {
        PersonagemController pe = new PersonagemController();

        Personagem p = new Sayajin("Terra", "Goku", "Kamehameha", 1500.00, 2);
        Personagem p2 = new Sayajin("Vegeta", "Vegeta", "Final Flash", 5000.00, 3);
        Personagem p3 = new Namekuseijin("Namek", "Piccolo", "Makankosappo", 3000.00, 3);

        pe.addPoder(p);
        pe.addPoder(p2);
        pe.addPoder(p3);

        pe.mostraPersonagens();

        pe.exibePoderMaiorQue8000Mil();
    }
}
