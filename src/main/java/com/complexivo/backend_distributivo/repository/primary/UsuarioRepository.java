package com.complexivo.backend_distributivo.repository.primary;

import com.complexivo.backend_distributivo.model.primary.Usuario;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends GenericRepository<Usuario, Long> {
   /*@Query(value = "SELECT * FROM usuario WHERE usu_token_password =: token", nativeQuery = true)
    public Usuario findByUsuTokenPassword(@Param("token") String token);

    Optional<Usuario> findByUsuNombreUsuario(String username);*/

}
