package com.complexivo.Complexivo_Base.Repository.primary;

import com.complexivo.Complexivo_Base.Models.primary.Rol;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RolRepository extends CrudRepository<Rol, Long> {

}
