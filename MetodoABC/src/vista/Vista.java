/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import modelo.Articulo;

/**
 *
 * @author Gabriel Mora
 */
public class Vista extends javax.swing.JFrame {

    private List<Articulo> lista = new ArrayList();
    
    /**
     * Creates new form Vista
     */
    public Vista() {
        initComponents();
        actualizarTablaDos();
        
        campoNombre.requestFocus();
        Color color = new Color(43, 43, 43);
        
        jScrollPane1.getViewport().setBackground(color);
        JTableHeader headerUno = tablaUno.getTableHeader();
        headerUno.setBackground(Color.white);
        headerUno.setForeground(Color.black);
        
        jScrollPane2.getViewport().setBackground(color);        
        JTableHeader headerDos = tablaDos.getTableHeader();
        headerDos.setBackground(Color.white);
        headerDos.setForeground(Color.black);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fondo = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        btnAgregar = new javax.swing.JButton();
        campoCosto = new javax.swing.JTextField();
        campoNombre = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        panel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaUno = new javax.swing.JTable();
        btnEliminar = new javax.swing.JButton();
        panel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaDos = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        costoTotal = new javax.swing.JLabel();
        barra = new javax.swing.JPanel();
        btnSalir = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        lbImage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        fondo.setBackground(new java.awt.Color(22, 21, 22));
        fondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(22, 21, 22));

        btnAgregar.setBackground(new java.awt.Color(31, 223, 100));
        btnAgregar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnAgregar.setForeground(new java.awt.Color(0, 0, 0));
        btnAgregar.setText("Agregar");
        btnAgregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAgregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAgregarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAgregarMouseExited(evt);
            }
        });
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        campoCosto.setBackground(new java.awt.Color(44, 44, 44));
        campoCosto.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        campoCosto.setForeground(new java.awt.Color(255, 255, 255));
        campoCosto.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(44, 44, 44), 4, true));
        campoCosto.setCaretColor(new java.awt.Color(255, 255, 255));
        campoCosto.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        campoCosto.setSelectionColor(new java.awt.Color(31, 223, 100));

        campoNombre.setBackground(new java.awt.Color(44, 44, 44));
        campoNombre.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        campoNombre.setForeground(new java.awt.Color(255, 255, 255));
        campoNombre.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(44, 44, 44), 4, true));
        campoNombre.setCaretColor(new java.awt.Color(255, 255, 255));
        campoNombre.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        campoNombre.setSelectionColor(new java.awt.Color(31, 223, 100));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nombre");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Costo Anual");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Metodo ABC");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(campoNombre)
                    .addComponent(campoCosto)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                    .addComponent(btnAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addComponent(jLabel1)
                .addGap(12, 12, 12)
                .addComponent(campoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoCosto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(302, Short.MAX_VALUE))
        );

        fondo.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 210, 630));

        panel1.setBackground(new java.awt.Color(24, 24, 24));

        jScrollPane1.setBackground(new java.awt.Color(255, 0, 255));
        jScrollPane1.setBorder(null);
        jScrollPane1.setForeground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setWheelScrollingEnabled(false);

        tablaUno.setBackground(new java.awt.Color(43, 43, 43));
        tablaUno.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tablaUno.setForeground(new java.awt.Color(255, 255, 255));
        tablaUno.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Costo Anual", "Porcentaje"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaUno.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tablaUno.setSelectionBackground(new java.awt.Color(31, 223, 100));
        tablaUno.setSelectionForeground(new java.awt.Color(0, 0, 0));
        tablaUno.getTableHeader().setResizingAllowed(false);
        tablaUno.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tablaUno);
        if (tablaUno.getColumnModel().getColumnCount() > 0) {
            tablaUno.getColumnModel().getColumn(0).setResizable(false);
            tablaUno.getColumnModel().getColumn(1).setResizable(false);
            tablaUno.getColumnModel().getColumn(2).setResizable(false);
        }

        btnEliminar.setBackground(new java.awt.Color(31, 223, 100));
        btnEliminar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(0, 0, 0));
        btnEliminar.setText("Eliminar");
        btnEliminar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        btnEliminar.setBorderPainted(false);
        btnEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEliminarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEliminarMouseExited(evt);
            }
        });
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addContainerGap(80, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65))
        );

        fondo.add(panel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, 480, 630));

        panel2.setBackground(new java.awt.Color(22, 21, 22));

        jScrollPane2.setBorder(null);
        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        tablaDos.setBackground(new java.awt.Color(43, 43, 43));
        tablaDos.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tablaDos.setForeground(new java.awt.Color(255, 255, 255));
        tablaDos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Costo Anual", "Porcentaje", "Articulos", "Porcentaje"
            }
        ));
        tablaDos.setAutoscrolls(false);
        tablaDos.setEnabled(false);
        tablaDos.setRowHeight(60);
        tablaDos.setSelectionBackground(new java.awt.Color(31, 223, 100));
        tablaDos.setSelectionForeground(new java.awt.Color(0, 0, 0));
        tablaDos.getTableHeader().setResizingAllowed(false);
        tablaDos.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(tablaDos);
        if (tablaDos.getColumnModel().getColumnCount() > 0) {
            tablaDos.getColumnModel().getColumn(0).setResizable(false);
            tablaDos.getColumnModel().getColumn(1).setResizable(false);
            tablaDos.getColumnModel().getColumn(2).setResizable(false);
            tablaDos.getColumnModel().getColumn(3).setResizable(false);
        }

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("A");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("B");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("C");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Inversion");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Inventario");

        costoTotal.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        costoTotal.setForeground(new java.awt.Color(255, 255, 255));
        costoTotal.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        costoTotal.setText("Costo Anual Total = ");

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 154, Short.MAX_VALUE)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60))
            .addGroup(panel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(costoTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addGap(10, 10, 10)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(39, 39, 39)
                        .addComponent(jLabel5)
                        .addGap(40, 40, 40)
                        .addComponent(jLabel6)
                        .addGap(25, 25, 25))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(costoTotal))
        );

        fondo.add(panel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 110, 490, -1));

        barra.setBackground(new java.awt.Color(22, 21, 22));

        btnSalir.setBackground(new java.awt.Color(31, 223, 100));
        btnSalir.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setText("x");
        btnSalir.setBorderPainted(false);
        btnSalir.setContentAreaFilled(false);
        btnSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSalirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSalirMouseExited(evt);
            }
        });
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        btnLimpiar.setBackground(new java.awt.Color(31, 223, 100));
        btnLimpiar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnLimpiar.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpiar.setText("Limpiar");
        btnLimpiar.setContentAreaFilled(false);
        btnLimpiar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLimpiar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnLimpiarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnLimpiarMouseExited(evt);
            }
        });
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout barraLayout = new javax.swing.GroupLayout(barra);
        barra.setLayout(barraLayout);
        barraLayout.setHorizontalGroup(
            barraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(barraLayout.createSequentialGroup()
                .addContainerGap(356, Short.MAX_VALUE)
                .addComponent(btnLimpiar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        barraLayout.setVerticalGroup(
            barraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(barraLayout.createSequentialGroup()
                .addGroup(barraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalir)
                    .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        fondo.add(barra, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 0, 490, 30));

        lbImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/colores-movimiento.gif"))); // NOI18N
        fondo.add(lbImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 490, 380, 380));

        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1180, 630));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.dispose();
        this.setVisible(false);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        try {
            if(campoNombre.getText().equalsIgnoreCase("")){
                JOptionPane.showMessageDialog(null, "Rellene los campos");
                campoNombre.requestFocus();
            }else if(campoCosto.getText().equalsIgnoreCase("")){
                JOptionPane.showMessageDialog(null, "Rellene los campos");
                campoCosto.requestFocus();
            }else{
                Articulo articulo = new Articulo();
                articulo.setNombre(campoNombre.getText());
                articulo.setCostoAnual(Float.parseFloat(campoCosto.getText()));
                lista.add(articulo);
                ordenarLista();
                actualizarPorcentajes();
                actualizarTablaUno();
                actualizarTablaDos();
                campoNombre.setText("");
                campoNombre.requestFocus();
                campoCosto.setText("");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Rellene correctamente los campos");
        }   
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        if(tablaUno.getSelectedRow()==-1){
            JOptionPane.showMessageDialog(null, "Debe seleccionar un articulo a borrar!");
        }else{
            int row = tablaUno.getSelectedRow();
            Articulo articulo = new Articulo();
            articulo.setNombre((String) tablaUno.getValueAt(row, 0));
            articulo.setCostoAnual(Float.parseFloat((String) tablaUno.getValueAt(row, 1)));
            articulo.setPorcentaje(Float.parseFloat((String) tablaUno.getValueAt(row, 2)));
            System.out.println(articulo.toString());
            lista.remove(articulo);
            actualizarPorcentajes();
            actualizarTablaUno();
            actualizarTablaDos();
        }
        
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        limpiarTodo();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnAgregarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarMouseEntered
        btnAgregar.setBackground(Color.white);
    }//GEN-LAST:event_btnAgregarMouseEntered

    private void btnAgregarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarMouseExited
        Color color = new Color(31, 223, 100);
        btnAgregar.setBackground(color);
    }//GEN-LAST:event_btnAgregarMouseExited

    private void btnEliminarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseEntered
        btnEliminar.setBackground(Color.white);
    }//GEN-LAST:event_btnEliminarMouseEntered

    private void btnEliminarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseExited
        Color color = new Color(31, 223, 100);
        btnEliminar.setBackground(color);
    }//GEN-LAST:event_btnEliminarMouseExited

    private void btnLimpiarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarMouseEntered
        Color color = new Color(31, 223, 100);
        btnLimpiar.setForeground(color);
    }//GEN-LAST:event_btnLimpiarMouseEntered

    private void btnLimpiarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarMouseExited
        btnLimpiar.setForeground(Color.white);
    }//GEN-LAST:event_btnLimpiarMouseExited

    private void btnSalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseEntered
        Color color = new Color(31, 223, 100);
        btnSalir.setForeground(color);
    }//GEN-LAST:event_btnSalirMouseEntered

    private void btnSalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseExited
        btnSalir.setForeground(Color.white);
    }//GEN-LAST:event_btnSalirMouseExited

    private void actualizarTablaUno(){
        Object[] datos = new Object[tablaUno.getColumnCount()];
    	DefaultTableModel modelo=(DefaultTableModel) tablaUno.getModel();
    	modelo.setRowCount(0);
        int i = 0;
        String datosEntrada = "";
        while(i<lista.size()){
            datosEntrada += lista.get(i).toString()+"\n";
            i++;
        }  	
    	try (Scanner entrada = new Scanner(datosEntrada)) {
            while (entrada.hasNext()) {
                String datosArticulo = entrada.nextLine();
                String[] subcadenas = datosArticulo.split("\t");
                datos[0] = subcadenas[0];
                datos[1] = subcadenas[1];
                datos[2] = subcadenas[2];
                modelo.addRow(datos);
            }
        }
    }
    
    private void actualizarTablaDos(){
    	DefaultTableModel modelo=(DefaultTableModel) tablaDos.getModel();
    	modelo.setRowCount(0);
    	try {
            
            int i = (lista.size()-1);
            
            float costoA = 0;
            float porcentajeA = 0;
            float porcentajeAA = 0;
            String articulosA = "<html>";
            List<Articulo> listaA = new ArrayList();
            
            float costoB = 0;
            float porcentajeB = 0;
            float porcentajeBB = 0;
            String articulosB = "<html>";
            List<Articulo> listaB = new ArrayList();
            
            float costoC = 0;
            float porcentajeC = 0;
            float porcentajeCC = 0;
            String articulosC = "<html>";
            List<Articulo> listaC = new ArrayList();
            
            int contador = 1;
            
            while(i>=0){
               if(contador==4){
                   contador=0;
                   articulosC+="<br>";
               }
               porcentajeC += lista.get(i).getPorcentaje();
               porcentajeCC = ((listaC.size()+1)*100)/(lista.size());
               if(porcentajeC<=15&&porcentajeCC<=50){
                   costoC += lista.get(i).getCostoAnual();
                   articulosC+=lista.get(i).getNombre()+", ";
                   listaC.add(lista.get(i));
                   porcentajeCC = (listaC.size()*100)/(lista.size());
               }else{
                   porcentajeCC = (listaC.size()*100)/(lista.size());
                   porcentajeC -= lista.get(i).getPorcentaje();
                   break;
               }
               contador++;
               i--;
            } 
             
            contador=0;
            
             while(i>=0){
                if(contador==4){
                    contador=0;
                    articulosB+="<br>";
                }
                porcentajeB += lista.get(i).getPorcentaje();
                porcentajeBB = ((listaB.size()+1)*100)/lista.size();
                if(porcentajeB<=25&&porcentajeBB<=40){
                    costoB += lista.get(i).getCostoAnual();
                    articulosB+=lista.get(i).getNombre()+", ";
                    listaB.add(lista.get(i));
                    porcentajeBB = (listaB.size()*100)/lista.size();
                }else{
                    porcentajeBB = (listaB.size()*100)/lista.size();
                    porcentajeB -= lista.get(i).getPorcentaje();
                    break;
                }
                contador++;
                i--;
            }
            
            contador=0;
            
            while(i>=0){
                if(contador==4){
                    contador=0;
                    articulosA+="<br>";
                }
                porcentajeA += lista.get(i).getPorcentaje();
                costoA += lista.get(i).getCostoAnual();
                articulosA+=lista.get(i).getNombre()+", ";
                listaA.add(lista.get(i));
                porcentajeAA = (listaA.size()*100)/lista.size();
                contador++;
                i--;
            } 
            
            articulosA+="</html>";
            articulosB+="</html>";
            articulosC+="</html>";
            
            Object[] datosA = new Object[tablaDos.getColumnCount()];
            if(costoA==0){
                datosA[0] = "-";
                datosA[1] = "-";
                datosA[2] = "-";
                datosA[3] = "-";
            }else{
                datosA[0] = costoA;
                datosA[1] = porcentajeA;
                datosA[2] = articulosA;
                datosA[3] = porcentajeAA;
            } 
          
            Object[] datosB = new Object[tablaDos.getColumnCount()];
            if(costoB==0){
                datosB[0] = "-";
                datosB[1] = "-";
                datosB[2] = "-";
                datosB[3] = "-";
            }else{
                datosB[0] = costoB;
                datosB[1] = porcentajeB;
                datosB[2] = articulosB;
                datosB[3] = porcentajeBB;
            } 
            
            Object[] datosC = new Object[tablaDos.getColumnCount()];
            if(costoC==0){
                datosC[0] = "-";
                datosC[1] = "-";
                datosC[2] = "-";
                datosC[3] = "-";
            }else{
                datosC[0] = costoC;
                datosC[1] = porcentajeC;
                datosC[2] = articulosC;
                datosC[3] = porcentajeCC;
            }
            
            modelo.addRow(datosA);
            modelo.addRow(datosB);
            modelo.addRow(datosC);   
            
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Rellene correctamente los campos");
        }  
    }
    
    private void actualizarPorcentajes(){
        int j = 0;
        while(j<lista.size()){
            int i = 0;
            float suma = 0;
            while(i<lista.size()){
                suma += lista.get(i).getCostoAnual();
                i++;
            }
            float porcentaje = 0;
            if(suma==0){
                porcentaje=100;
            }else{
                porcentaje=(lista.get(j).getCostoAnual()*100)/suma;
            }
            costoTotal.setText("Costo Anual Total = " + suma);
            lista.get(j).setPorcentaje(porcentaje);
            j++;
        } 
    }
    
    private void limpiarTodo(){
        lista.removeAll(lista);
        campoNombre.setText("");
        campoCosto.setText("");
        DefaultTableModel modelo=(DefaultTableModel) tablaUno.getModel();
    	modelo.setRowCount(0);
        actualizarTablaDos();
        costoTotal.setText("Costo Anual Total = ");    
    }
    
    private void ordenarLista(){
        Collections.sort(lista, new Comparator<Articulo>() {
            @Override
            public int compare(Articulo p1, Articulo p2) {
                return p1.compareTo(p2);
            }
        });
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
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel barra;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JTextField campoCosto;
    private javax.swing.JTextField campoNombre;
    private javax.swing.JLabel costoTotal;
    private javax.swing.JPanel fondo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbImage;
    private javax.swing.JPanel panel1;
    private javax.swing.JPanel panel2;
    private javax.swing.JTable tablaDos;
    private javax.swing.JTable tablaUno;
    // End of variables declaration//GEN-END:variables
}