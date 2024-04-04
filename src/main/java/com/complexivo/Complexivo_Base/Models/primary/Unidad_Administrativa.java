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
@Table(name = "unidad_administrativa")
public class Unidad_Administrativa {
    
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_uni_adm")
    private Long id_uni_adm;

    @Column(name = "uni_adm_nombre")
    private String uni_adm_nombre;

    @Column(name = "uni_adm_inicio")
    private String uni_adm_horas;

    @Column(name = "uni_adm_fin")
    private String uni_adm_descripcion;

    //Relaciones
    @OneToMany(mappedBy = "uni_adm")
    @JsonIgnore
    private List<Distributivo> distributivo;
}
