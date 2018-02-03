/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package Calculadora;

/**
 *
 * @author Ana Lucía Hernández 17138. Luis Delgado 17187.
 */
public interface calculadora<E>{
    /**
     * 
     * @param expresion: String que contiene todos los numerandos y operaciones que se quieren realizar
     * @return el resultado de operar todo lo que dice el string 
     */
    public double operar(String expresion);
}
