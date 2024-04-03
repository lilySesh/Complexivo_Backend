package com.complexivo.Complexivo_Base.Controllers;

import com.complexivo.Complexivo_Base.Models.primary.Curso_Materia;
import com.complexivo.Complexivo_Base.Services.primary.Curso_MateriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/curso_materia")
public class Curso_MateriaController {

    @Autowired
    private Curso_MateriaService curso_materiaService;

    @GetMapping("/read")
    public List<Curso_Materia> read() {
        return curso_materiaService.findAll();
    }
    
    @GetMapping("/read/{id}")
    public Curso_Materia buscar(@PathVariable Long id) {
        return curso_materiaService.findById(id);
    }

    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public Curso_Materia create(@RequestBody Curso_Materia curso_materia) {
        return curso_materiaService.save(curso_materia);
    }

    @DeleteMapping("/delete/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) {
    	curso_materiaService.delete(id);
    }
}
