/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventario;

import java.math.RoundingMode;
import java.text.DecimalFormat;

/**
 *
 * @author André Zanon
 */
public class Produto {

    private DecimalFormat df2 = new DecimalFormat("#.##");

//    Declaração dos campos de instância
    private int id;
    private String nome;
    private double preco;
    private int estoque;
    private boolean ativo = true;

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo() {
        this.ativo = !this.ativo;
        System.out.println(this.nome+ " status : " +(this.isAtivo() ? "Ativo" : "Inativo"));
    }

    public Produto() {
    }

    public Produto(int id, String nome, double preco, int estoque) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.estoque = estoque;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    public double getInventoryValue() {

        return this.getEstoque() * this.getPreco();
    }

    @Override
    public String toString() {

        String description = "Número do Item : " + this.getId() + "\n"
                + "Nome : " + this.getNome() + "\n"
                + "Quantidade em estoque : " + this.getEstoque() + "\n"
                + "Preço : " + this.getPreco() + "\n"
                + "Status do Produto : " + (this.isAtivo() ? "Ativo" : "Inativo") + "\n"
                + "Valor do Estoque : " + this.df2.format(this.getInventoryValue()) + "\n";

        return description;

    }

    public void addToInventory(int qtd) {
        this.estoque = this.estoque + qtd;
    }

    public void deductFromInventory(int qtd) {
        this.estoque = this.estoque - qtd;
    }

}
