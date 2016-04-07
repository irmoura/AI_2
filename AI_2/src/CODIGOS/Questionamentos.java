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
public class Questionamentos {
    
    public void Questionamentos(String frase){
            
            List<String> questionamentos = new ArrayList<String>(){
            {
             add("que");
             add("Que");
             add("QUE");
             add("qual");
             add("Qual");
             add("QUAL");
            }
};
            
            if(questionamentos.contains(frase)){
                JOptionPane.showMessageDialog(null,"Fui questionado");
            }
            
        }
    
}
