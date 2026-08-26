package Jogo.Gamilist20.Modelo;

import jakarta.persistence.*;

@Entity
@Table(name = "jogosFavoritos")
public class JogosFavoritos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String nome;
    private Integer avaliacao;
    private Integer avaliacaoRawg;
    private String ano;
    private String genero;
    private String imagem;


    public JogosFavoritos() {
    }


    public JogosFavoritos(JogoRawg jogoRawg) {
        this.nome = jogoRawg.nome();
        //this.avaliacao = jogoRawg.avaliacao() != null ? jogoRawg.avaliacao() : 0;
        this.avaliacaoRawg = jogoRawg.avaliacaoRawg() != null ? jogoRawg.avaliacaoRawg() : 0;
        this.ano = jogoRawg.ano();
        this.imagem = jogoRawg.imagem();

    }

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(Integer avaliacao) {
        this.avaliacao = avaliacao;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public Integer getAvaliacaoRawg() {
        return avaliacaoRawg;
    }

    public void setAvaliacaoRawg(Integer avaliacaoRawg) {
        this.avaliacaoRawg = avaliacaoRawg;
    }

    public String getImagem() {
        return imagem;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

}
