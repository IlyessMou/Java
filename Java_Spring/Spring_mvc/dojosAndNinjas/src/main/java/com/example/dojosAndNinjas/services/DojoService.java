package com.example.dojosAndNinjas.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.dojosAndNinjas.models.Dojo;
import com.example.dojosAndNinjas.repositories.DojoRepository;

@Service
public class DojoService {
    private final DojoRepository dojoRepo;

    public DojoService(DojoRepository dojoRepo) {
        this.dojoRepo = dojoRepo;
    }

    public List<Dojo> allDojos() {
        return (List<Dojo>) dojoRepo.findAll();
    }

    public Dojo createDojo(Dojo dojo) {
        return dojoRepo.save(dojo);
    }

    public Dojo findDojo(Long id) {
        return dojoRepo.findById(id).orElse(null);
    }
}