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
@Table(name = "curso")
public class Curso {

    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_curso")
    private Long id_curso;

    @Column(name = "cur_nombre")
    private String cur_nombre;

    @Column(name = "cur_jornada")
    private String cur_jordana;

    @Column(name = "cur_ciclo")
    private String cur_ciclo;

    @Column(name = "cur_paralelo")
    private String cur_paralelo;


    //Relaciones
    @OneToMany(mappedBy = "curso")
    @JsonIgnore
    List<Curso_Materia> curso_materias;
}
