package com.estudo.eventos.controles;

import com.estudo.eventos.entidades.Categoria;
import com.estudo.eventos.servicos.CategoriaService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/evento/categoria")
@RequiredArgsConstructor
public class CategoriaController {

    private final CategoriaService service;

    @CrossOrigin
    @RequestMapping(method = RequestMethod.GET, path = "")
    public ResponseEntity<List<Categoria>> getData() { return ResponseEntity.ok(service.getData()); }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    public ResponseEntity<Optional<Categoria>> getDataById(@PathVariable Long id) {
        return ResponseEntity.ok(service.getDataById(id));
    }

    @RequestMapping(method = RequestMethod.POST, path = "")
    public ResponseEntity<?> postData(@RequestBody Categoria categoria) {
        service.postData(categoria);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @RequestMapping(method = RequestMethod.PUT, path = "/{id}")
    public ResponseEntity<?> putData(@PathVariable Long id, @RequestBody Categoria categoria) {
        service.putData(id, categoria);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.DELETE, path = "/{id}")
    public ResponseEntity<?> deleteData(@PathVariable Long id) {
        service.deleteData(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
