/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabalhodeoo;

/**
 *
 * @author pense_4bc3gvu
 */
public class Endereco {
    private String rua;
    private String bairro;
    private String numero;
    private String cidade;
    private String estado;
    
    public Endereco()
    {
        this.rua = "";
        this.bairro = "";
        this.numero = "";
        this.cidade = "";
        this.estado = "";
    }
    
    public void setRua(String rua){
        this.rua = rua;
    }
    
    public void setBairro(String bairro)
    {
        this.bairro = bairro;
    }
    
    public void setNumero(String numero)
    {
        this.numero = numero;
    }
    
    public void setCidade(String cidade)
    {
        this.cidade = cidade;
    }
    
    public void setEstado(String estado)
    {
        this.estado = estado;
    }
    
    public String getRua() {
        return this.rua;
    }
    
    public String getBairro() {
        return this.bairro;
    }
    
    public String getNumero() {
        return this.numero;
    }
    
    public String getCidade() {
        return this.cidade;
    }
    
    public String getEstado() {
        return this.estado;
    }

    
}
