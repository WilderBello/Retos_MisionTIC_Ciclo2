/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package reto4;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
/**
 *
 * @author Wilder O. Bello
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
    }
    
    Connection connect;
    String Mensaje, title;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Principal = new javax.swing.JPanel();
        Contenedor = new javax.swing.JTabbedPane();
        Ingreso = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        IngresarBtn = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        Procesar = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        ObtenerBtn = new javax.swing.JButton();
        ProcesarBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        Editar = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        BuscarBtn = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jTextField13 = new javax.swing.JTextField();
        EditarBtn = new javax.swing.JButton();
        EliminarBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(632, 380));
        setResizable(false);

        Principal.setName(""); // NOI18N
        Principal.setLayout(new java.awt.BorderLayout());

        jLabel1.setText("Nombre:");

        jLabel2.setText("Cedula:");

        jLabel3.setText("Edad:");

        jLabel4.setText("Ciudad:");

        jLabel5.setText("EPS:");

        jLabel6.setText("Enfermedad:");

        IngresarBtn.setText("Ingresar");
        IngresarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IngresarBtnActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Ingrese los datos del paciente");

        javax.swing.GroupLayout IngresoLayout = new javax.swing.GroupLayout(Ingreso);
        Ingreso.setLayout(IngresoLayout);
        IngresoLayout.setHorizontalGroup(
            IngresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, IngresoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(IngresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField4)
                    .addComponent(jTextField1)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(IngresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField2)
                    .addComponent(jTextField5)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE))
                .addGap(29, 29, 29)
                .addGroup(IngresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField6)
                    .addComponent(jTextField3)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(85, 85, 85))
            .addGroup(IngresoLayout.createSequentialGroup()
                .addGap(271, 271, 271)
                .addComponent(IngresarBtn)
                .addContainerGap(284, Short.MAX_VALUE))
        );
        IngresoLayout.setVerticalGroup(
            IngresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(IngresoLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(IngresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(IngresoLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(55, 55, 55)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(IngresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(IngresoLayout.createSequentialGroup()
                        .addGroup(IngresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(IngresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(IngresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(29, 29, 29)))
                .addGap(42, 42, 42)
                .addComponent(IngresarBtn)
                .addContainerGap(458, Short.MAX_VALUE))
        );

        Contenedor.addTab("Ingresar", Ingreso);

        Procesar.setLayout(null);

        jTextArea2.setEditable(false);
        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        Procesar.add(jScrollPane2);
        jScrollPane2.setBounds(319, 10, 290, 238);

        ObtenerBtn.setText("Obtener Datos");
        ObtenerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ObtenerBtnActionPerformed(evt);
            }
        });
        Procesar.add(ObtenerBtn);
        ObtenerBtn.setBounds(200, 270, 100, 21);

        ProcesarBtn.setText("Procesar Datos");
        ProcesarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProcesarBtnActionPerformed(evt);
            }
        });
        Procesar.add(ProcesarBtn);
        ProcesarBtn.setBounds(320, 270, 110, 21);

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        Procesar.add(jScrollPane1);
        jScrollPane1.setBounds(10, 10, 290, 240);

        Contenedor.addTab("Procesar", Procesar);

        jLabel7.setText("Documento del paciente:");

        jLabel8.setText("Resultados de la búsqueda:");

        BuscarBtn.setText("Buscar");
        BuscarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarBtnActionPerformed(evt);
            }
        });

        jLabel9.setText("Nombre:");

        jLabel10.setText("Cedula:");

        jLabel11.setText("Edad:");

        jLabel12.setText("Ciudad:");

        jLabel13.setText("EPS:");

        jLabel14.setText("Enfermedad:");

        EditarBtn.setText("Editar");
        EditarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditarBtnActionPerformed(evt);
            }
        });

        EliminarBtn.setText("Eliminar");
        EliminarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout EditarLayout = new javax.swing.GroupLayout(Editar);
        Editar.setLayout(EditarLayout);
        EditarLayout.setHorizontalGroup(
            EditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EditarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(EditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EditarLayout.createSequentialGroup()
                        .addGroup(EditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(EditarLayout.createSequentialGroup()
                                .addGroup(EditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(46, 46, 46)
                                .addGroup(EditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39)
                        .addGroup(EditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(45, 45, 45))
                    .addGroup(EditarLayout.createSequentialGroup()
                        .addGroup(EditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(EditarLayout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(51, 51, 51)
                                .addComponent(BuscarBtn))
                            .addGroup(EditarLayout.createSequentialGroup()
                                .addGap(157, 157, 157)
                                .addComponent(EditarBtn)
                                .addGap(130, 130, 130)
                                .addComponent(EliminarBtn)))
                        .addContainerGap(201, Short.MAX_VALUE))
                    .addGroup(EditarLayout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        EditarLayout.setVerticalGroup(
            EditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EditarLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(EditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BuscarBtn))
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addGroup(EditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(EditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField8)
                    .addComponent(jTextField9)
                    .addComponent(jTextField10))
                .addGap(28, 28, 28)
                .addGroup(EditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(EditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField11)
                    .addComponent(jTextField12)
                    .addComponent(jTextField13))
                .addGap(34, 34, 34)
                .addGroup(EditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EditarBtn)
                    .addComponent(EliminarBtn))
                .addGap(134, 134, 134))
        );

        Contenedor.addTab("Editar", Editar);

        Principal.add(Contenedor, java.awt.BorderLayout.CENTER);

        getContentPane().add(Principal, java.awt.BorderLayout.PAGE_START);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void IngresarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IngresarBtnActionPerformed
        // TODO add your handling code here:        
        Connection conn = DataConnection.connectDB();
        
        if (conn != null){
            Paciente paciente = getDataPacientes();
            
            int datosIngresados = DataConnection.InsertData(conn, paciente);
            //System.out.println(datosIngresados);
            
            if (datosIngresados == 1){
                Mensaje = "Datos cargados correctamente.";
                title = "Guardar";
                JOptionPane.showMessageDialog(rootPane, Mensaje, title, 1);
                clearAll();
            } else {
                Mensaje = "Error al cargar los datos.";
                title = "Error";
                JOptionPane.showMessageDialog(rootPane, Mensaje, title, 0);
            } 
        } else {
                Mensaje = "Error al conectar con la base de datos.";
                title = "Error";
                JOptionPane.showMessageDialog(rootPane, Mensaje, title, 0);
        }
    }//GEN-LAST:event_IngresarBtnActionPerformed

    private void ObtenerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ObtenerBtnActionPerformed
        // TODO add your handling code here:
        Connection conn = DataConnection.connectDB();
        jTextArea1.setText(""); jTextArea2.setText("");
        if (conn != null){
            List<Paciente> DatosObtenidos = DataConnection.getData(conn);
            for (int i = 0; i < DatosObtenidos.size(); i++) {
                Paciente Per = DatosObtenidos.get(i);
                String nombre = Per.getNombre();
                String cc = Per.getCedula();
                int edad = Per.getEdad();
                String ciudad = Per.getCiudad();
                String eps = Per.getEPS();
                String enfermedad = Per.getEnfermedad();
                String Dato_Ob = nombre + " - " + cc + " - " + edad + " - " + ciudad + " - " + eps + " - " + enfermedad;
                jTextArea1.append(Dato_Ob + "\n");
            }
            Mensaje = "Datos obtenidos correctamente.";
            title = "Datos Obtenidos";
            JOptionPane.showMessageDialog(rootPane, Mensaje, title, 1);
        }else{
            Mensaje = "Error al conectar con la base de datos.";
            title = "Error";
            JOptionPane.showMessageDialog(rootPane, Mensaje, title, 0);
        }
    }//GEN-LAST:event_ObtenerBtnActionPerformed

    private void ProcesarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProcesarBtnActionPerformed
        // TODO add your handling code here:
        Connection conn = DataConnection.connectDB();
        jTextArea2.setText("");
        if (conn != null){
            int max = -1; int index = -1;
            List<Paciente> DatosObtenidos = DataConnection.getData(conn);
            List<String> Ciudades = new ArrayList<>();
            for (int j = 0; j< DatosObtenidos.size(); j++){
                Paciente dado = DatosObtenidos.get(j);
                String City = dado.getCiudad();
                if(!Ciudades.contains(City)){
                    Ciudades.add(City);
                }
            }
            for (int i = 0; i < Ciudades.size(); i++) {
                int cont = 0;
                for (int j = 0; j < DatosObtenidos.size(); j++) {
                    Paciente dado = DatosObtenidos.get(j);
                    String City = dado.getCiudad();
                    if (Ciudades.get(i).equals(City)) {
                        cont += 1;
                    }
                }
                if(cont > max){
                    index = i;
                    max = cont;
                }
            }
            jTextArea2.append(Ciudades.get(index)+ "\n");


            for (int i = 0; i < DatosObtenidos.size(); i++) {
                Paciente Per = DatosObtenidos.get(i);
                String cc = Per.getCedula();
                int edad = Per.getEdad();
                String clasificacion = Per.clasificarEdad(edad);
                String Dato_Ob = cc + " - " + clasificacion;
                jTextArea2.append(Dato_Ob + "\n");
            }
            Mensaje = "Datos obtenidos correctamente.";
            title = "Datos Obtenidos";
            JOptionPane.showMessageDialog(rootPane, Mensaje, title, 1);
        }else{
            Mensaje = "Error al conectar con la base de datos.";
            title = "Error";
            JOptionPane.showMessageDialog(rootPane, Mensaje, title, 0);
        }
    }//GEN-LAST:event_ProcesarBtnActionPerformed
    
    int n = 0; //int other = 0;
    
    private void BuscarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarBtnActionPerformed
        // TODO add your handling code here:
        Connection conn = DataConnection.connectDB();
        
        if (conn != null){
            List<Paciente> DatosObtenidos = DataConnection.getData(conn);
            String Search = jTextField7.getText().trim();
            boolean a = false;
            for (int i = 0; i < DatosObtenidos.size(); i++) {
                Paciente Per = DatosObtenidos.get(i);

                String nombre = Per.getNombre();
                int edad = Per.getEdad();
                String ciudad = Per.getCiudad();
                String eps = Per.getEPS();
                String enfermedad = Per.getEnfermedad();

                String cc = Per.getCedula();

                if (Search.equals(cc)){
                    jTextField8.setText(nombre);
                    jTextField9.setText(cc);
                    jTextField10.setText(String.valueOf(edad));
                    jTextField11.setText(ciudad);
                    jTextField12.setText(eps);
                    jTextField13.setText(enfermedad);
                    a = true;
                    n = i;
                    break;
                }
            }
            if(a == false){
                Mensaje = "Error, Search failed.";
                title = "Error";
                JOptionPane.showMessageDialog(rootPane, Mensaje, title, 0);             
            }
            Mensaje = "Busqueda finaliza.";
            title = "Search";
            JOptionPane.showMessageDialog(rootPane, Mensaje, title, 1);
        }else{
            Mensaje = "Error al conectar con la base de datos.";
            title = "Error";
            JOptionPane.showMessageDialog(rootPane, Mensaje, title, 0);
        }
    }//GEN-LAST:event_BuscarBtnActionPerformed

    private void EditarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditarBtnActionPerformed
        // TODO add your handling code here:
        Connection conn = DataConnection.connectDB();
        //clearSearch();
        if (conn != null){
            List<Integer> IDs = DataConnection.getID(conn);

            String a = jTextField8.getText().trim();
            String b = jTextField9.getText().trim();
            int c = Integer.parseInt(jTextField10.getText());
            String d = jTextField11.getText().trim();
            String e = jTextField12.getText().trim();
            String f = jTextField13.getText().trim();

            Paciente data = new Paciente(a,b,c,d,e,f);
            int x = IDs.get(n);
            
            Connection conn1 = DataConnection.connectDB();
            DataConnection.editData(conn1, data, x);
            Mensaje = "Datos Actualizados correctamente.";
            title = "Editar";
            JOptionPane.showMessageDialog(rootPane, Mensaje, title, 1);
        }else{
            Mensaje = "Error al conectar con la base de datos.";
            title = "Error";
            JOptionPane.showMessageDialog(rootPane, Mensaje, title, 0);
        }
    }//GEN-LAST:event_EditarBtnActionPerformed

    private void EliminarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarBtnActionPerformed
        // TODO add your handling code here:
        Connection conn = DataConnection.connectDB();
        if (conn != null){
            
            String cedula = jTextField9.getText();
            
            int datosIngresados = DataConnection.deleteData(conn, cedula);
            
            if (datosIngresados == 1){
                Mensaje = "Datos Borrados correctamente.";
                title = "Delete";
                JOptionPane.showMessageDialog(rootPane, Mensaje, title, 1);
                clearAll();
            } else {
                Mensaje = "Error al borrar los datos.";
                title = "Error";
                JOptionPane.showMessageDialog(rootPane, Mensaje, title, 0);
            } 
        } else {
                Mensaje = "Error al conectar con la base de datos.";
                title = "Error";
                JOptionPane.showMessageDialog(rootPane, Mensaje, title, 0);
        }
    }//GEN-LAST:event_EliminarBtnActionPerformed
    
    private Paciente getDataPacientes(){
        
        String a = jTextField1.getText().trim();
        String b = jTextField2.getText().trim();
        int c = Integer.parseInt(jTextField3.getText().trim());
        String d = jTextField4.getText().trim();
        String e = jTextField5.getText().trim();
        String f = jTextField6.getText().trim();
        
        Paciente data = new Paciente(a,b,c,d,e,f);
        
        return data;
    }
    
    private void clearAll(){
        //Borrar los datos de los textbox
        jTextField1.setText("");jTextField2.setText("");jTextField3.setText("");
        jTextField4.setText("");jTextField5.setText("");jTextField6.setText("");
        jTextField7.setText("");jTextField8.setText("");jTextField9.setText("");
        jTextField10.setText("");jTextField11.setText("");jTextField12.setText("");
        jTextField13.setText("");
    }
    
    private void clearSearch(){
        //Borrar los datos de los textbox
        jTextField8.setText("");jTextField9.setText("");jTextField10.setText("");
        jTextField11.setText("");jTextField12.setText("");jTextField13.setText("");
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
        
        //connectDB();
    }
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BuscarBtn;
    private javax.swing.JTabbedPane Contenedor;
    private javax.swing.JPanel Editar;
    private javax.swing.JButton EditarBtn;
    private javax.swing.JButton EliminarBtn;
    private javax.swing.JButton IngresarBtn;
    private javax.swing.JPanel Ingreso;
    private javax.swing.JButton ObtenerBtn;
    private javax.swing.JPanel Principal;
    private javax.swing.JPanel Procesar;
    private javax.swing.JButton ProcesarBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
