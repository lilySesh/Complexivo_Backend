package com.complexivo.Complexivo_Base.Models.primary;

import com.fasterxml.jackson.annotation.JsonIgnore;
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
@Table(name = "persona")
public class Persona {

    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_persona")
    private Long id_persona;

    @Column(name = "per_cedula")
    private String per_cedula;
    @Column(name = "per_primer_nombre")
    private String per_primer_nombre;

    @Column(name = "per_segundo_nombre")
    private String per_segundo_nombre;

    @Column(name = "per_prim_apellido")
    private String per_prim_apellido;

    @Column(name = "per_seg_apellido")
    private String per_seg_apellido;

    @Column(name = "per_correo_institucional")
    private String per_correo_institucional;


    //Relaciones
    @JsonIgnore
    @OneToOne(mappedBy = "persona")
    private Usuario usuario;

    @JsonIgnore
    @OneToOne(mappedBy = "persona")
    private Docente docente;
}
