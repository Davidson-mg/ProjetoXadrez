/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xadrez;

import boardgame.Posicao;
import boardgame.Tabuleiro;
import xadrez.pecas.Rei;
import xadrez.pecas.Torre;

/**
 *
 * @author David
 */
public class PartidaXadrez {
    
    private Tabuleiro tabuleiro;
    
    public PartidaXadrez (){
        
        tabuleiro = new Tabuleiro(8, 8);
        configuracaoInicial();
    
    }
    
    public PecaXadrez[][]getPecas(){
    
        PecaXadrez[][] mat = new PecaXadrez[tabuleiro.getLinha()][tabuleiro.getColuna()];
        for (int i = 0; i < tabuleiro.getLinha(); i++) {
            for (int j = 0; j < tabuleiro.getColuna(); j++) {
                mat[i][j] = (PecaXadrez) tabuleiro.peca(i, j);
            }
        }
        return mat;
    }
    
    private void configuracaoInicial (){
    
        tabuleiro.ColocarPeca(new Torre(tabuleiro, Cor.branco), new Posicao(4, 1));
        tabuleiro.ColocarPeca(new Rei (tabuleiro, Cor.preto), new Posicao (5, 1));
        tabuleiro.ColocarPeca(new Rei (tabuleiro, Cor.preto), new Posicao (4, 4));
    }
    
}
