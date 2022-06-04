package com.mycompany.trabalhodeoo;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author pense_4bc3gvu
 */
public class Cliente extends Pessoa {
    private String tipoCliente;
    
    public Cliente(String _nome, String _telefone, Endereco _endereco) {
		super(_nome, _telefone, _endereco);
                this.tipoCliente = "";
    }
    
    public void setTipo(String tipoCliente){
        this.tipoCliente = tipoCliente;
    }
    
    public String getTipo(){
        return this.tipoCliente;
    } 

    
}
