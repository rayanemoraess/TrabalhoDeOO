package com.mycompany.trabalhodeoo;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author pense_4bc3gvu
 */
public class Funcionario extends Pessoa {
    private String tipoFuncionario;
    
    public Funcionario(String _nome, String _telefone, Endereco _endereco) {
		super(_nome, _telefone, _endereco);
                this.tipoFuncionario = "";
    }
    
    public void setTipo(String tipoFuncionario){
        this.tipoFuncionario = tipoFuncionario;
    }
    
    public String getTipo(){
        return this.tipoFuncionario;
    } 
    
}
