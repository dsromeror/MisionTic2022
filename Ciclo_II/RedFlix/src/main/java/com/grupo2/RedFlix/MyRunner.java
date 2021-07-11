/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grupo2.RedFlix;

import com.grupo2.RedFlix.Modelos.Entidades.Usuario;
import com.grupo2.RedFlix.Modelos.Repositorios.PeliculaRepositorio;
import com.grupo2.RedFlix.Modelos.Repositorios.SerieRepositorio;
import com.grupo2.RedFlix.Modelos.Repositorios.UsuarioRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 *
 * @author felip
 */
@Component
public class MyRunner implements CommandLineRunner{
    
    @Autowired
    private PeliculaRepositorio peliculaRepositorio;
    @Autowired
    private SerieRepositorio serieRepositorio;
    @Autowired
    private UsuarioRepositorio usuarioRepositorio;
    
    @Override
    public void run(String... args) throws Exception {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        
        Usuario usuario = new Usuario();
        
        usuario.setUsrAlias("usu1");
        
        usuarioRepositorio.save(usuario);
    }
    
}
