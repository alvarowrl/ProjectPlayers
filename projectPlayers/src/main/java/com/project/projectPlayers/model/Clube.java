package com.project.projectPlayers.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Clube {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idClube", nullable = false)
    private int idClube;

    @Column(name = "nomeClube", nullable = false, length = 100)
    private String nomeClube;

    @Column(name = "cidade", nullable = false, length = 50)
    private String cidade;

    public int getIdClube() {
        return idClube;
    }
    public void setIdClube(int idClube) {
        this.idClube = idClube;
    }


    

    public String getNomeClube() {
        return nomeClube;
    }

    public void setNomeClube(String nomeClube) {
        this.nomeClube = nomeClube;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
}

