/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reto2;


/**
 *
 * @author wob19
 */
public class Paciente {
    String Nombre; String Cedula; int Edad;
    String Ciudad; String EPS; String Enfermedad;
    
    public Paciente(){
        this.Nombre = "Prueba";
        this.Cedula = "Prueba";
        this.Edad = 0;
        this.Ciudad = "Prueba";
        this.EPS = "Prueba";
        this.Enfermedad = "Prueba";
    }
    
    public Paciente(String Nombre, String Cedula, int Edad,
            String Ciudad, String EPS, String Enfermedad){
        this.Nombre = Nombre;
        this.Cedula = Cedula;
        this.Edad = Edad;
        this.Ciudad = Ciudad;
        this.EPS = EPS;
        this.Enfermedad = Enfermedad;
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
    public String getCiudad(){
        return Ciudad;
    }
    public String getEPS(){
        return EPS;
    }
    public String getEnfermedad(){
        return Enfermedad;
    }
    public String clasificarEdad(int Edad){
        String Clasificacion1 = " Joven adulto";
        String Clasificacion2 = " Adulto";
        String Clasificacion3 = " Tercera edad";
        String a = "Sin clasificacion";
        if (Edad > 20 && Edad < 31){
            a = Clasificacion1;
        } else if(Edad > 30 && Edad < 61) {
            a = Clasificacion2;
        } else if(Edad > 60) {
            a = Clasificacion3;
        }
        return a;
    }
}
