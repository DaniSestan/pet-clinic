package com.daniasestan.petclinic.services;

import com.daniasestan.petclinic.model.Vet;

import java.util.Set;

public interface VetService {
    Vet findById (Long id);
    Vet findByLastName(String lastName);
    Set<Vet> findAll();
    Vet save (Vet vet);
}
