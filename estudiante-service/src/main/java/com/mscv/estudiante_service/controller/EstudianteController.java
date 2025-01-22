package com.mscv.estudiante_service.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/estudiante")
public class EstudianteController {

    @GetMapping("/hola")
    public ResponseEntity<String> holaMundo(){
        return ResponseEntity.ok("Hola mundo");
    }

}
