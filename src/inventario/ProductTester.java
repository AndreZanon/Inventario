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

            System.out.println("\n FIM DA EXECUÇÃO");
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

        return maxSize + 4;
    }

    private static void addToInventory(Produto[] produtos, Scanner in) {

        produtos[0] = new Produto(45, "Cerveja", 2.99, 13);
        produtos[1] = new Produto(46, "Celular", 40, 18);
        produtos[2] = new Produto(47, "Cadeira", 23, 45);
        produtos[3] = new Produto(48, "Mesa", 200, 20);

        for (int i = 4; i < produtos.length; i++) {
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

    private static void addCDToInventory(Produto[] produtos, Scanner in) {

        for (int i = 0; i < produtos.length; i++) {
            in.nextLine();
            String tempName, tempArtista, tempSelo;
            int tempNumber, tempQty, tempMusicas;
            double tempPrice;

            System.out.println("Nome do CD");
            tempName = in.next();

            System.out.println("Nome do Artista");
            tempArtista = in.next();

            System.out.println("Nome do Selo");
            tempSelo = in.next();

            System.out.println("Numero de Músicas");
            tempMusicas = in.nextInt();

            System.out.println("Numero");
            tempNumber = in.nextInt();

            System.out.println("Quantidade");
            tempQty = in.nextInt();

            System.out.println("Preço");
            tempPrice = in.nextDouble();

            CD p7 = new CD(tempNumber, tempName, tempPrice, tempQty, tempArtista, tempSelo, tempMusicas);

            produtos[i] = p7;

        }
    }

    private static void addDVDToInventory(Produto[] produtos, Scanner in) {

        for (int i = 0; i < produtos.length; i++) {
            in.nextLine();
            String tempName, tempEstudio;
            int tempNumber, tempQty, tempDuracao, tempEtaria;
            double tempPrice;

            System.out.println("Nome do DVD");
            tempName = in.next();

            System.out.println("Nome do Estudio");
            tempEstudio = in.next();

            System.out.println("Tempo de Duração");
            tempDuracao = in.nextInt();

            System.out.println("Faixa Etária");
            tempEtaria = in.nextInt();

            System.out.println("Numero");
            tempNumber = in.nextInt();

            System.out.println("Quantidade");
            tempQty = in.nextInt();

            System.out.println("Preço");
            tempPrice = in.nextDouble();

            DVD p7 = new DVD(tempDuracao, tempEtaria, tempEstudio, tempNumber, tempName, tempPrice, tempQty);

            produtos[i] = p7;

        }
    }

    private static int getMenuOptions(Scanner in) {

        int menuChoice = -1;

        do {
            in.nextLine();
            System.out.println("=============================== \n"
                    + "1. Exibir Inventário\n"
                    + "2. Adicionar Estoque\n"
                    + "3. Deduzir Estoque\n"
                    + "4. Descontinuar Produto\n"
                    + "0. Sair\n"
                    + "Insira uma opção de menu:\n"
                    + "======================================="
            );

            menuChoice = in.nextInt();

        } while (menuChoice < 0 || menuChoice > 4);

        return menuChoice;

    }

    private static int getProductNumber(Produto[] produtos, Scanner in) {

        int productNumber = -1;

        do {
            try {
                in.nextLine();
                System.out.println("Escolha o Produto : ");

                for (int i = 0; i < produtos.length; i++) {
                    System.out.println(i + " : " + produtos[i].getNome());
                }

                productNumber = in.nextInt();
                if (productNumber < 0 || productNumber > produtos.length) {
                    System.out.println("Valor incorreto inserido");
                }
            } catch (InputMismatchException e) {
                System.out.println("Tipo incorreto de dados inserido!");
                in.nextLine();
            } catch (Exception e) {
                System.out.println(e.toString());
                in.nextLine();
            }

        } while (productNumber < 0 || productNumber > produtos.length);

        return productNumber;

    }

    private static void executeMenuChoice(int menuChoice, Produto[] produtos, Scanner in) {
        switch (menuChoice) {
            case 1:
                System.out.println("Exibir Lista de Produtos");
                displayInventory(produtos);
                break;
            case 2:
                System.out.println("Adicionar Estoque");
                addInventory(produtos, in);
                break;
            case 3:
                System.out.println("Deduzir Estoque");
                reduceInventory(produtos, in);
                break;
            case 4:
                System.out.println("Descontinuar Estoque");
                discontinueInventory(produtos, in);
                break;
        }
    }

    private static void addInventory(Produto[] produtos, Scanner in) {
        int productChoice;
        int qtd = -1;

        productChoice = getProductNumber(produtos, in);

        do {
            in.nextLine();
            try {
                System.out.println("Insira quantidade à acrescentar...");
                qtd = in.nextInt();
            } catch (Exception e) {
                System.out.println("Entrada inválida");
            }

            if (qtd < 0) {
                System.out.println("Necessário valor maior que 0!");
            }

        } while (qtd < 0);

        for (int i = 0; i < produtos.length; i++) {
            if (i == productChoice) {
                produtos[i].addToInventory(qtd);
            }
        }

    }

    private static void reduceInventory(Produto[] produtos, Scanner in) {
        int productChoice;
        int maxReduceValue = 0;
        int qtd = -1;

        productChoice = getProductNumber(produtos, in);

        for (Produto prod : produtos) {
            if (prod.getId() == productChoice) {
                maxReduceValue = prod.getEstoque();
            }
        }

        do {
            in.nextLine();
            try {
                System.out.println("Insira quantidade à deduzir... menor que " + maxReduceValue);
                qtd = in.nextInt();
            } catch (Exception e) {
                System.out.println("Entrada inválida");
            }

            if (qtd < 0) {
                System.out.println("Necessário valor maior que 0!");
            }
            if (qtd > maxReduceValue) {
                System.out.println("Valor de entrada extende estoque registrado!");
            }

        } while (qtd < 0 && qtd > maxReduceValue);

        for (int i = 0; i < produtos.length; i++) {
            if (i == productChoice) {
                produtos[i].deductFromInventory(qtd);
            }
        }

    }

    private static void discontinueInventory(Produto[] produtos, Scanner in) {
        int productChoice;

        productChoice = getProductNumber(produtos, in);

        for (int i = 0; i < produtos.length; i++) {
            if (i == productChoice) {
                produtos[i].setAtivo();
            }
        }

    }

    private static void displayInventory(Produto[] produtos) {
        for (Produto prod : produtos) {
            System.out.println(prod.toString());
        }
    }

}
