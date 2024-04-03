package com.complexivo.Complexivo_Base.Services.primary;

import com.complexivo.Complexivo_Base.Models.primary.Rol;
import com.complexivo.Complexivo_Base.Repository.primary.RolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class RolService implements IRolService {

	@Autowired
	private RolRepository rolrepository;
	
	@Override
	@Transactional(readOnly = true)
	public List<Rol> findAll() {

		return (List<Rol>) rolrepository.findAll();
	}

	@Override
	@Transactional
	public Rol save(Rol rol) {

		return rolrepository.save(rol);
	}

	@Override
	@Transactional(readOnly = true)
	public Rol findById(Long id) {

		return rolrepository.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public void delete(Long id) {

		rolrepository.deleteById(id);
	}


}
