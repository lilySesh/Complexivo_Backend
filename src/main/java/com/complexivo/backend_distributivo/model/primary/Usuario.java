package com.complexivo.backend_distributivo.model.primary;

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
@Table(name = "Usuarios")
public class Usuario {
    private static final long serialVersionUID = 1L;
    /**
     *
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_usuario;

    private String usu_usuario;

    private String usu_clave;
    //Relacion uno a uno
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "usuPerId", referencedColumnName = "id_persona")
//    @JsonIgnore // Esta anotación evita que se serialice el campo usuPerId
    private Persona usuPerId;

    @ManyToOne
    @JoinColumn(name = "rolId", referencedColumnName = "id_rol")
    private Rol rol;


}
