package com.estudo.eventos.servicos;

import com.estudo.eventos.entidades.Categoria;
import com.estudo.eventos.repositorios.RepositorioCategoria;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CategoriaService {
    private final RepositorioCategoria category;

    public boolean existById (Long id) { return category.existsById(id); }

    public List<Categoria> getData() { return category.findAll(); }

    public Optional<Categoria> getDataById(@RequestParam Long id) { return category.findById(id); }

    public void postData(Categoria categoria) { category.save(categoria); }

    public void putData(Long id, Categoria categoria) {
        if (existById(id)) {
            categoria.setId(id);
            category.save(categoria);
        }

    }

    public void deleteData(Long id) {
        if (existById(id)) {
            category.deleteById(id);
        }

    }

}
