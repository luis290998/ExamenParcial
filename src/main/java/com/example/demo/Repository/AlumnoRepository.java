package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.Entidad.Alumno;

public interface AlumnoRepository extends JpaRepository<Alumno, Integer> {
}
