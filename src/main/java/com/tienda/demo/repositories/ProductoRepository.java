package com.tienda.demo.repositories;


import com.tienda.demo.models.ProductoModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;





@Repository
public interface ProductoRepository extends CrudRepository<ProductoModel, Integer> {

}
