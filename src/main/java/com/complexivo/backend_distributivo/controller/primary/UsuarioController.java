package com.complexivo.backend_distributivo.controller.primary;

import com.complexivo.backend_distributivo.model.primary.Usuario;
import com.complexivo.backend_distributivo.services.primary.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/usuario")
public class UsuarioController {


    @Autowired
    private UsuarioService usuarioService;
    @GetMapping("/read")
    public ResponseEntity<List<Usuario>> read() {
        return new ResponseEntity<>(usuarioService.findByAll(), HttpStatus.OK);
    }
    @PostMapping("/create")
    public ResponseEntity<Usuario> create(@RequestBody Usuario u) {
        return new ResponseEntity<>(usuarioService.save(u), HttpStatus.CREATED);
    }

    @DeleteMapping("/delete")
    public ResponseEntity<Usuario> delete(@RequestParam Long id) {
        usuarioService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }



}
