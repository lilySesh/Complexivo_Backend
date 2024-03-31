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
@Table(name = "Persona")
public class Persona {

    private static final long serialVersionUID = 1L;
    /**
     *
     */
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_persona")
    @Id
    private Long id_persona;

    @Column(name = "cedula")
    private String cedula;

    @Column(name = "apellido_paterno")
    private String apellido_paterno;

    @Column(name = "apellido_materno")
    private String apellido_materno;

    @Column(name = "primer_nombre")
    private String primer_nombre;

    @Column(name = "segundo_nombre")
    private String segundo_nombre;

    @Column(name = "fecha_nacimiento")
    private String fecha_nacimiento;

    @Column(name = "edad")
    private Integer edad;

    @Column(name = "celular")
    private String celular;

    @Column(name = "telefono")
    private String telefono;

    @Column(name = "correo")
    private String correo;

    @Column(name = "correo_institucional")
    private String correo_institucional;




    //relacion
    @OneToOne(mappedBy = "usuPerId")
    @JsonIgnore // Esta anotación evita que se serialice el campo usuario
    private Usuario usuario;

    //relacion
    @OneToOne(mappedBy = "persona_id")
    @JsonIgnore // Esta anotación evita que se serialice el campo docente
    private Docente docente;

}
