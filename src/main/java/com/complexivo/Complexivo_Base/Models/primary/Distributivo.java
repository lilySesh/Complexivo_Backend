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
    @ManyToOne()
    @JoinColumn(name = "curso_materia", referencedColumnName = "id_curso_materia")
    private Curso_Materia curso_materia;

    @ManyToOne()
    @JoinColumn(name = "uni_adm", referencedColumnName = "id_uni_adm")
    private Unidad_Administrativa uni_adm;

    @OneToMany(mappedBy = "distributivo")
    @JsonIgnore
    private List<Distributivo_Periodo> distributivo_periodo;
}
