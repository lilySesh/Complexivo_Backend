package com.complexivo.Complexivo_Base.Models.primary;

import com.complexivo.Complexivo_Base.Models.primary.Persona;
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
@Table(name = "Docente")
public class Docente {
    private static final long serialVersionUID = 1L;
    /**
     *
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_docente;

    private int doc_titulo;
    private int doc_tipo;
    private int doc_horas;

    //Relacion uno a uno
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "persona_id", referencedColumnName = "id_persona")
//    @JsonIgnore // Esta anotación evita que se serialice el campo usuPerId
    private Persona persona_id;
}
