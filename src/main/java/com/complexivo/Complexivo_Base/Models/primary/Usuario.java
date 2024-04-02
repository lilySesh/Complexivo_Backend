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
@Table(name = "usuario")
public class Usuario {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_usuario")
    private Long id_usuario;

    @Column(name = "usu_usuario")
    private String usu_usuario;

    @Column(name = "usu_clave")
    private String usu_clave;


    //Relaciones
    @OneToOne()
    @JoinColumn(nullable = false ,name = "persona", referencedColumnName = "id_persona", unique = true)
    private Persona persona;

    @ManyToOne()
    @JoinColumn(name = "rol", referencedColumnName = "id_rol")
    private Rol rol;
}
