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
    
    public static void cadastraPessoa(){
        System.out.println("Cadastrando Pessoas... ");
        Scanner teclado = new Scanner(System.in);
        List<Pessoa> pessoas = new ArrayList<>();
        String cpf;
        String nome;
        String telefone;
        String endereco;
        Pessoa pessoa = new Pessoa();

        for(int i = 0; i < 2; i++){
            System.out.print("Digite o cpf da pessoa: ");
            cpf = teclado.nextLine();
            pessoa.leCpf(cpf);
            System.out.print("Digite o nome da pessoa: ");
            nome = teclado.nextLine();
            pessoa.leNome(nome);
            System.out.print("Digite o telefone da pessoa: ");
            telefone = teclado.nextLine();
            pessoa.leTelefone(telefone);
            System.out.print("Digite o endereco da pessoa: ");
            endereco= teclado.nextLine();
            pessoa.leEndereco(endereco);
            pessoas.add(pessoa);
            pessoa = new Pessoa();
        }

        for(Pessoa person : pessoas)
        {
            System.out.println("Cpf: " + person.getCpf());
            System.out.println("Nome: " + person.getNome());
            System.out.println("Telefone: " + person.getTelefone());
            System.out.println("Enderco: " + person.getEndereco());
        }
        
    }
    
    public static void cadastraProduto(){
        System.out.println("Cadastrando Produtos... ");
        DecimalFormat df = new DecimalFormat("#,###.00");
        Scanner teclado = new Scanner(System.in);
        //teclado.useLocale(Locale.US); // setar o locale
        List<Produto> produtos = new ArrayList<>();
        int idProduto;
        String nomeProduto, enter;
        float preco;
        
        Produto produto = new Produto();

        for(int i = 0; i < 2; i++){
            System.out.print("Digite o id do produto: ");
            idProduto = teclado.nextInt();
            produto.leIdProduto(idProduto);
            enter = teclado.nextLine();
            System.out.print("Digite o nome do produto: ");
            nomeProduto = teclado.nextLine();
            produto.leNomeProduto(nomeProduto);
            System.out.print("Digite o preco: ");
            preco = teclado.nextFloat();
            produto.lePreco(preco);
     
            produtos.add(produto);
            produto = new Produto();
        }

        for(Produto product : produtos)
        {
            System.out.println("Id do produto: " + product.getIdProduto());
            System.out.println("Nome do produto: " + product.getNomeProduto());
            System.out.println("Preco: R$" + df.format(product.getPreco()));
        }
    }
    
    public static void main(String[] args) {
        cadastraPessoa();
        cadastraProduto();
    }
    
    
}