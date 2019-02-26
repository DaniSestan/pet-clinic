package com.daniasestan.petclinic.services;

import com.daniasestan.petclinic.model.Vet;

public interface VetService extends CrudService<Vet, Long>{
//    Vet findById (Long id);
    Vet findByLastName(String lastName);
//    Set<Vet> findAll();
//    Vet save (Vet vet);
}
