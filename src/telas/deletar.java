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
public class deletar extends javax.swing.JFrame {
    
    
    
    MySQL conectar = new MySQL(); 
    usuario deletaUsuario = new usuario();


    /**
     * Creates new form deletar
     */
    public deletar() {
        initComponents();
    }

    
    private void deletaUsuario(usuario deletaUsuario){
    this.conectar.conectaBanco(); 
  
    deletaUsuario.setCpf(txtDeletaCpf.getText());    
try {  
        this.conectar.conectaBanco();
        
        String txtDeletaCpf = this.txtDeletaCpf.getText();             
            this.conectar.updateSQL(
                "DELETE FROM usuario "
                + " WHERE "
                    + "cpf = '" + txtDeletaCpf + "'"
                + ";"  
            );
        } catch (Exception e) {
            
            System.out.println("Erro ao deletar usuário " +  e.getMessage());
            JOptionPane.showMessageDialog(null, "Erro ao deletar usuário");
            
        } finally{            
            this.conectar.fechaBanco();
            JOptionPane.showMessageDialog(null, "Usuário deletado com sucesso");
            //novoCliente.limpaCliente();
            //limparCamposCadastro();
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

        jLabel29 = new javax.swing.JLabel();
        txtDeletaCpf = new javax.swing.JFormattedTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        btnSair = new javax.swing.JButton();
        btnDeletar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Deletar usuário");
        setMaximumSize(new java.awt.Dimension(700, 600));
        setMinimumSize(new java.awt.Dimension(700, 600));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel29.setFont(new java.awt.Font("Nunito SemiBold", 1, 19)); // NOI18N
        jLabel29.setText("Digite o CPF");
        getContentPane().add(jLabel29);
        jLabel29.setBounds(260, 170, 130, 40);

        try {
            txtDeletaCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtDeletaCpf.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtDeletaCpf.setFont(new java.awt.Font("Nunito SemiBold", 1, 18)); // NOI18N
        getContentPane().add(txtDeletaCpf);
        txtDeletaCpf.setBounds(240, 210, 170, 30);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Document Writer.png"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(380, 160, 50, 60);

        jLabel41.setBackground(new java.awt.Color(0, 0, 0));
        jLabel41.setFont(new java.awt.Font("Nunito SemiBold", 1, 48)); // NOI18N
        jLabel41.setText("Deletar Usuário");
        getContentPane().add(jLabel41);
        jLabel41.setBounds(140, 30, 450, 90);
        getContentPane().add(jSeparator3);
        jSeparator3.setBounds(20, 100, 650, 10);
        getContentPane().add(jSeparator2);
        jSeparator2.setBounds(20, 310, 650, 10);

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

        btnDeletar.setFont(new java.awt.Font("Nunito SemiBold", 1, 24)); // NOI18N
        btnDeletar.setForeground(new java.awt.Color(0, 25, 37));
        btnDeletar.setText("Deletar");
        btnDeletar.setBorder(null);
        btnDeletar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletarActionPerformed(evt);
            }
        });
        getContentPane().add(btnDeletar);
        btnDeletar.setBounds(460, 460, 200, 60);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed

        this.dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletarActionPerformed
        deletaUsuario(deletaUsuario);       
    }//GEN-LAST:event_btnDeletarActionPerformed

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
            java.util.logging.Logger.getLogger(deletar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(deletar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(deletar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(deletar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new deletar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDeletar;
    private javax.swing.JButton btnSair;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JFormattedTextField txtDeletaCpf;
    // End of variables declaration//GEN-END:variables
}
