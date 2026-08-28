package Jogo.Gamilist20.repository;

import Jogo.Gamilist20.Modelo.DesenvolvedoraRawg;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface DesenvolvedoraRepository extends JpaRepository<DesenvolvedoraRawg, Long> {
    Optional<DesenvolvedoraRawg> findByNome(String nome);
}
