package com.complexivo.Complexivo_Base.Models.primary;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

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
    @OneToMany(mappedBy = "periodo")
    @JsonIgnore
    List<Distributivo_Periodo> distributivo_periodo;
}
