/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.emy.BancoPDLP.view;

import com.mycompany.emy.BancoPDLP.model.service.ContaBancariaService;
import java.awt.Component;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;
import org.springframework.beans.factory.annotation.Autowired;

@org.springframework.stereotype.Component
public class TelaaOperacoes extends javax.swing.JFrame {

     @Autowired
    private ContaBancariaService contaBancariaService;
    
      public TelaaOperacoes(ContaBancariaService contaBancariaService) {
        this.contaBancariaService = contaBancariaService;
    }
      
    public TelaaOperacoes() {
        initComponents();
    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        telaContainer = new javax.swing.JPanel();
        saldoContainer = new javax.swing.JPanel();
        saldoLabel = new javax.swing.JLabel();
        saldoInput = new javax.swing.JTextField();
        tabOperacoes = new javax.swing.JTabbedPane();
        saqueContainer = new javax.swing.JPanel();
        saqueContainerButton = new javax.swing.JPanel();
        saqueVoltarButton = new javax.swing.JButton();
        saqueCancelarButton = new javax.swing.JButton();
        saqueButton = new javax.swing.JButton();
        contaContainer = new javax.swing.JPanel();
        saqueAgenciaInput = new javax.swing.JTextField();
        saqueAgenciaLabel = new javax.swing.JLabel();
        saqueContaLabel = new javax.swing.JLabel();
        saqueContaInput = new javax.swing.JTextField();
        depositoContainer = new javax.swing.JPanel();
        contaContainer1 = new javax.swing.JPanel();
        depositoAgenciaInput = new javax.swing.JTextField();
        depositoAgenciaLabel = new javax.swing.JLabel();
        depositoContaLabel = new javax.swing.JLabel();
        depositoContaInput = new javax.swing.JTextField();
        depositoContainerButton = new javax.swing.JPanel();
        depositoVoltarButton = new javax.swing.JButton();
        depositoCancelarButton = new javax.swing.JButton();
        depositoButton = new javax.swing.JButton();
        transferenciaContainer = new javax.swing.JPanel();
        contaOrigemContainer = new javax.swing.JPanel();
        transferenciaAgenciaOrigemInput = new javax.swing.JTextField();
        transferenciaAgenciaOrigemLabel = new javax.swing.JLabel();
        transferenciaContaOrigemLabel = new javax.swing.JLabel();
        transferenciaContaOrigemInput = new javax.swing.JTextField();
        contaDestinoContainer = new javax.swing.JPanel();
        transferenciaAgenciaDestinoInput = new javax.swing.JTextField();
        transferenciaAgenciaDestinoLabel = new javax.swing.JLabel();
        transferenciaContaDestinoLabel = new javax.swing.JLabel();
        transferenciaContaDestinoInput = new javax.swing.JTextField();
        tansferenciaContainerButton = new javax.swing.JPanel();
        transferenciaVoltarButton = new javax.swing.JButton();
        transferenciaCancelarButton = new javax.swing.JButton();
        transferirButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        saldoContainer.setBorder(javax.swing.BorderFactory.createTitledBorder("Saldo"));

        saldoLabel.setText("Saldo atual:");

        saldoInput.setToolTipText("R$0,00");

        javax.swing.GroupLayout saldoContainerLayout = new javax.swing.GroupLayout(saldoContainer);
        saldoContainer.setLayout(saldoContainerLayout);
        saldoContainerLayout.setHorizontalGroup(
            saldoContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(saldoContainerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(saldoLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(saldoInput)
                .addContainerGap())
        );
        saldoContainerLayout.setVerticalGroup(
            saldoContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(saldoContainerLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(saldoContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saldoLabel)
                    .addComponent(saldoInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tabOperacoes.setName("Saque"); // NOI18N

        saqueVoltarButton.setText("Voltar");
        saqueVoltarButton.setName(""); // NOI18N

        saqueCancelarButton.setText("Cancelar");
        saqueCancelarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saqueCancelarButtonActionPerformed(evt);
            }
        });

        saqueButton.setText("Sacar");
        saqueButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saqueButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout saqueContainerButtonLayout = new javax.swing.GroupLayout(saqueContainerButton);
        saqueContainerButton.setLayout(saqueContainerButtonLayout);
        saqueContainerButtonLayout.setHorizontalGroup(
            saqueContainerButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(saqueContainerButtonLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(saqueCancelarButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(saqueVoltarButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(saqueButton)
                .addContainerGap())
        );
        saqueContainerButtonLayout.setVerticalGroup(
            saqueContainerButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, saqueContainerButtonLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(saqueContainerButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saqueButton)
                    .addComponent(saqueVoltarButton)
                    .addComponent(saqueCancelarButton))
                .addGap(20, 20, 20))
        );

        contaContainer.setBorder(javax.swing.BorderFactory.createTitledBorder("Conta"));

        saqueAgenciaInput.setToolTipText("XXXX");
        saqueAgenciaInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saqueAgenciaInputActionPerformed(evt);
            }
        });

        saqueAgenciaLabel.setText("Agência:");

        saqueContaLabel.setText("Conta:");

        saqueContaInput.setToolTipText("XXX");
        saqueContaInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saqueContaInputActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout contaContainerLayout = new javax.swing.GroupLayout(contaContainer);
        contaContainer.setLayout(contaContainerLayout);
        contaContainerLayout.setHorizontalGroup(
            contaContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contaContainerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(saqueAgenciaLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(saqueAgenciaInput)
                .addGap(24, 24, 24)
                .addComponent(saqueContaLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(saqueContaInput, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        contaContainerLayout.setVerticalGroup(
            contaContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contaContainerLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(contaContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saqueAgenciaInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(saqueAgenciaLabel)
                    .addComponent(saqueContaLabel)
                    .addComponent(saqueContaInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout saqueContainerLayout = new javax.swing.GroupLayout(saqueContainer);
        saqueContainer.setLayout(saqueContainerLayout);
        saqueContainerLayout.setHorizontalGroup(
            saqueContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(saqueContainerLayout.createSequentialGroup()
                .addComponent(saqueContainerButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(contaContainer, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        saqueContainerLayout.setVerticalGroup(
            saqueContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(saqueContainerLayout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(contaContainer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 126, Short.MAX_VALUE)
                .addComponent(saqueContainerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        tabOperacoes.addTab("Saque", saqueContainer);

        contaContainer1.setBorder(javax.swing.BorderFactory.createTitledBorder("Conta"));

        depositoAgenciaInput.setToolTipText("XXXX");
        depositoAgenciaInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                depositoAgenciaInputActionPerformed(evt);
            }
        });

        depositoAgenciaLabel.setText("Agência:");

        depositoContaLabel.setText("Conta:");

        depositoContaInput.setToolTipText("XXX");
        depositoContaInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                depositoContaInputActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout contaContainer1Layout = new javax.swing.GroupLayout(contaContainer1);
        contaContainer1.setLayout(contaContainer1Layout);
        contaContainer1Layout.setHorizontalGroup(
            contaContainer1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contaContainer1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(depositoAgenciaLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(depositoAgenciaInput)
                .addGap(24, 24, 24)
                .addComponent(depositoContaLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(depositoContaInput, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        contaContainer1Layout.setVerticalGroup(
            contaContainer1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contaContainer1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(contaContainer1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(depositoAgenciaInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(depositoAgenciaLabel)
                    .addComponent(depositoContaLabel)
                    .addComponent(depositoContaInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        depositoVoltarButton.setText("Voltar");
        depositoVoltarButton.setName(""); // NOI18N

        depositoCancelarButton.setText("Cancelar");
        depositoCancelarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                depositoCancelarButtonActionPerformed(evt);
            }
        });

        depositoButton.setText("Depositar");
        depositoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                depositoButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout depositoContainerButtonLayout = new javax.swing.GroupLayout(depositoContainerButton);
        depositoContainerButton.setLayout(depositoContainerButtonLayout);
        depositoContainerButtonLayout.setHorizontalGroup(
            depositoContainerButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(depositoContainerButtonLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(depositoCancelarButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(depositoVoltarButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(depositoButton)
                .addContainerGap())
        );
        depositoContainerButtonLayout.setVerticalGroup(
            depositoContainerButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, depositoContainerButtonLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(depositoContainerButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(depositoButton)
                    .addComponent(depositoVoltarButton)
                    .addComponent(depositoCancelarButton))
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout depositoContainerLayout = new javax.swing.GroupLayout(depositoContainer);
        depositoContainer.setLayout(depositoContainerLayout);
        depositoContainerLayout.setHorizontalGroup(
            depositoContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(depositoContainerButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(contaContainer1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        depositoContainerLayout.setVerticalGroup(
            depositoContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(depositoContainerLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(contaContainer1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 125, Short.MAX_VALUE)
                .addComponent(depositoContainerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        tabOperacoes.addTab("Deposito", depositoContainer);

        contaOrigemContainer.setBorder(javax.swing.BorderFactory.createTitledBorder("Conta Origem"));

        transferenciaAgenciaOrigemInput.setToolTipText("XXXX");
        transferenciaAgenciaOrigemInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transferenciaAgenciaOrigemInputActionPerformed(evt);
            }
        });

        transferenciaAgenciaOrigemLabel.setText("Agência:");

        transferenciaContaOrigemLabel.setText("Conta:");

        transferenciaContaOrigemInput.setToolTipText("XXX");
        transferenciaContaOrigemInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transferenciaContaOrigemInputActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout contaOrigemContainerLayout = new javax.swing.GroupLayout(contaOrigemContainer);
        contaOrigemContainer.setLayout(contaOrigemContainerLayout);
        contaOrigemContainerLayout.setHorizontalGroup(
            contaOrigemContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contaOrigemContainerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(transferenciaAgenciaOrigemLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(transferenciaAgenciaOrigemInput)
                .addGap(24, 24, 24)
                .addComponent(transferenciaContaOrigemLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(transferenciaContaOrigemInput, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        contaOrigemContainerLayout.setVerticalGroup(
            contaOrigemContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contaOrigemContainerLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(contaOrigemContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(transferenciaAgenciaOrigemInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(transferenciaAgenciaOrigemLabel)
                    .addComponent(transferenciaContaOrigemLabel)
                    .addComponent(transferenciaContaOrigemInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        contaDestinoContainer.setBorder(javax.swing.BorderFactory.createTitledBorder("Conta Destino"));

        transferenciaAgenciaDestinoInput.setToolTipText("XXXX");
        transferenciaAgenciaDestinoInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transferenciaAgenciaDestinoInputActionPerformed(evt);
            }
        });

        transferenciaAgenciaDestinoLabel.setText("Agência:");

        transferenciaContaDestinoLabel.setText("Conta:");

        transferenciaContaDestinoInput.setToolTipText("XXX");
        transferenciaContaDestinoInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transferenciaContaDestinoInputActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout contaDestinoContainerLayout = new javax.swing.GroupLayout(contaDestinoContainer);
        contaDestinoContainer.setLayout(contaDestinoContainerLayout);
        contaDestinoContainerLayout.setHorizontalGroup(
            contaDestinoContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contaDestinoContainerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(transferenciaAgenciaDestinoLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(transferenciaAgenciaDestinoInput)
                .addGap(24, 24, 24)
                .addComponent(transferenciaContaDestinoLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(transferenciaContaDestinoInput, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        contaDestinoContainerLayout.setVerticalGroup(
            contaDestinoContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contaDestinoContainerLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(contaDestinoContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(transferenciaAgenciaDestinoInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(transferenciaAgenciaDestinoLabel)
                    .addComponent(transferenciaContaDestinoLabel)
                    .addComponent(transferenciaContaDestinoInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        transferenciaVoltarButton.setText("Voltar");
        transferenciaVoltarButton.setName(""); // NOI18N

        transferenciaCancelarButton.setText("Cancelar");
        transferenciaCancelarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transferenciaCancelarButtonActionPerformed(evt);
            }
        });

        transferirButton.setText("Transferir");
        transferirButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transferirButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout tansferenciaContainerButtonLayout = new javax.swing.GroupLayout(tansferenciaContainerButton);
        tansferenciaContainerButton.setLayout(tansferenciaContainerButtonLayout);
        tansferenciaContainerButtonLayout.setHorizontalGroup(
            tansferenciaContainerButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tansferenciaContainerButtonLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(transferenciaCancelarButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(transferenciaVoltarButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(transferirButton)
                .addContainerGap())
        );
        tansferenciaContainerButtonLayout.setVerticalGroup(
            tansferenciaContainerButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tansferenciaContainerButtonLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(tansferenciaContainerButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(transferirButton)
                    .addComponent(transferenciaVoltarButton)
                    .addComponent(transferenciaCancelarButton))
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout transferenciaContainerLayout = new javax.swing.GroupLayout(transferenciaContainer);
        transferenciaContainer.setLayout(transferenciaContainerLayout);
        transferenciaContainerLayout.setHorizontalGroup(
            transferenciaContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contaOrigemContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(contaDestinoContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(tansferenciaContainerButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        transferenciaContainerLayout.setVerticalGroup(
            transferenciaContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(transferenciaContainerLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(contaOrigemContainer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(contaDestinoContainer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tansferenciaContainerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        tabOperacoes.addTab("Transferência", transferenciaContainer);

        javax.swing.GroupLayout telaContainerLayout = new javax.swing.GroupLayout(telaContainer);
        telaContainer.setLayout(telaContainerLayout);
        telaContainerLayout.setHorizontalGroup(
            telaContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(telaContainerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(telaContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(saldoContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(telaContainerLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(tabOperacoes, javax.swing.GroupLayout.DEFAULT_SIZE, 372, Short.MAX_VALUE)))
                .addContainerGap())
        );
        telaContainerLayout.setVerticalGroup(
            telaContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, telaContainerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(saldoContainer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(tabOperacoes, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(telaContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(12, 12, 12))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(telaContainer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void limparCampos(ActionEvent e) {
        Component source = (Component) e.getSource();
        if (source instanceof JButton && "Cancelar".equals(((JButton) source).getText())) {
            // Vamos percorrer todos os componentes no JPanel telaContainer
            Component[] components = telaContainer.getComponents();
            for (Component component : components) {
                if (component instanceof JPanel) {
                    // Dentro de cada JPanel, percorra todos os campos de texto e limpe-os
                    Component[] innerComponents = ((JPanel) component).getComponents();
                    for (Component innerComponent : innerComponents) {
                        if (innerComponent instanceof JTextField) {
                            ((JTextField) innerComponent).setText("");
                        }
                    }
                }
            }
        }
    }
    private void saqueCancelarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saqueCancelarButtonActionPerformed
        limparCampos(evt);
    }//GEN-LAST:event_saqueCancelarButtonActionPerformed

    private void saqueButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saqueButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_saqueButtonActionPerformed

    private void saqueAgenciaInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saqueAgenciaInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_saqueAgenciaInputActionPerformed

    private void saqueContaInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saqueContaInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_saqueContaInputActionPerformed

    private void depositoAgenciaInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_depositoAgenciaInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_depositoAgenciaInputActionPerformed

    private void depositoContaInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_depositoContaInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_depositoContaInputActionPerformed

    private void depositoCancelarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_depositoCancelarButtonActionPerformed
        limparCampos(evt);
    }//GEN-LAST:event_depositoCancelarButtonActionPerformed

    private void depositoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_depositoButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_depositoButtonActionPerformed

    private void transferenciaAgenciaOrigemInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transferenciaAgenciaOrigemInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_transferenciaAgenciaOrigemInputActionPerformed

    private void transferenciaContaOrigemInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transferenciaContaOrigemInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_transferenciaContaOrigemInputActionPerformed

    private void transferenciaAgenciaDestinoInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transferenciaAgenciaDestinoInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_transferenciaAgenciaDestinoInputActionPerformed

    private void transferenciaContaDestinoInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transferenciaContaDestinoInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_transferenciaContaDestinoInputActionPerformed

    private void transferenciaCancelarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transferenciaCancelarButtonActionPerformed
        limparCampos(evt);
    }//GEN-LAST:event_transferenciaCancelarButtonActionPerformed

    private void transferirButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transferirButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_transferirButtonActionPerformed

 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel contaContainer;
    private javax.swing.JPanel contaContainer1;
    private javax.swing.JPanel contaDestinoContainer;
    private javax.swing.JPanel contaOrigemContainer;
    private javax.swing.JTextField depositoAgenciaInput;
    private javax.swing.JLabel depositoAgenciaLabel;
    private javax.swing.JButton depositoButton;
    private javax.swing.JButton depositoCancelarButton;
    private javax.swing.JTextField depositoContaInput;
    private javax.swing.JLabel depositoContaLabel;
    private javax.swing.JPanel depositoContainer;
    private javax.swing.JPanel depositoContainerButton;
    private javax.swing.JButton depositoVoltarButton;
    private javax.swing.JPanel saldoContainer;
    private javax.swing.JTextField saldoInput;
    private javax.swing.JLabel saldoLabel;
    private javax.swing.JTextField saqueAgenciaInput;
    private javax.swing.JLabel saqueAgenciaLabel;
    private javax.swing.JButton saqueButton;
    private javax.swing.JButton saqueCancelarButton;
    private javax.swing.JTextField saqueContaInput;
    private javax.swing.JLabel saqueContaLabel;
    private javax.swing.JPanel saqueContainer;
    private javax.swing.JPanel saqueContainerButton;
    private javax.swing.JButton saqueVoltarButton;
    private javax.swing.JTabbedPane tabOperacoes;
    private javax.swing.JPanel tansferenciaContainerButton;
    private javax.swing.JPanel telaContainer;
    private javax.swing.JTextField transferenciaAgenciaDestinoInput;
    private javax.swing.JLabel transferenciaAgenciaDestinoLabel;
    private javax.swing.JTextField transferenciaAgenciaOrigemInput;
    private javax.swing.JLabel transferenciaAgenciaOrigemLabel;
    private javax.swing.JButton transferenciaCancelarButton;
    private javax.swing.JTextField transferenciaContaDestinoInput;
    private javax.swing.JLabel transferenciaContaDestinoLabel;
    private javax.swing.JTextField transferenciaContaOrigemInput;
    private javax.swing.JLabel transferenciaContaOrigemLabel;
    private javax.swing.JPanel transferenciaContainer;
    private javax.swing.JButton transferenciaVoltarButton;
    private javax.swing.JButton transferirButton;
    // End of variables declaration//GEN-END:variables
}
