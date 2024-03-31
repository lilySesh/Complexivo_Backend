package com.complexivo.Complexivo_Base.Controllers;

import com.complexivo.Complexivo_Base.Models.primary.Unidad_Administrativa;
import com.complexivo.Complexivo_Base.Services.primary.Unidad_AdministrativaService;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/unidad_administrativa")
public class Unidad_AdministrativaController {

    @Autowired
    private Unidad_AdministrativaService unidadAdministrativaService;
    @Autowired
    private HttpServletRequest request;

    @GetMapping("/read")
    public ResponseEntity<List<Unidad_Administrativa>> read() {

        return new ResponseEntity<>(unidadAdministrativaService.findByAll(), HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<Unidad_Administrativa> create(@RequestBody Unidad_Administrativa u) {

        return new ResponseEntity<>(unidadAdministrativaService.save(u), HttpStatus.CREATED);
    }

    @DeleteMapping("/delete")
    public ResponseEntity<Unidad_Administrativa> delete(@RequestParam Long id) {

        unidadAdministrativaService.delete(id);
        return  new ResponseEntity<>(HttpStatus.OK);
    }
}
