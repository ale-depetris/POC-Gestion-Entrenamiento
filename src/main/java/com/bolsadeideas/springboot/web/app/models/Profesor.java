package com.bolsadeideas.springboot.web.app.models;

import java.util.List;

public class Profesor extends Persona{

    private List<Alumno> alumnos;

    public List<Alumno> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(List<Alumno> alumnos) {
        this.alumnos = alumnos;
    }
}
