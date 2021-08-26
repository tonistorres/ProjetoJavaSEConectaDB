package Aplicativo;

import BO.UsuarioBO;
import Conexao.Conexao;
import DAO.UsuariosDAO;
import DTO.UsuarioDTO;
import EXCEPTIONS.ValidacaoException;
import java.awt.Color;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JOptionPane;

/**
 *
 * @author DaTorres
 */
public class ConectaBD extends javax.swing.JFrame {

    //criando objetos do tipo global 
    UsuariosDAO usuarioDAO = new UsuariosDAO();
    UsuarioBO usuarioBO = new UsuarioBO();
    UsuarioDTO usuarioDTO = new UsuarioDTO();
    Conexao conecta = new Conexao();

    public ConectaBD() {
        initComponents();

        melhorandoInterfaceSwing();
    }

    /*Melhorando a interface swing */
    private void melhorandoInterfaceSwing() {

        btnClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/close.png")));
        btnDesconectar.setEnabled(false);
        // setando valores padrão sendo que se usuário tiver um valor específico ele pode trocar o valor padrão 
        txtURL.setText("localhost");
        txtUsuario.setText("root");
                

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JPrincipal = new javax.swing.JPanel();
        PainelConexao = new javax.swing.JPanel();
        lblURL = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();
        lblSenha = new javax.swing.JLabel();
        txtURL = new javax.swing.JTextField();
        txtUsuario = new javax.swing.JTextField();
        btnConectar = new javax.swing.JButton();
        passSenha = new javax.swing.JPasswordField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaLog = new javax.swing.JTextArea();
        btnDesconectar = new javax.swing.JButton();
        lblBancoDados = new javax.swing.JLabel();
        txtBanco = new javax.swing.JTextField();
        lblMysql = new javax.swing.JLabel();
        lblLogoTrybe = new javax.swing.JLabel();
        jPainelInformativo = new javax.swing.JPanel();
        lblLinhaInformativa = new javax.swing.JLabel();
        btnClose = new javax.swing.JButton();
        lblStatusDaConexao = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setType(java.awt.Window.Type.POPUP);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JPrincipal.setBackground(java.awt.Color.white);
        JPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PainelConexao.setBackground(java.awt.Color.white);
        PainelConexao.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(60, 179, 113)), "Formuário Conexão:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(60, 179, 113))); // NOI18N
        PainelConexao.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblURL.setForeground(new java.awt.Color(60, 179, 113));
        lblURL.setText("URL:");
        PainelConexao.add(lblURL, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 32, 20));

        lblUsuario.setForeground(new java.awt.Color(60, 179, 113));
        lblUsuario.setText("USUÁRIO:");
        PainelConexao.add(lblUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        lblSenha.setForeground(new java.awt.Color(60, 179, 113));
        lblSenha.setText("SENHA:");
        PainelConexao.add(lblSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

        txtURL.setPreferredSize(new java.awt.Dimension(23, 38));
        txtURL.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtURLFocusLost(evt);
            }
        });
        PainelConexao.add(txtURL, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, 195, 30));

        txtUsuario.setPreferredSize(new java.awt.Dimension(23, 38));
        PainelConexao.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, 195, 30));

        btnConectar.setForeground(new java.awt.Color(60, 179, 113));
        btnConectar.setText("Conectar");
        btnConectar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConectarActionPerformed(evt);
            }
        });
        PainelConexao.add(btnConectar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 200, 105, -1));

        passSenha.setPreferredSize(new java.awt.Dimension(23, 38));
        PainelConexao.add(passSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, 195, 27));

        txtAreaLog.setColumns(20);
        txtAreaLog.setRows(5);
        jScrollPane1.setViewportView(txtAreaLog);

        PainelConexao.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 300, 140));

        btnDesconectar.setForeground(new java.awt.Color(60, 179, 113));
        btnDesconectar.setText("Desconectar");
        btnDesconectar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDesconectarActionPerformed(evt);
            }
        });
        PainelConexao.add(btnDesconectar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, 110, -1));

        lblBancoDados.setForeground(new java.awt.Color(60, 179, 113));
        lblBancoDados.setText("BANCO:");
        PainelConexao.add(lblBancoDados, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        txtBanco.setPreferredSize(new java.awt.Dimension(23, 38));
        PainelConexao.add(txtBanco, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, 195, 30));

        lblMysql.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PainelConexao.add(lblMysql, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 70, 60));

        JPrincipal.add(PainelConexao, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 155, 320, 410));

        lblLogoTrybe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/trybePadrão.png"))); // NOI18N
        JPrincipal.add(lblLogoTrybe, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, 150, 80));

        jPainelInformativo.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Line Info:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12))); // NOI18N
        jPainelInformativo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblLinhaInformativa.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        lblLinhaInformativa.setForeground(new java.awt.Color(60, 179, 113));
        jPainelInformativo.add(lblLinhaInformativa, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 25, 310, 30));

        JPrincipal.add(jPainelInformativo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 330, 70));

        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });
        JPrincipal.add(btnClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 0, 48, 48));

        lblStatusDaConexao.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        JPrincipal.add(lblStatusDaConexao, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 70, 60));

        getContentPane().add(JPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        setSize(new java.awt.Dimension(354, 616));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnConectarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConectarActionPerformed

        usuarioDTO.setUrlDTO(txtURL.getText());
        usuarioDTO.setBancoDTO(txtBanco.getText());
        usuarioDTO.setUsuarioDTO(txtUsuario.getText());
        usuarioDTO.setSenhaDTO(passSenha.getText());//depois vou melhorar

        try {

          
            //fazendo validação dos campos antes de fazer a conexão vê se todos os campos estão preenchidos 
            //utilizando a camada de Busines Object (funciona como se fosse o javaScript no lado do Cliente)
            usuarioBO.validaCamposFormCondectaBD(usuarioDTO);

            if (conecta.Conexao(txtURL.getText(), txtUsuario.getText(), passSenha.getText(), txtBanco.getText())) {

                /*Melhorando a parte de swing que trás um beneficio de tornar o aplicativo 
            mais intuitivo para usuario*/
                lblLinhaInformativa.setText("");
                lblLinhaInformativa.setForeground(new Color(60, 179, 113));
                lblLinhaInformativa.setText("Banco Conectado!");
                lblStatusDaConexao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/wifiC.png")));
                lblMysql.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/mysql.png")));
                btnDesconectar.setEnabled(true);
                buscarUsuariosNoBanco();

            }

        } catch (ValidacaoException ex) {

            //tratamento campo URL
            if (ex.getMessage().equals("Campo Url Obrigatório")) {
                txtURL.setBackground(new Color(60, 179, 113));
                txtURL.requestFocus();
                lblLinhaInformativa.setText("");
                lblLinhaInformativa.setText("Preencha campo URL");
                lblLinhaInformativa.setForeground(new Color(60, 179, 113));
                jPainelInformativo.setBackground(Color.WHITE);
                txtURL.setText("localhost");

            }
            //tratamento campo Banco 
            if (ex.getMessage().equals("Campo Banco é Obrigatório")) {
                txtBanco.setBackground(new Color(60, 179, 113));
                txtBanco.requestFocus();

                lblLinhaInformativa.setText("");
                lblLinhaInformativa.setText("Preencha campo BANCO");
                lblLinhaInformativa.setForeground(new Color(60, 179, 113));
                jPainelInformativo.setBackground(Color.WHITE);

            }

            //tratamento campo Usuario
            if (ex.getMessage().equals("Campo Usuário Obrigatório")) {
                txtUsuario.setBackground(new Color(60, 179, 113));
                txtUsuario.requestFocus();
                lblLinhaInformativa.setText("");
                lblLinhaInformativa.setText("Preencha campo USUÁRIO");
                lblLinhaInformativa.setForeground(new Color(60, 179, 113));
                jPainelInformativo.setBackground(Color.WHITE);
                txtUsuario.setText("root");

            }

            //tratamento Campo senha é obrigatorio
            if (ex.getMessage().equals("Campo Senha é Obrigatório")) {
                passSenha.setBackground(new Color(60, 179, 113));
                passSenha.requestFocus();
                lblLinhaInformativa.setText("");
                lblLinhaInformativa.setText("Preencha campo SENHA");
                lblLinhaInformativa.setForeground(new Color(60, 179, 113));
                jPainelInformativo.setBackground(Color.WHITE);

            }

        }

    }//GEN-LAST:event_btnConectarActionPerformed

    private void limparCampos() {
        txtURL.setText("");
        txtBanco.setText("");
        txtUsuario.setText("");
        passSenha.setText("");

    }

    private void retornarCorCampos() {
        txtURL.setBackground(Color.WHITE);
        txtBanco.setBackground(Color.WHITE);
        txtUsuario.setBackground(Color.WHITE);
        passSenha.setBackground(Color.WHITE);
    }


    private void btnDesconectarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDesconectarActionPerformed
        if (conecta.desconectar()) {

            /*Melhorando a experiencia do usuario */
            lblLinhaInformativa.setText("");
            lblLinhaInformativa.setText("Banco Desconectado");
            lblLinhaInformativa.setForeground(new Color(60, 179, 113));
            lblStatusDaConexao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/wifiD.png")));
            lblMysql.setIcon(null);

            txtAreaLog.setText("");
            btnDesconectar.setEnabled(false);

            limparCampos();
            retornarCorCampos();

        } else {
            txtAreaLog.setText("Houve um erro ao tenta\nr Desconectar do Banco MSQL");
        }
    }//GEN-LAST:event_btnDesconectarActionPerformed

    private void limparTextArea() {

    }


    private void buscarUsuariosNoBanco(){
    
        txtAreaLog.setText("");

        try {

            List<UsuarioDTO> listaUsuarios = usuarioDAO.listarTodos();

            if (listaUsuarios != null) {

                for (int i = 0; i < listaUsuarios.size(); i++) {
                    txtAreaLog.append("\n" + listaUsuarios.get(i).getUsuarioDTO());     // aqui que esta dando erro !
                }

            }

            conecta.desconectar();
        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }


    
    }
    
    
    
    
    private void txtURLFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtURLFocusLost
        if (txtURL.getText().equals("localhost")) {
            txtUsuario.setText("root");
        }

    }//GEN-LAST:event_txtURLFocusLost

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        //fechar form
        dispose();
    }//GEN-LAST:event_btnCloseActionPerformed

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
            java.util.logging.Logger.getLogger(ConectaBD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConectaBD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConectaBD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConectaBD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConectaBD().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel JPrincipal;
    private javax.swing.JPanel PainelConexao;
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnConectar;
    private javax.swing.JButton btnDesconectar;
    private javax.swing.JPanel jPainelInformativo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBancoDados;
    public static javax.swing.JLabel lblLinhaInformativa;
    private javax.swing.JLabel lblLogoTrybe;
    public static javax.swing.JLabel lblMysql;
    private javax.swing.JLabel lblSenha;
    public static javax.swing.JLabel lblStatusDaConexao;
    private javax.swing.JLabel lblURL;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JPasswordField passSenha;
    private javax.swing.JTextArea txtAreaLog;
    private javax.swing.JTextField txtBanco;
    private javax.swing.JTextField txtURL;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables

}
