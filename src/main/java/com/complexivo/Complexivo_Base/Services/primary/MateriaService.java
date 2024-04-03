package com.complexivo.Complexivo_Base.Services.primary;

import com.complexivo.Complexivo_Base.Models.primary.Materia;
import com.complexivo.Complexivo_Base.Repository.primary.MateriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class MateriaService implements IMateriaService {

	@Autowired
	private MateriaRepository materiarepository;
	
	@Override
	@Transactional(readOnly = true)
	public List<Materia> findAll() {

		return (List<Materia>) materiarepository.findAll();
	}

	@Override
	@Transactional
	public Materia save(Materia materia) {

		return materiarepository.save(materia);
	}

	@Override
	@Transactional(readOnly = true)
	public Materia findById(Long id) {

		return materiarepository.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public void delete(Long id) {

		materiarepository.deleteById(id);
	}

}
