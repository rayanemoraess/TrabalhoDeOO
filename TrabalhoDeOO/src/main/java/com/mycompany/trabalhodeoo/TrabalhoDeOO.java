/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.trabalhodeoo;

import java.util.*;
import java.text.DecimalFormat;

/**
 *
 * @author pense_4bc3gvu
 */
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

public class TrabalhoDeOO {

    public static void cadastroEndereco(Endereco endereco) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o endereco: ");
        System.out.println("");
        System.out.println("Digite a Rua: ");
        endereco.setRua(teclado.nextLine());
        System.out.println("Digite o bairro: ");
        endereco.setBairro(teclado.nextLine());
        System.out.println("Digite o numero: ");
        endereco.setNumero(teclado.nextLine());
        System.out.println("Digite a cidade: ");
        endereco.setCidade(teclado.nextLine());
        System.out.println("Digite o estado: ");
        endereco.setEstado(teclado.nextLine());
    }

    public static void cadastroPessoa() {
        System.out.println("Cadastrando Pessoas... ");
        Scanner teclado = new Scanner(System.in);
        List<Pessoa> pessoas = new ArrayList<>();
        String nome;
        String telefone;
        Endereco endereco = new Endereco();
        Pessoa pessoa = new Pessoa();

        //for (int i = 0; i < 1; i++) {
            System.out.print("Digite o nome da pessoa: ");
            nome = teclado.nextLine();
            pessoa.setNome(nome);
            System.out.print("Digite o telefone da pessoa: ");
            telefone = teclado.nextLine();
            pessoa.setTelefone(telefone);
            cadastroEndereco(endereco);
            pessoa.setEndereco(endereco);
            pessoas.add(pessoa);
            pessoa = new Pessoa();
            endereco = new Endereco();
        //}

        for (Pessoa person : pessoas) {
            System.out.println("Nome: " + person.getNome());
            System.out.println("Telefone: " + person.getTelefone());
            endereco = person.getEndereco();
            System.out.println("Endereco: \n" + "Rua: " + endereco.getRua()
                    + "\nBairro: " + endereco.getBairro() + "\nNumero: " + endereco.getNumero()
                    + "\nCidade: " + endereco.getCidade() + "\nEstado: " + endereco.getEstado());
        }

    }

    public static Produto cadastroProduto() {
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

        //produtos.add(produto);
        //produto = new Produto();
        //}

        /*for(Produto product : produtos)
        {
            System.out.println("Id do produto: " + product.getIdProduto());
            System.out.println("Nome do produto: " + product.getNomeProduto());
            System.out.println("Preco: R$" + df.format(product.getPreco()));
        }*/
        return produto;
    }
    
    public static int defQuantidade(String nomeProduto)
    {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite a quantidade do produto (" + nomeProduto + "): ");
        return teclado.nextInt();
    }

    public static void cadastroEstoque() {
        DecimalFormat df = new DecimalFormat("#,###.00");
        Estoque estoque = new Estoque();
        Produto produto = new Produto();
        for(int i = 0; i < 2; i++)
        {
            produto = cadastroProduto();
            estoque.setListaDeProdutos(produto, defQuantidade(produto.getNomeProduto()));
        }

        for (Produto product : estoque.getListaDeProdutos().keySet()) {
            System.out.println("Id: " + product.getIdProduto() + "\nNome: " + product.getNomeProduto()
                    + "\nPreco: R$" + df.format(product.getPreco()) + "\nQuantidade: " + estoque.getListaDeProdutos().get(product));

        }
    }

    public static void main(String[] args) {
        //cadastroPessoa();
        //cadastroEstoque();
        Cadastro cadastro = new Cadastro();
        
        Cadastro.cdEstoque();
    }

}
