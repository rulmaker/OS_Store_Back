package com.tienda.demo.services;


import com.tienda.demo.models.ProductoModel;
import com.tienda.demo.repositories.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class ProductoService {

    @Autowired
    ProductoRepository productoRepository;

    /*metodo para obtener usuarios */
    public ArrayList<ProductoModel> obtenerProductos(){
        return (ArrayList<ProductoModel>)productoRepository.findAll();
    }

    /*metodo para guardar usuarios */
    public ProductoModel guardarProducto(ProductoModel producto){

        return productoRepository.save(producto);
    }

    /*Buscar por ID*/
    public Optional<ProductoModel> obtenerPorId(Integer idproducto){

        return productoRepository.findById(idproducto);
    }

    public boolean eliminarProducto(Integer idproducto) {
        try {
            productoRepository.deleteById(idproducto);
            return true;
        } catch (Exception err) {
            return false;
        }
    }







}
