package com.complexivo.Complexivo_Base.Controllers;

import com.complexivo.Complexivo_Base.Models.primary.Materia;
import com.complexivo.Complexivo_Base.Services.primary.MateriaService;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/materia")
public class MateriaController {

    @Autowired
    private MateriaService materiaService;
    @Autowired
    private HttpServletRequest request;

    @GetMapping("/read")
    public ResponseEntity<List<Materia>> read() {

        return new ResponseEntity<>(materiaService.findByAll(), HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<Materia> create(@RequestBody Materia u) {

        return new ResponseEntity<>(materiaService.save(u), HttpStatus.CREATED);
    }

    @DeleteMapping("/delete")
    public ResponseEntity<Materia> delete(@RequestParam Long id) {

        materiaService.delete(id);
        return  new ResponseEntity<>(HttpStatus.OK);
    }
}
