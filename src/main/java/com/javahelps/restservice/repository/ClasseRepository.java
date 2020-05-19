package com.javahelps.restservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.javahelps.restservice.entity.Classe;
import org.springframework.data.rest.core.annotation.RestResource;

@RestResource(exported = false)
public interface ClasseRepository extends JpaRepository<Classe, Integer> {

    public Classe findOne(Integer id);

    public void delete(Integer id);

    public boolean exists(Integer id);

}