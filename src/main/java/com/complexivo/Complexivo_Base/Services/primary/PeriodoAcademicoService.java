package com.complexivo.Complexivo_Base.Services.primary;

import com.complexivo.Complexivo_Base.Models.primary.Periodo_Academico;
import com.complexivo.Complexivo_Base.Repository.primary.PeridodAcademicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PeriodoAcademicoService implements IPeriodoAcademicoService {

	@Autowired
	private PeridodAcademicoRepository periodoacademicoepository;
	
	@Override
	@Transactional(readOnly = true)
	public List<Periodo_Academico> findAll() {

		return (List<Periodo_Academico>) periodoacademicoepository.findAll();
	}

	@Override
	@Transactional
	public Periodo_Academico save(Periodo_Academico periodo_academico) {

		return periodoacademicoepository.save(periodo_academico);
	}

	@Override
	@Transactional(readOnly = true)
	public Periodo_Academico findById(Long id) {

		return periodoacademicoepository.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public void delete(Long id) {

		periodoacademicoepository.deleteById(id);
	}


}
