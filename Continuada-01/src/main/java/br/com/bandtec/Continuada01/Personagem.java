package br.com.bandtec.Continuada01;


public abstract class Personagem {

    private String Universo;
    private String nome;

    public Personagem(String universo, String nome) {
        Universo = universo;
        this.nome = nome;
    }

    public abstract Double calcularPoder();

    public String getUniverso() {
        return Universo;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Personagem{" +
                "Universo='" + Universo + '\'' +
                ", nome='" + nome + '\'' +
                '}';
    }
}
