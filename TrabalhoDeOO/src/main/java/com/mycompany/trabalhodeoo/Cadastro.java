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

    public static String defQuantidade(String nomeProduto) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite a quantidade do produto (" + nomeProduto + "): ");
        return teclado.nextLine();
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
    
    public static void cdEndereco(Endereco endereco) {
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
    
    public static void cdPessoaFis(String cpfCnpj){
        System.out.println("Cadastrando Pessoa Fisica: ");
        Scanner teclado = new Scanner(System.in);
        List<PessoaFis> pessoas = new ArrayList<>();
        String nome;
        String telefone;
        Endereco endereco = new Endereco();
        System.out.print("Digite o nome da pessoa: ");
        nome = teclado.nextLine();
        System.out.print("Digite o telefone da pessoa: ");
        telefone = teclado.nextLine();
        PessoaFis pessoaFis = new PessoaFis(nome, telefone, new Endereco());
        pessoaFis.setCpf(cpfCnpj);
        pessoaFis.setNome(nome);
        pessoaFis.setTelefone(telefone);
        cdEndereco(endereco);
        pessoaFis.setEndereco(endereco);
        pessoas.add(pessoaFis);
        //nome = "";
        //telefone = "";
        //endereco = new Endereco();
        //pessoaFis = new PessoaFis(nome, telefone, new Endereco());
        
        for (PessoaFis person : pessoas) {
            System.out.println("Nome: " + person.getNome());
            System.out.println("Telefone: " + person.getTelefone());
            endereco = person.getEndereco();
            System.out.println("Endereco: \n" + "Rua: " + endereco.getRua()
                    + "\nBairro: " + endereco.getBairro() + "\nNumero: " + endereco.getNumero()
                    + "\nCidade: " + endereco.getCidade() + "\nEstado: " + endereco.getEstado());
        }
        
        
    }
    
    public static void cdPessoaJur(String cpfCnpj){
        System.out.println("Cadastrando Pessoa Juridica: ");
        Scanner teclado = new Scanner(System.in);
        List<PessoaJur> pessoas = new ArrayList<>();
        String nome;
        String telefone;
        Endereco endereco = new Endereco();
        System.out.print("Digite o nome da pessoa: ");
        nome = teclado.nextLine();
        System.out.print("Digite o telefone da pessoa: ");
        telefone = teclado.nextLine();
        PessoaJur pessoaJur = new PessoaJur(nome, telefone, new Endereco());
        pessoaJur.setCnpj(cpfCnpj);
        pessoaJur.setNome(nome);
        pessoaJur.setTelefone(telefone);
        cdEndereco(endereco);
        pessoaJur.setEndereco(endereco);
        pessoas.add(pessoaJur);
        //nome = "";
        //telefone = "";
        //endereco = new Endereco();
        //pessoaFis = new PessoaFis(nome, telefone, new Endereco());
        
        for (PessoaJur person : pessoas) {
            System.out.println("Nome: " + person.getNome());
            System.out.println("Telefone: " + person.getTelefone());
            endereco = person.getEndereco();
            System.out.println("Endereco: \n" + "Rua: " + endereco.getRua()
                    + "\nBairro: " + endereco.getBairro() + "\nNumero: " + endereco.getNumero()
                    + "\nCidade: " + endereco.getCidade() + "\nEstado: " + endereco.getEstado());
        }
    }

    public static void verifTipoPessoa(){
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o cpf ou cnpj: ");
        String cpfCnpj = teclado.nextLine();
        if(cpfCnpj.length() == 11)
            cdPessoaFis(cpfCnpj);
        else if(cpfCnpj.length() == 14)
            cdPessoaJur(cpfCnpj);
    }
    
    public static void cdPessoa() {
        System.out.println("Cadastrando Pessoas... ");
        verifTipoPessoa();
        /*
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
            cdEndereco(endereco);
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

    */
    }
    
    public static void cdPedido()
    {
        Pedido pedido = new Pedido();
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o id do Pedido: ");
        pedido.setIdPedido(teclado.nextLine());
        
        DecimalFormat df = new DecimalFormat("#,###.00");
        Produto produto = new Produto();
        for (int i = 0; i < 2; i++) {
            produto = cdProduto();
            pedido.setListaProdComprados(produto, defQuantidade(produto.getNomeProduto()));
        }

        pedido.setValorTotal();
        System.out.println("Valor total do Pedido: R$" + df.format(pedido.getValorTotal()));
        pedido.FormaPgto();
        System.out.print("Digite a forma de pagamento: ");
        pedido.setFormaPgto(teclado.nextLine());
        System.out.println("-----Nota Fiscal-----");
        System.out.println("Id do pedido: " + pedido.getIdPedido());
        System.out.println("Forma de pagamento: " + pedido.getFormaPgto());
        System.out.println("Valor Total: R$" + df.format(pedido.getValorTotal()));
    }

}
