/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author Principal
 */

//PARA PROBAR CREE OTRA CLASE LLAMADA PruebaPersona2 para provar que se pueden crear objetos dentro de 
//una diferente clase.
public class PruebaPersona2 {
    public static void main(String[] args) {
        Persona persona2 = new Persona();
        persona2.nombre = "Freyder";
        persona2.apellido = "Urbano";
        persona2.desplegarInformacion();
        //se pueden crear los objetos que sean necesarios
        Persona persona3 = new Persona();
        persona3.nombre = "Clara";
        persona3.apellido = "Rosales";
        persona3.desplegarInformacion();
    }
}
