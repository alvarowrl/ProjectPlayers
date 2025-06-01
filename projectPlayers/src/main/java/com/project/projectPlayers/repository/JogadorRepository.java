package com.project.projectPlayers.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.projectPlayers.model.Jogador;

public interface JogadorRepository extends JpaRepository<Jogador, Integer> {
    Jogador findByNomeJogador(String nomeJogador);   

    
}