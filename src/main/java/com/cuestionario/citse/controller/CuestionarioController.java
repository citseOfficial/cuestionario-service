package com.cuestionario.citse.controller;

import com.cuestionario.citse.entity.Cuestionario;
import com.cuestionario.citse.service.CuestionarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/cuestionario")
public class CuestionarioController {

    @Autowired
    private CuestionarioService cuestionarioService;


    @GetMapping
    public ResponseEntity<List<Cuestionario>> findAll(@RequestParam(name = "nombre",required = false)String nombre){
        List<Cuestionario> cues = new ArrayList<>();
        if(nombre==null){
            cues=cuestionarioService.findAll();
            if(cues.isEmpty())
                return ResponseEntity.noContent().build();
        }else {
            cues=cuestionarioService.findByNombre(nombre);
            if(cues.isEmpty())
                return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(cues);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Cuestionario> findById(@PathVariable int id){
        Cuestionario cuestionario = cuestionarioService.findById(id);

        if (cuestionario != null){
            return ResponseEntity.ok().body(cuestionarioService.findById(id));
        }else{
            return ResponseEntity.noContent().build();
        }
    }

    @PostMapping
    public Cuestionario save(@RequestBody Cuestionario cuestionario){
        return cuestionarioService.save(cuestionario);
    }

    @PutMapping("/{id}")
    public Cuestionario update(@RequestBody Cuestionario cuestionario,@PathVariable Integer id){
        Cuestionario c = cuestionarioService.findById(id);
        c.setNoCuestionario(cuestionario.getNoCuestionario());
        c.setFeFin(cuestionario.getFeInicio());
        c.setFeFin(cuestionario.getFeFin());
        return cuestionarioService.save(c);
    }

    @DeleteMapping("/{id}")
    public Cuestionario delete(@PathVariable Integer id){
        Cuestionario c = cuestionarioService.findById(id);
        c.setEsCuestionario(false);
        cuestionarioService.save(c);
        return c;
    }
}
