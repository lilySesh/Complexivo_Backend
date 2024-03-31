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
@Table(name = "Distributivo")
public class Distributivo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_distributivo;

    private int doc_horas_doc;
    private int doc_horas_admin;

    @ManyToMany(mappedBy = "distributivos")
    private Set<Distributivo_Periodo> distributivoPeriodos = new HashSet<>();
}
