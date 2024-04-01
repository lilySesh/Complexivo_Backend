package com.complexivo.Complexivo_Base.Controllers;

import com.complexivo.Complexivo_Base.Models.primary.Distributivo;
import com.complexivo.Complexivo_Base.Services.primary.DistributivoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/distributivo")
public class DistributivoController {

    @Autowired
    private DistributivoService distributivoService;

    @GetMapping("/read")
    public ResponseEntity<List<Distributivo>> read() {
        return new ResponseEntity<>(distributivoService.findByAll(), HttpStatus.OK);
    }
    @PostMapping("/create")
    public ResponseEntity<Distributivo> create(@RequestBody Distributivo u) {
        return new ResponseEntity<>(distributivoService.save(u), HttpStatus.CREATED);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Distributivo> update(@PathVariable Long id, @RequestBody Distributivo p) {
        Distributivo distributivos = distributivoService.findById(id);
        if (distributivos != null) {
            try {
                     distributivos.setId_distributivo(p.getId_distributivo());
                     distributivos.setDoc_horas_admin(p.getDoc_horas_admin());
                     distributivos.setDoc_horas_doc(p.getDoc_horas_doc());


                return new ResponseEntity<>(distributivoService.save(distributivos), HttpStatus.CREATED);
            } catch (Exception e) {
                return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
            }

        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/delete")
    public ResponseEntity<Distributivo> delete(@RequestParam Long id) {
        distributivoService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
