package com.song.MegaSenaAPI;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

@RestController
@RequestMapping(value = "/megasena")
public class MegaSenaController {

    @GetMapping("/simpleMessageWelcome")
    public String mensagemBoasVindas() {
        return "Bem vindo a API REST para geração de números para a loteria Mega Sena.";
    }


    @GetMapping("/getNumbers")
    public List<Integer> numerosMegaSena() {

        List<Integer> megaSenaList = new ArrayList<>();
        Random randomNumber = new Random();

        while(megaSenaList.size() < 6) {
            Integer sorteio = randomNumber.nextInt(60);
            if (!megaSenaList.contains(sorteio)){
                megaSenaList.add(sorteio);
            }
        }

        Collections.sort(megaSenaList);

        return megaSenaList;
    }
}
