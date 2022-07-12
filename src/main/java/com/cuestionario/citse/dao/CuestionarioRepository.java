package com.cuestionario.citse.dao;

import com.cuestionario.citse.entity.Cuestionario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CuestionarioRepository extends JpaRepository<Cuestionario, Integer> {
    public List<Cuestionario> findTop10ByNoCuestionarioContains(String nombre);
}
