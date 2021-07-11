/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grupo2.RedFlix.Modelos.Entidades;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author felip
 */
@Entity
@Table(name = "serie")
public class Serie implements Serializable{
    
    @Id
    @Column(name = "serie_titulo")
    String serieTitulo;
    
    @Column(name = "serie_temporadas")
    Integer serieTemporadas;
    
    @Column(name = "serie_episodios")
    Integer serieEpisodios;
    
    // Getters y Setters
    
    public String getSerieTitulo() {
        return serieTitulo;
    }

    public void setSerieTitulo(String serieTitulo) {
        this.serieTitulo = serieTitulo;
    }

    public Integer getSerieTemporadas() {
        return serieTemporadas;
    }

    public void setSerieTemporadas(Integer serieTemporadas) {
        this.serieTemporadas = serieTemporadas;
    }

    public Integer getSerieEpisodios() {
        return serieEpisodios;
    }

    public void setSerieEpisodios(Integer serieEpisodios) {
        this.serieEpisodios = serieEpisodios;
    }
    
    
    
}
