/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.prova_ex5.model;

/**
 *
 * @author Admin
 */
public class Sms implements Mensagem {
    @Override
    public void enviar(){
        System.out.println("Enviando mensagem por SMS...");
    }
}
