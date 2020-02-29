/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xadrez;

import boardgame.Tabuleiro;

/**
 *
 * @author David
 */
public class PartidaXadrez {
    
    private Tabuleiro tabuleiro;
    
    public PartidaXadrez (){
        
        tabuleiro = new Tabuleiro(8, 8);
    
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
    
    
}
