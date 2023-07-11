package com.estudo.eventos.repositorios;

import com.estudo.eventos.entidades.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositorioCategoria extends JpaRepository<Categoria, Long> {
}
