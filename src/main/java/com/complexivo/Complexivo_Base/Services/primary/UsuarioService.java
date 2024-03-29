package com.complexivo.Complexivo_Base.Services.primary;

import com.complexivo.Complexivo_Base.Models.primary.Usuario;
import com.complexivo.Complexivo_Base.Repository.primary.UsuarioRepository;
import com.complexivo.Complexivo_Base.Services.genericServices.GenericService;
import com.complexivo.Complexivo_Base.Services.genericServices.GenericServiceImpl;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class UsuarioService extends GenericServiceImpl<Usuario, Long> implements GenericService<Usuario, Long> {

    @Autowired
    private UsuarioRepository usuarioRepository;
    @Override
    public CrudRepository<Usuario, Long> getDao() {
        return usuarioRepository;
    }


}