package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entidad.Alumno;
import com.example.demo.Service.AlumnoService;

import java.util.List;


 @RestController
@RequestMapping("/Alumno")
public class AlumnoController {

    @Autowired
    private AlumnoService alumnoService;


    
    @GetMapping

    public List<Alumno> listarAlumnos() {
        return alumnoService.obtenerTodosLosAlumnos(); // Asegúrate de que el servicio esté devolviendo algo
    }
}

