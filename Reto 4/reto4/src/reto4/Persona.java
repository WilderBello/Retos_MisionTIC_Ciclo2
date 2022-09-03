/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reto4;

/**
 *
 * @author wob19
 */
public class Persona {
    
    private String Nombre;
    private String Cedula;
    private int Edad;
    
    public Persona(String Nombre, String Cedula, int Edad){
        this.Nombre = Nombre;
        this.Cedula = Cedula;
        this.Edad = Edad;
    }
    
    public String getNombre(){
        return Nombre;
    }
    
    public String getCedula(){
        return Cedula;
    }
    public Integer getEdad(){
        return Edad;
    }
}
