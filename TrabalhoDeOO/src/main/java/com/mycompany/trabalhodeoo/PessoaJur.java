/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabalhodeoo;

/**
 *
 * @author pedro
 */
public class PessoaJur extends Pessoa {
    private String cnpj;
    
    public PessoaJur(String _nome, String _telefone, Endereco _endereco) {
		super(_nome, _telefone, _endereco);
                this.cnpj = "";
    }
    
    public void setCnpj(String cnpj){
        this.cnpj = cnpj;
    }
    
    public String getCnpj(){
        return this.cnpj;
    }
}
