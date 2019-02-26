package com.daniasestan.petclinic.services;

import com.daniasestan.petclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long>{
//    Owner findById (Long id);
    Owner findByLastName(String lastName);
//    Set<Owner> findAll();
//    Owner save (Owner owner);
}
