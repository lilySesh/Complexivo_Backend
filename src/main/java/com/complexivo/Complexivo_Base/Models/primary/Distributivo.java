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
@Table(name = "Distributivo")
public class Distributivo {
    private static final long serialVersionUID = 1L;
    /**
     *
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_distributivo;

    private String dis_curso;
    private int dis_cantidad_horas;
    private String dis_periodo_aca;
}
