package Jogo.Gamilist20.Modelo;

import Jogo.Gamilist20.Modelo.Desenvolvedor.DeveloperInfo;
import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public record JogoRawg(//@JsonAlias("metacritic") Integer avaliacao,
                       @JsonAlias("id") Long id,
                       @JsonAlias("rating") Integer avaliacaoRawg,
                       @JsonAlias("name") String nome,
                       @JsonAlias("released") String ano,
                       @JsonAlias("background_image") String imagem,
                       @JsonAlias("developers") List<DeveloperInfo> desenvolvedora
                       ) {

}
