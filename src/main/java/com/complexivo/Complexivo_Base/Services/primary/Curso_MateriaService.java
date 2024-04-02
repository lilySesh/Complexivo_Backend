package com.complexivo.Complexivo_Base.Services.primary;

import com.complexivo.Complexivo_Base.Models.primary.Carrera;
import com.complexivo.Complexivo_Base.Models.primary.Curso_Materia;
import com.complexivo.Complexivo_Base.Repository.primary.Curso_MateriaRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public class Curso_MateriaService implements ICurso_MateriaService{

	
	@Autowired
	private Curso_MateriaRepository curso_materiarepository;
	
	@Override
	@Transactional(readOnly = true)
	public List<Curso_Materia> findAll() {
		// TODO Auto-generated method stub
		return (List<Curso_Materia>) curso_materiarepository.findAll();
	}

	@Override
	@Transactional
	public Curso_Materia save(Curso_Materia curso_materia) {
		// TODO Auto-generated method stub
		return curso_materiarepository.save(curso_materia);
	}

	@Override
	@Transactional(readOnly = true)
	public Curso_Materia findById(Long id) {
		// TODO Auto-generated method stub
		return curso_materiarepository.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public void delete(Long id) {
		// TODO Auto-generated method stub
		curso_materiarepository.deleteById(id);
	} 


}
