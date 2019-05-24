/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import DAL.ClienteDAO;
import java.util.List;

/**
 *
 * @author Carambola_64
 */
public class Controller {
    private String mensagem;
    DAL.ClienteDAO clienteDAO = new ClienteDAO();
    
    public void CadastrarCliente(List<String> listaDadosCliente){
        Validacao validacao = new Validacao(listaDadosCliente);
        if(validacao.getMensagem().equals("")){
            
            Cliente cliente = new Cliente();
            cliente.setIdCliente(0);
            cliente.setNomeCliente(listaDadosCliente.get(1));
            cliente.setSobrenCliente(listaDadosCliente.get(2));
            clienteDAO.CadastrarCliente(cliente);
            this.mensagem = clienteDAO.getMensagem();
        }
        
        else{
            this.mensagem = validacao.getMensagem();
    }
    }
    
public String getMensagem(){
    return mensagem;
}
}