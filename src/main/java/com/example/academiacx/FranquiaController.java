package com.example.academiacx;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/franchise")
public class FranquiaController {

    @Autowired
    private FranquiaService franquiaService;

    @GetMapping("/list")
    public List<Franquia> getAllFranchises(){
        return franquiaService.getAllFranchises();
    }

    @GetMapping("/{id}")
    public Optional getFranchiseById(@PathVariable Long id){
        return franquiaService.getFranchiseById(id);
    }

    @PostMapping("/save")
    public Franquia saveFranchise(@RequestBody Franquia franchise){
        return franquiaService.saveFranchise(franchise);
    }

    @PutMapping("/update")
    public Franquia updateFranchise(@RequestBody Franquia franchise){
        return franquiaService.updateFranchise(franchise);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteFranchise(@PathVariable Long id){
        franquiaService.deleteFranchise(id);
    }
}
