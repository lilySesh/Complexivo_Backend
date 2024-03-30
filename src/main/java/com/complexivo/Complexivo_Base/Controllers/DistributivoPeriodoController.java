package com.complexivo.Complexivo_Base.Controllers;


import com.complexivo.Complexivo_Base.Models.primary.Distributivo_Periodo;
import com.complexivo.Complexivo_Base.Services.primary.DistributivoPeriodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin("*")
@RestController
@RequestMapping("/distributivoController")
public class DistributivoPeriodoController {
    @Autowired
    private DistributivoPeriodoService distributivoPeriodoService;



    @GetMapping("/read")
    public ResponseEntity<List<Distributivo_Periodo>> read() {
        return new ResponseEntity<>(distributivoPeriodoService.findByAll(), HttpStatus.OK);
    }
    @PostMapping("/create")
    public ResponseEntity<Distributivo_Periodo> create(@RequestBody Distributivo_Periodo u) {
        return new ResponseEntity<>(distributivoPeriodoService.save(u), HttpStatus.CREATED);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Distributivo_Periodo> update(@PathVariable Long id, @RequestBody Distributivo_Periodo p) {
        Distributivo_Periodo distributivos = distributivoPeriodoService.findById(id);
        if (distributivos != null) {
            try {
                distributivos.setId_dis_periodo(p.getId_dis_periodo());
                distributivos.setDistributivos(p.getDistributivos());
                distributivos.setPeriodosAcademicos(p.getPeriodosAcademicos());


                return new ResponseEntity<>(distributivoPeriodoService.save(distributivos), HttpStatus.CREATED);
            } catch (Exception e) {
                return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
            }

        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/delete")
    public ResponseEntity<Distributivo_Periodo> delete(@RequestParam Long id) {
        distributivoPeriodoService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
