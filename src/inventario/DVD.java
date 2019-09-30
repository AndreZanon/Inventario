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
public class DVD extends Produto {

    private int duracao;
    private int faixaEtaria;
    private String estudio;

    public DVD(int duracao, int faixaEtaria, String estudio, int id, String nome, double preco, int estoque) {
        super(id, nome, preco, estoque);
        this.duracao = duracao;
        this.faixaEtaria = faixaEtaria;
        this.estudio = estudio;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public int getFaixaEtaria() {
        return faixaEtaria;
    }

    public void setFaixaEtaria(int faixaEtaria) {
        this.faixaEtaria = faixaEtaria;
    }

    public String getEstudio() {
        return estudio;
    }

    public void setEstudio(String estudio) {
        this.estudio = estudio;
    }

    @Override
    public String toString() {
        String description = "Número do Item : " + this.getId() + "\n"
                + "Nome : " + this.getNome() + "\n"
                + "Quantidade em estoque : " + this.getEstoque() + "\n"
                + "Preço : " + this.getPreco() + "\n"
                + "Status do Produto : " + (this.isAtivo() ? "Ativo" : "Inativo") + "\n"
                + "Valor do Estoque : " + this.df2.format(this.getInventoryValue()) + "\n"
                + "Artista : " + this.getEstudio()+ "\n"
                + "Selo : " + this.getDuracao()+ "\n"
                + "Musicas : " + this.getFaixaEtaria()+ "\n";

        return description;
    }

    @Override
    public double getInventoryValue() {
        return this.getEstoque() * this.getPreco() + this.getPreco()*0.05;
    }

}
