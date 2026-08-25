package Jogo.Gamilist20.Modelo;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;
import java.util.stream.Collectors;

@JsonIgnoreProperties(ignoreUnknown = true)
public record JogoRawg(//@JsonAlias("metacritic") Integer avaliacao,
                       @JsonAlias("rating") Integer avaliacaoRawg,
                       @JsonAlias("name") String nome,
                       @JsonAlias("released") String ano,
                       @JsonAlias("background_image") String imagem
                       ) {

}
