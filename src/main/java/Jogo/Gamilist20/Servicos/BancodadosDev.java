package Jogo.Gamilist20.Servicos;

import Jogo.Gamilist20.Modelo.DesenvolvedoraRawg;
import Jogo.Gamilist20.repository.DesenvolvedoraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BancodadosDev {

    @Autowired
    private DesenvolvedoraRepository desenvolvedoraRepository;

    public DesenvolvedoraRawg buscarOuCriarDev(DesenvolvedoraRawg desenvolvedor) {
        return desenvolvedoraRepository
                .findByNome(desenvolvedor.getNome())
                .orElseGet(() -> desenvolvedoraRepository.save(desenvolvedor));
    }
}