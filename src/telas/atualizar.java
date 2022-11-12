/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package telas;

import banco.MySQL;
import classes.usuario;
import javax.swing.JOptionPane;

/**
 *
 * @author Hendrew
 */
public class atualizar extends javax.swing.JFrame {
    MySQL conectar = new MySQL(); 
    usuario pesquisarUsuario = new usuario();
    usuario atualizarUsuario = new usuario();
    /**
     * Creates new form atualizar
     */
    public atualizar() {
        initComponents();
    }

    private void pesquisarUsuario(usuario pesquisarUsuario){
    this.conectar.conectaBanco(); 
  
    pesquisarUsuario.setCpf(txtConsultaCpf.getText());    
try {  
        this.conectar.conectaBanco();
        
        String txtConsultaCpf = this.txtConsultaCpf.getText();             
           this.conectar.executarSQL(
                   "SELECT "
                    + "nome,"                    
                    + "email,"
                    + "cidade,"
                    + "celular,"
                    + "UF"
                 + " FROM"
                     + " usuario"
                 + " WHERE"
                     + " cpf = '" + txtConsultaCpf + "'"
                + ";");
      
           pesquisarUsuario.limpaCliente();
            while(this.conectar.getResultSet().next()){
                pesquisarUsuario.setNome(this.conectar.getResultSet().getString(1));
                pesquisarUsuario.setEmail(this.conectar.getResultSet().getString(2));
                pesquisarUsuario.setCidade(this.conectar.getResultSet().getString(3));
                pesquisarUsuario.setCelular(this.conectar.getResultSet().getString(4));
                pesquisarUsuario.setUF(this.conectar.getResultSet().getString(5));
           }
           if (pesquisarUsuario.getNome().isEmpty()){
                JOptionPane.showMessageDialog(null, "Usuário não encontrado!");
           }
           
        } catch (Exception e) {            
            System.out.println("Erro ao consultar usuário " +  e.getMessage());
            JOptionPane.showMessageDialog(null, "Erro ao buscar cliente");
            
        } finally{
            txtAtualizarNome.setText(pesquisarUsuario.getNome());
            txtAtualizarEmail.setText(pesquisarUsuario.getEmail());
            txtAtualizarCidade.setText(pesquisarUsuario.getCidade());
            txtAtualizarCelular.setText(pesquisarUsuario.getCelular());
            txtAtualizarUf.setText(pesquisarUsuario.getUF());
            this.conectar.fechaBanco();   
        }                      
    }
    
    private void atualizarUsuario(usuario atualizarUsuario){
    this.conectar.conectaBanco();
    String txtConsultaCpf = this.txtConsultaCpf.getText();
            try {
            this.conectar.updateSQL(
                "UPDATE usuario SET "                    
                    + "nome = '" + txtAtualizarNome.getText() + "',"
                    + "email = '" + txtAtualizarEmail.getText() + "',"
                    + "cidade = '" + txtAtualizarCidade.getText() + "',"
                    + "celular = '" + txtAtualizarCelular.getText() + "',"                   
                    + "UF = '" + txtAtualizarUf.getText() + "'"
                + " WHERE "
                    + "cpf = '" + txtConsultaCpf + "'"
                + ";"
            );
        } catch(Exception e){
            System.out.println("Erro ao atualizar usuário " +  e.getMessage());
            JOptionPane.showMessageDialog(null, "Erro ao atualizar usuário");
        } finally {
            this.conectar.fechaBanco();
            limparCamposBusca();
            JOptionPane.showMessageDialog(null, "Usuário atualizado com sucesso");
        }
    
    }
    private void limparCamposBusca(){
        txtAtualizarCelular.setText("");
        txtAtualizarCidade.setText("");
        txtAtualizarEmail.setText("");
        txtAtualizarNome.setText("");
        txtAtualizarUf.setText("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel41 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        btnSair = new javax.swing.JButton();
        btnPesquisar = new javax.swing.JButton();
        txtConsultaCpf = new javax.swing.JFormattedTextField();
        jLabel29 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnAtualizar = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        txtAtualizarNome = new javax.swing.JTextField();
        txtAtualizarCelular = new javax.swing.JFormattedTextField();
        txtAtualizarCidade = new javax.swing.JTextField();
        txtAtualizarEmail = new javax.swing.JTextField();
        txtAtualizarUf = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Atualizar cliente");
        setMaximumSize(new java.awt.Dimension(700, 600));
        setMinimumSize(new java.awt.Dimension(700, 600));
        setPreferredSize(new java.awt.Dimension(700, 600));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel41.setBackground(new java.awt.Color(0, 0, 0));
        jLabel41.setFont(new java.awt.Font("Nunito SemiBold", 1, 48)); // NOI18N
        jLabel41.setText("Atualizar Usuário");
        getContentPane().add(jLabel41);
        jLabel41.setBounds(140, 30, 450, 90);
        getContentPane().add(jSeparator2);
        jSeparator2.setBounds(20, 230, 650, 10);

        btnSair.setFont(new java.awt.Font("Nunito SemiBold", 1, 24)); // NOI18N
        btnSair.setForeground(new java.awt.Color(0, 25, 37));
        btnSair.setText("Sair");
        btnSair.setActionCommand("");
        btnSair.setBorder(null);
        btnSair.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });
        getContentPane().add(btnSair);
        btnSair.setBounds(30, 460, 200, 60);

        btnPesquisar.setFont(new java.awt.Font("Nunito SemiBold", 1, 18)); // NOI18N
        btnPesquisar.setForeground(new java.awt.Color(0, 25, 37));
        btnPesquisar.setText("Pesquisar");
        btnPesquisar.setBorder(null);
        btnPesquisar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });
        getContentPane().add(btnPesquisar);
        btnPesquisar.setBounds(410, 160, 130, 30);

        try {
            txtConsultaCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtConsultaCpf.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtConsultaCpf.setFont(new java.awt.Font("Nunito SemiBold", 1, 18)); // NOI18N
        getContentPane().add(txtConsultaCpf);
        txtConsultaCpf.setBounds(220, 160, 170, 30);

        jLabel29.setFont(new java.awt.Font("Nunito SemiBold", 1, 19)); // NOI18N
        jLabel29.setText("Digite o CPF");
        getContentPane().add(jLabel29);
        jLabel29.setBounds(230, 120, 130, 40);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Document Writer.png"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(360, 110, 50, 60);

        btnAtualizar.setFont(new java.awt.Font("Nunito SemiBold", 1, 24)); // NOI18N
        btnAtualizar.setForeground(new java.awt.Color(0, 25, 37));
        btnAtualizar.setText("Atualizar");
        btnAtualizar.setBorder(null);
        btnAtualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAtualizar);
        btnAtualizar.setBounds(460, 460, 200, 60);
        getContentPane().add(jSeparator3);
        jSeparator3.setBounds(20, 100, 650, 10);

        txtAtualizarNome.setFont(new java.awt.Font("Nunito SemiBold", 1, 18)); // NOI18N
        txtAtualizarNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAtualizarNomeActionPerformed(evt);
            }
        });
        getContentPane().add(txtAtualizarNome);
        txtAtualizarNome.setBounds(20, 260, 350, 30);

        try {
            txtAtualizarCelular.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtAtualizarCelular.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtAtualizarCelular.setFont(new java.awt.Font("Nunito SemiBold", 1, 18)); // NOI18N
        getContentPane().add(txtAtualizarCelular);
        txtAtualizarCelular.setBounds(410, 260, 190, 30);

        txtAtualizarCidade.setFont(new java.awt.Font("Nunito SemiBold", 1, 18)); // NOI18N
        txtAtualizarCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAtualizarCidadeActionPerformed(evt);
            }
        });
        getContentPane().add(txtAtualizarCidade);
        txtAtualizarCidade.setBounds(20, 380, 430, 30);

        txtAtualizarEmail.setFont(new java.awt.Font("Nunito SemiBold", 1, 18)); // NOI18N
        txtAtualizarEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAtualizarEmailActionPerformed(evt);
            }
        });
        getContentPane().add(txtAtualizarEmail);
        txtAtualizarEmail.setBounds(20, 320, 330, 30);

        txtAtualizarUf.setFont(new java.awt.Font("Nunito SemiBold", 1, 18)); // NOI18N
        txtAtualizarUf.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtAtualizarUf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAtualizarUfActionPerformed(evt);
            }
        });
        getContentPane().add(txtAtualizarUf);
        txtAtualizarUf.setBounds(510, 380, 90, 30);

        jLabel30.setFont(new java.awt.Font("Nunito SemiBold", 1, 19)); // NOI18N
        jLabel30.setText("Nome");
        getContentPane().add(jLabel30);
        jLabel30.setBounds(20, 230, 80, 40);

        jLabel31.setFont(new java.awt.Font("Nunito SemiBold", 1, 19)); // NOI18N
        jLabel31.setText("Celular");
        getContentPane().add(jLabel31);
        jLabel31.setBounds(410, 230, 80, 40);

        jLabel32.setFont(new java.awt.Font("Nunito SemiBold", 1, 19)); // NOI18N
        jLabel32.setText("Email");
        getContentPane().add(jLabel32);
        jLabel32.setBounds(20, 290, 80, 40);

        jLabel33.setFont(new java.awt.Font("Nunito SemiBold", 1, 19)); // NOI18N
        jLabel33.setText("Cidade");
        getContentPane().add(jLabel33);
        jLabel33.setBounds(20, 350, 80, 40);

        jLabel34.setFont(new java.awt.Font("Nunito SemiBold", 1, 19)); // NOI18N
        jLabel34.setText("UF");
        getContentPane().add(jLabel34);
        jLabel34.setBounds(510, 350, 80, 40);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/User Male.png"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(80, 210, 50, 70);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Smartphone.png"))); // NOI18N
        getContentPane().add(jLabel6);
        jLabel6.setBounds(480, 210, 60, 70);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Mail Account.png"))); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(80, 270, 60, 70);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Home Page.png"))); // NOI18N
        getContentPane().add(jLabel9);
        jLabel9.setBounds(90, 350, 50, 40);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Home Page.png"))); // NOI18N
        getContentPane().add(jLabel10);
        jLabel10.setBounds(540, 340, 50, 60);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed

        this.dispose();

    }//GEN-LAST:event_btnSairActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
pesquisarUsuario(pesquisarUsuario);        // TODO add your handling code here:        // TODO add your handling code here:
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarActionPerformed
atualizarUsuario(atualizarUsuario);        // TODO add your handling code here:
    }//GEN-LAST:event_btnAtualizarActionPerformed

    private void txtAtualizarNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAtualizarNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAtualizarNomeActionPerformed

    private void txtAtualizarCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAtualizarCidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAtualizarCidadeActionPerformed

    private void txtAtualizarEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAtualizarEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAtualizarEmailActionPerformed

    private void txtAtualizarUfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAtualizarUfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAtualizarUfActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(atualizar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(atualizar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(atualizar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(atualizar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new atualizar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtualizar;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnSair;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JFormattedTextField txtAtualizarCelular;
    private javax.swing.JTextField txtAtualizarCidade;
    private javax.swing.JTextField txtAtualizarEmail;
    private javax.swing.JTextField txtAtualizarNome;
    private javax.swing.JTextField txtAtualizarUf;
    private javax.swing.JFormattedTextField txtConsultaCpf;
    // End of variables declaration//GEN-END:variables
}
