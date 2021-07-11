/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grupo2.RedFlix.Modelos.Entidades;

import java.io.Serializable;
import java.time.Year;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author felip
 */
@Entity
@Table(name = "pelicula")
public class Pelicula implements Serializable{
    
    @Id
    @Column(name = "pelicula_titulo")
    String peliculaTitulo;
    
    @Column(name = "pelicula_resumen")
    String peliculaResumen;
    
    @Column(name = "pelicula_anio")
    Integer peliculaAnio;
    
    @Column(name = "pelicula_director")
    String peliculaDirector;
    
    // Getters y Setters

    public String getPeliculaTitulo() {
        return peliculaTitulo;
    }

    public void setPeliculaTitulo(String peliculaTitulo) {
        this.peliculaTitulo = peliculaTitulo;
    }

    public String getPeliculaResumen() {
        return peliculaResumen;
    }

    public void setPeliculaResumen(String peliculaResumen) {
        this.peliculaResumen = peliculaResumen;
    }

    public Integer getPeliculaAnio() {
        return peliculaAnio;
    }

    public void setPeliculaAnio(Integer peliculaAnio) {
        this.peliculaAnio = peliculaAnio;
    }

    public String getPeliculaDirector() {
        return peliculaDirector;
    }

    public void setPeliculaDirector(String peliculaDirector) {
        this.peliculaDirector = peliculaDirector;
    }
    
    
}
