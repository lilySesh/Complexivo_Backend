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

    @Column(name = "pais_natal")
    private String pais_natal;

    @Column(name = "edad")
    private Integer edad;

    @Column(name = "genero")
    private String genero;

    @Column(name = "sexo")
    private String sexo;

    @Column(name = "tipo_sangre")
    private String tipo_sangre;

    @Column(name = "estado_civil")
    private String estado_civil;

    @Column(name = "etnia")
    private String etnia;

    @Column(name = "idioma_raiz")
    private String idioma_raiz;

    @Column(name = "idioma_secundario")
    private String idioma_secundario;

    ////////////////////////////////////////////

    @Column(name = "pais_residencia")
    private String pais_residencia;

    @Column(name = "provincia_residencia")
    private String provincia_residencia;

    @Column(name = "canton_residencia")
    private String canton_residencia;

    @Column(name = "parroquia_residencia")
    private String parroquia_residencia;

    @Column(name = "calles")
    private String calles;

    @Column(name = "numero_casa")
    private String numero_casa;

    @Column(name = "sector")
    private String sector;

    @Column(name = "referencia")
    private String referencia;

    //////////////////////////////////////////////////

    @Column(name = "celular")
    private String celular;

    @Column(name = "telefono")
    private String telefono;

    @Column(name = "correo")
    private String correo;

    @Column(name = "correo_institucional")
    private String correo_institucional;

    ///////////////////////////////////////////////

    @Column(name = "discapacidad")
    private String discapacidad;

    @Column(name = "tipo_discapacidad")
    private String tipo_discapacidad;

    @Column(name = "porcentaje_discapacidad")
    private String porcentaje_discapacidad;

    @Column(name = "carnet_conadis")
    private String carnet_conadis;

    ////////////////////////////////////////////////

    @Column(name = "foto_carnet", columnDefinition = "TEXT")
    private String foto_carnet;

    @Column(name = "foto", columnDefinition = "TEXT")
    private String foto;

    @Column(name = "cv_socioempleo", columnDefinition = "TEXT")
    private String cv_socioempleo;

    @Column(name = "descripcion_perfil")
    private String descripcion_perfil;


    //relacion
    @OneToOne(mappedBy = "usuPerId")
    @JsonIgnore // Esta anotación evita que se serialice el campo usuario
    private Usuario usuario;

    //relacion
    @OneToOne(mappedBy = "persona_id")
    @JsonIgnore // Esta anotación evita que se serialice el campo usuario
    private Docente docente;

}
