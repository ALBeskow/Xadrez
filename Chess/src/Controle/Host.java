package Controle;

import Players.*;
import javax.swing.JOptionPane;



public class Host {
    int [][] tabuleiro;
    final int peao1=1,torre1=2,bispo1=3,cavalo1=4,rei1=5,rainha1=6;
    final int peao2=11,torre2=12,bispo2=13,cavalo2=14,rei2=15,rainha2=16;
    Local player1,player2;
    AI PC;
    Rede rede;
    public Host(){
        tabuleiro=new int[8][8];
        for (int k=0;k<8;k++) {
            for(int x=0;x<8;x++){
                tabuleiro[k][x]=-1;
            }
        }
    }
    
    public void startPlayer1(){
        player1=new Local();
        tabuleiro=player1.start(1, tabuleiro);
    }
    
    public void startPlayer2(){
        player2=new Local();
        tabuleiro=player2.start(2, tabuleiro);
    }

    public void startPC(){
        PC=new AI();
        tabuleiro=PC.start(2, tabuleiro);
    }
    
    public void startRede(){
        rede=new Rede();
        tabuleiro=rede.start(2, tabuleiro);
    }
    
    public void game(){
        if(player1!=null){
            if(player2!=null){
                pVp();//player vs player!!
            }else if(PC!=null){
                pVsPC();//player vs PC!!
            }else if(rede!=null){
                pVsR();//player vs Rede!!
            }else{
                JOptionPane.showConfirmDialog(null,"não foi selecionado o jogador 2!!", "Problema",1);
            }
        }else{
            JOptionPane.showConfirmDialog(null,"não foi selecionado o jogador 1!!", "Problema",1);
        }
    }
    
    private void pVp(){
        
        
    }
    
    private void pVsPC(){
        
    }
    private void pVsR(){
        
    }
    
}
