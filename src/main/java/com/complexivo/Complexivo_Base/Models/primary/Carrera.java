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
@Table(name = "Carrera")
public class Carrera {

    private static final long serialVersionUID = 1L;
    /**
     *
     */
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_carrera")
    @Id
    private Long id_carrera;

    @Column(name = "car_nombre")
    private String car_nombre;

    @Column(name = "car_modalidad")
    private String car_modalidad;

    @Column(name = "car_director")
    private String car_director;


    ////////////////////////////////////////////////////////

    //relacion uno a muchos

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "matCarId", cascade = CascadeType.ALL)
    @JsonIgnore // Esta anotación evita que se serialice el campo carrera
            List<Materia> materias;
}
