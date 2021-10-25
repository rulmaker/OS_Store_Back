package com.tienda.demo.controllers;


import com.tienda.demo.models.RegistroModel;
import com.tienda.demo.services.RegistroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;


@RestController
@RequestMapping("/registro")
public class RegristroController {
    @Autowired
    RegistroService registroService;

    @GetMapping
    public ArrayList<RegistroModel> obtenerRegistros(){
        return registroService.obtenerRegistro();
    }

    @PostMapping
    public RegistroModel guardarRegistro(@RequestBody RegistroModel registro){
        return this.registroService.guardarRegistro(registro);
    }

    @GetMapping( path = "/{id}")
    public Optional<RegistroModel> obtenerRegistroPorId(@PathVariable("id") Integer idregistro){
        return this.registroService.obtenerPorId(idregistro);
    }

    @DeleteMapping( path = "/{id}")
    public String eliminarPorId(@PathVariable("id") Integer idregistro) {
        boolean ok = this.registroService.eliminarRegistro(idregistro);
        if (ok) {
            return "Se eliminó el regristro con id " + idregistro;


    }else {
        return "No pudo eliminar el producto con id " + idregistro;
    }



    }
}
