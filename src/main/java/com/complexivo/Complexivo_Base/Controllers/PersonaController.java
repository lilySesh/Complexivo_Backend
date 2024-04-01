package com.complexivo.Complexivo_Base.Controllers;

import com.complexivo.Complexivo_Base.Models.primary.Persona;
import com.complexivo.Complexivo_Base.Services.primary.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/persona")
public class PersonaController {

    @Autowired
    private PersonaService usuarioService;

    @GetMapping("/read")
    public ResponseEntity<List<Persona>> read() {
        return new ResponseEntity<>(usuarioService.findByAll(), HttpStatus.OK);
    }
    @PostMapping("/create")
    public ResponseEntity<Persona> create(@RequestBody Persona u) {
        return new ResponseEntity<>(usuarioService.save(u), HttpStatus.CREATED);
    }
    @PutMapping("/update/{id}")
    public ResponseEntity<Persona> update(@PathVariable Long id, @RequestBody Persona p) {
        Persona personas = usuarioService.findById(id);
        if (personas != null) {
            try {
                personas.setPer_cedula(p.getPer_cedula());
                personas.setPer_primer_nombre(p.getPer_primer_nombre());
                personas.setPer_prim_apellido(p.getPer_prim_apellido());
                personas.setPer_segundo_nombre(p.getPer_segundo_nombre());
                personas.setPer_seg_apellido(p.getPer_seg_apellido());
                personas.setPer_correo_institucional(p.getPer_correo_institucional());
                personas.setUsuario(p.getUsuario());
                personas.setDocente(p.getDocente());
                return new ResponseEntity<>(usuarioService.save(personas), HttpStatus.CREATED);
            } catch (Exception e) {
                return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
            }

        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/delete")
    public ResponseEntity<Persona> delete(@RequestParam Long id) {
        usuarioService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }


}
