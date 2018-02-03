/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package Calculadora;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ana Lucía Hernández 17138. Luis Delgado 17187.
 */
public class Principal {
    public static void main(String args[]) throws FileNotFoundException, IOException
    {
        System.out.println("Ingrese la direccion o el nombre del documento .txt (en el caso está en la misma carpeta que el programa): ");
        Scanner teclado = new Scanner(System.in);
        String file = teclado.nextLine();
        BufferedReader br = new BufferedReader(new FileReader(file));
        Calculos calc = new Calculos();
        try 
        {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();

            while (line != null) {
                sb.append(line);
                sb.append(System.lineSeparator());
                line = br.readLine();
            }
            String everything = sb.toString();
            if (Double.isNaN(calc.operar(everything)))
            {
                System.out.println("MATH ERROR.");
            }
            else
            {
                System.out.println(calc.operar(everything));                
            }
            
        } 
        finally 
        {
            br.close();
        }
    }
    
}
