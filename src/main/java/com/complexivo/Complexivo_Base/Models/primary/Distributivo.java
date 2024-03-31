package com.complexivo.Complexivo_Base.Models.primary;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "distributivo")
public class Distributivo {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_distributivo")
    private Long id_distributivo;

    @Column(name = "doc_horas_doc")
    private int doc_horas_doc;

    @Column(name = "doc_horas_admin")
    private int doc_horas_admin;

    //Relaciones
    @ManyToMany(mappedBy = "distributivos")
    private Set<Distributivo_Periodo> distributivoPeriodos = new HashSet<>();
}
