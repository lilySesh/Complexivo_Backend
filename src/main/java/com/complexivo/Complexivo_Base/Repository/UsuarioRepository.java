package com.complexivo.Complexivo_Base.Repository;

import com.complexivo.Complexivo_Base.Models.Persona;
import com.complexivo.Complexivo_Base.Models.Usuario;
import com.complexivo.Complexivo_Base.Repository.genericRepository.GenericRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UsuarioRepository extends GenericRepository<Usuario, Long> {
   /*@Query(value = "SELECT * FROM usuario WHERE usu_token_password =: token", nativeQuery = true)
    public Usuario findByUsuTokenPassword(@Param("token") String token);

    Optional<Usuario> findByUsuNombreUsuario(String username);*/

}
