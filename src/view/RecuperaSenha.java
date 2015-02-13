package view;

import core.Sistema;
import javax.swing.JOptionPane;

/**
 *
 * @author Grupo
 * @version 1.0
 */
public class RecuperaSenha extends javax.swing.JDialog {

    /**
     * Creates new form RecuperaSenha
     */
    public RecuperaSenha(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        getRootPane().setDefaultButton(recuperarButton);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        recuperarButton = new javax.swing.JButton();
        inputEmail = new javax.swing.JTextField();
        digiteLabel = new javax.swing.JLabel();
        voltarButton = new javax.swing.JButton();
        tituloLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Dark Side of the Grana - Recuperar Senha");

        jPanel1.setBackground(new java.awt.Color(251, 251, 251));

        recuperarButton.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        recuperarButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagens/key_go.png"))); // NOI18N
        recuperarButton.setText("Recuperar");
        recuperarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recuperarButtonActionPerformed(evt);
            }
        });

        inputEmail.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N

        digiteLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        digiteLabel.setText("Digite seu e-mail:");

        voltarButton.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        voltarButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagens/arrow_left.png"))); // NOI18N
        voltarButton.setText("Voltar");
        voltarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarButtonActionPerformed(evt);
            }
        });

        tituloLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tituloLabel.setText("Recuperar Senha");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel1.setText("Se seu e-mail não existir, não sera possível recuperar sua senha.");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(recuperarButton)
                .addGap(50, 50, 50)
                .addComponent(voltarButton)
                .addGap(102, 102, 102))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addComponent(tituloLabel))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(digiteLabel)
                        .addGap(20, 20, 20)
                        .addComponent(inputEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(tituloLabel)
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(digiteLabel)
                    .addComponent(inputEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(recuperarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(voltarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(54, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void voltarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarButtonActionPerformed
        dispose();
    }//GEN-LAST:event_voltarButtonActionPerformed

    private void recuperarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recuperarButtonActionPerformed
        try {
            Sistema.instance.enviaSenha(getEmail());
            JOptionPane.showMessageDialog(rootPane, "E-mail enviado com sucesso.");
            dispose();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
        }
    }//GEN-LAST:event_recuperarButtonActionPerformed

    private String getEmail() {
        return inputEmail.getText();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel digiteLabel;
    private javax.swing.JTextField inputEmail;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton recuperarButton;
    private javax.swing.JLabel tituloLabel;
    private javax.swing.JButton voltarButton;
    // End of variables declaration//GEN-END:variables
}