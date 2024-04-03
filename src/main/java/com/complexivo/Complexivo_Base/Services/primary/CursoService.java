package com.complexivo.Complexivo_Base.Services.primary;

import com.complexivo.Complexivo_Base.Models.primary.Curso;
import com.complexivo.Complexivo_Base.Repository.primary.CursoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CursoService implements ICursoService{

	
	
	@Autowired
	private CursoRepository cursorepository;
	
	
	@Override
	@Transactional(readOnly = true)
	public List<Curso> findAll() {

		return (List<Curso>) cursorepository.findAll();
	}

	@Override
	@Transactional
	public Curso save(Curso curso) {

		return cursorepository.save(curso);
	}

	@Override
	@Transactional(readOnly = true)
	public Curso findById(Long id) {

		return cursorepository.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public void delete(Long id) {

		cursorepository.deleteById(id);
	}


}
