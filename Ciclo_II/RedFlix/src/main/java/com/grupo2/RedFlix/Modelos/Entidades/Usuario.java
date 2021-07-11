/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grupo2.RedFlix.Modelos.Entidades;


import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author felip
 */
@Entity
@Table(name = "usuario")
public class Usuario implements Serializable{
    
    @Id
    @Column(name = "usr_alias")
    String usrAlias;
    
    @Column(name = "usr_nombre")
    String usrNombre;
    
    @Column(name = "usr_apellidos")
    String usrApellido;
    
    @Column(name = "usr_email")
    String usrEmail;
    
    @Column(name = "usr_celular")
    String usrCelular;
    
    @Column(name = "usr_contrasenia")
    String usrContrasenia;
    
    @Column(name = "usr_fecha_nacimiento")
    String usrFechaNacimiento;
    
    //Getters y Setters
    
    public String getUsrAlias() {
        return usrAlias;
    }

    public void setUsrAlias(String usrAlias) {
        this.usrAlias = usrAlias;
    }

    public String getUsrNombre() {
        return usrNombre;
    }

    public void setUsrNombre(String usrNombre) {
        this.usrNombre = usrNombre;
    }

    public String getUsrApellido() {
        return usrApellido;
    }

    public void setUsrApellido(String usrApellido) {
        this.usrApellido = usrApellido;
    }

    public String getUsrEmail() {
        return usrEmail;
    }

    public void setUsrEmail(String usrEmail) {
        this.usrEmail = usrEmail;
    }

    public String getUsrCelular() {
        return usrCelular;
    }

    public void setUsrCelular(String usrCelular) {
        this.usrCelular = usrCelular;
    }

    public String getUsrContrasenia() {
        return usrContrasenia;
    }

    public void setUsrContrasenia(String usrContrasenia) {
        this.usrContrasenia = usrContrasenia;
    }

    public String getUsrFechaNacimiento() {
        return usrFechaNacimiento;
    }

    public void setUsrFechaNacimiento(String usrFechaNacimiento) {
        this.usrFechaNacimiento = usrFechaNacimiento;
    }
  
}
