package com.complexivo.Complexivo_Base.Controllers;

import com.complexivo.Complexivo_Base.Models.primary.Rol;
import com.complexivo.Complexivo_Base.Services.primary.RolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/rol")
public class RolController {

    @Autowired
    private RolService rolService;

    @GetMapping("/read")
    public List<Rol> read() {
        return rolService.findAll();
    }
    
    @GetMapping("/read/{id}")
    public Rol buscar(@PathVariable Long id) {
        return rolService.findById(id);
    }

    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public Rol create(@RequestBody Rol rol) {
        return rolService.save(rol);
    }

    @DeleteMapping("/delete/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) {
    	rolService.delete(id);
    }
}
