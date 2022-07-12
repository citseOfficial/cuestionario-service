package com.cuestionario.citse.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "TAX_CUESTIONARIOS")
@Data
public class Cuestionario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_cuestionario")
    private Integer idCuestionario;

    @Column(name = "no_cuestionario")
    private String noCuestionario;

    @Column(name = "fe_inicio")
    private String feInicio;

    @Column(name = "fe_fin")
    private String feFin;

    @Column(name = "es_cuestionario",columnDefinition = "BIT")
    private Boolean esCuestionario;

    @OneToMany(mappedBy = "cuestionario", cascade = CascadeType.ALL)
    private List<Pregunta> preguntas;

}
