package com.cuestionario.citse.serviceImp;

import com.cuestionario.citse.entity.Cuestionario;
import com.cuestionario.citse.dao.CuestionarioRepository;
import com.cuestionario.citse.service.CuestionarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CuestionarioServiceImp implements CuestionarioService {

    @Autowired
    private CuestionarioRepository cuestionarioRepository;


    @Override
    public List<Cuestionario> findAll() {
        return cuestionarioRepository.findAll();
    }

    @Override
    public Cuestionario findById(int id_cuestionario) {
        return cuestionarioRepository.findById(id_cuestionario).orElse(null);
    }

    @Override
    public Cuestionario save(Cuestionario cuestionario) {
        return cuestionarioRepository.save(cuestionario);
    }

    @Override
    public List<Cuestionario> findByNombre(String nombre) {
        return cuestionarioRepository.findTop10ByNoCuestionarioContains(nombre);
    }
}
