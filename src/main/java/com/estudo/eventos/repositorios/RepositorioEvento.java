package com.estudo.eventos.repositorios;

import com.estudo.eventos.entidades.Evento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositorioEvento extends JpaRepository<Evento,Long> {
}
