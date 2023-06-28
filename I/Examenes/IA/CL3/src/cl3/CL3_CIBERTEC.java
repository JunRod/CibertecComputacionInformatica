package cl3;

public class CL3_CIBERTEC extends javax.swing.JFrame {

    public CL3_CIBERTEC() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        spResultado = new javax.swing.JScrollPane();
        txtaResultado = new javax.swing.JTextArea();
        cbModelo = new javax.swing.JComboBox<>();
        btnProcesar = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtCantidadJueguetes = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CL3");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtaResultado.setColumns(20);
        txtaResultado.setRows(5);
        spResultado.setViewportView(txtaResultado);

        getContentPane().add(spResultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 430, 120));

        cbModelo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Abecedario – Miniland", "Arqueojugando El Esqueleto", "Cohete Magnético – Janod", "Cubos Conectores" }));
        cbModelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbModeloActionPerformed(evt);
            }
        });
        getContentPane().add(cbModelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 220, 30));

        btnProcesar.setText("Procesar");
        btnProcesar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcesarActionPerformed(evt);
            }
        });
        getContentPane().add(btnProcesar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 20, 130, 30));

        btnBorrar.setText("Borrar");
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 60, 130, 30));

        jLabel1.setText("Cantidad Jueguetes");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        txtCantidadJueguetes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCantidadJueguetesActionPerformed(evt);
            }
        });
        getContentPane().add(txtCantidadJueguetes, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, 100, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbModeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbModeloActionPerformed

    }//GEN-LAST:event_cbModeloActionPerformed

    private void btnProcesarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcesarActionPerformed

        double importePagar;
        int cantidadCuentos, cantidadPulseras, modelo = 0, cantidadJuguetes;

        cantidadJuguetes = leerCantidadJuguetes();
        modelo = leerModelo();
        importePagar = calcularImportePagar(modelo);
        cantidadCuentos = calcularPrimerObsequio(cantidadJuguetes);
        cantidadPulseras = calcularSegundoObsequi(modelo, cantidadJuguetes);
        imprimir(importePagar, cantidadCuentos, cantidadPulseras);
    }//GEN-LAST:event_btnProcesarActionPerformed

    private int leerModelo() {
        return cbModelo.getSelectedIndex();
    }

    private int leerCantidadJuguetes() {
        return Integer.parseInt(txtCantidadJueguetes.getText());
    }

    private double calcularImportePagar(int modelo) {
        double precio;
        switch (modelo) {
            case 0:
                precio = 214.9;
                break;
            case 1:
                precio = 94.9;
                break;
            case 2:
                precio = 129.9;
                break;
            case 3:
                precio = 29.9;
                break;
            default:
                throw new AssertionError();
        }

        return precio;
    }

    private int calcularPrimerObsequio(int cantidadJuguetes) {
        if (cantidadJuguetes <= 5) {
            return 2;
        } else if (cantidadJuguetes <= 10) {
            return 3;
        } else if (cantidadJuguetes <= 15) {
            return cantidadJuguetes;
        } else {
            return cantidadJuguetes * 2;
        }
    }

    private int calcularSegundoObsequi(int modelo, int cantidadJuguetes) {
        if (modelo == 2) {
            return 4;
        } else if (modelo == 3) {
            return 3;
        } else {
            return cantidadJuguetes * 2;
        }
    }

    void imprimir(double importePagar, int cantidadCuentos, int cantidadPulseras) {
        txtaResultado.setText("Importe a pagar: S/." + importePagar
                + "\nCantidad de Cuentos: " + cantidadCuentos
                + "\nCantidad de Pulseras: " + cantidadPulseras);
    }

    private void txtCantidadJueguetesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantidadJueguetesActionPerformed

    }//GEN-LAST:event_txtCantidadJueguetesActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        cbModelo.setSelectedIndex(0);
        txtCantidadJueguetes.setText("");
        txtaResultado.setText("");

    }//GEN-LAST:event_btnBorrarActionPerformed

    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(CL3_CIBERTEC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CL3_CIBERTEC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CL3_CIBERTEC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CL3_CIBERTEC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CL3_CIBERTEC().setVisible(true);
            }

        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnProcesar;
    private javax.swing.JComboBox<String> cbModelo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane spResultado;
    private javax.swing.JTextField txtCantidadJueguetes;
    private javax.swing.JTextArea txtaResultado;
    // End of variables declaration//GEN-END:variables
}
