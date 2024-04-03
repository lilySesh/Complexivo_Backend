package com.complexivo.Complexivo_Base.Controllers;

import com.complexivo.Complexivo_Base.Models.primary.Distributivo;
import com.complexivo.Complexivo_Base.Services.primary.DistributivoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/distributivo")
public class DistributivoController {

    @Autowired
    private DistributivoService distributivoService;

    @GetMapping("/read")
    public List<Distributivo> read() {
        return distributivoService.findAll();
    }
    
    @GetMapping("/read/{id}")
    public Distributivo buscar(@PathVariable Long id) {
        return distributivoService.findById(id);
    }

    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public Distributivo create(@RequestBody Distributivo distributivo) {
        return distributivoService.save(distributivo);
    }

    @DeleteMapping("/delete/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) {
    	distributivoService.delete(id);
    }

}
