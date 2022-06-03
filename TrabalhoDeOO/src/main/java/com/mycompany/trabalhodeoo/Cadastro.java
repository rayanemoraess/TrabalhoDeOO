/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabalhodeoo;

import java.util.*;
import java.text.DecimalFormat;
/**
 *
 * @author carlo
 */
public class Cadastro {

    public static Produto cdProduto() {
        System.out.println("Cadastrando Produtos... ");
        DecimalFormat df = new DecimalFormat("#,###.00");
        Scanner teclado = new Scanner(System.in);
        //teclado.useLocale(Locale.US); // setar o locale
        //List<Produto> produtos = new ArrayList<>();
        int idProduto;
        String nomeProduto, enter;
        float preco;

        Produto produto = new Produto();

        //for(int i = 0; i < 2; i++){
        System.out.print("Digite o id do produto: ");
        idProduto = teclado.nextInt();
        produto.setIdProduto(idProduto);
        enter = teclado.nextLine();
        System.out.print("Digite o nome do produto: ");
        nomeProduto = teclado.nextLine();
        produto.setNomeProduto(nomeProduto);
        System.out.print("Digite o preco: ");
        preco = teclado.nextFloat();
        produto.setPreco(preco);

        return produto;
    }

    public static int defQuantidade(String nomeProduto) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite a quantidade do produto (" + nomeProduto + "): ");
        return teclado.nextInt();
    }

    public static void cdEstoque() {
        DecimalFormat df = new DecimalFormat("#,###.00");
        Estoque estoque = new Estoque();
        Produto produto = new Produto();
        for (int i = 0; i < 2; i++) {
            produto = cdProduto();
            estoque.setListaDeProdutos(produto, defQuantidade(produto.getNomeProduto()));
        }

        for (Produto product : estoque.getListaDeProdutos().keySet()) {
            System.out.println("Id: " + product.getIdProduto() + "\nNome: " + product.getNomeProduto()
                    + "\nPreco: R$" + df.format(product.getPreco()) + "\nQuantidade: " + estoque.getListaDeProdutos().get(product));

        }
    }

}
