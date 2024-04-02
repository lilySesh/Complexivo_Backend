package com.complexivo.Complexivo_Base.Services.primary;

import com.complexivo.Complexivo_Base.Models.primary.Carrera;
import com.complexivo.Complexivo_Base.Models.primary.Rol;
import com.complexivo.Complexivo_Base.Repository.primary.CarreraRepository;
import com.complexivo.Complexivo_Base.Repository.primary.RolRepository;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public class RolService implements IRolService {

	@Autowired
	private RolRepository rolrepository;
	
	@Override
	@Transactional(readOnly = true)
	public List<Rol> findAll() {
		// TODO Auto-generated method stub
	    return (List<Rol>) rolrepository.findAll();
	}

	@Override
	@Transactional
	public Rol save(Rol rol) {
		// TODO Auto-generated method stub
		return rolrepository.save(rol);
	}

	@Override
	@Transactional(readOnly = true)
	public Rol findById(Long id) {
		// TODO Auto-generated method stub
		return rolrepository.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public void delete(Long id) {
		// TODO Auto-generated method stub
		rolrepository.deleteById(id);
	}


}
