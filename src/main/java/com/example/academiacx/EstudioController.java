package com.example.academiacx;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/studio")
public class EstudioController {

    @Autowired
    private EstudioService estudioService;

    @GetMapping("/list")
    public List<Estudio> getAllStudios(){
        return estudioService.getAllStudios();
    }

    @GetMapping("/{id}")
    public Optional getStudioId(@PathVariable Long id){
        return estudioService.getStudioById(id);
    }

    @PostMapping("/save")
    public Estudio saveStudio(@RequestBody Estudio estudio){
        return estudioService.saveStudio(estudio);
    }

    @PutMapping("/update")
    public Estudio updateEstudio(@RequestBody Estudio estudio){
        return estudioService.updateStudio(estudio);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteStudio(@PathVariable Long id){
        estudioService.deleteStudio(id);
    }
}
