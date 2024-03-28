package com.complexivo.backend_distributivo.model.primary;

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
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_persona;
    public int cedula;
    public String nombre;
    public String apellido;
    public String correo;

    public boolean persona_estado;

    //relacion
    @OneToOne(mappedBy = "usuPerId")
    @JsonIgnore // Esta anotación evita que se serialice el campo usuario
    private Usuario usuario;

    //relacion
    @OneToOne(mappedBy = "persona_id")
    @JsonIgnore // Esta anotación evita que se serialice el campo usuario
    private Docente docente;

}
