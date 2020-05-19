/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.javahelps.restservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javahelps.restservice.entity.Classe;

import javassist.tools.web.BadHttpRequest;
import com.javahelps.restservice.repository.ClasseRepository;


@RestController
@RequestMapping(path = "/classes")
public class ClasseController {

    @Autowired
    private ClasseRepository repository;

    @GetMapping
    public Iterable<Classe> findAll() {
        return repository.findAll();
    }

    @GetMapping(path = "/{id}")
    public Classe find(@PathVariable("id") Integer id) {
        return repository.findOne(id);
    }

    @PostMapping(consumes = "application/json")
    public Classe create(@RequestBody Classe classe) {
        return repository.save(classe);
    }

    @DeleteMapping(path = "/{id}")
    public void delete(@PathVariable("id") Integer id) {
        repository.delete(id);
    }

    @PutMapping(path = "/{id}")
    public Classe update(@PathVariable("id") Integer id, @RequestBody Classe classe) throws BadHttpRequest {
        if (repository.exists(id)) {
            classe.setId(id);
            return repository.save(classe);
        } else {
            throw new BadHttpRequest();
        }
    }
}

