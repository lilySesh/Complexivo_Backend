package com.complexivo.Complexivo_Base.Controllers;

import com.complexivo.Complexivo_Base.Models.primary.Materia;
import com.complexivo.Complexivo_Base.Services.primary.MateriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/materia")
public class MateriaController {

    @Autowired
    private MateriaService materiaService;

    @GetMapping("/read")
    public List<Materia> read() {
        return materiaService.findAll();
    }
    
    @GetMapping("/read/{id}")
    public Materia buscar(@PathVariable Long id) {
        return materiaService.findById(id);
    }

    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public Materia create(@RequestBody Materia materia) {
        return materiaService.save(materia);
    }

    @DeleteMapping("/delete/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) {
    	materiaService.delete(id);
    }
}
