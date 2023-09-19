package com.mycompany.emy.BancoPDLP.view;

import javax.swing.JFrame;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GuiInitializer {


    private final Tela tela;

    @Autowired
    public GuiInitializer(Tela tela) {
        this.tela = tela;
    }

    public void initializeGui() {
        JFrame frame = new JFrame("Cadastro de Contas");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(tela);
        frame.pack();
        frame.setVisible(true);
    }
}