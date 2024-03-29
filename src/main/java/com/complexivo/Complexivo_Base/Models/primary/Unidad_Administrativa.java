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
@Table(name = "Unidad_Administrativa")
public class Unidad_Administrativa {

    private static final long serialVersionUID = 1L;
    /**
     *
     */
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_uni_adm")
    @Id
    private Long id_uni_adm;

    @Column(name = "peri_nombre")
    private String peri_nombre;

    @Column(name = "peri_inicio")
    private String peri_inicio;

    @Column(name = "peri_fin")
    private String peri_fin;

    @Column(name = "peri_estado")
    private boolean peri_estado;

}
