package com.complexivo.Complexivo_Base.Controllers;

import com.complexivo.Complexivo_Base.Models.primary.Curso_Materia;
import com.complexivo.Complexivo_Base.Services.primary.Curso_MateriaService;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/curso_materia")
public class Curso_MateriaController {

    @Autowired
    private Curso_MateriaService cursoMateriaService;
    @Autowired
    private HttpServletRequest request;

    @GetMapping("/read")
    public ResponseEntity<List<Curso_Materia>> read() {

        return new ResponseEntity<>(cursoMateriaService.findByAll(), HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<Curso_Materia> create(@RequestBody Curso_Materia u) {

        return new ResponseEntity<>(cursoMateriaService.save(u), HttpStatus.CREATED);
    }

    @DeleteMapping("/delete")
    public ResponseEntity<Curso_Materia> delete(@RequestParam Long id) {

        cursoMateriaService.delete(id);
        return  new ResponseEntity<>(HttpStatus.OK);
    }
}
