package com.complexivo.Complexivo_Base.Repository.primary;

import com.complexivo.Complexivo_Base.Models.primary.Unidad_Administrativa;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface Unidad_AdministrativaRepository extends CrudRepository<Unidad_Administrativa, Long> {
}
