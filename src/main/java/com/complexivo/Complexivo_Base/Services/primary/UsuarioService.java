package com.complexivo.Complexivo_Base.Services.primary;

import com.complexivo.Complexivo_Base.Models.primary.Carrera;
import com.complexivo.Complexivo_Base.Models.primary.Usuario;
import com.complexivo.Complexivo_Base.Repository.primary.CarreraRepository;
import com.complexivo.Complexivo_Base.Repository.primary.UsuarioRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UsuarioService implements IUsuarioService{

	@Autowired
	private UsuarioRepository usuariorepository;
	
	@Override
	@Transactional(readOnly = true)
	public List<Usuario> findAll() {
		// TODO Auto-generated method stub
	    return (List<Usuario>) usuariorepository.findAll();
	}

	@Override
	@Transactional
	public Usuario save(Usuario usuario) {
		// TODO Auto-generated method stub
		return usuariorepository.save(usuario);
	}

	@Override
	@Transactional(readOnly = true)
	public Usuario findById(Long id) {
		// TODO Auto-generated method stub
		return usuariorepository.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public void delete(Long id) {
		// TODO Auto-generated method stub
		usuariorepository.deleteById(id);
	}



}
