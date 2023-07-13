package com.estudo.eventos.dto;

import com.estudo.eventos.entidades.Categoria;
import com.estudo.eventos.entidades.Evento;
import lombok.Data;

import java.util.List;

@Data
public class CategoriaEventoDTO {

    private Categoria categoria;

    private List<Evento> eventos;
}
