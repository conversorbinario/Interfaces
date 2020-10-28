/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package novataboa.gui;

import java.awt.Component;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableCellRenderer;
import novataboa.dto.Alumno;
import novataboa.loxica.ProcesoAlumnado;
import novataboa.modeloTabla.DateCellEditor;
import novataboa.modeloTabla.DateCellTextEditor;

import novataboa.modeloTabla.StudentTableModelGeneric;

/**
 *
 * @author manuel
 */
public class PantallaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form PantallaPrincipal
     */
    public PantallaPrincipal() {
        initComponents();
        cargarDatos();
        jTable1.getColumnModel().getColumn(3).setCellRenderer(tableCellRenderer);

    }

    //o cell Renderer é outro tipo de atributo, simplemente, que pasamos a tabla como parametro do renderer
    TableCellRenderer tableCellRenderer = new DefaultTableCellRenderer() {
        SimpleDateFormat f = new SimpleDateFormat("dd-MM-yyyy");

        public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
            if (value instanceof Date) {
                value = f.format(value);
            }
            return super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);

        }
    };

  

    private void inicializarTaboa() {
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu1Actualizar = new javax.swing.JMenu();
        jMenuItem1AltaAlumnos = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jMenu1Actualizar.setText("Actualizar");

        jMenuItem1AltaAlumnos.setText("AltaAlumnos");
        jMenuItem1AltaAlumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1AltaAlumnosActionPerformed(evt);
            }
        });
        jMenu1Actualizar.add(jMenuItem1AltaAlumnos);

        jMenuBar2.add(jMenu1Actualizar);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(63, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(113, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1AltaAlumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1AltaAlumnosActionPerformed
        DialogoModif dialogo = new DialogoModif(this, true);
        dialogo.setVisible(true);

    }//GEN-LAST:event_jMenuItem1AltaAlumnosActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        /*JTable source = (JTable)evt.getSource();
        int row = source.rowAtPoint( evt.getPoint() );
        DialogoModif dialogo = new DialogoModif(this, true, row);
        dialogo.setVisible(true); */


    }//GEN-LAST:event_jTable1MouseClicked

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
            java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PantallaPrincipal().setVisible(true);
            }
        });

    }

    public JMenu getjMenu1Actualizar() {
        return jMenu1Actualizar;
    }

    public JMenuBar getjMenuBar2() {
        return jMenuBar2;
    }

    public JMenuItem getjMenuItem1AltaAlumnos() {
        return jMenuItem1AltaAlumnos;
    }

    public JScrollPane getjScrollPane1() {
        return jScrollPane1;
    }

    public JTable getjTable1() {
        return jTable1;
    }

    private void cargarDatos() {
        Date data = new Date();

        ProcesoAlumnado.engadirAlumno(new Alumno("Ana", "Perez Barcia", data));
        ProcesoAlumnado.engadirAlumno(new Alumno("Jose", "Rivera Portas Barcia", data));
        List<Alumno> listaAlumnado = ProcesoAlumnado.getAlumnado();

        //set Model
        StudentTableModelGeneric stm = new StudentTableModelGeneric();
        for (Alumno alumno : listaAlumnado) {
            stm.addRow(alumno);
        }
        jTable1.setModel(stm);
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        //set Editor
        String formatoAmosar="dd-MM-yyyy";
        jTable1.getColumnModel().getColumn(3).setCellEditor(new DateCellEditor(formatoAmosar));

    }

    public void engadirALumno(Alumno alumno) {
        StudentTableModelGeneric stm = (StudentTableModelGeneric) jTable1.getModel();
        stm.addRow(alumno);

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1Actualizar;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1AltaAlumnos;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
