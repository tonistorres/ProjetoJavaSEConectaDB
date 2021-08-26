package DAO;

import Conexao.Conexao;
import DTO.UsuarioDTO;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class UsuariosDAO implements GenericDAO<UsuarioDTO> {

    Conexao conecta = new Conexao();

    @Override
    public List<UsuarioDTO> listarTodos() {

        List<UsuarioDTO> listaDeUsuarios = new ArrayList<UsuarioDTO>();

        try {

            conecta.ConexaoDireta();

            String sql = "SELECT *FROM tb_pessoas ";

            PreparedStatement statement = conecta.con.prepareStatement(sql);

            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {

                UsuarioDTO usuariosDTO = new UsuarioDTO();

                usuariosDTO.setIdDTO(resultSet.getInt("idpessoa"));
                usuariosDTO.setUsuarioDTO(resultSet.getString("desnome"));

                listaDeUsuarios.add(usuariosDTO);

            }

             
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
       
        return listaDeUsuarios;
    }

}
