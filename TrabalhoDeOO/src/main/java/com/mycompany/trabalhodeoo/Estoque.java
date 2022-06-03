package com.mycompany.trabalhodeoo;


import java.util.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author pense_4bc3gvu
 */
public class Estoque {
    private Map<Produto,String> listaDeProdutos;
    
    public Estoque(){
        this.listaDeProdutos = new HashMap<>();
    }
    
    public void setListaDeProdutos(Produto produto, String qtd)
    {
        this.listaDeProdutos.put(produto, qtd);
    }
    
    public Map<Produto,String> getListaDeProdutos()
    {
        return this.listaDeProdutos;
    }
    
}
