package com.complexivo.Complexivo_Base.Controllers;

import com.complexivo.Complexivo_Base.Models.primary.Rol;
import com.complexivo.Complexivo_Base.Models.primary.Unidad_Administrativa;
import com.complexivo.Complexivo_Base.Services.primary.Unidad_AdministrativaService;
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

    @GetMapping("/read")
    public List<Unidad_Administrativa> read() {
        return unidadAdministrativaService.findAll();
    }
    
    @GetMapping("/read/{id}")
    public Unidad_Administrativa buscar(@PathVariable Long id) {
        return unidadAdministrativaService.findById(id);
    }

    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public Unidad_Administrativa create(@RequestBody Unidad_Administrativa unidad_administrativa) {
        return unidadAdministrativaService.save(unidad_administrativa);
    }

    @DeleteMapping("/delete/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) {
    	unidadAdministrativaService.delete(id);
    }
}
