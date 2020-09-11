package br.com.bandtec.Continuada01;

public class Namekuseijin extends Personagem {

    private Integer regeneracao;

    public Namekuseijin(String planeta, String nome, String nomeDoPoder, Double nivelDePoder, Integer regeneracao) {
        super(planeta, nome, nomeDoPoder, nivelDePoder);
        this.regeneracao = regeneracao;
    }

    public Integer getRegeneracao() {
        return regeneracao;
    }

    @Override
    public Double calcularPoder() {
        return getNivelDePoder() * regeneracao;
    }

    @Override
    public String toString() {
        return "Namekuseijin{" +
                "regeneracao=" + regeneracao +
                "} " + super.toString();
    }
}
