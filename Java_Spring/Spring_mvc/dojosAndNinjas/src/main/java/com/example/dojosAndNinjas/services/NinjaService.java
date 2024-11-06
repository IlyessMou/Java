package com.example.dojosAndNinjas.services;

import org.springframework.stereotype.Service;

import com.example.dojosAndNinjas.models.Ninja;
import com.example.dojosAndNinjas.repositories.NinjaRepository;

@Service
public class NinjaService {
    private final NinjaRepository ninjaRepo;

    public NinjaService(NinjaRepository ninjaRepo) {
        this.ninjaRepo = ninjaRepo;
    }

    public Ninja createNinja(Ninja ninja) {
        return ninjaRepo.save(ninja);
    }
}