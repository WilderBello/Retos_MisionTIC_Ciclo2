/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package reto3;

/**
 *
 * @author wob19
 */
public class reto3{

    public static void main(String[] args) {
        Interface_reto3 Interface = new Interface_reto3();
        Interface.setVisible(true);
    }
        
}
/** POR CONSOLA
int cantidadPacientes; String info; String[] infoPaciente;
        
        //System.out.println("ENTRADAS");
        
        Scanner entrada = new Scanner(System.in);
        cantidadPacientes = Integer.parseInt(entrada.nextLine());
        List<String> ciudadPacientes = new ArrayList<>();
        List<String> Ciudades = new ArrayList<>();
        List<Paciente> Pacientes = new ArrayList<>();
        
        for (int i = 0; i < cantidadPacientes; i++) {
            info = entrada.nextLine();
            infoPaciente = info.split("-");
            ciudadPacientes.add(infoPaciente[3]);
            if(!Ciudades.contains(infoPaciente[3])){
                Ciudades.add(infoPaciente[3]);
            }
            String a = infoPaciente[0].trim();
            String b = infoPaciente[1].trim();
            int c = Integer.parseInt(infoPaciente[2]);
            String d = infoPaciente[3].trim();
            String e = infoPaciente[4].trim();
            String f = infoPaciente[5].trim();
            
            Paciente paciente_write;
            paciente_write = new Paciente(a,b,c,d,e,f);
            Pacientes.add(paciente_write);
        }
        int index = -1; int max = -1;
        for (int i = 0; i < Ciudades.size(); i++) {
            int cont = 0;
            for (int j = 0; j < ciudadPacientes.size(); j++) {
                if (Ciudades.get(i).equals(ciudadPacientes.get(j))) {
                    cont += 1;
                }
            }
            if(cont > max){
                index = i;
                max = cont;
            }
        }
        //System.out.println("SALIDAS");
        
        System.out.println(Ciudades.get(index));
        
        for (int i = 0; i < cantidadPacientes; i++) {
            Paciente paciente_read;
            paciente_read = Pacientes.get(i);
            int edad = paciente_read.getEdad();
            String clasificacion = paciente_read.clasificarEdad(edad);
            String Documento = paciente_read.getCedula();
            
            System.out.println(Documento + clasificacion);
        }
*/
