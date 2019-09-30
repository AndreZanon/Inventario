/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventario;

/**
 *
 * @author André Zanon
 */
public class CD extends Produto {

    private String artista, selo;
    private int musicas;

    public CD(int id, String nome, double preco, int estoque, String artista, String selo, int musicas) {
        super(id, nome, preco, estoque);
        this.artista = artista;
        this.selo = selo;
        this.musicas = musicas;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getSelo() {
        return selo;
    }

    public void setSelo(String selo) {
        this.selo = selo;
    }

    public int getMusicas() {
        return musicas;
    }

    public void setMusicas(int musicas) {
        this.musicas = musicas;
    }

    @Override
    public String toString() {

        String description = "Número do Item : " + this.getId() + "\n"
                + "Nome : " + this.getNome() + "\n"
                + "Quantidade em estoque : " + this.getEstoque() + "\n"
                + "Preço : " + this.getPreco() + "\n"
                + "Status do Produto : " + (this.isAtivo() ? "Ativo" : "Inativo") + "\n"
                + "Valor do Estoque : " + this.df2.format(this.getInventoryValue()) + "\n"
                + "Artista : " + this.getArtista() + "\n"
                + "Selo : " + this.getSelo() + "\n"
                + "Musicas : " + this.getMusicas() + "\n";

        return description;
    }

}
