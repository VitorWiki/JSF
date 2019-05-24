/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ManagedBeans;

import Model.Controller;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author Carambola_64
 */
@ManagedBean(name ="cliente")
@RequestScoped
public class bgrCadastro {
    private String nome;
    private String sobreN;
    private String mensagem;
    
    public bgrCadastro(){
        
    }
    
    public String cadastrarCliente(){
        List<String> listaDadosCliente = new ArrayList<String>();
        listaDadosCliente.add("0");
        listaDadosCliente.add(this.nome);
        listaDadosCliente.add(this.sobreN);
        Controller controller = new Controller();
        controller.CadastrarCliente(listaDadosCliente);
        this.mensagem = controller.getMensagem();
        return "/Pagina/respCadastro.xhtml";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobreN() {
        return sobreN;
    }

    public void setSobreN(String sobreN) {
        this.sobreN = sobreN;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }
    
    
}
