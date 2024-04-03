package com.complexivo.Complexivo_Base.Controllers;

import com.complexivo.Complexivo_Base.Models.primary.Curso;
import com.complexivo.Complexivo_Base.Services.primary.CursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/curso")
public class CursoController {

    @Autowired
    private CursoService cursoService;

    @GetMapping("/read")
    public List<Curso> read() {
        return cursoService.findAll();
    }
    
    @GetMapping("/read/{id}")
    public Curso buscar(@PathVariable Long id) {
        return cursoService.findById(id);
    }

    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public Curso create(@RequestBody Curso curso) {
        return cursoService.save(curso);
    }

    @DeleteMapping("/delete/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) {
    	cursoService.delete(id);
    }
}
