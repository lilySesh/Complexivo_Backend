package com.complexivo.Complexivo_Base.Services.primary;

import com.complexivo.Complexivo_Base.Models.primary.Carrera;
import com.complexivo.Complexivo_Base.Models.primary.Curso;
import com.complexivo.Complexivo_Base.Repository.primary.CarreraRepository;
import com.complexivo.Complexivo_Base.Repository.primary.CursoRepository;

import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public class CursoService implements ICursoService{

	
	
	@Autowired
	private CursoRepository cursorepository;
	
	
	@Override
	@Transactional(readOnly = true)
	public List<Curso> findAll() {
		// TODO Auto-generated method stub
	    return (List<Curso>) cursorepository.findAll();
	}

	@Override
	@Transactional
	public Curso save(Curso curso) {
		// TODO Auto-generated method stub
		return cursorepository.save(curso);
	}

	@Override
	@Transactional(readOnly = true)
	public Curso findById(Long id) {
		// TODO Auto-generated method stub
		return cursorepository.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public void delete(Long id) {
		// TODO Auto-generated method stub
		cursorepository.deleteById(id);
	}


}
