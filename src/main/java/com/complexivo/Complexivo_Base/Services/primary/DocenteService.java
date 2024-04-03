package com.complexivo.Complexivo_Base.Services.primary;

import com.complexivo.Complexivo_Base.Models.primary.Docente;
import com.complexivo.Complexivo_Base.Repository.primary.DocenteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class DocenteService implements IDocenteService {
	
	
	@Autowired
	private DocenteRepository docenterepository;
	
	@Override
	@Transactional(readOnly = true)
	public List<Docente> findAll() {

		return (List<Docente>) docenterepository.findAll();
	}

	@Override
	@Transactional
	public Docente save(Docente docente) {

		return docenterepository.save(docente);
	}

	@Override
	@Transactional(readOnly = true)
	public Docente findById(Long id) {

		return docenterepository.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public void delete(Long id) {

		docenterepository.deleteById(id);
	}

}
