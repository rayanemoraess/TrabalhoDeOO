/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabalhodeoo;

/**
 *
 * @author pense_4bc3gvu
 */
public class PessoaFis extends Pessoa {
    private String cpf;
    
    public PessoaFis()
    {
        this.cpf = "";
    }
    
    public void setCpf(String cpf)
    {
        this.cpf = cpf;
    }
    
    public String getCpf()
    {
        return this.cpf;
    }
    
}
