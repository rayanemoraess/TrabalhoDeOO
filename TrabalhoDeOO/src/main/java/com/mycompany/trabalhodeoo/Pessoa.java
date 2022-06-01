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

    private String cpf;
    private String nome;
    private String telefone;
    private String endereco;

    
    public Pessoa()
    {
       this.cpf = "";
       this.nome = "";
       this.telefone = "";
       this.endereco = "";
       
    }
    
    public void leCpf(String cpf) {
        this.cpf = cpf;
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
    
    public String getCpf() {
        return this.cpf;
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
