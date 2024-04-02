package com.complexivo.Complexivo_Base.Services.primary;

import java.util.List;

import com.complexivo.Complexivo_Base.Models.primary.Usuario;


public interface IUsuarioService {
	public List<Usuario> findAll();
	public Usuario save(Usuario usuario);
	public Usuario findById(Long id);
	public void delete(Long id);
}
