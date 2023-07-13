package com.estudo.eventos.repositorios;

import com.estudo.eventos.entidades.Evento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface RepositorioEvento extends JpaRepository<Evento,Long> {
    @Query("select e from Evento e where e.categoria.id = ?1")
    List<Evento> findByCategoria_Id(Long id);

}
