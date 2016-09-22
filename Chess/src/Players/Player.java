/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Players;

import Jogadas.*;

/**
 *
 * @author Alvin
 */
public class Player {
    final int peao1=1,torre1=2,bispo1=3,cavalo1=4,rei1=5,rainha1=6;
    final int peao2=11,torre2=12,bispo2=13,cavalo2=14,rei2=15,rainha2=16;
    final int a=0,b=1,c=2,d=3,e=4,f=5,g=6,h=7;
    final int _1=0,_2=1,_3=2,_4=3,_5=4,_6=5,_7=6,_8=7;
    
    public Player(){

    }
    
    public int [][] start(int x, int [][] tabuleiro){
        if(x==1){
            tabuleiro[_1][a]=torre1;
            tabuleiro[_1][b]=cavalo1;
            tabuleiro[_1][c]=bispo1;
            tabuleiro[_1][d]=rei1;
            tabuleiro[_1][e]=rainha1;
            tabuleiro[_1][f]=bispo1;
            tabuleiro[_1][g]=cavalo1;
            tabuleiro[_1][h]=torre1;
            tabuleiro[_2][a]=peao1;
            tabuleiro[_2][b]=peao1;
            tabuleiro[_2][c]=peao1;
            tabuleiro[_2][d]=peao1;
            tabuleiro[_2][e]=peao1;
            tabuleiro[_2][f]=peao1;
            tabuleiro[_2][g]=peao1;
            tabuleiro[_2][h]=peao1;
        }else if(x==2){
            tabuleiro[_8][a]=torre2;
            tabuleiro[_8][b]=cavalo2;
            tabuleiro[_8][c]=bispo2;
            tabuleiro[_8][d]=rei2;
            tabuleiro[_8][e]=rainha2;
            tabuleiro[_8][f]=bispo2;
            tabuleiro[_8][g]=cavalo2;
            tabuleiro[_8][h]=torre2;
            tabuleiro[_7][a]=peao2;
            tabuleiro[_7][b]=peao2;
            tabuleiro[_7][c]=peao2;
            tabuleiro[_7][d]=peao2;
            tabuleiro[_7][e]=peao2;
            tabuleiro[_7][f]=peao2;
            tabuleiro[_7][g]=peao2;
            tabuleiro[_7][h]=peao2;
        }
        return tabuleiro;
    }
    

}
