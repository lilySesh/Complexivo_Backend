package com.complexivo.Complexivo_Base.Controllers;

import com.complexivo.Complexivo_Base.Models.primary.Rol;
import com.complexivo.Complexivo_Base.Services.primary.RolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/rol")
public class RolController {

    @Autowired
    private RolService rolService;

    @GetMapping("/read")
    public ResponseEntity<List<Rol>> read() {
        return new ResponseEntity<>(rolService.findByAll(), HttpStatus.OK);
    }
    @PostMapping("/create")
    public ResponseEntity<Rol> create(@RequestBody Rol u) {
        return new ResponseEntity<>(rolService.save(u), HttpStatus.CREATED);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Rol> update(@PathVariable Long id, @RequestBody Rol p) {
        Rol roles = rolService.findById(id);
        if (roles != null) {
            try {

                roles.setId_rol(p.getId_rol());
                roles.setRol_nombre(p.getRol_nombre());
                roles.setRol_descripcion(p.getRol_descripcion());

                return new ResponseEntity<>(rolService.save(roles), HttpStatus.CREATED);
            } catch (Exception e) {
                return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
            }

        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/delete")
    public ResponseEntity<Rol> delete(@RequestParam Long id) {
        rolService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
