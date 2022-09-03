/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reto4;

/**
 *
 * @author wob19
 */
public class Paciente extends Persona{
    
    private final String Ciudad;
    private final String EPS;
    private final String Enfermedad;
    
    public Paciente(String Nombre, String Cedula, int Edad, String Ciudad, String EPS, String Enfermedad) {
        super(Nombre, Cedula, Edad);
        this.Ciudad = Ciudad;
        this.EPS = EPS;
        this.Enfermedad = Enfermedad;
    }

    @Override
    public String getNombre(){
        return super.getNombre();
    }
    
    @Override
    public String getCedula(){
        return super.getCedula();
    }
    @Override
    public Integer getEdad(){
        return super.getEdad();
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
        String Category = "Sin clasificacion";
        if (Edad > 20 && Edad < 31){
            Category = Clasificacion1;
        } else if(Edad > 30 && Edad < 61) {
            Category = Clasificacion2;
        } else if(Edad > 60) {
            Category = Clasificacion3;
        }
        return Category;
    }
}
