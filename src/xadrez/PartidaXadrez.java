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
    
    private void colocarNovaPeca (char coluna, int linha, PecaXadrez peca){
    
        tabuleiro.ColocarPeca(peca, new XadrezPosicao(coluna, linha).toPosicao());
    
    }
    
    private void configuracaoInicial (){
    
        colocarNovaPeca('b', 6, new Torre (tabuleiro, Cor.branco));
        colocarNovaPeca('e', 8, new Rei(tabuleiro, Cor.preto));
        colocarNovaPeca('e', 1,new Rei(tabuleiro, Cor.preto));
    }
    
}
