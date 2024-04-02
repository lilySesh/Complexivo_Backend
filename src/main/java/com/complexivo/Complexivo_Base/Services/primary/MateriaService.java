package com.complexivo.Complexivo_Base.Services.primary;

import com.complexivo.Complexivo_Base.Models.primary.Carrera;
import com.complexivo.Complexivo_Base.Models.primary.Materia;
import com.complexivo.Complexivo_Base.Repository.primary.CarreraRepository;
import com.complexivo.Complexivo_Base.Repository.primary.MateriaRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class MateriaService implements IMateriaService {

	@Autowired
	private MateriaRepository materiarepository;
	
	@Override
	@Transactional(readOnly = true)
	public List<Materia> findAll() {
		// TODO Auto-generated method stub
	    return (List<Materia>) materiarepository.findAll();
	}

	@Override
	@Transactional
	public Materia save(Materia materia) {
		// TODO Auto-generated method stub
		return materiarepository.save(materia);
	}

	@Override
	@Transactional(readOnly = true)
	public Materia findById(Long id) {
		// TODO Auto-generated method stub
		return materiarepository.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public void delete(Long id) {
		// TODO Auto-generated method stub
		materiarepository.deleteById(id);
	}

}
