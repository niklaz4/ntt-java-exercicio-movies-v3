package com.example.academiacx;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/actor")
public class ActorController {

    @Autowired
    private ActorService actorService;

    @GetMapping("/list")
    public List<Ator> getAllActors(){
        return actorService.getAllActors();
    }

    @GetMapping("/{id}")
    public Ator getActorById(@PathVariable Long id){
        return actorService.getActorById(id);
    }

    @PostMapping("/save")
    public Ator saveActor(@RequestBody Ator ator){
        return actorService.saveActor(ator);
    }

    @PutMapping("/update")
    public Ator updateActor(@RequestBody Ator ator){
        return actorService.updateActor(ator);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteActor(@PathVariable Long id){
        actorService.deleteActor(id);
    }

}
