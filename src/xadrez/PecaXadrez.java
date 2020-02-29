/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xadrez;

import boardgame.Peca;
import boardgame.Posicao;
import boardgame.Tabuleiro;

/**
 *
 * @author David
 */
public class PecaXadrez extends Peca{

    private Cor cor;

    
    public PecaXadrez(Tabuleiro tabuleiro, Cor cor, int moverCount) {
        super(tabuleiro);
        this.cor = cor;
    }

    public void setCor(Cor cor) {
        this.cor = cor;
    }

    public Posicao getPosicao() {
        return posicao;
    }

    public void setPosicao(Posicao posicao) {
        this.posicao = posicao;
    }
    
    
    
}
