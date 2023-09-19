package com.mycompany.emy.BancoPDLP;

import com.mycompany.emy.BancoPDLP.view.GuiInitializer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);

        // Obter a instância de GuiInitializer do contexto Spring
        GuiInitializer guiInitializer = context.getBean(GuiInitializer.class);

        // Configurar o modo headless
        System.setProperty("java.awt.headless", "false");

        // Iniciar o aplicativo Spring Boot
        new SpringApplicationBuilder(Application.class)
                .headless(false) // Também é necessário definir isso para o Spring Boot
                .run(args);
        // Inicializar a interface gráfica
        guiInitializer.initializeGui();
    }

    }


