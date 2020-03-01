/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xadrez.pecas;

import boardgame.Tabuleiro;
import xadrez.Cor;
import xadrez.PecaXadrez;

/**
 *
 * @author David
 */
public class Torre extends PecaXadrez {

    public Torre(Tabuleiro tabuleiro, Cor cor, int moverCount) {
        super(tabuleiro, cor, moverCount);
    }
    
    public Torre(Tabuleiro tabuleiro, Cor cor){
        super(tabuleiro, cor);
    }
    
    @Override
    public String toString (){
    
        return "T";
    
    }
}
