package com.mongodocker.test.controller;

import com.mongodocker.test.model.Cats;
import com.mongodocker.test.repository.CatRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cats")
public class CatController {

    @Autowired
    private CatRepo catRepo;

    @GetMapping("/getCats")
    public List<Cats> getAllCats(){
        return catRepo.findAll();
    }

    @PostMapping("/addCats")
    public List<Cats> addCats(@RequestBody List<Cats> catsList){
        return catRepo.saveAll(catsList);
    }
}
