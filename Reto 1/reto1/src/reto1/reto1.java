/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package reto1;

import java.util.Scanner;

/**
 * @author wob19
 *
 * Las entradas y salidas del programa deben corresponder con lo expresado en la
 * siguiente tabla. Para la entrada, indicar en una primera línea el número de
 * pacientes, luego indicar los datos del paciente separados por guión medio
 * (cada paciente en una línea diferente), y por último las ciudades separadas
 * por guión medio.
 *
 * ●Leer la cantidad de pacientes del estudio. ●Leer y almacenar el
 * nombre,número de cédula, edad, ciudad, EPS, y enfermedad diagnosticada de
 * cada uno de los pacientes. Una vez leidos los datos. ●¿Cuál es la ciudad en
 * la cual se encuentra el mayor número de pacientes?
 */
public class reto1 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner data = new Scanner(System.in);
        int pacientes = Integer.parseInt(data.nextLine());
        String Ciudad[] = new String[pacientes];
        
        for (int i = 0; i < pacientes; i++) {
            String Datos = data.nextLine();
            String[] partes = Datos.split("-");
            Ciudad[i] = partes[3];
        }
        // Cidades para definir
        String Ciudades = data.nextLine();
        String[] City = Ciudades.split("-");
        
        int index = -1; int max = -1;
        for (int i = 0; i < City.length; i++) {
            int cont = 0;
            for (int j = 0; j < Ciudad.length; j++) {
                if (City[i].equals(Ciudad[j])) {
                    cont += 1;
                }
            }
            if(cont > max){
                index = i;
                max = cont;
            }
            
        }
        System.out.println(City[index]);
    }
}
/**
 * Entrada Esperada
 *
 * 3
 *
 * Julian Andrade-723456-45-Barranquilla-Sura-cardiovasculares
 *
 * Andres Utria-734673-76-Barranquilla-Sanitas-cancer
 *
 * Eva Molina-104312456-32-Bogota-Sura-cáncer
 *
 * Barranquilla-Bogota
 *
 * Salida Esperada 
 * 
 * Barranquilla
 */
