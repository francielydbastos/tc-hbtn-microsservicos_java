package com.example.jpah2demo;

import javax.persistence.*;
import java.util.List;

@Entity
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nome;
    private short idade;
    private String email;
    @OneToMany(cascade = {CascadeType.ALL})
    @JoinColumn(name = "cliente_id", referencedColumnName = "id")
    private List<Endereco> endereco;
    @OneToMany(cascade = {CascadeType.ALL})
    @JoinColumn(name = "cliente_id", referencedColumnName = "id")
    private List<Telefone> telefone;

    public void setId(long id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(short idade) {
        this.idade = idade;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setEndereco(List<Endereco> endereco) {
        this.endereco = endereco;
    }

    public void setTelefone(List<Telefone> telefone) {
        this.telefone = telefone;
    }

    public long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public short getIdade() {
        return idade;
    }

    public String getEmail() {
        return email;
    }

    public List<Endereco> getEndereco() {
        return endereco;
    }

    public List<Telefone> getTelefone() {
        return telefone;
    }
}
