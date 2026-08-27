package Jogo.Gamilist20.Servicos;

import Jogo.Gamilist20.Modelo.JogoRawg;
import Jogo.Gamilist20.Modelo.JogosFavoritos;
import Jogo.Gamilist20.repository.JogosFavoritosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

@Component
public class BancoDados {



    @Autowired
    private JogosFavoritosRepository repositorio;

    public void salvarFavoritos(JogoRawg jogoRawg) {
       if (repositorio.existsByNome(jogoRawg.nome())) {
           System.out.println("Jogo ja esta na lista de favoritos");
       } else {
           JogosFavoritos favoritos = new JogosFavoritos(jogoRawg);
           repositorio.save(favoritos);
           System.out.println("jogo salvo");

       }
    }
    public void removerFavorito() {
        Scanner scanner = new Scanner(System.in);

        boolean temFavorito = lsitarFavoritos();
        if (!temFavorito) {
            return;
        }


        System.out.println("qual id do jogo que deseja tirar dos favoritos(ID)");
        long jogoRemove = scanner.nextLong();

        Optional<JogosFavoritos> jogo = repositorio.findById(jogoRemove);
        if (jogo.isEmpty()) {
            System.out.println("Id invalido ou nao esta nos favoritos");
        } else {
            repositorio.delete(jogo.get());
            System.out.println("removido com sucesso");
        }




    }

    public boolean lsitarFavoritos() {
        List<JogosFavoritos> favoritos = repositorio.findAll();

        if (favoritos.isEmpty()) {
            System.out.println("nenhum jogo nos favoritos");
            return false;
        } else {
            for (JogosFavoritos favorito : favoritos) {
                System.out.println(favorito.getId() + " - " + favorito.getNome());
            }
            return true;
        }
    }
}
