package com.eventos.resources;

import com.eventos.models.evento;
import com.eventos.repository.EventoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.DeleteMapping;


@RestController
@RequestMapping("/evento") //recurso
public class EventoResource { //método que retorna a lista de usuários cadastrada no banco de dados

    @Autowired
    private EventoRepository er;
    @GetMapping("/lista")
    public @ResponseBody Iterable<evento> listaEventos(){
        Iterable<evento> listaEventos = er.findAll();
        return listaEventos;
    }

    @PostMapping("/")
    public evento cadastraEvento(@RequestBody evento teste){
        return er.save(teste);
    }

    @DeleteMapping("/")
    public evento deletaEvento(@RequestBody evento evento){
        er.delete(evento);
        return (evento);
    }
}
