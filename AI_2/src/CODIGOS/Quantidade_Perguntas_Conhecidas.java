/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CODIGOS;

import java.io.File;
import javax.swing.JOptionPane;

/**
 *
 * @author Mael
 */
public class Quantidade_Perguntas_Conhecidas {
    
    public static void Quantidade(){
        
        File diretorio = new File("C:\\AI_2\\Perguntas");
        
        String[] stringDir = diretorio.list();
        String[] stringDir2 = diretorio.list();
        
        int quantidade = diretorio.listFiles().length;
        
        for(int i = 0; i < 1; i++)
        {
              if ((stringDir[i].contains(".txt")) && (i == 0))
            {
                stringDir[i] = stringDir[i].replace(".txt", "");
                JOptionPane.showMessageDialog(null,"Atualmente reconheço "+quantidade+" frases.");
            }

        }
        
    }
    
}
