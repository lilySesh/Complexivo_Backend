package com.complexivo.Complexivo_Base.Services.primary;

import java.util.List;

import com.complexivo.Complexivo_Base.Models.primary.Periodo_Academico;



public interface IPeriodoAcademicoService {
	public List<Periodo_Academico> findAll();
	public Periodo_Academico save(Periodo_Academico periodo_academico);
	public Periodo_Academico findById(Long id);
	public void delete(Long id);
}
