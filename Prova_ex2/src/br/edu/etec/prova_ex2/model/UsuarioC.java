/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.prova_ex2.model;

/**
 *
 * @author Admin
 */
public class UsuarioC extends Usuario{

    public String getBiografia() {
        return biografia;
    }

    public void setBiografia(String biografia) {
        this.biografia = biografia;
    }

    public UsuarioC(String nome, String email, String biografia) {
        super(nome, email);
        this.biografia = biografia;
    }
    private String biografia;
    

    public void exibirInfo(){
        System.out.println("Nome de usuario: " + getNome());
        System.out.println("Email do usuario" + getEmail());
        System.out.println("Biografia: " + biografia);
    }
}
