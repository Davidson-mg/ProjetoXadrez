/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import xadrez.PartidaXadrez;

/**
 *
 * @author David
 */
public class Program {

    
    public static void main(String[] args) {
        
        PartidaXadrez partidaXadrez = new PartidaXadrez();
        
        Ui.printTabuleiro(partidaXadrez.getPecas());
        
    }
    
}
