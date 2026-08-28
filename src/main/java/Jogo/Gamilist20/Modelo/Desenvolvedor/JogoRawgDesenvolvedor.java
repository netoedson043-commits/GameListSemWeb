package Jogo.Gamilist20.Modelo.Desenvolvedor;

import Jogo.Gamilist20.Modelo.JogoRawg;

import java.util.stream.Collectors;

public class JogoRawgDesenvolvedor {
    public String filtrarNome(JogoRawg jogoRawg) {
        if (jogoRawg.desenvolvedora() == null | jogoRawg.desenvolvedora().isEmpty()) {
            return "Nao existe desenvolvedor";
        }
        return jogoRawg.desenvolvedora().stream()
                .map(DeveloperInfo::name)
                .collect(Collectors.joining(", "));
    }
}
