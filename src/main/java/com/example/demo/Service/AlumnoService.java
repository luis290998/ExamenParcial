package com.example.demo.Service;

import com.example.demo.Entidad.Alumno;
import com.example.demo.Repository.AlumnoRepository;
import org.springframework.stereotype.Service;

import java.util.List;





    
    @Service
    public class AlumnoService {
        private final AlumnoRepository alumnoRepository;
    
        public AlumnoService(AlumnoRepository alumnoRepository) {
            this.alumnoRepository = alumnoRepository;
        }
    
        public Alumno crearAlumno(Alumno alumno) {
            return alumnoRepository.save(alumno);
        }
    
        // Método para obtener todos los alumnos
        public List<Alumno> obtenerTodosLosAlumnos() {
            return alumnoRepository.findAll();
        }
    }
    
  

    




