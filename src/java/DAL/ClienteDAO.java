/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import Model.Cliente;
import org.hibernate.Session;
/**
 *
 * @author Carambola_64
 */
public class ClienteDAO {
    
    private String mensagem;
    
    public void CadastrarCliente(Cliente cliente){
        this.mensagem = "";
        
        try {
            Session session = Conection.getSessionFactory().openSession();
            session.beginTransaction();
            session.save(cliente);
            session.getTransaction().commit();
            session.close();
            this.mensagem = "Cliente cadastrado";
        }
        catch (Exception e){
            this.mensagem = "ERRO no cadastro";
    }
}
    public String getMensagem() {
        return mensagem;
    }
}