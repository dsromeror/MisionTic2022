package com.grupo2.RedFlix;

import com.grupo2.RedFlix.Vistas.VentanaInicio;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RedFlixApplication {

    public static void main(String[] args) {
            new VentanaInicio().setVisible(true);
    }
    
    public static void SpringRunner(String[] args) {
		SpringApplication.run(RedFlixApplication.class, args);
    }

}
