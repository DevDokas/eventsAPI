package com.estudo.eventos;

import com.estudo.eventos.entidades.Evento;
import com.estudo.eventos.repositorios.RepositorioEvento;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/evento")
public class EventoREST {
    @Autowired
    private RepositorioEvento repositorio;

    @GetMapping
    public List<Evento> getData() {
        return repositorio.findAll();
    }

    @PostMapping
    public void postData(@RequestBody Evento evento) {
        repositorio.save(evento);
    }

    @PutMapping
    public void putData(@RequestBody Evento evento) {
        if (evento.getId()>0) {
            repositorio.save(evento);
        }
    }

    @DeleteMapping
    public void deleteData(@RequestBody Evento evento) {
        repositorio.delete(evento);
    }
}
