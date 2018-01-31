/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculadora;

import java.util.ArrayList;

/**
 *
 * @author Ana Lucía Hernández 17138. Luis Delgado 17187.
 */
public class Calculos implements calculadora{
    StackVector<Double> sv;
    ArrayList<String> ex;
    
    public Calculos()
    {
        sv = new StackVector<>();
        ex = new ArrayList<>();
    }
    @Override
    public double operar(String expresion)
    {
        int indice =0;
        ex.add(expresion.substring(indice,expresion.indexOf(" ")+1));
        indice+=1;
        double num =0.0;
        return num;
    }
}
