/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boardgame;

/*board*/

public class Tabuleiro {

    public static void ColocarPeca() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    private int linha;
    private int coluna;
    private Peca [][] pecas;

    public Tabuleiro(int linha, int coluna) {
        
        if(linha < 1 || coluna < 1){
        
            throw new TabuleiroException("Erro criando tabuleiro: É necessario que haja pelo menos 1 linha e uma coluna");
        
        }
        
        this.linha = linha;
        this.coluna = coluna;
        pecas = new Peca [linha][coluna];
    }

    public int getLinha() {
        return linha;
    }
    
    public int getColuna() {
        return coluna;
    }
    
    public Peca peca (int coluna, int linha){
        
        if(!posicaoExiste(linha, coluna)){
            throw new TabuleiroException ("Posicão fora do tabuleiro");     
        }
        
        return pecas [linha][coluna];
    }
    
    public Peca peca (Posicao posicao){
        
        if(!posicaoExiste(posicao)){    
            throw new TabuleiroException ("Posicão fora do tabuleiro");    
        }
        
        return pecas [posicao.getColuna()][posicao.getLinha()];
    
    }
    
    public void ColocarPeca (Peca peca, Posicao posicao){
    
        if(haUmaPeca(posicao)){ 
            throw new TabuleiroException ("Já existe uma peça na posição "+posicao);    
        }
        
        pecas[posicao.getColuna()][posicao.getLinha()] = peca;
        peca.posicao = posicao;
    }
    
    private boolean posicaoExiste (int linhas, int colunas){
    
        return linhas >= 0 && linhas < linha && colunas >= 0 && colunas < coluna;
    
    }
    
    public boolean posicaoExiste (Posicao posicao){
    
        return posicaoExiste (posicao.getColuna(), posicao.getLinha()); 
    
    }
    
    public boolean haUmaPeca (Posicao posicao){
    
        if(!posicaoExiste(posicao)){      
            throw new TabuleiroException ("Posicão fora do tabuleiro");        
        }
        
        return peca(posicao) != null;
    
    }
    
}
