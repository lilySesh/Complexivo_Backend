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
@Table(name = "docente")
public class Docente {

    private static final long serialVersionUID = 1L;
    
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_docente")
    private Long id_docente;
    
    @Column(name = "doc_titulo")
    private int doc_titulo;

    @Column(name = "doc_tipo")
    private int doc_tipo;

    @Column(name = "doc_horas")
    private int doc_horas;

    //Relaciones
    @OneToOne()
    @JoinColumn(name = "id_persona", referencedColumnName = "id_persona")
    private Persona persona;
}
