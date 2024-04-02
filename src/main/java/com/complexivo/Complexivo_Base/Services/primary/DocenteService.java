package com.complexivo.Complexivo_Base.Services.primary;

import com.complexivo.Complexivo_Base.Models.primary.Carrera;
import com.complexivo.Complexivo_Base.Models.primary.Docente;
import com.complexivo.Complexivo_Base.Repository.primary.CarreraRepository;
import com.complexivo.Complexivo_Base.Repository.primary.DocenteRepository;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class DocenteService implements IDocenteService {
	
	
	@Autowired
	private DocenteRepository docenterepository;
	
	@Override
	@Transactional(readOnly = true)
	public List<Docente> findAll() {
		// TODO Auto-generated method stub
	    return (List<Docente>) docenterepository.findAll();
	}

	@Override
	@Transactional
	public Docente save(Docente docente) {
		// TODO Auto-generated method stub
		return docenterepository.save(docente);
	}

	@Override
	@Transactional(readOnly = true)
	public Docente findById(Long id) {
		// TODO Auto-generated method stub
		return docenterepository.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public void delete(Long id) {
		// TODO Auto-generated method stub
		docenterepository.deleteById(id);
	}

}
