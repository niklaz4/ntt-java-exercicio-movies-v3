package com.example.academiacx;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/director")
public class DirectorController {

    @Autowired
    private DirectorService directorService;

    @GetMapping("/list")
    public List<Diretor> getAllDirectors(){
        return directorService.getAllDirectors();
    }

    @GetMapping("/{id}")
    public Optional getDirectorById(@PathVariable Long id){
        return directorService.getDirectorById(id);
    }

    @PostMapping("/save")
    public Diretor saveDirector(@RequestBody Diretor director){
        return directorService.saveDirector(director);
    }

    @PutMapping("/update")
    public Diretor updateDirector(@RequestBody Diretor director){
        return (Diretor) directorService.updateDirector(director);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteDirector(@PathVariable Long id){
        directorService.deleteDirector(id);
    }
}
