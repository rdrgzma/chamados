/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;

/**
 *
 * @author Duda
 */
@Entity
@Table(name = "chamado")
public class Chamado implements Serializable  {

    @Id
    @GeneratedValue
    private int id;
    private String nome; 
    @ManyToOne
    @JoinColumn(name="id_setor")
    private Setor setor;
    private String localChamado;
    private String descricao;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dataAbertura;
    private String email; 
    private String status;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getLocalChamado() {
        return localChamado;
    }

    public void setLocalChamado(String localChamado) {
        this.localChamado = localChamado;
    }

    public Setor getSetor() {
        return setor;
    }

    public void setSetor(Setor setor) {
        this.setor = setor;
    }

    public Date getDataAbertura() {
        return dataAbertura;
    }

    public void setDataAbertura(Date dataAbertura) {
        this.dataAbertura = dataAbertura;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProblema() {
        return localChamado;
    }

    public void setProblema(String localChamado) {
        this.localChamado = localChamado;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
       
            this.status=status;
        
    }
    public void alteraStatus(String novoStatus){
  
            
        if(novoStatus=="Aberto"&& status=="Em Andamento"){
            status=novoStatus;
           
        }else if(novoStatus=="Fechado"&& status=="Em Andamento"){
            status=novoStatus;
          
        }else if(novoStatus=="Em Andamento"&& status=="Aberto"){
            status=novoStatus;
            
        }   else if(novoStatus=="Fechado" && status=="Aberto"){
            status=novoStatus;
           
        }
    }
    
}
    


