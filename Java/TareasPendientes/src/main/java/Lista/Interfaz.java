/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author david
 */
public class Interfaz extends javax.swing.JFrame {
    ArrayList<Tarea> tareas = new ArrayList<Tarea>();
    
    /**
     * Creates new form Interfaz
     */
    public Interfaz() {
        initComponents();
        
    }
    
    private void displayTasks(){
        DefaultTableModel model = (DefaultTableModel) tblTareasHoy.getModel();
        Object RowData[] = new Object[3];
        model.setRowCount(0);
        for(int i=0;i<tareas.size();i++){
            RowData[0] = tareas.get(i).getStart();
            RowData[1] = tareas.get(i).getName();;
            RowData[2] = tareas.get(i).getStatus();;
            model.addRow(RowData);
        }
        lblNumeroDeTareas.setText(String.valueOf(tareas.size()) );
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        TareasHoy = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTareasHoy = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        btnAgregar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtTaskName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lblNumeroDeTareas = new javax.swing.JLabel();
        TareasAyer = new javax.swing.JPanel();
        jSeparator2 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblTareasAyer = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        tblTareasHoy.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null}
            },
            new String [] {
                "Creación", "Tarea", "Estado"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblTareasHoy);

        jLabel2.setText("Tareas para hoy:");

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        jLabel3.setText("jLabel3");

        txtTaskName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTaskNameActionPerformed(evt);
            }
        });

        jLabel4.setText("Quedan:");

        jLabel9.setText("jLabel9");

        lblNumeroDeTareas.setText("jLabel10");

        javax.swing.GroupLayout TareasHoyLayout = new javax.swing.GroupLayout(TareasHoy);
        TareasHoy.setLayout(TareasHoyLayout);
        TareasHoyLayout.setHorizontalGroup(
            TareasHoyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TareasHoyLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(lblNumeroDeTareas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(41, 41, 41)
                .addComponent(jLabel4)
                .addGap(42, 42, 42)
                .addComponent(jLabel9)
                .addGap(68, 68, 68))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TareasHoyLayout.createSequentialGroup()
                .addGap(182, 182, 182)
                .addComponent(txtTaskName, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(97, 97, 97))
        );
        TareasHoyLayout.setVerticalGroup(
            TareasHoyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TareasHoyLayout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addGroup(TareasHoyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel9)
                    .addComponent(lblNumeroDeTareas))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addGroup(TareasHoyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregar)
                    .addComponent(txtTaskName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57))
        );

        jTabbedPane1.addTab("Hoy", TareasHoy);

        tblTareasAyer.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null}
            },
            new String [] {
                "Creación", "Tarea", "Estado"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblTareasAyer);

        jLabel5.setText("Tareas de ayer");

        javax.swing.GroupLayout TareasAyerLayout = new javax.swing.GroupLayout(TareasAyer);
        TareasAyer.setLayout(TareasAyerLayout);
        TareasAyerLayout.setHorizontalGroup(
            TareasAyerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 735, Short.MAX_VALUE)
            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TareasAyerLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        TareasAyerLayout.setVerticalGroup(
            TareasAyerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TareasAyerLayout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(120, 120, 120))
        );

        jTabbedPane1.addTab("Ayer", TareasAyer);

        getContentPane().add(jTabbedPane1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtTaskNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTaskNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTaskNameActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        // TODO add your handling code here:
        String tskname;
        if(txtTaskName.getText().isBlank()){
            return;
        }
        tskname = txtTaskName.getText();
        tareas.add(new Tarea(tskname));
        displayTasks();
        
    }//GEN-LAST:event_btnAgregarActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel TareasAyer;
    private javax.swing.JPanel TareasHoy;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblNumeroDeTareas;
    private javax.swing.JTable tblTareasAyer;
    private javax.swing.JTable tblTareasHoy;
    private javax.swing.JTextField txtTaskName;
    // End of variables declaration//GEN-END:variables
}
