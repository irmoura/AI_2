/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CODIGOS;

import java.io.*;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

/**
 *
 * @author Mael
 */
public class GUI_Principal {
    
    public static boolean respondida = false;
    static int antes_do_operador, depois_do_operador, depois, antes, na;
    public static String frase = "";
    public static String nome = JOptionPane.showInputDialog(null,"Qual seu nome ?","Artificial Inteligence",JOptionPane.QUESTION_MESSAGE);
    
    public static void main(String args[]){
        
        Cria_Pasta cp = new Cria_Pasta();
        Verifica_Frase vf = new Verifica_Frase();
        Uma_Frase uma_frase = new Uma_Frase();
        Duas_Frases duas_frases = new Duas_Frases();
        
        cp.Pasta_Principal("AI_2","Perguntas","Nomes");//NOME DAS PASTAS PRINCIPAIS DO PROGRAMA
        
        java.io.File Diretorio_Nomes = new java.io.File("C:\\AI_2\\Nomes");
        
/*========================================================VERIFICA SE O NOME JÁ FOI DIGITADO ALGUMA VEZ==================================================*/
        
        String Nome = nome;
        
        if (!Nome.equals(""))
        {
        
        Nome = Nome+".txt";
        
        File dir = new File("C:\\AI\\Nomes");//LER
        
        File arq = new File(dir,Nome);//LER
            try {
                FileReader fileReader = new FileReader(arq);//LER
                
                if (Nome.equals(Nome))
                {
                    //JOptionPane.showMessageDialog(null,"Você optou por não alterar as informações atuais.");
                    Nome = "";  
                }
                
            } catch (FileNotFoundException ex) {
                //System.out.println("Nome não encontrado");
                //Logger.getLogger(GUI_Teste.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        java.io.File arquivo = new java.io.File(Diretorio_Nomes,Nome );
        
        if (Nome.equals("")){
        //JOptionPane.showMessageDialog(null,"Eu já lhe conheço "+nome);    
        }
        else{
        JOptionPane.showMessageDialog(null,"Prazer em conhecer "+nome);   
        }
        
        try {
            arquivo.createNewFile();
        } catch (IOException ex) {
            Logger.getLogger(GUI_Principal.class.getName()).log(Level.SEVERE, null, ex);
    }       
}       
/*========================================================VERIFICA SE O NOME JÁ FOI DIGITADO ALGUMA VEZ==================================================*/
        
        int vezes = 2;
      
        for(int i = 0; i < vezes; i++){
            
            Random numero_aleatorio = new Random();
            na = numero_aleatorio.nextInt(4);//NUMEROS ALEATORIOS ENTRE 0 E 3
            
            frase = JOptionPane.showInputDialog(null,"Digite a "+(i+1)+"ª pergunta: ");
            
            ////////////////////////
            
            frase = frase.replace(" ",";");
            String[] s = frase.split(";");
            
            String[] palavras_separadas = new String[s.length];
        
            for(int j = 0; j < s.length; j++){
            palavras_separadas[j] = s[j];
            }
            
            if(s.length == 1 && !frase.contains("-") && !frase.contains("+")
            && !frase.contains("*") && !frase.contains("/")){
            uma_frase.Uma_Frase(palavras_separadas[0]);
            }
            else
            if(s.length == 2 && !frase.contains("-")){
            duas_frases.Duas_Frases(palavras_separadas[0], palavras_separadas[1]);
            }
            else
            if(!respondida == true)
            {
                frase = frase.replace(";"," ");
                
                frase = frase+".txt";
        
                vf.Verifica_Frase(frase);
                
            }
            
            ////////////////////////
            
        }
        
    }
}