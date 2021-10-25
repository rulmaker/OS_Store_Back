package com.tienda.demo.repositories;


import com.tienda.demo.models.RegistroModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegistroRepository extends CrudRepository<RegistroModel, Integer> {
}
