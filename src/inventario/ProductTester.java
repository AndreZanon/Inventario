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
public class ProductTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int maxSize, menuChoice;

        maxSize = getNumProducts(in);

        if (maxSize == 0) {
            System.out.println("Não há produtos!");
        } else {
            Produto[] produtos = new Produto[maxSize];
            addToInventory(produtos, in);

            do {
                menuChoice = getMenuOptions(in);
                executeMenuChoice(menuChoice, produtos, in);
            } while (menuChoice != 0);

            displayInventory(produtos);
        }
    }

    private static int getNumProducts(Scanner in) {
        int maxSize = -1;
        do {
            try {
                System.out.println("Quantos Produtos? 0 para nenhum");
                maxSize = in.nextInt();
                if (maxSize < 0) {
                    System.out.println("Valor incorreto inserido");
                }
            } catch (InputMismatchException e) {
                System.out.println("Tipo incorreto de dados inserido!");
                in.nextLine();
            } catch (Exception e) {
                System.out.println(e.toString());
                in.nextLine();
            }
        } while (maxSize < 0);

        return maxSize;
    }

    private static void addToInventory(Produto[] produtos, Scanner in) {

        for (int i = 0; i < produtos.length; i++) {
            in.nextLine();
            String tempName;
            int tempNumber, tempQty;
            double tempPrice;

            System.out.println("Nome do Produto");
            tempName = in.next();

            System.out.println("Numero");
            tempNumber = in.nextInt();

            System.out.println("Quantidade");
            tempQty = in.nextInt();

            System.out.println("Preço");
            tempPrice = in.nextDouble();

            Produto p7 = new Produto(tempNumber, tempName, tempPrice, tempQty);

            produtos[i] = p7;

        }
    }

    private static int getMenuOptions(Scanner in) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void executeMenuChoice(int menuChoice, Produto[] produtos, Scanner in) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void displayInventory(Produto[] produtos) {
        for (Produto prod : produtos) {
            System.out.println(prod.toString());
        }
    }

}
