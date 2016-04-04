/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CODIGOS;

import java.util.Calendar;
import javax.swing.JOptionPane;

/**
 *
 * @author Mael
 */
public class Duas_Frases {
    GUI_Principal p = new GUI_Principal();
    
    Calendar calendario = Calendar.getInstance();
    int hora = calendario.get(Calendar.HOUR);
    int minuto = calendario.get(Calendar.MINUTE);
    int dia_int = calendario.get(Calendar.DAY_OF_WEEK);
    String nome = p.nome;
    boolean respondida = p.respondida;
    
    public void Duas_Frases(String p1, String p2){
        
        if(
          (p1.equals("que")) || (p1.equals("Que")) || (p1.equals("QUE")
          )
          ){//INICIO COMEÇANDO COM QUE
            if(
          (p2.equals("horas")) || (p2.equals("Horas")) || (p2.equals("HORAS"))
          ){
                
             p.respondida = true;
                
             if(p.na == 0){
                 JOptionPane.showMessageDialog(null,"Agora são "+hora+" horas e "+minuto+" minutos "+nome);
             }
             else
             if(p.na == 1){
                 JOptionPane.showMessageDialog(null,"São "+hora+" e "+minuto+" "+nome);
             }
             else
             if(p.na == 2){
                 JOptionPane.showMessageDialog(null,"Neste momento "+hora+" e "+minuto+" "+nome);
             }
             else
             if(p.na == 3){
                 JOptionPane.showMessageDialog(null,hora+" e "+minuto+" "+nome);
             }
             
            }
        }
    }
}