package br.com.bandtec.Continuada01;

public class Sayajin extends Personagem {

    private Integer transformacao;

    public Sayajin(String planeta, String nome, String nomeDoPoder, Double nivelDePoder, Integer transformacao) {
        super(planeta, nome, nomeDoPoder, nivelDePoder);
        this.transformacao = transformacao;
    }

    public Integer getTransformacao() {
        return transformacao;
    }

    @Override
    public Double calcularPoder() {
        return getNivelDePoder() * transformacao;
    }

    @Override
    public String toString() {
        return "Sayajin{" +
                "transformacao=" + transformacao +
                "} " + super.toString();
    }
}
