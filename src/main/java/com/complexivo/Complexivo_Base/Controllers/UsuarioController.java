package com.complexivo.Complexivo_Base.Controllers;

import com.complexivo.Complexivo_Base.Models.primary.Usuario;
import com.complexivo.Complexivo_Base.Repository.primary.UsuarioRepository;
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
@RequestMapping("/usuario")
public class UsuarioController {


    @Autowired
    private UsuarioService usuarioService;
    @Autowired
    private HttpServletRequest request;

    @Autowired
    private RolService rolService;
    @Autowired
    private UsuarioRepository uR;

    @GetMapping("/read")
    public ResponseEntity<List<Usuario>> read() {
        return new ResponseEntity<>(usuarioService.findByAll(), HttpStatus.OK);
    }
    @PostMapping("/create")
    public ResponseEntity<Usuario> create(@RequestBody Usuario u) {
        return new ResponseEntity<>(usuarioService.save(u), HttpStatus.CREATED);
    }

    @DeleteMapping("/delete")
    public ResponseEntity<Usuario> delete(@RequestParam Long id) {
        usuarioService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }



}
