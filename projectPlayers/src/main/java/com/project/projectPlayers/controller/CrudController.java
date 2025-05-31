package com.project.projectPlayers.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.project.projectPlayers.model.Jogador;
import com.project.projectPlayers.repository.JogadorRepository;


@Controller
public class CrudController {

    @Autowired
    JogadorRepository JogadorRepository;

    @GetMapping("/CadastroJogador")
    public ModelAndView cadastrar(Jogador jogador) {
        ModelAndView mv = new ModelAndView("/home");
        mv.addObject("jogador", jogador);
        return mv;
    }
    @PostMapping("/SalvarJogador")
    public ModelAndView salvar(Jogador jogador, BindingResult result) {
        ModelAndView mv = new ModelAndView("/home");
        mv.addObject("jogador", jogador);
        JogadorRepository.saveAndFlush(jogador);
        return mv;
    }
    
    
}
