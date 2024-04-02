package com.complexivo.Complexivo_Base.Controllers;

import com.complexivo.Complexivo_Base.Models.primary.Materia;
import com.complexivo.Complexivo_Base.Models.primary.Periodo_Academico;
import com.complexivo.Complexivo_Base.Services.primary.PeriodoAcademicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/periodoAcademico")
public class PeriodoAcademicoController {

    @Autowired
    private PeriodoAcademicoService periodoAcademicoService;

    @GetMapping("/read")
    public List<Periodo_Academico> read() {
        return periodoAcademicoService.findAll();
    }
    
    @GetMapping("/read/{id}")
    public Periodo_Academico buscar(@PathVariable Long id) {
        return periodoAcademicoService.findById(id);
    }

    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public Periodo_Academico create(@RequestBody Periodo_Academico periodo_academico) {
        return periodoAcademicoService.save(periodo_academico);
    }

    @DeleteMapping("/delete/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) {
    	periodoAcademicoService.delete(id);
    }

}
