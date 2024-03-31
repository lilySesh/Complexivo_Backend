package com.complexivo.Complexivo_Base.Controllers;

import com.complexivo.Complexivo_Base.Models.primary.Curso;
import com.complexivo.Complexivo_Base.Services.primary.CursoService;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/curso")
public class CursoController {

    @Autowired
    private CursoService cursoService;
    @Autowired
    private HttpServletRequest request;

    @GetMapping("/read")
    public ResponseEntity<List<Curso>> read() {

        return new ResponseEntity<>(cursoService.findByAll(), HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<Curso> create(@RequestBody Curso u) {

        return new ResponseEntity<>(cursoService.save(u), HttpStatus.CREATED);
    }

    @DeleteMapping("/delete")
    public ResponseEntity<Curso> delete(@RequestParam Long id) {

        cursoService.delete(id);
        return  new ResponseEntity<>(HttpStatus.OK);
    }
}
