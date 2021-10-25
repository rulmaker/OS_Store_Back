package com.tienda.demo.controllers;


import com.tienda.demo.models.ProductoModel;
import com.tienda.demo.services.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/producto")
public class ProductoController {

    @Autowired
    ProductoService productoService;

    @GetMapping
    public ArrayList<ProductoModel> obtenerProductos() {

        return productoService.obtenerProductos();
    }

    @PostMapping
    public ProductoModel guardarProducto(@RequestBody ProductoModel producto){
        return this.productoService.guardarProducto(producto);
    }

    @GetMapping( path = "/{id}")
    public Optional<ProductoModel> obtenerProductoPorId(@PathVariable("id") Integer idproducto) {
        return this.productoService.obtenerPorId(idproducto);
    }
    @DeleteMapping( path = "/{id}")
    public String eliminarPorId(@PathVariable("id") Integer idproducto) {
        boolean ok = this.productoService.eliminarProducto(idproducto);
        if (ok) {
            return "Se eliminó el producto con id " + idproducto;
        } else {
            return "No pudo eliminar el producto con id " + idproducto;
        }
    }


}
