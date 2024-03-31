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
@Table(name = "periodo_academico")
public class Periodo_Academico {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_periodo")
    private Long id_periodo;

    @Column(name = "peri_nombre")
    private String peri_nombre;

    @Column(name = "peri_inicio")
    private String peri_inicio;

    @Column(name = "peri_fin")
    private String peri_fin;

    @Column(name = "peri_estado")
    private boolean peri_estado;

    //Relaciones
    @ManyToMany(mappedBy = "periodosAcademicos")
    private Set<Distributivo_Periodo> distributivoPeriodos = new HashSet<>();

}
