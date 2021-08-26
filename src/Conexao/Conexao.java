package Conexao;

import Aplicativo.ConectaBD;
import static Aplicativo.ConectaBD.lblLinhaInformativa;
import static Aplicativo.ConectaBD.lblMysql;
import static Aplicativo.ConectaBD.lblStatusDaConexao;
import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conexao {

    private String driver = "com.mysql.jdbc.Driver";
    private Connection conexao;
    public Statement statement;
    public ResultSet resultset;
    public Connection con;

    /**
     * Construtor da Classe
     */
    public boolean Conexao(String url, String usuario, String senha,String BD) {

        try {
           
          
            /**
             * 1º Esse método irá procurar dentro do meu projeto a classe do meu
             * Driver MYSQ
             */
            Class.forName("com.mysql.jdbc.Driver");
            //implementei um pouco mais o Drive de Conexão corrigindo um erro ocorrido no linux 
            conexao = DriverManager.getConnection("jdbc:mysql://" + url + ":3306/"+BD+"?autoReconnect=true&useSSL=false",usuario, senha);
            return true;
        } catch (Exception e) {
            
            e.printStackTrace();
            
            /*Implementando mais um pouco a experiencia do Usuário
            tornando a aplicação mais intuitiva para usuário final*/
            lblLinhaInformativa.setText("");
            lblLinhaInformativa.setText("Erro Conexão");
            lblLinhaInformativa.setForeground(Color.red);
            lblStatusDaConexao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/wifiD.png")));
            lblMysql.setIcon(null);
        }
        return false;

    }

    public void ConexaoDireta() throws SQLException {

        try {
            /**
             * 1º Esse método irá procurar dentro do meu projeto a classe do meu
             * Driver MYSQ
             */
            Class.forName("com.mysql.jdbc.Driver");

            /**
             * 2º Criando uma variável de conexão com a Calsse Connection do
             * Pacote Java sql - cria e pega uma conexão com o banco
             */
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hcode", "root",
                    "1020");

              
        } catch (Exception e) {
            System.out.println("Erro:no objeto connection ao tentar conectar-se com o banco MySQL");
        }

    }

    public boolean desconectar() {
        try {

            conexao.close();
          
            return true;

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return false;
    }

    public boolean executeSql(String sql) {

        try {
            Statement statement = conexao.createStatement();
            ResultSet resultset = statement.executeQuery(sql);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());

        }
        return false;

    }

}
