package com.complexivo.Complexivo_Base.Controllers;

import com.complexivo.Complexivo_Base.Models.primary.Docente;
import com.complexivo.Complexivo_Base.Services.primary.DocenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/docente")
public class DocenteController {

    @Autowired
    private DocenteService docenteService;

    @GetMapping("/read")
    public ResponseEntity<List<Docente>> read() {
        return new ResponseEntity<>(docenteService.findByAll(), HttpStatus.OK);
    }
    @PostMapping("/create")
    public ResponseEntity<Docente> create(@RequestBody Docente u) {
        return new ResponseEntity<>(docenteService.save(u), HttpStatus.CREATED);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Docente> update(@PathVariable Long id, @RequestBody Docente p) {
        Docente docentes = docenteService.findById(id);
        if (docentes != null) {
            try {
                docentes.setId_docente(p.getId_docente());
                docentes.setDoc_tipo(p.getDoc_tipo());
                docentes.setDoc_horas(p.getDoc_horas());
                docentes.setDoc_titulo(p.getDoc_titulo());
                docentes.setPersona(p.getPersona());

                return new ResponseEntity<>(docenteService.save(docentes), HttpStatus.CREATED);
            } catch (Exception e) {
                return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
            }

        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/delete")
    public ResponseEntity<Docente> delete(@RequestParam Long id) {
        docenteService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
