package br.com.bandtec.Continuada01;

import java.util.ArrayList;
import java.util.List;

public class SuperPoder extends Personagem {

    private String nomeDoPoder;
    private Double nivelDePoder;


    public SuperPoder(String universo, String nome, String nomeDoPoder, Double nivelDePoder) {
        super(universo, nome);
        this.nomeDoPoder = nomeDoPoder;
        this.nivelDePoder = nivelDePoder;
    }

    public String getNomeDoPoder() {
        return nomeDoPoder;
    }

    public Double getNivelDePoder() {
        return nivelDePoder;
    }

    @Override
    public Double calcularPoder() {
        return nivelDePoder * 2;
    }

    @Override
    public String toString() {
        return "SuperPoder{" +
                "nomeDoPoder='" + nomeDoPoder + '\'' +
                ", nivelDePoder=" + nivelDePoder +
                "} " + super.toString();
    }
}
