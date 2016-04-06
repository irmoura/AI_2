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
public class Despertador {
    
    static String operador_procurado, Depois, Antes;
    static int antes_do_operador, depois_do_operador, depois, antes;
    
    GUI_Principal p = new GUI_Principal();
    
    Verifica_Frase vf = new Verifica_Frase();
    
    Calendar calendario = Calendar.getInstance();
    public int hora = calendario.get(Calendar.HOUR);
    int minuto = calendario.get(Calendar.MINUTE);
    int dia_int = calendario.get(Calendar.DAY_OF_WEEK);
    String nome = p.nome;
    boolean respondida = p.respondida;
    
    public void Despertador(){
        String calculo = JOptionPane.showInputDialog(null,"Digite o horário desejado: ");
        
            operador_procurado = ":";
            depois = calculo.indexOf(operador_procurado);
            antes = calculo.indexOf(operador_procurado);
            Depois = calculo.substring(depois);
            Depois = Depois.replace(":","");
            Antes = calculo.substring(0, antes);
            antes_do_operador = Integer.parseInt(Antes);
            depois_do_operador = Integer.parseInt(Depois);
            
            if((minuto == 23) && (antes_do_operador == 23)){
                JOptionPane.showMessageDialog(null,"Hora de acordar !!!");
            }
            
    }
    
}
