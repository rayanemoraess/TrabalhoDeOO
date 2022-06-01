/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.trabalhodeoo;
/**
 *
 * @author pense_4bc3gvu
 */
public class Pessoa {

    protected String nome;
    protected String telefone;
    protected String endereco;

    
    public Pessoa()
    {
       this.nome = "";
       this.telefone = "";
       this.endereco = "";
       
    }

    public void leNome(String nome) {
        this.nome = nome;
    }

    public void leTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void leEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getNome() {
        return this.nome;
    }

    public String getTelefone() {
        return this.telefone;
    }

    public String getEndereco() {
        return this.endereco;
    }
}
