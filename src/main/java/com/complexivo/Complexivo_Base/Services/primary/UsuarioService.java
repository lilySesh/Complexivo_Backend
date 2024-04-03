package com.complexivo.Complexivo_Base.Services.primary;

import com.complexivo.Complexivo_Base.Models.primary.Usuario;
import com.complexivo.Complexivo_Base.Repository.primary.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UsuarioService implements IUsuarioService{

	@Autowired
	private UsuarioRepository usuariorepository;
	
	@Override
	@Transactional(readOnly = true)
	public List<Usuario> findAll() {
		
	    return (List<Usuario>) usuariorepository.findAll();
	}

	@Override
	@Transactional
	public Usuario save(Usuario usuario) {

		return usuariorepository.save(usuario);
	}

	@Override
	@Transactional(readOnly = true)
	public Usuario findById(Long id) {

		return usuariorepository.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public void delete(Long id) {

		usuariorepository.deleteById(id);
	}



}
