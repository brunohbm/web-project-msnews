/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bruno.modelos;

/**
 *
 * @author Hope
 */
public class Usuario {
    
    public Usuario (String login, String senha) {
        this.login = login;
        this.senha = senha;
    }
    
    public Usuario () {}
    
    private String login;
    private String senha;
    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }   
    
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    
    
}