package com.complexivo.Complexivo_Base.Controllers;

import com.complexivo.Complexivo_Base.Models.primary.Persona;
import com.complexivo.Complexivo_Base.Models.primary.Usuario;
import com.complexivo.Complexivo_Base.Repository.primary.UsuarioRepository;
import com.complexivo.Complexivo_Base.Services.primary.PersonaService;
import com.complexivo.Complexivo_Base.Services.primary.RolService;
import com.complexivo.Complexivo_Base.Services.primary.UsuarioService;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/persona")
public class PersonaController {

    @Autowired
    private PersonaService usuarioService;
    @Autowired
    private HttpServletRequest request;


    @GetMapping("/read")
    public ResponseEntity<List<Persona>> read() {
        return new ResponseEntity<>(usuarioService.findByAll(), HttpStatus.OK);
    }
    @PostMapping("/create")
    public ResponseEntity<Persona> create(@RequestBody Persona u) {
        return new ResponseEntity<>(usuarioService.save(u), HttpStatus.CREATED);
    }

    @DeleteMapping("/delete")
    public ResponseEntity<Persona> delete(@RequestParam Long id) {
        usuarioService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }


}
