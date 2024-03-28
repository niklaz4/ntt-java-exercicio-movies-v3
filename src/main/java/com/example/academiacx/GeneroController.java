package com.example.academiacx;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/genre")
public class GeneroController {

    @Autowired
    private GeneroService generoService;

    @GetMapping("/list")
    public List<Genero> getAllGenres(){
        return generoService.getAllGenres();
    }

    @GetMapping("/{id}")
    public Genero getGenreById(@PathVariable Long id){
        return generoService.getGenreById(id);
    }

    @PostMapping("/save")
    public Genero saveGenre(@RequestBody Genero genre){
        return generoService.saveGenre(genre);
    }

    @PutMapping("/update")
    public Genero updateGenre(@RequestBody Genero genre){
        return generoService.updateGenre(genre);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteGenre(@PathVariable Long id){
        generoService.deleteGenre(id);
    }
}
