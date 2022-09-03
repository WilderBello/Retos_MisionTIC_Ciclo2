/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reto4;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Wilder O. Bello
 */
public class DataConnection {
    protected static Connection connectDB(){
        String urlDB = "jdbc:sqlite:" + System.getProperty("user.dir") + "/dataBase.db";
        Connection myConnection = null;
        try{
            myConnection = DriverManager.getConnection(urlDB);
            System.out.println("Conexion realizada con exito");
        } catch(SQLException e){
            myConnection = null;
            System.out.println(e.getMessage());
        }
        return myConnection;
    }
    protected static int InsertData(Connection conn, Paciente paciente){
        Statement sent = null;
        int resultado = 0;
        String query;
        
        query = "INSERT INTO Datos(Nombre, Cedula, Edad, Ciudad, EPS, Enfermedad) VALUES('";
        query += paciente.getNombre() + "', '" + paciente.getCedula() + "', " + paciente.getEdad() + ", '" + paciente.getCiudad() + "', '" + paciente.getEPS() + "', '" + paciente.getEnfermedad() + "');";
        
        try{
            sent = conn.createStatement();
            sent.executeUpdate(query);
            resultado = 1;
        }catch(SQLException e){
            resultado = 0;
            System.out.println(e.getMessage());
        } finally {
            if (resultado != 0){
                try{
                    sent.close();
                    conn.close();
                }catch (SQLException e){
                    System.out.println("Error al cerrar la conexión.");
                }
            }
        }
        return resultado;
    }
   protected static List<Paciente> getData(Connection conn) {
      // Método que obtiene los registros de  productos de la DB y los retorna en un array list

      List<Paciente> pacientes = new ArrayList<>();
      Statement sent = null;
      ResultSet rs = null;

      String query = "SELECT * FROM Datos";

      try {
         sent = conn.createStatement();
         rs = sent.executeQuery(query);
         while (rs.next()) {
            Paciente p;
            p = new Paciente(rs.getString(2), rs.getString(3), rs.getInt(4), rs.getString(5), rs.getString(6), rs.getString(7));
            pacientes.add(p);
         }
         rs.close();
         sent.close();
         conn.close();
      } catch (SQLException e) {
         System.out.println(e.getMessage());
      }
      return pacientes;
   }
   
   protected static int deleteData(Connection conn, String cedula){
       int resultado = 0;
       
       Statement sent = null;
       String query;
        
       query = "DELETE FROM Datos WHERE Cedula = '" + cedula + "' ";
        try{
            sent = conn.createStatement();
            sent.executeUpdate(query);
            resultado = 1;
        }catch(SQLException e){
            resultado = 0;
            System.out.println(e.getMessage());
        } finally {
            if (resultado != 0){
                try{
                    sent.close();
                    conn.close();
                }catch (SQLException e){
                    System.out.println("Error al cerrar la conexión.");
                }
            }
        }
       
       return resultado;
   }
   
   protected static int editData(Connection conn, Paciente paciente, int x){
       int resultado = 0;
       
       Statement sent = null;
       String query;
        
       query = "UPDATE Datos SET Nombre='" + paciente.getNombre() + "', Cedula ='" + paciente.getCedula() + 
               "', Edad=" + paciente.getEdad() + ",Ciudad='" + paciente.getCiudad() + 
               "', EPS='" + paciente.getEPS() + "', Enfermedad='" + paciente.getEnfermedad() + 
               "' WHERE id=" + x;      
       
       try{
           sent = conn.createStatement();
           sent.executeUpdate(query);
           //conn.commit();
           resultado = 1;
        }catch(SQLException e){
           resultado = 0;
           System.out.println(e.getMessage());
        } finally {
           if (resultado != 0){
               try{
                   sent.close();
                   conn.close();
               }catch (SQLException e){
                   System.out.println("Error al cerrar la conexión.");
               }
           }
        }
       
       return resultado;
   }
   
   protected static List<Integer> getID(Connection conn){
       List<Integer> Id = new ArrayList<>();
      Statement sent = null;
      ResultSet rs = null;

      String query = "SELECT * FROM Datos";

      try {
         sent = conn.createStatement();
         rs = sent.executeQuery(query);
         while (rs.next()) {
            Id.add(rs.getInt(1));
         }
         rs.close();
         sent.close();
         conn.close();
      } catch (SQLException e) {
         System.out.println(e.getMessage());
      }
      return Id;
   }
}
