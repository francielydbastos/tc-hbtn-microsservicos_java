package com.example.jpah2demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Telefone {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String ddd;
    private String numero;

    public int getId() {
        return id;
    }

    public String getDdd() {
        return ddd;
    }

    public String getNumero() {
        return numero;
    }
}
