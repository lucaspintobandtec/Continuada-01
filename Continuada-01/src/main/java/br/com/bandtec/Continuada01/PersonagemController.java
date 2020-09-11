package br.com.bandtec.Continuada01;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/personagens")
public class PersonagemController {

    //Personagens

    private List<Personagem> perso = new ArrayList<>();


    @GetMapping("/listarTodos")
    public List<Personagem> getPersonagem() {
        return perso;
    }

    @DeleteMapping("/excluir/{id}")
    public void excluirPerso(@PathVariable int id) {
        perso.remove(id - 1);
    }

    @GetMapping("/recuperar/{id}")
    public Personagem getPerso(@PathVariable int id) {
        return perso.get(id - 1);
    }

    //Sayajin


    @PostMapping("/cadastrarS")
    public void cadastrarSayajin(@RequestBody Sayajin novoSayajin) {
        perso.add(novoSayajin);
    }


    //Namekuseijin


    @PostMapping("/cadastrarN")
    public void cadastrarNamek(@RequestBody Namekuseijin novoNamek) {
        perso.add(novoNamek);
    }

}
