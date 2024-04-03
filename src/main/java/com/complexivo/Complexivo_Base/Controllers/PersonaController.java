package com.complexivo.Complexivo_Base.Controllers;

import com.complexivo.Complexivo_Base.Models.primary.Persona;
import com.complexivo.Complexivo_Base.Services.primary.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/persona")
public class PersonaController {

    @Autowired
    private PersonaService usuarioService;

    @GetMapping("/read")
    public List<Persona> read() {
        return usuarioService.findAll();
    }
    
    @GetMapping("/read/{id}")
    public Persona buscar(@PathVariable Long id) {
        return usuarioService.findById(id);
    }

    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public Persona create(@RequestBody Persona persona) {
        return usuarioService.save(persona);
    }

    @DeleteMapping("/delete/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) {
    	usuarioService.delete(id);
    }


}
