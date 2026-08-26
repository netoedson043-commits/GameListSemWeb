package Jogo.Gamilist20.Principal;

import Jogo.Gamilist20.Menus.Menus;
import Jogo.Gamilist20.Modelo.JogoRawg;
import Jogo.Gamilist20.Servicos.BancoDados;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Scanner;
@Component
public class Main {
    Scanner scanner = new Scanner(System.in);
    Menus menus = new Menus();
    boolean loop = true;

    @Autowired
    private BancoDados banco;
    @Autowired
    private BuscarJogos encontrado;

    public void principal() {
        while (loop) {
            menus.MenuPrincipal();
            String desejo = scanner.nextLine();
            switch (desejo) {
                case "1":
                    encontrado.procurarJogo();
                    break;
                case "2":
                    menus.MenuSecundario();
                    String desejo2 = scanner.nextLine();
                    switch (desejo2){
                        case "1":
                            JogoRawg jogoRawg = encontrado.procurarJogo();
                            banco.salvarFavoritos(jogoRawg);
                            break;

                        case "2":
                            banco.removerFavorito();
                        case "3":
                            banco.lsitarFavoritos();
                    }
                case "3":
                    loop = false;

            }
        }
    }
}
