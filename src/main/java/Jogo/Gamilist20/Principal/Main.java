package Jogo.Gamilist20.Principal;

import Jogo.Gamilist20.Modelo.JogoRawg;
import Jogo.Gamilist20.Modelo.JogosFavoritos;
import Jogo.Gamilist20.Servicos.BancoDados;
import Jogo.Gamilist20.Servicos.Entrada;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Scanner;
@Component
public class Main {
    @Autowired
    private BancoDados banco;
    @Autowired
    private BuscarJogos encontrado;

    public void menu() {

        Scanner scanner = new Scanner(System.in);
        boolean loop = true;
        while (loop) {
            System.out.println("""
                1. Procurar jogos
                2. Jogos favoritos
                3. Sair
                """);
            String desejo = scanner.nextLine();

            switch (desejo) {
                case "1":
                    encontrado.procurarJogo();
                    break;
                case "2":
                    System.out.println("""
                        1. Adicionar jogo
                        2. Remover jogo
                        3. Listar favoritos
                        """);
                    String desejo2 = scanner.nextLine();
                    switch (desejo2){
                        case "1":
                            JogoRawg jogoRawg = encontrado.procurarJogo();
                            banco.SalvarFavoritos(jogoRawg);
                            break;

                        case "2":

                    }
                case "3":
                    loop = false;
            }
        }
    }
}
