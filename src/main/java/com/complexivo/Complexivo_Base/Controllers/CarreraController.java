package com.complexivo.Complexivo_Base.Controllers;

import com.complexivo.Complexivo_Base.Models.primary.Carrera;
import com.complexivo.Complexivo_Base.Services.primary.CarreraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/carrera")
public class CarreraController {

    @Autowired
    private CarreraService carreraService;

    @GetMapping("/read")
    public ResponseEntity<List<Carrera>> read() {

        return new ResponseEntity<>(carreraService.findByAll(), HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<Carrera> create(@RequestBody Carrera u) {

        return new ResponseEntity<>(carreraService.save(u), HttpStatus.CREATED);
    }

    @DeleteMapping("/delete")
    public ResponseEntity<Carrera> delete(@RequestParam Long id) {

        carreraService.delete(id);
        return  new ResponseEntity<>(HttpStatus.OK);
    }
}
