package com.complexivo.Complexivo_Base.Controllers;

import com.complexivo.Complexivo_Base.Models.primary.Persona;
import com.complexivo.Complexivo_Base.Models.primary.Usuario;
import com.complexivo.Complexivo_Base.Repository.primary.UsuarioRepository;
import com.complexivo.Complexivo_Base.Services.primary.PersonaService;
import com.complexivo.Complexivo_Base.Services.primary.RolService;
import com.complexivo.Complexivo_Base.Services.primary.UsuarioService;
import jakarta.servlet.http.HttpServletRequest;
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

                personas.setId_persona(p.getId_persona());
                personas.setCedula(p.getCedula());
                personas.setPrimer_nombre(p.getPrimer_nombre());
                personas.setSegundo_nombre(p.getSegundo_nombre());
                personas.setApellido_materno(p.getApellido_materno());
                personas.setApellido_paterno(p.getApellido_paterno());
                personas.setTelefono(p.getTelefono());
                personas.setCorreo(p.getCorreo());
                personas.setCorreo_institucional(p.getCorreo_institucional());
                personas.setCelular(p.getCelular());


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
