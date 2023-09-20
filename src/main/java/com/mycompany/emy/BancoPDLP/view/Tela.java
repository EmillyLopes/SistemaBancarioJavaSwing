package com.mycompany.emy.BancoPDLP.view;

import com.mycompany.emy.BancoPDLP.model.dto.ContaPoupancaDTO;
import com.mycompany.emy.BancoPDLP.model.service.ContaBancariaService;
import com.mycompany.emy.BancoPDLP.model.service.OperacaoContaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * @author emtra
 */
@Component
public class Tela extends javax.swing.JFrame {

    @Autowired
    private ContaBancariaService contaBancariaService;

    @Autowired
    private OperacaoContaService operacaoContaService;

    public Tela(ContaBancariaService contaBancariaService, OperacaoContaService operacaoContaService ) {
        this.contaBancariaService = contaBancariaService;
        this.operacaoContaService = operacaoContaService;
    }

    public Tela() {
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        grupoTipoConta = new javax.swing.ButtonGroup();
        nomeContainer = new javax.swing.JPanel();
        nomeLabel = new javax.swing.JLabel();
        nomeInput = new javax.swing.JTextField();
        saldoContainer = new javax.swing.JPanel();
        saldoLabel = new javax.swing.JLabel();
        saldoInput = new javax.swing.JTextField();
        contaContainer = new javax.swing.JPanel();
        agenciaInput = new javax.swing.JTextField();
        agenciaLabel = new javax.swing.JLabel();
        contaLabel = new javax.swing.JLabel();
        contaInput = new javax.swing.JTextField();
        tipoContaLabel = new javax.swing.JLabel();
        contaPoupancaButton = new javax.swing.JRadioButton();
        contaCorrentePJButton = new javax.swing.JRadioButton();
        contaCorrentePfButton = new javax.swing.JRadioButton();
        acoesContainer = new javax.swing.JPanel();
        cadastrarButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();

        jList1.setModel(new javax.swing.AbstractListModel() {
            String[] strings = {"john.guy@xxxxxx.yyy", "gui@yyyyyy.xxx"};

            public int getSize() {
                return strings.length;
            }

            public Object getElementAt(int i) {
                return strings[i];
            }
        });
        jScrollPane1.setViewportView(jList1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro de Contas");

        nomeContainer.setBorder(javax.swing.BorderFactory.createTitledBorder("Nome"));
        nomeContainer.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        nomeLabel.setText("Nome:");

        nomeInput.setToolTipText("John");

        javax.swing.GroupLayout nomeContainerLayout = new javax.swing.GroupLayout(nomeContainer);
        nomeContainer.setLayout(nomeContainerLayout);
        nomeContainerLayout.setHorizontalGroup(
                nomeContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(nomeContainerLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(nomeLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nomeInput)
                                .addContainerGap())
        );
        nomeContainerLayout.setVerticalGroup(
                nomeContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(nomeContainerLayout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addGroup(nomeContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(nomeLabel)
                                        .addComponent(nomeInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        saldoContainer.setBorder(javax.swing.BorderFactory.createTitledBorder("Saldo"));

        saldoLabel.setText("Saldo:");

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
                                .addContainerGap(17, Short.MAX_VALUE))
        );

        contaContainer.setBorder(javax.swing.BorderFactory.createTitledBorder("Conta"));

        agenciaInput.setToolTipText("XXXX");
        agenciaInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agenciaInputActionPerformed(evt);
            }
        });

        agenciaLabel.setText("Agência:");

        contaLabel.setText("Conta:");

        contaInput.setToolTipText("XXX");
        contaInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contaInputActionPerformed(evt);
            }
        });

        tipoContaLabel.setText("Tipo de conta:");

        grupoTipoConta.add(contaPoupancaButton);
        contaPoupancaButton.setSelected(true);
        contaPoupancaButton.setText("Conta Poupança");
        contaPoupancaButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        contaPoupancaButton.setMargin(new java.awt.Insets(0, 0, 0, 0));

        grupoTipoConta.add(contaCorrentePJButton);
        contaCorrentePJButton.setText("Conta Corrente PJ");
        contaCorrentePJButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        contaCorrentePJButton.setMargin(new java.awt.Insets(0, 0, 0, 0));

        grupoTipoConta.add(contaCorrentePfButton);
        contaCorrentePfButton.setText("Conta Corrente PF");
        contaCorrentePfButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        contaCorrentePfButton.setMargin(new java.awt.Insets(0, 0, 0, 0));

        javax.swing.GroupLayout contaContainerLayout = new javax.swing.GroupLayout(contaContainer);
        contaContainer.setLayout(contaContainerLayout);
        contaContainerLayout.setHorizontalGroup(
                contaContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(contaContainerLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(contaContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(contaContainerLayout.createSequentialGroup()
                                                .addComponent(agenciaLabel)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(agenciaInput)
                                                .addGap(24, 24, 24)
                                                .addComponent(contaLabel)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(contaInput, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addContainerGap())
                                        .addGroup(contaContainerLayout.createSequentialGroup()
                                                .addGroup(contaContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(contaContainerLayout.createSequentialGroup()
                                                                .addComponent(contaPoupancaButton)
                                                                .addGap(12, 12, 12)
                                                                .addComponent(contaCorrentePJButton)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(contaCorrentePfButton))
                                                        .addComponent(tipoContaLabel))
                                                .addGap(0, 14, Short.MAX_VALUE))))
        );
        contaContainerLayout.setVerticalGroup(
                contaContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(contaContainerLayout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addGroup(contaContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(agenciaInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(agenciaLabel)
                                        .addComponent(contaLabel)
                                        .addComponent(contaInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                                .addComponent(tipoContaLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(contaContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(contaPoupancaButton)
                                        .addComponent(contaCorrentePJButton)
                                        .addComponent(contaCorrentePfButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(8, 8, 8))
        );

        cadastrarButton.setText("Cadastrar");
        cadastrarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarButtonActionPerformed(evt);
            }
        });

        cancelButton.setText("Cancel");

        javax.swing.GroupLayout acoesContainerLayout = new javax.swing.GroupLayout(acoesContainer);
        acoesContainer.setLayout(acoesContainerLayout);
        acoesContainerLayout.setHorizontalGroup(
                acoesContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(acoesContainerLayout.createSequentialGroup()
                                .addContainerGap(227, Short.MAX_VALUE)
                                .addComponent(cadastrarButton)
                                .addGap(18, 18, 18)
                                .addComponent(cancelButton)
                                .addContainerGap())
        );
        acoesContainerLayout.setVerticalGroup(
                acoesContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(acoesContainerLayout.createSequentialGroup()
                                .addContainerGap(10, Short.MAX_VALUE)
                                .addGroup(acoesContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(cadastrarButton)
                                        .addComponent(cancelButton))
                                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(acoesContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(nomeContainer, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(saldoContainer, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(contaContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(nomeContainer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(contaContainer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(saldoContainer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(acoesContainer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(17, 17, 17))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void agenciaInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agenciaInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_agenciaInputActionPerformed

    private void contaInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contaInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contaInputActionPerformed

    private void cadastrarButtonActionPerformed(java.awt.event.ActionEvent evt) {
        String agencia = agenciaInput.getText();
        String conta = contaInput.getText();
        String nome = nomeInput.getText();
        Double saldo = Double.valueOf(saldoInput.getText());
        String tipoConta = "";

        if (contaPoupancaButton.isSelected()) {
            tipoConta = contaPoupancaButton.getText();
        } else if (contaCorrentePfButton.isSelected()) {
            tipoConta = contaCorrentePfButton.getText();
        } else if (contaCorrentePJButton.isSelected()) {
            tipoConta = contaCorrentePJButton.getText();
        }

        if (!tipoConta.isEmpty()) {
            ContaBancariaDTO contaBancariaDTO = new ContaBancariaDTO(agencia, conta, tipoConta, nome, saldo);
            contaBancariaService.cadastrarContaBancaria(contaBancariaDTO);
        } else {
            // Lógica para lidar com nenhum tipo de conta selecionado
        }

    }

    // Variables declaration - do not modify//
    private javax.swing.JPanel acoesContainer;
    private javax.swing.JTextField agenciaInput;
    private javax.swing.JLabel agenciaLabel;
    private javax.swing.JButton cadastrarButton;
    private javax.swing.JButton cancelButton;
    private javax.swing.JPanel contaContainer;
    private javax.swing.JRadioButton contaCorrentePJButton;
    private javax.swing.JRadioButton contaCorrentePfButton;
    private javax.swing.JTextField contaInput;
    private javax.swing.JLabel contaLabel;
    private javax.swing.JRadioButton contaPoupancaButton;
    private javax.swing.ButtonGroup grupoTipoConta;
    private javax.swing.JList jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel nomeContainer;
    private javax.swing.JTextField nomeInput;
    private javax.swing.JLabel nomeLabel;
    private javax.swing.JPanel saldoContainer;
    private javax.swing.JTextField saldoInput;
    private javax.swing.JLabel saldoLabel;
    private javax.swing.JLabel tipoContaLabel;
    // End of variables declaration//

}