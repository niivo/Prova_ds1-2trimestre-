/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.Prova_ex6adicional.model;

/**
 *
 * @author Admin
 */
public abstract class Animal {

    public Animal(String nome, String habitat) {
        this.nome = nome;
        this.habitat = habitat;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }
    private String nome;
    private String habitat;
    
    public abstract void emitirSom();
}
