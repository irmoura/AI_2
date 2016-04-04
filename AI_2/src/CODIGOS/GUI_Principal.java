/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CODIGOS;

import java.io.*;
import javax.swing.*;

/**
 *
 * @author Mael
 */
public class GUI_Principal {
    
    public static String frase = "";
    public static String nome = "";
    
    public static void main(String args[]){
        
        Cria_Pasta cp = new Cria_Pasta();
        Verifica_Frase vf = new Verifica_Frase();
        
        cp.Pasta_Principal("AI_2","Perguntas");//NOME DAS PASTAS PRINCIPAIS DO PROGRAMA
        
        int vezes = 10;
        
        nome = JOptionPane.showInputDialog(null,"Qual seu nome ?");
      
        for(int i = 0; i < vezes; i++){
            
            frase = JOptionPane.showInputDialog(null,"Digite a "+(i+1)+"ª pergunta: ");
            
            ////////////////////////
            
            frase = frase+".txt";
        
            vf.Verifica_Frase(frase);
            
            ////////////////////////
            
        }
        
    }
}
