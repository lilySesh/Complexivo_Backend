package com.complexivo.Complexivo_Base.Controllers;


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
    public ResponseEntity<List<Periodo_Academico>> read() {
        return new ResponseEntity<>(periodoAcademicoService.findByAll(), HttpStatus.OK);
    }
    @PostMapping("/create")
    public ResponseEntity<Periodo_Academico> create(@RequestBody Periodo_Academico u) {
        return new ResponseEntity<>(periodoAcademicoService.save(u), HttpStatus.CREATED);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Periodo_Academico> update(@PathVariable Long id, @RequestBody Periodo_Academico p) {
        Periodo_Academico periodos = periodoAcademicoService.findById(id);
        if (periodos != null) {
            try {
                periodos.setId_periodo(p.getId_periodo());
                periodos.setPeri_fin(p.getPeri_fin());
                periodos.setPeri_nombre(p.getPeri_nombre());
                periodos.setPeri_inicio(p.getPeri_inicio());
                periodos.setPeri_estado(p.isPeri_estado());
                return new ResponseEntity<>(periodoAcademicoService.save(periodos), HttpStatus.CREATED);
            } catch (Exception e) {
                return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
            }

        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/delete")
    public ResponseEntity<Periodo_Academico> delete(@RequestParam Long id) {
        periodoAcademicoService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
