package com.complexivo.Complexivo_Base.Models.primary;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Periodo_Academico")
public class Periodo_Academico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_periodo;
    private String peri_nombre;
    private String peri_inicio;
    private String peri_fin;
    private boolean peri_estado;

    @ManyToMany(mappedBy = "periodosAcademicos")
    private Set<Distributivo_Periodo> distributivoPeriodos = new HashSet<>();



}
