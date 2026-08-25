package Jogo.Gamilist20.Servicos;

import Jogo.Gamilist20.Modelo.JogoRawg;
import Jogo.Gamilist20.Modelo.JogosFavoritos;
import Jogo.Gamilist20.repository.JogosFavoritosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BancoDados {
    @Autowired
    private JogosFavoritosRepository repositorio;

    public void SalvarFavoritos(JogoRawg jogoRawg) {
       if (repositorio.existsByNome(jogoRawg.nome())) {
           System.out.println("Jogo ja esta na lista de favoritos");
       } else {
           JogosFavoritos favoritos = new JogosFavoritos(jogoRawg);
           repositorio.save(favoritos);
           System.out.println("jogo salvo");

       }


    }
}
