package BO;

import DTO.UsuarioDTO;
import EXCEPTIONS.ValidacaoException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class UsuarioBO {

    //   Acrescentado uma camada de Busines Object (Camada de négocio)
    /**
     * Neste campo irei fazer uma validação dos campos a serem preennchidos no
     * formulário
     */
    public boolean validaCamposFormCondectaBD(UsuarioDTO usuarioDTO) throws ValidacaoException {

        boolean ehValido = true;

        if (usuarioDTO.getUrlDTO()== null || usuarioDTO.getUrlDTO().isEmpty()) {
            ehValido = false;
            throw new ValidacaoException("Campo Url Obrigatório");

        } else if (usuarioDTO.getBancoDTO() == null || usuarioDTO.getBancoDTO().isEmpty()) {
            ehValido = false;
            throw new ValidacaoException("Campo Banco é Obrigatório");

        } else if (usuarioDTO.getUsuarioDTO()== null || usuarioDTO.getUsuarioDTO().isEmpty()) {
            ehValido = false;
            throw new ValidacaoException("Campo Usuário Obrigatório");

        } else if (usuarioDTO.getSenhaDTO()== null || usuarioDTO.getSenhaDTO().isEmpty()) {

            ehValido = false;
            throw new ValidacaoException("Campo Senha é Obrigatório");
        }
       
        return ehValido;
    }

        
}//aqui fim da classe 
