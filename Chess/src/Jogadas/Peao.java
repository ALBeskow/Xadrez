/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jogadas;

/**
 *
 * @author Alvin
 */
public class Peao extends Pai_Objetos{
    
    
    
    
    private boolean isFirst(int player,int row){
        if (player==1){
            if(row==1){
                return true;
            }
        }
        else if(player==2){
            if(row==7){
                return true;
            }
        }
        return false;
    }
    
}
