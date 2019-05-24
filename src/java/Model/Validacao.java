/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.List;

/**
 *
 * @author Carambola_64
 */
public class Validacao {
    
    private String mensagem;
    private int id;
    
    public Validacao (List<String> listaDadosCliente){
        this.mensagem = "";
        try {
            if (listaDadosCliente.get(1).length() > 20)
                this.mensagem = "Primeiro nome com mais de 10 caracteres \n";
            if(listaDadosCliente.get(2).length() > 20)
                this.mensagem = "Sobrenome com mais de 10 caracteres \n";
        }catch (Exception e){
            this.mensagem += "ID invalido";
        }
    }
    
    public String getMensagem(){
        return mensagem;
    }
}
