package br.com.bandtec.Continuada01;

import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController

public class PersonagemController {

    private List<Personagem> perso = new ArrayList<>();

    public void addPoder(Personagem personagem) {
        perso.add(personagem);
    }

    public void mostraPersonagens() {
        System.out.println("Mostrando todos Personagens: ");
        for (Personagem p : perso) {
            System.out.println(p);
        }
    }

    public void exibePoderMaiorQue8000Mil() {
        System.out.println("É mais de 8 mil: ");
        for (Personagem p : perso) {
            if (p.calcularPoder() > 8000) {
                System.out.println(p);
            }
        }
    }
}
