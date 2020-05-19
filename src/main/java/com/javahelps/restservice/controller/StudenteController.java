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

import com.javahelps.restservice.entity.Studente;

import javassist.tools.web.BadHttpRequest;
import com.javahelps.restservice.repository.StudenteRepository;

@RestController
@RequestMapping(path = "/students")
public class StudenteController
{
    @Autowired
    private StudenteRepository repository;

    @GetMapping
    public Iterable<Studente> findAll()
    {
        return repository.findAll();
    }

    @GetMapping(path = "/{id}")
    public Studente find(@PathVariable("id") Integer id)
    {
        return repository.getOne(id.toString());
    }

    @PostMapping(consumes = "application/json")
    public Studente create(@RequestBody Studente student)
    {
        return repository.save(student);
    }

    /*@DeleteMapping(path = "/{id}")
    public void delete(@PathVariable("id") Integer id)
    {
        repository.delete(id.toString());
    }

    @PutMapping(path = "/{id}")
    public Studente update(@PathVariable("id") Integer id, @RequestBody Studente student) throws BadHttpRequest
    {
        if (repository.exists(id.toString()))
        {
            classe.setId(id);
            return repository.save(student);
        }
        else
        {
            throw new BadHttpRequest();
        }
    }*/
}