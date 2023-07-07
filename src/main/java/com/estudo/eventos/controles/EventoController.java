package com.estudo.eventos.controles;

import com.estudo.eventos.entidades.Evento;
import com.estudo.eventos.servicos.EventoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/evento")
@RequiredArgsConstructor
public class EventoController {

    private final EventoService service;

    @CrossOrigin
    @RequestMapping(method = RequestMethod.GET, path = "")
    public ResponseEntity<List<Evento>> getData() {
        return ResponseEntity.ok(service.getData());
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    public ResponseEntity<Optional<Evento>> getDataById(@PathVariable Long id) {
        return ResponseEntity.ok(service.getDataById(id));
    }

    @PostMapping
    public ResponseEntity<?> postData(@RequestBody Evento evento) {
        service.postData(evento);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity<?> putData(@RequestBody Evento evento) {
            service.putData(evento);
            return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<?> deleteData(@PathVariable Long id) {
        service.deleteData(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
