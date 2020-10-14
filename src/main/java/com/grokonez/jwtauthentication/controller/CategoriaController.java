package com.grokonez.jwtauthentication.controller;

import com.grokonez.jwtauthentication.model.Categoria;
import com.grokonez.jwtauthentication.repository.CategoriaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/auth")
public class CategoriaController {

    @Autowired
    private CategoriaRepository categoriaRepository;

    @GetMapping("/categorias")
    public Page<Categoria> getCategorias(Pageable pageable) {
        return categoriaRepository.findAll(pageable);
    }
  
    
}