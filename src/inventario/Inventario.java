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
public class Inventario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Produto p1 = new Produto(1, "Cerveja", 2.99, 13);
        Produto p2 = new Produto(2, "Queijo", 1.20, 56);
        Produto p3 = new Produto(3, "Salame", 4.60, 24);
        Produto p4 = new Produto(4, "Biscoito", 8.88, 88);
        Produto p5 = new Produto();
        Produto p6 = new Produto();

        p5.setId(5);
        p5.setNome("Yogurte");
        p5.setPreco(0.80);
        p5.setEstoque(19);

        p6.setId(6);
        p6.setNome("Controle Remoto");
        p6.setPreco(57.99);
        p6.setEstoque(2);

        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
        System.out.println(p5.toString());
        System.out.println(p6.toString());
        
    }

}
