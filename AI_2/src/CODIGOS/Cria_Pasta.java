/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CODIGOS;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Mael
 */
public class Cria_Pasta {
    
    public static void Pasta_Principal(String Pasta_Principal, String Perguntas, String Nomes) {
        
        java.io.File DIRETORIO_PRINCIPAL = new java.io.File("C:\\"+Pasta_Principal);
        DIRETORIO_PRINCIPAL.mkdir();
        
        java.io.File PASTA_PERGUNTAS = new java.io.File("C:\\"+Pasta_Principal+"\\"+Perguntas);
        PASTA_PERGUNTAS.mkdir();
        
        java.io.File PASTA_NOMES = new java.io.File("C:\\"+Pasta_Principal+"\\"+Nomes);
        PASTA_NOMES.mkdir();
        
    }
    
}