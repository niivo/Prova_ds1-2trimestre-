/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.Prova_ex6adicional.model;

/**
 *
 * @author Admin
 */
public class Leao extends Animal {

    public Leao(String nome, String habitat) {
        super(nome, habitat);
    }



    @Override
    public void emitirSom() {
     System.out.println("O LEAO "+getNome() +  " RUGE!!!!!!!!!!!!!");
    }
}
