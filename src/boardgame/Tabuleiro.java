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

    public Tabuleiro(int linha, int coluna, Peca[][] pecas) {
        this.linha = linha;
        this.coluna = coluna;
        pecas = new Peca [linha][coluna];
    }
    
    
    
}
