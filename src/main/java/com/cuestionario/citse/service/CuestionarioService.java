package com.cuestionario.citse.service;

import com.cuestionario.citse.entity.Cuestionario;

import java.util.List;

public interface CuestionarioService {

    public List<Cuestionario> findAll();
    public Cuestionario findById(int id_cuestionario);

    public Cuestionario save(Cuestionario cuestionario);

    public List<Cuestionario> findByNombre(String nombre);


}
