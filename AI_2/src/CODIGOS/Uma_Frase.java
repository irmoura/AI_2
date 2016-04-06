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
public class Uma_Frase {
    
    GUI_Principal p = new GUI_Principal();
    
    Verifica_Frase vf = new Verifica_Frase();
    
    Calendar calendario = Calendar.getInstance();
    int hora = calendario.get(Calendar.HOUR);
    int minuto = calendario.get(Calendar.MINUTE);
    int dia_int = calendario.get(Calendar.DAY_OF_WEEK);
    String nome = p.nome;
    boolean respondida = p.respondida;
    
    public void Uma_Frase(String p1,String frase){
        if(p1.equals("horas")){
            JOptionPane.showMessageDialog(null,"São "+hora+" e "+minuto+" "+nome);
            p.respondida = true;
        }
        else
        {
            
            frase = frase.replace(";"," ");
            frase += ".txt";
            
            vf.Verifica_Frase(frase);
        }
    }
    
}
