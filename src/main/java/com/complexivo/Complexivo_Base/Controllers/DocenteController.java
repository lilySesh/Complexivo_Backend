package com.complexivo.Complexivo_Base.Controllers;

import com.complexivo.Complexivo_Base.Models.primary.Docente;
import com.complexivo.Complexivo_Base.Services.primary.DocenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/docente")
public class DocenteController {

    @Autowired
    private DocenteService docenteService;

    @GetMapping("/read")
    public List<Docente> read() {
        return docenteService.findAll();
    }
    
    @GetMapping("/read/{id}")
    public Docente buscar(@PathVariable Long id) {
        return docenteService.findById(id);
    }

    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public Docente create(@RequestBody Docente docente) {
        return docenteService.save(docente);
    }

    @DeleteMapping("/delete/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) {
    	docenteService.delete(id);
    }
}
