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


public class cadastro extends javax.swing.JFrame {

    MySQL conectar = new MySQL(); 
    usuario novoUsuario = new usuario();
    /**
     * Creates new form cadastro
     */
    public cadastro() {
        initComponents();
    }
    
  private void cadastraUsuario(usuario novoUsuario){
    this.conectar.conectaBanco(); 
  
    novoUsuario.setNome(txtNome.getText());
    novoUsuario.setCpf(txtCpf.getText());
    novoUsuario.setEmail(txtEmail.getText());
    novoUsuario.setCelular(txtCelular.getText());
    novoUsuario.setCidade(txtCidade.getText());
    novoUsuario.setUF(txtUf.getText());  
    

                        
            this.conectar.insertSQL("INSERT INTO usuario ("
                    + "nome,"
                    + "cpf,"
                    + "email,"
                    + "celular,"
                    + "cidade,"
                    + "UF"
                + ") VALUES ("
                    + "'" + novoUsuario.getNome() + "',"
                    + "'" + novoUsuario.getCpf() + "',"
                    + "'" + novoUsuario.getEmail() + "',"
                    + "'" + novoUsuario.getCelular() + "',"
                    + "'" + novoUsuario.getCidade() + "',"
                    + "'" + novoUsuario.getUF() + "'"
                + ");");
    try {        
             if(novoUsuario.getCpf().isEmpty()){
                JOptionPane.showMessageDialog(null, "Erro ao cadastrar usuário!");
           }else {
              this.conectar.fechaBanco();
              JOptionPane.showMessageDialog(null, "Usuário cadastrado com sucesso");
             }
            
        } catch (Exception e) {
            
            System.out.println("Erro ao cadastrar usuário " +  e.getMessage());
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar usuário");
            
        }        
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
        txtUf = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        txtCelular = new javax.swing.JFormattedTextField();
        jLabel31 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        txtCidade = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        btnSair = new javax.swing.JButton();
        btnCadastrar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        txtCpf = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro");
        setMaximumSize(new java.awt.Dimension(700, 600));
        setMinimumSize(new java.awt.Dimension(700, 600));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel41.setBackground(new java.awt.Color(0, 0, 0));
        jLabel41.setFont(new java.awt.Font("Nunito SemiBold", 1, 48)); // NOI18N
        jLabel41.setText("Cadastrar Usuário");
        getContentPane().add(jLabel41);
        jLabel41.setBounds(140, 30, 480, 90);
        getContentPane().add(jSeparator2);
        jSeparator2.setBounds(20, 100, 650, 10);

        txtUf.setFont(new java.awt.Font("Nunito SemiBold", 1, 18)); // NOI18N
        txtUf.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtUf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUfActionPerformed(evt);
            }
        });
        getContentPane().add(txtUf);
        txtUf.setBounds(480, 360, 90, 30);

        jLabel28.setFont(new java.awt.Font("Nunito SemiBold", 1, 19)); // NOI18N
        jLabel28.setText("Celular");
        getContentPane().add(jLabel28);
        jLabel28.setBounds(380, 240, 80, 40);

        jLabel29.setFont(new java.awt.Font("Nunito SemiBold", 1, 19)); // NOI18N
        jLabel29.setText("CPF");
        getContentPane().add(jLabel29);
        jLabel29.setBounds(400, 160, 80, 40);

        jLabel30.setFont(new java.awt.Font("Nunito SemiBold", 1, 19)); // NOI18N
        jLabel30.setText("Nome");
        getContentPane().add(jLabel30);
        jLabel30.setBounds(20, 160, 80, 40);

        try {
            txtCelular.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCelular.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtCelular.setFont(new java.awt.Font("Nunito SemiBold", 1, 18)); // NOI18N
        getContentPane().add(txtCelular);
        txtCelular.setBounds(380, 280, 190, 30);

        jLabel31.setFont(new java.awt.Font("Nunito SemiBold", 1, 19)); // NOI18N
        jLabel31.setText("UF");
        getContentPane().add(jLabel31);
        jLabel31.setBounds(480, 320, 40, 40);

        txtEmail.setFont(new java.awt.Font("Nunito SemiBold", 1, 18)); // NOI18N
        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });
        getContentPane().add(txtEmail);
        txtEmail.setBounds(20, 280, 330, 30);

        jLabel32.setFont(new java.awt.Font("Nunito SemiBold", 1, 19)); // NOI18N
        jLabel32.setText("E-mail");
        getContentPane().add(jLabel32);
        jLabel32.setBounds(20, 240, 80, 40);

        txtCidade.setFont(new java.awt.Font("Nunito SemiBold", 1, 18)); // NOI18N
        txtCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCidadeActionPerformed(evt);
            }
        });
        getContentPane().add(txtCidade);
        txtCidade.setBounds(20, 360, 430, 30);

        jLabel33.setFont(new java.awt.Font("Nunito SemiBold", 1, 19)); // NOI18N
        jLabel33.setText("Cidade");
        getContentPane().add(jLabel33);
        jLabel33.setBounds(20, 320, 80, 40);

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

        btnCadastrar.setFont(new java.awt.Font("Nunito SemiBold", 1, 24)); // NOI18N
        btnCadastrar.setForeground(new java.awt.Color(0, 25, 37));
        btnCadastrar.setText("Cadastrar ");
        btnCadastrar.setBorder(null);
        btnCadastrar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCadastrar);
        btnCadastrar.setBounds(460, 460, 200, 60);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Home Page.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(510, 310, 60, 60);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/User Male.png"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(84, 150, 50, 60);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Document Writer.png"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(450, 150, 50, 60);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Mail Account.png"))); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(90, 230, 50, 60);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Smartphone.png"))); // NOI18N
        getContentPane().add(jLabel6);
        jLabel6.setBounds(450, 230, 60, 60);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Home Page.png"))); // NOI18N
        getContentPane().add(jLabel7);
        jLabel7.setBounds(90, 310, 50, 60);

        txtNome.setFont(new java.awt.Font("Nunito SemiBold", 1, 18)); // NOI18N
        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });
        getContentPane().add(txtNome);
        txtNome.setBounds(20, 200, 350, 30);

        txtCpf.setFont(new java.awt.Font("Nunito SemiBold", 0, 16)); // NOI18N
        getContentPane().add(txtCpf);
        txtCpf.setBounds(390, 200, 180, 29);

        jPanel1.setBackground(new java.awt.Color(166, 190, 196));
        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 700, 600);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtUfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUfActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void txtCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCidadeActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed

        this.dispose();
       
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        // TODO add your handling code here:
        cadastraUsuario(novoUsuario);
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

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
            java.util.logging.Logger.getLogger(cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cadastro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnSair;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JFormattedTextField txtCelular;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JTextField txtCpf;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtUf;
    // End of variables declaration//GEN-END:variables
}
