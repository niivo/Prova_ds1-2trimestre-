/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.prova_ex5.test;
import br.edu.etec.prova_ex5.model.Email;
import br.edu.etec.prova_ex5.model.Mensagem;
import br.edu.etec.prova_ex5.model.Sms;
/**
 *
 * @author Admin
 */
public class Main {
    public static void main(String[] args) {
        Email email = new Email();
        Sms sms = new Sms();
        
        email.enviar();
        sms.enviar();
    }
}
