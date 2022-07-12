package com.cuestionario.citse.service;

import com.cuestionario.citse.entity.Pregunta;

import java.util.List;

public interface PreguntaService {

    List<Pregunta> findAll();

    Pregunta findById(int id_pregunta);

    Pregunta save(Pregunta pregunta);
}
