package com.example.academiacx;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/filmes")
public class FilmeController {

    @Autowired
    private FilmeService filmeService;

    @GetMapping
    public List<Filme> findAll() {
        return filmeService.findAll();
    }

    @GetMapping("/{id}")
    public Filme findById(@PathVariable Long id){
        return filmeService.findById(id);
    }

    @PostMapping
    public Filme create(@RequestBody Filme filme){
        return filmeService.create(filme);
    }

    @PutMapping("/{id}")
    public Filme update(@PathVariable Long id, @RequestBody Filme filme){
        return filmeService.update(id, filme);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        filmeService.delete(id);
    }
}
