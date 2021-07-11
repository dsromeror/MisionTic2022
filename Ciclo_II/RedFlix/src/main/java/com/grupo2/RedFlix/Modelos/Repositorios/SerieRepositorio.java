/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grupo2.RedFlix.Modelos.Repositorios;

import com.grupo2.RedFlix.Modelos.Entidades.Serie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author felip
 */
@Repository
public interface SerieRepositorio extends JpaRepository <Serie, String>{
    
}
