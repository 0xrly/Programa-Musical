/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import logic.CRock;
import logic.CSalsa;
import logic.Cancion;
import logic.ProgramaMusical;
import model.ProgramaMusicalModel;

/**
 *
 * @author Orly
 */
public class Principal extends javax.swing.JFrame {

    private ProgramaMusical programa;

    private ArrayList<Cancion> canciones;

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        
        
        if (ProgramaMusicalModel.getCancionGuardada() == null) {
            programa = new ProgramaMusical();
        } else {
            programa = new ProgramaMusical(ProgramaMusicalModel.getCancionGuardada());
        }
        table = (DefaultTableModel) jTable2.getModel();
        canciones = programa.getCanciones();

        actualizarTablaCanciones();

    }

    public ProgramaMusical getPrograma() {
        return programa;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu7 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Programa Musical");
        setBackground(new java.awt.Color(0, 102, 153));
        setIconImage(getIconImage());

        jPanel2.setBackground(new java.awt.Color(0, 51, 102));
        jPanel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jTable2.setBackground(new java.awt.Color(0, 51, 102));
        jTable2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTable2.setForeground(new java.awt.Color(255, 255, 255));
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Duración", "Autor", "Anno", "Tipo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable2.setGridColor(new java.awt.Color(0, 51, 102));
        jTable2.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(jTable2);
        if (jTable2.getColumnModel().getColumnCount() > 0) {
            jTable2.getColumnModel().getColumn(0).setResizable(false);
            jTable2.getColumnModel().getColumn(1).setResizable(false);
            jTable2.getColumnModel().getColumn(2).setResizable(false);
            jTable2.getColumnModel().getColumn(3).setResizable(false);
            jTable2.getColumnModel().getColumn(4).setResizable(false);
        }

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        jMenu7.setText("Operaciones");

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/agregar.png"))); // NOI18N
        jMenuItem1.setText("Agregar canción");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem1);

        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/borrar1.png"))); // NOI18N
        jMenuItem2.setText("Eliminar canción");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem2);

        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/rock1.png"))); // NOI18N
        jMenuItem3.setText("Datos cancion de mayor duración");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem3);

        jMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/rock1.png"))); // NOI18N
        jMenuItem4.setText("Cantidad de canciones Pop interpretadas por mujeres");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem4);

        jMenuItem5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/rock1.png"))); // NOI18N
        jMenuItem5.setText("Datos canción de Rock de mayor aceptación");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem5);

        jMenuItem6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/sumar1.png"))); // NOI18N
        jMenuItem6.setText("Suma del tiempo de todas las canciones");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem6);

        jMenuBar1.add(jMenu7);

        jMenu1.setText("Opciones");

        jMenuItem7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/nuevo1.png"))); // NOI18N
        jMenuItem7.setText("Nuevo");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem7);

        jMenuItem8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/guardar1.png"))); // NOI18N
        jMenuItem8.setText("Guardar");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem8);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        Adicionar adicionar = new Adicionar(this, rootPaneCheckingEnabled, programa, table);
        adicionar.setVisible(true);
        


    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        int cambios = JOptionPane.showConfirmDialog(null, "¿Desea eliminar una cancion?", "Eliminar", JOptionPane.OK_CANCEL_OPTION);
        if (cambios == 0) {
            if (canciones.isEmpty()) {
                JOptionPane.showMessageDialog(null, "No existen canciones en el programa musical", "Información", JOptionPane.INFORMATION_MESSAGE);
            } else {

                int pos = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de la cancion que desea eliminar"));
                if (pos - 1 < canciones.size() && pos > 0) {
                    programa.removerCancion(pos - 1);

                } else {
                    JOptionPane.showMessageDialog(null, "No existe esta cancion", "Atención", JOptionPane.WARNING_MESSAGE);
                }
                JOptionPane.showMessageDialog(null, "Los cambios necesitan ser guardados", "Información", JOptionPane.INFORMATION_MESSAGE);
                actualizarTablaCanciones();
            }
        }


    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed

        if (canciones.isEmpty()) {
            JOptionPane.showMessageDialog(null, " No se ha agregado ninguna canción", "Atención", JOptionPane.WARNING_MESSAGE);
        } else {
            String cancionMasLarga = programa.MostrarCMasLarga();
            JOptionPane.showMessageDialog(null, cancionMasLarga, "Datos de la Canción de Mayor Duración", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        int cant = programa.CancionesIMujeres();
        if (canciones.isEmpty()) {
            JOptionPane.showMessageDialog(null, " No se ha agregado ninguna canción", "Atención", JOptionPane.WARNING_MESSAGE);
        } else {

            JOptionPane.showMessageDialog(null, "Cantidad de canciones de Pop interpretadas por mujeres: " + cant, "Canciones de Pop interpretadas por mujeres", JOptionPane.INFORMATION_MESSAGE);
        }


    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        try {
            if (canciones.isEmpty()) {
                JOptionPane.showMessageDialog(null, " No se ha agregado ninguna canción", "Atención", JOptionPane.WARNING_MESSAGE);
            } else {
                String datos = programa.DatosCRockMayorAceptacion();
                JOptionPane.showMessageDialog(null, datos, "Datos de la canción", JOptionPane.INFORMATION_MESSAGE);

            }
        } catch (Exception IndexOutOfBoundsException) {

            JOptionPane.showMessageDialog(null, "No se han agregado canciones de Rock", "Atención", JOptionPane.WARNING_MESSAGE);
        }

    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        if (canciones.isEmpty()) {
            JOptionPane.showMessageDialog(null, " No se ha agregado ninguna canción", "Atención", JOptionPane.WARNING_MESSAGE);
        } else {
            int suma = programa.SumarTiempo();
            JOptionPane.showMessageDialog(null, "Suma = " + suma, "Suma del tiempo de todas las canciones", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        int cambios = JOptionPane.showConfirmDialog(null, "¿Desea guardar cambios?", "Guardar", JOptionPane.OK_CANCEL_OPTION);
        if (cambios == 0) {
            ProgramaMusicalModel.guardarCancion(programa.getCanciones());
        }
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        programa = new ProgramaMusical();
        actualizarTablaCanciones();
    }//GEN-LAST:event_jMenuItem7ActionPerformed

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
    }

    public void actualizarTablaCanciones() {
        ArrayList<Cancion> canciones = programa.getCanciones();
        int rows = table.getRowCount();

        for (int i = rows - 1; i >= 0; i--) {
            table.removeRow(i);

        }
        canciones.forEach((c) -> {
            String tipo = "";

            if (c instanceof CRock) {
                tipo = "Rock";
            } else if (c instanceof CSalsa) {
                tipo = "Salsa";
            } else {
                tipo = "Pop";
            }
            table.addRow(new Object[]{
                c.getId(),
                c.gettDuracion(),
                c.getAutor(),
                c.getAnnoC(),
                tipo
            });
        });
    }

    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().
                getImage(ClassLoader.getSystemResource("images/musica1.png"));

        return retValue;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    // End of variables declaration//GEN-END:variables
    private DefaultTableModel table;

}