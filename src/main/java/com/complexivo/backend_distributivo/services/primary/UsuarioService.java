package com.complexivo.backend_distributivo.services.primary;

import com.complexivo.backend_distributivo.model.primary.Usuario;
import com.complexivo.backend_distributivo.repository.primary.UsuarioRepository;
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
