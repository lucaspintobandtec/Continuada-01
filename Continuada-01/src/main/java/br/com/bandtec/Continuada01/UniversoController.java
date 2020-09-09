package br.com.bandtec.Continuada01;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController

public class UniversoController {

    private List<Personagem> perso = new ArrayList<>();

    public void addSuperPoder(Personagem personagem){
        perso.add(personagem);
    }

    public void mostraPersonagens(){
        System.out.println("Mostrando todos Personagens: ");
        for (Personagem p : perso){
            System.out.println(p);
        }
    }

    public void exibePoderMaiorQue8000Mil(){
        System.out.println("Poderes maior que 8000 mil: ");
        for (Personagem p : perso){
            if (p.calcularPoder() > 8000){
                System.out.println(p);
            }
        }
    }

    public static void main(String[] args) {
        UniversoController u = new UniversoController();

        Personagem p = new SuperPoder("Dbz", "Goku","Kamehameha",1000.00);
        Personagem p2 = new SuperPoder("Dbz", "Vegeta","Final Flash",5000.00);

        u.addSuperPoder(p);
        u.addSuperPoder(p2);

        u.mostraPersonagens();

        u.exibePoderMaiorQue8000Mil();

    }
}
