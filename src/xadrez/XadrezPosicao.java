/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xadrez;

import boardgame.Posicao;

/**
 *
 * @author David
 */
public class XadrezPosicao {
    
    private char coluna;
    private int linha;

    public XadrezPosicao(char coluna, int linha) {
        if (coluna < 'a' || coluna > 'h' || linha < 1 || linha > 8){
        
            throw new XadrezExeception ("Erro instaciando posição no xadrez. Valores validos são de a1 a h2.");
            
        }
        this.coluna = coluna;
        this.linha = linha;
    }

    public char getColuna() {
        return coluna;
    }

    public int getLinha() {
        return linha;
    }  
    
    protected Posicao toPosicao (){
    
        return new Posicao(8 - linha, coluna - 'a');
    
    }
    
    protected static XadrezPosicao daPosicao (Posicao posicao){
    
        return new XadrezPosicao((char)('a' - posicao.getColuna()), 8 - posicao.getLinha());
    
    }
    
    @Override
    public String toString (){
    
        return "" + coluna + linha;
    
    }
}
