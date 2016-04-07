/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CODIGOS;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Mael
 */
public class Verifica_Frase {
    
    public static void Verifica_Frase(String frase){
        
        GUI_Principal p = new GUI_Principal();
        
        File dir = new File("C:\\AI_2\\Perguntas");
        
            File arq = new File(dir,frase);//dir,OS
        
        try {
            
            FileReader fileReader = new FileReader(arq);
            
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            
            String Resposta = bufferedReader.readLine();//DIA
            
            JOptionPane.showMessageDialog(null,Resposta+" "+p.nome,"Artificial Inteligence",JOptionPane.INFORMATION_MESSAGE);
             
        } catch (FileNotFoundException ex) {//INICIO ARQUIVO NAO ENCONTRADO
            
            java.io.File DIRETORIO = new java.io.File("C:\\AI_2\\Perguntas");
            DIRETORIO.mkdir();
            
            java.io.File arquivo = new java.io.File(DIRETORIO,frase);
            
            try {
                arquivo.createNewFile();
            } catch (IOException ex1) {
                Logger.getLogger(Verifica_Frase.class.getName()).log(Level.SEVERE, null, ex1);
            }
            
            //ok cria o arquivo ^^
            
            FileWriter Obs = null;
            
            try {
            Obs = new FileWriter("C:\\AI_2\\Perguntas\\"+frase);
        } catch (IOException exe) {
            Logger.getLogger(Verifica_Frase.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        String resposta = JOptionPane.showInputDialog(null,"Digite uma resposta para essa pergunta: ","Artificial Inteligence",JOptionPane.QUESTION_MESSAGE);
        
        PrintWriter gravarArq = new PrintWriter(Obs); 
        {
              gravarArq.println(resposta);//LINHA DA RESPOSTA
 
        }
        try {
            Obs.close();
        } catch (IOException exi) {
            Logger.getLogger(Verifica_Frase.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        }//FIM ARQUIVO NAO ENCONTRADO
        
        catch (IOException ex) {
            
            //Logger.getLogger(GUI_Principal.class.getName()).log(Level.SEVERE, null, ex);
            
        }
        
    }
    
}
