package com.complexivo.Complexivo_Base.Models.primary;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "curso_materia")
public class Curso_Materia {

    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_curso_materia")
    private Long id_curso_materia;


    //Relaciones
    //Relacion muchos a uno
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cmMatId", referencedColumnName = "id_materia")
//    @JsonIgnore // Esta anotación evita que se serialice el campo matCarId
    private Materia cmMatId;

    //Relacion muchos a uno

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cmCurId", referencedColumnName = "id_curso")
//    @JsonIgnore // Esta anotación evita que se serialice el campo matCarId
    private Curso cmCurId;

}
