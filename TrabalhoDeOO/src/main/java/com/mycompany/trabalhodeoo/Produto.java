package com.mycompany.trabalhodeoo;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author pense_4bc3gvu
 */
public class Produto {
    
    private int idProduto;
    private String nomeProduto;
    private float preco;  
    
    public Produto()
    {
       this.idProduto = 0;
       this.nomeProduto = "";
       this.preco = 0;       
    }
    
    public void leIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public void leNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public void lePreco(float preco) {
        this.preco = preco;
    }

    public int getIdProduto() {
        return this.idProduto;
    }

    public String getNomeProduto() {
       return this.nomeProduto;
    }

    public float getPreco() {
        return this.preco;
    }

}

