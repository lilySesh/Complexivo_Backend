package com.complexivo.backend_distributivo.model.primary;


import jakarta.persistence.*;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Entity
@Table(name = "Persona")
public class Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_persona;
    public int cedula;
    public String nombre;
    public String apellido;
    public String correo;

    public boolean persona_estado;


}
