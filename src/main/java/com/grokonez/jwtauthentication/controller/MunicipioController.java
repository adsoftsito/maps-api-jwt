package com.grokonez.jwtauthentication.controller;
import java.util.List;

import com.grokonez.jwtauthentication.model.Municipio;
import com.grokonez.jwtauthentication.repository.MunicipioRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/auth")
public class MunicipioController {

    @Autowired
    private MunicipioRepository municipioRepository;

    @GetMapping("/municipios")
//    @GetMapping(value = "/capa-without-geometry", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Municipio> getMunicipios(@RequestParam(value="idestado") Long idestado){

    //public Page<Municipio> getMunicipios(Pageable pageable) {
        //return municipioRepository.findAll(pageable);
        return municipioRepository.findMunicipiosByEstado(idestado);
    }
  
    
}