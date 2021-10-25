package com.tienda.demo.services;


import com.tienda.demo.models.RegistroModel;
import com.tienda.demo.repositories.RegistroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class RegistroService {

    @Autowired
    RegistroRepository registroRepository;

    /*metodo para obtener registro */
    public ArrayList<RegistroModel> obtenerRegistro(){
        return (ArrayList<RegistroModel>) registroRepository.findAll();
    }

    /*metodo para guardar usuario */
    public RegistroModel guardarRegistro(RegistroModel registro){
        return registroRepository.save(registro);
    }

    /*Buscar por ID*/
    public Optional<RegistroModel> obtenerPorId(Integer idregistro){
        return registroRepository.findById(idregistro);
    }

    public boolean eliminarRegistro(Integer idregistro){
        try{
            registroRepository.deleteById(idregistro);
            return true;
        }catch (Exception err){
            return false;
        }
    }

}
