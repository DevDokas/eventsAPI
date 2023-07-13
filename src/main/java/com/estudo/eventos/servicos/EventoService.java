package com.estudo.eventos.servicos;

import com.estudo.eventos.entidades.Evento;
import com.estudo.eventos.repositorios.RepositorioEvento;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class EventoService {
    private final RepositorioEvento repository;

    public boolean existById (Long id) {
        return repository.existsById(id);
    }

    public List<Evento> getData() {
        return repository.findAll();
    }

    public Optional<Evento> getDataById(Long id) {
        return repository.findById(id);
    }

    public List<Evento> getDataByCategoryId(Long id) {
        return repository.findByCategoria_Id(id);
    }

    public void postData(Evento evento) {
        repository.save(evento);
    }

    public void putData(Long id,Evento evento) {
        if (existById(id)) {
            evento.setId(id);
            repository.save(evento);
        }
    }

    public void deleteData(Long id) {
        if (existById(id)) {
            repository.deleteById(id);
        }

    }
}
