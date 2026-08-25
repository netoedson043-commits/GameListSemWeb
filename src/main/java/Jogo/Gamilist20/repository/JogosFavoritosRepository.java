package Jogo.Gamilist20.repository;

import Jogo.Gamilist20.Modelo.JogosFavoritos;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JogosFavoritosRepository extends JpaRepository<JogosFavoritos, Long> {
    boolean existsByNome(String nome);
}
