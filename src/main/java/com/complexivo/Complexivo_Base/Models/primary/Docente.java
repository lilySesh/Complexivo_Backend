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
@Table(name = "docente")
public class Docente {

    private static final long serialVersionUID = 1L;
    
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_docente")
    private Long id_docente;
    
    @Column(name = "doc_titulo")
    private String doc_titulo;

    @Column(name = "doc_tipo")
    private String doc_tipo;

    @Column(name = "doc_horas")
    private int doc_horas;
    
    @Column(name = "doc_estado")
    private String doc_estado;

    //Relaciones
    @OneToOne()
    @JoinColumn(name = "id_persona", referencedColumnName = "id_persona", unique = true)
    private Persona persona;

    @OneToMany(mappedBy = "docentes")
    @JsonIgnore
    private List<Distributivo> distributivos;
}
