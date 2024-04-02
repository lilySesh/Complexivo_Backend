package com.complexivo.Complexivo_Base.Services.primary;

import com.complexivo.Complexivo_Base.Models.primary.Carrera;
import com.complexivo.Complexivo_Base.Models.primary.Unidad_Administrativa;
import com.complexivo.Complexivo_Base.Repository.primary.CarreraRepository;
import com.complexivo.Complexivo_Base.Repository.primary.Unidad_AdministrativaRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class Unidad_AdministrativaService implements IUnidad_Administrativa{

	@Autowired
	private Unidad_AdministrativaRepository unidadadministrativarepository;
	
	@Override
	@Transactional(readOnly = true)
	public List<Unidad_Administrativa> findAll() {
		// TODO Auto-generated method stub
	    return (List<Unidad_Administrativa>) unidadadministrativarepository.findAll();
	}

	@Override
	@Transactional
	public Unidad_Administrativa save(Unidad_Administrativa unidad_administrativa) {
		// TODO Auto-generated method stub
		return unidadadministrativarepository.save(unidad_administrativa);
	}

	@Override
	@Transactional(readOnly = true)
	public Unidad_Administrativa findById(Long id) {
		// TODO Auto-generated method stub
		return unidadadministrativarepository.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public void delete(Long id) {
		// TODO Auto-generated method stub
		unidadadministrativarepository.deleteById(id);
	}


}
