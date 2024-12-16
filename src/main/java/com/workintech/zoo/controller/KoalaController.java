package com.workintech.zoo.controller;

import com.workintech.zoo.entity.Koala;
import jakarta.annotation.PostConstruct;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/koalas")
public class KoalaController {
    private Map<Integer, Koala> koalas;

    @PostConstruct
    public void init(){
        koalas = new HashMap<>();
    }

    @GetMapping
    public List<Koala> find(){
        return this.koalas.values().stream().toList();
    }

    @GetMapping("/{id}")
    public Koala findById(@PathVariable Integer id){
        return koalas.get(id); // ID'ye göre koala döndürülür
    }

    @PostMapping
    public Koala save (@RequestBody Koala koala){
        koalas.put(koala.getId(), koala);
        return koalas.get(koala.getId());
    }

    @PutMapping("/{id}")
    public Koala update(@PathVariable Integer id, @RequestBody Koala koala){
        if (koalas.containsKey(id)) {
            koala.setId(id);
            koalas.put(id, koala);
            return koala;
        }
        return null;
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable Integer id){
        if (koalas.containsKey(id)) {
            koalas.remove(id);
            return "Koala with ID " + id + " was deleted";
        }
        return "Koala with ID " + id + " not found";
    }
}