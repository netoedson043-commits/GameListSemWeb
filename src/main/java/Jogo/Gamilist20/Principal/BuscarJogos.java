package Jogo.Gamilist20.Principal;

import Jogo.Gamilist20.Modelo.JogoRawg;
import Jogo.Gamilist20.Servicos.Entrada;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;
@Component
public class BuscarJogos {

    @Value("${rawg.api.key}")
    private String apiKey;

    public JogoRawg procurarJogo() {
        Scanner scanner = new Scanner(System.in);
        Entrada jogoProcurado = new Entrada();

        System.out.println("nome do jogo");
        String buscarJogo = scanner.nextLine();
        String buscarTransformada = URLEncoder.encode(buscarJogo, StandardCharsets.UTF_8);

        String endereco = "https://api.rawg.io/api/games?key=" + apiKey +"&search=" + buscarTransformada;


        var resultado = jogoProcurado.obterDados(endereco);
        ObjectMapper jackson = new ObjectMapper();
        JogoRawg jackson2 = null;
        try {
            JsonNode raiz = jackson.readTree(resultado);
            JsonNode primeiroResultado = raiz.get("results").get(0);
            jackson2 = jackson.treeToValue(primeiroResultado, JogoRawg.class);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
        System.out.println(jackson2);

        return jackson2;
    }
}
