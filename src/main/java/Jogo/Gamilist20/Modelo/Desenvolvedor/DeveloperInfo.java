package Jogo.Gamilist20.Modelo.Desenvolvedor;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DeveloperInfo(@JsonAlias("name") String name) {
}
