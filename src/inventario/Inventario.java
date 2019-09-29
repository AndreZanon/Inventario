/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventario;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author André Zanon
 */
public class Inventario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        Produto p1 = new Produto(1, "Cerveja", 2.99, 13);
        Produto p6 = new Produto();

        p6.setId(6);
        p6.setNome("Controle Remoto");
        p6.setPreco(57.99);
        p6.setEstoque(2);
        p6.setAtivo();

        String tempName;
        int tempNumber, tempQty;
        double tempPrice;

//        System.out.println("Nome do Produto");
//        tempName = in.next();
//
//        System.out.println("Numero");
//        tempNumber = in.nextInt();
//
//        System.out.println("Quantidade");
//        tempQty = in.nextInt();
//
//        System.out.println("Preço");
//        tempPrice = in.nextDouble();
//
//        Produto p7 = new Produto(tempNumber, tempName, tempPrice, tempQty);
//        
//        in.nextLine();
//        
//        System.out.println("Nome do Produto");
//        tempName = in.next();
//
//        System.out.println("Numero");
//        tempNumber = in.nextInt();
//
//        System.out.println("Quantidade");
//        tempQty = in.nextInt();
//
//        System.out.println("Preço");
//        tempPrice = in.nextDouble();
//
//        Produto p8 = new Produto(tempNumber, tempName, tempPrice, tempQty);
//        System.out.println(p1.toString());
//        System.out.println(p6.toString());
//
//        int maxSize = -1;
//        do {
//
//            try {
//                System.out.println("Quantos Produtos? 0 para nenhum");
//                maxSize = in.nextInt();
//                if (maxSize < 0) {
//                    System.out.println("Valor incorreto inserido");
//                }
//                in.nextLine();
//            } catch (InputMismatchException e) {
//                System.out.println(" Tipo incorreto de dados inserido!");
//            } catch (Exception e) {
//                System.out.println(e.toString());
//                in.nextLine();
////                System.exit(1);
//            }
//
//        } while (maxSize < 0);
//        
        int array[][] = {{2, 2, 2}, {2, 2, 0}};

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                if (array[i][j] == 0 && j == 2) {
                    System.out.println(array[i][j]);
                }
            }

        }

    }

}
