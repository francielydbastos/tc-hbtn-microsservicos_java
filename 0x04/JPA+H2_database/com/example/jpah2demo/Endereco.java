package com.example.jpah2demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Endereco {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String logradouro;
    private String endereco;
    private String numero;
    private String bairro;
    private String cidade;
    private String estado;

    public int getId() {
        return id;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getNumero() {
        return numero;
    }

    public String getBairro() {
        return bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public String getEstado() {
        return estado;
    }
}
