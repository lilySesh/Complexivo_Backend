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
@Table(name = "distributivo_periodo")
public class Distributivo_Periodo {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_dis_periodo")
    private Long id_dis_periodo;

    //Relaciones
    @ManyToOne
    @JoinColumn(name = "id_distributivo")
    private Distributivo distributivos;

    @ManyToOne
    @JoinColumn(name = "id_periodo")
    private Periodo_Academico periodosAcademicos;
}
