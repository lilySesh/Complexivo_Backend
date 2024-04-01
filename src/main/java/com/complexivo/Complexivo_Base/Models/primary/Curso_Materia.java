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
@Table(name = "curso_materia")
public class Curso_Materia {

    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_curso_materia")
    private Long id_curso_materia;


    //Relaciones
    @ManyToOne()
    @JoinColumn(name = "materia", referencedColumnName = "id_materia")
    private Materia materia;

    @ManyToOne()
    @JoinColumn(name = "curso", referencedColumnName = "id_curso")
    private Curso curso;

    @OneToMany(mappedBy = "curso_materia")
    @JsonIgnore
    private List<Distributivo> distributivo;


}
