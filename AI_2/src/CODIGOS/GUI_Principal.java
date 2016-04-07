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
        Calculos_Diretos cd = new Calculos_Diretos();
        Quantidade_Perguntas_Conhecidas qpc = new Quantidade_Perguntas_Conhecidas();
        Palavras_Chave pc = new Palavras_Chave();
        Despertador d = new Despertador();
        Cumprimentos c = new Cumprimentos();
        Questionamentos q = new Questionamentos();
        
        cp.Pasta_Principal("AI_2","Perguntas","Nomes");//NOME DAS PASTAS PRINCIPAIS DO PROGRAMA
        
        java.io.File Diretorio_Nomes = new java.io.File("C:\\AI_2\\Nomes");
        
/*========================================================VERIFICA SE O NOME JÁ FOI DIGITADO ALGUMA VEZ==================================================*/
        
        String Nome = nome;
        
        if (!Nome.equals(""))
        {
        
        Nome = Nome+".txt";
        
        File dir = new File("C:\\AI_2\\Nomes");//LER
        
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
        
        java.io.File arquivo = new java.io.File(dir,Nome );
        
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
        
        int vezes = 50;
      
        for(int i = 0; i < vezes; i++){
            
            Random numero_aleatorio = new Random();
            na = numero_aleatorio.nextInt(4);//NUMEROS ALEATORIOS ENTRE 0 E 3
            
            frase = JOptionPane.showInputDialog(null,"Digite a "+(i+1)+"ª frase: ","Artificial Inteligence",JOptionPane.QUESTION_MESSAGE);
            
            if((frase.equals(pc.Calculo_Direto)))
        {//SE QUISER FAZER UM CALCULO DIRETO
            cd.Calculo();
        }//SE QUISER FAZER UM CALCULO DIRETO
            else
            if((frase.equals(pc.Quantidade)))
        {//SE QUISER SABER A QUANTIDADE DE FRASES CONHECIDAS
            qpc.Quantidade();
        }//SE QUISER SABER A QUANTIDADE DE FRASES CONHECIDAS
            else
            if((frase.equals(pc.Despertador)))
        {//SE QUISER SABER DEFINIR O DESPERTADOR
            d.Despertador();
        }//SE QUISER SABER DEFINIR O DESPERTADOR
            
            ////////////////////////
            
            frase = frase.replace(" ",";");
            String[] s = frase.split(";");
            
            String[] palavras_separadas = new String[s.length];
        
            for(int j = 0; j < s.length; j++){
            palavras_separadas[j] = s[j];
            }
            
            c.Cumprimentos(palavras_separadas[0]);//VERIFICA SE A FRASE TEM UM CUMPRIMENTO
            q.Questionamentos(palavras_separadas[0]);//VERIFICA SE A FRASE TEM UM QUESTIONAMENTO
            
            if(
              (s.length == 1) && 
             !(frase.contains("-")) && 
             !(frase.contains("+")) && 
             !(frase.contains("*")) && 
             !(frase.contains("/")) &&
             !(frase.equals(pc.Calculo_Direto)) &&
             !(frase.equals(pc.Despertador)) &&
             !(frase.equals(pc.Quantidade))
               )
            {
            uma_frase.Uma_Frase(palavras_separadas[0],frase);
            }
            else
            if(
              (s.length == 2) && 
             !(frase.contains("-")) &&
             !(frase.contains("+")) && 
             !(frase.contains("*")) && 
             !(frase.contains("/")) &&
             !(frase.equals(pc.Calculo_Direto)) &&
             !(frase.equals(pc.Despertador)) &&
             !(frase.equals(pc.Quantidade))
               )
            {
            duas_frases.Duas_Frases(palavras_separadas[0], palavras_separadas[1],frase);
            }
            else
            if(
               !(frase.equals(pc.Calculo_Direto)) &&
               !(frase.equals(pc.Despertador)) &&
               !(frase.equals(pc.Quantidade))     
               )
            {
             frase = frase.replace(";"," ");
             frase += ".txt";
             vf.Verifica_Frase(frase);   
            }
            
            ////////////////////////
            
        }
        
    }
}