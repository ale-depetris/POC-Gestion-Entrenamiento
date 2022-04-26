package com.bolsadeideas.springboot.web.app.models;

import java.util.Date;

public class Ciclo {

    private Date fechasinicio;
    private List<Semana> semanas;
    private String objetivo;
    private String tipoentrenamiento;
    private int cantdias;
    private String estado;


    public Date getFechasinicio() {
        return fechasinicio;
    }

    public void setFechasinicio(Date fechasinicio) {
        this.fechasinicio = fechasinicio;
    }

    public List<Semana> getSemanas() {
        return semanas;
    }

    public void setSemanas(List<Semana> semanas) {
        this.semanas = semanas;
    }
}
