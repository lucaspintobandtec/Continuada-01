package br.com.bandtec.Continuada01;


public abstract class Personagem {

    private String planeta;
    private String nome;
    private String nomeDoPoder;
    private Double nivelDePoder;

    public Personagem(String planeta, String nome, String nomeDoPoder, Double nivelDePoder) {
        this.planeta = planeta;
        this.nome = nome;
        this.nomeDoPoder = nomeDoPoder;
        this.nivelDePoder = nivelDePoder;
    }

    public abstract Double calcularPoder();

    public String getPlaneta() {
        return planeta;
    }

    public String getNome() {
        return nome;
    }

    public String getNomeDoPoder() {
        return nomeDoPoder;
    }

    public Double getNivelDePoder() {
        return nivelDePoder;
    }

    @Override
    public String toString() {
        return "Personagem{" +
                "planeta='" + planeta + '\'' +
                ", nome='" + nome + '\'' +
                ", nomeDoPoder='" + nomeDoPoder + '\'' +
                ", nivelDePoder=" + nivelDePoder +
                '}';
    }
}
