package com.project.projectPlayers.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Jogador {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idJogador", nullable = false)
    private int idJogador;

    @Column(name = "nomeJogador", nullable = false, length = 100)
    private String nomeJogador;

    @Column(name = "posicao", nullable = false, length = 50)
    private String posicao;

    @Column(name = "idade", nullable = false)
    private int idade;

    @Column(name = "nacionalidade", nullable = false, length = 50)
    private String nacionalidade;
    
    
    //Métodos getter e setters
    public int getIdJogador() {
        return idJogador;
    }
    public void setIdJogador( int idJogador) {
        this.idJogador = idJogador;
    }
    public String getNomeJogador() {
        return nomeJogador;
    }
    public void setNome(String nomeJogador) {
        this.nomeJogador = nomeJogador;
    }
    public String getPosicao() {
        return posicao;
    }
    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public String getNacionalidade() {
        return nacionalidade;
    }
    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    
}
