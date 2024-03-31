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
@Table(name = "materia")
public class Materia {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_materia")
    private Long id_materia;

    @Column(name = "mat_nombre")
    private String mat_nombre;

    @Column(name = "mat_horas")
    private String mat_horas;

    @Column(name = "mat_descripcion")
    private String mat_descripcion;

    //relaciones
    //Relacion muchos a uno
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "matCarId", referencedColumnName = "id_carrera")
//    @JsonIgnore // Esta anotación evita que se serialice el campo matCarId
    private Carrera matCarId;
   
    //relacion uno a muchos
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "cmMatId", cascade = CascadeType.ALL)
    @JsonIgnore // Esta anotación evita que se serialice el campo carrera
    List<Curso_Materia> curso_Materias;

}
