/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boardgame;

/*board*/

public class Tabuleiro {
    
    private int linha;
    private int coluna;
    private Peca [][] pecas;

    public Tabuleiro(int linha, int coluna) {
        this.linha = linha;
        this.coluna = coluna;
        pecas = new Peca [linha][coluna];
    }

    public int getLinha() {
        return linha;
    }

    public void setLinha(int linha) {
        this.linha = linha;
    }

    public int getColuna() {
        return coluna;
    }

    public void setColuna(int coluna) {
        this.coluna = coluna;
    }
    
    public Peca peca (int coluna, int linha){
        return pecas [linha][coluna];
    }
    
    public Peca peca (Posicao posicao){
        
        return pecas [posicao.getColuna()][posicao.getLinha()];
    
    }
    
}
