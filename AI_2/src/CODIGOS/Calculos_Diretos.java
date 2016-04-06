/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CODIGOS;

import javax.swing.JOptionPane;

/**
 *
 * @author Mael
 */
public class Calculos_Diretos {
    
    static String operador_procurado, Depois, Antes;
    static int antes_do_operador, depois_do_operador, depois, antes;
    
    public static void Calculo(){
        
        String calculo = JOptionPane.showInputDialog(null,"Digite o calculo que deseja fazer: ");
        
        if(calculo.contains("+")){
            operador_procurado = "+";
            depois = calculo.indexOf(operador_procurado);
            antes = calculo.indexOf(operador_procurado);
            Depois = calculo.substring(depois);
            Antes = calculo.substring(0, antes);
            antes_do_operador = Integer.parseInt(Antes);
            depois_do_operador = Integer.parseInt(Depois);
        }
        else
        if(calculo.contains("-")){
            operador_procurado = "-";
            depois = calculo.indexOf(operador_procurado);
            antes = calculo.indexOf(operador_procurado);
            Depois = calculo.substring(depois);
            Depois = Depois.replace("-","");
            Antes = calculo.substring(0, antes);
            antes_do_operador = Integer.parseInt(Antes);
            depois_do_operador = Integer.parseInt(Depois);
        }
        else
        if(calculo.contains("*")){
            operador_procurado = "*";
            depois = calculo.indexOf(operador_procurado);
            antes = calculo.indexOf(operador_procurado);
            Depois = calculo.substring(depois);
            Depois = Depois.replace("*","");
            Antes = calculo.substring(0, antes);
            antes_do_operador = Integer.parseInt(Antes);
            depois_do_operador = Integer.parseInt(Depois);
        }
        else
        if(calculo.contains("/")){
            operador_procurado = "/";
            depois = calculo.indexOf(operador_procurado);
            antes = calculo.indexOf(operador_procurado);
            Depois = calculo.substring(depois);
            Depois = Depois.replace("/","");
            Antes = calculo.substring(0, antes);
            antes_do_operador = Integer.parseInt(Antes);
            depois_do_operador = Integer.parseInt(Depois);
        }
        
        if(calculo.contains("+")){
            JOptionPane.showMessageDialog(null,"O resultado de "+antes_do_operador+" + "+depois_do_operador+" é "+
            (antes_do_operador+depois_do_operador),"Resultado da soma",JOptionPane.INFORMATION_MESSAGE);
        }
        else
        if(operador_procurado.contains("-")){
            JOptionPane.showMessageDialog(null,"O resultado de "+antes_do_operador+" - "+depois_do_operador+" é "+
            (antes_do_operador-depois_do_operador),"Resultado da subtração",JOptionPane.INFORMATION_MESSAGE);
        }
        else
        if(operador_procurado.contains("*")){
            JOptionPane.showMessageDialog(null,"O resultado de "+antes_do_operador+" * "+depois_do_operador+" é "+
            (antes_do_operador*depois_do_operador),"Resultado da multiplicação",JOptionPane.INFORMATION_MESSAGE);
        }
        else
        if(operador_procurado.contains("/")){
            JOptionPane.showMessageDialog(null,"O resultado de "+antes_do_operador+" / "+depois_do_operador+" é "+
            (antes_do_operador/depois_do_operador),"Resultado da divisão",JOptionPane.INFORMATION_MESSAGE);
        }
        
}
    
}