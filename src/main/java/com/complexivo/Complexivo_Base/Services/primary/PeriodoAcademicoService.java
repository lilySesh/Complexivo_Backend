package com.complexivo.Complexivo_Base.Services.primary;

import com.complexivo.Complexivo_Base.Models.primary.Carrera;
import com.complexivo.Complexivo_Base.Models.primary.Periodo_Academico;
import com.complexivo.Complexivo_Base.Models.primary.Persona;
import com.complexivo.Complexivo_Base.Repository.primary.CarreraRepository;
import com.complexivo.Complexivo_Base.Repository.primary.PeridodAcademicoRepository;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class PeriodoAcademicoService implements IPeriodoAcademicoService {

	@Autowired
	private PeridodAcademicoRepository periodoacademicoepository;
	
	@Override
	@Transactional(readOnly = true)
	public List<Periodo_Academico> findAll() {
		// TODO Auto-generated method stub
	    return (List<Periodo_Academico>) periodoacademicoepository.findAll();
	}

	@Override
	@Transactional
	public Periodo_Academico save(Periodo_Academico periodo_academico) {
		// TODO Auto-generated method stub
		return periodoacademicoepository.save(periodo_academico);
	}

	@Override
	@Transactional(readOnly = true)
	public Periodo_Academico findById(Long id) {
		// TODO Auto-generated method stub
		return periodoacademicoepository.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public void delete(Long id) {
		// TODO Auto-generated method stub
		periodoacademicoepository.deleteById(id);
	}


}
