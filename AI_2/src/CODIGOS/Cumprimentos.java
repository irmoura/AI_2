/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CODIGOS;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author IBS F25
 */
public class Cumprimentos {
        
        public void Cumprimentos(String frase){
            
            frase = frase.replace(".txt","");
            
            List<String> cumprimentos = new ArrayList<String>(){
            {
             add("ola");
             add("Ola");
             add("olá");
             add("Olá");
             add("OLA");
             add("OLÁ");
            }
};
            
            if(cumprimentos.contains(frase)){
                JOptionPane.showMessageDialog(null,"Fui cumprimentado");
            }
            
        }
    
}