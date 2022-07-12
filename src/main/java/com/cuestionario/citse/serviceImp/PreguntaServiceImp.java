package com.cuestionario.citse.serviceImp;

import com.cuestionario.citse.entity.Pregunta;
import com.cuestionario.citse.dao.PreguntaRepository;
import com.cuestionario.citse.service.PreguntaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PreguntaServiceImp implements PreguntaService {

    @Autowired
    private PreguntaRepository preguntaRepository;


    @Override
    public List<Pregunta> findAll() {
        return preguntaRepository.findAll();
    }

    @Override
    public Pregunta findById(int id_pregunta) {
        return preguntaRepository.findById(id_pregunta).orElse(null);
    }

    @Override
    public Pregunta save(Pregunta pregunta) {
        return preguntaRepository.save(pregunta);
    }
}
