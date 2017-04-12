package MisVentanas;

import MisClases.Trabajador;
import MisExcepciones.DatoLogicoException;
import MisExcepciones.VacioException;
import gestionpartes.GestionPartes;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

public class DModificar extends javax.swing.JDialog {

    public DModificar(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(this);
        setResizable(false);
        centrosArray = GestionPartes.nombreCentros();
        for (int x=0;x<centrosArray.size();x++) {
            cbCentro.insertItemAt(centrosArray.get(x), x);
        }
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        dcFNacimiento.setDateFormat(sdf);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        bSalir = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        tfDni = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tfNombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tfApeUno = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tfApeDos = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        tfCalle = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        tfPortal = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        tfPiso = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        tfMano = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        tfTPersonal = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        tfTEmpresa = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        tfSalario = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        bAlta = new javax.swing.JButton();
        bBaja = new javax.swing.JButton();
        bModificar = new javax.swing.JButton();
        cbTipo = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        cbCentro = new javax.swing.JComboBox<>();
        jCheckBox2 = new javax.swing.JCheckBox();
        dcFNacimiento = new datechooser.beans.DateChooserCombo();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setText("Trabajadores");

        bSalir.setText("SALIR");
        bSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSalirActionPerformed(evt);
            }
        });

        jLabel2.setText("DNI *");

        tfDni.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfDniFocusLost(evt);
            }
        });

        jLabel3.setText("Nombre *");

        jLabel4.setText("Primer apellido *");

        jLabel5.setText("Segundo apellido *");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Dirección"));

        jLabel6.setText("Calle *");

        jLabel7.setText("Portal *");

        jLabel8.setText("Piso *");

        jLabel9.setText("Mano *");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tfPiso, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel9))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tfCalle, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tfPortal, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                    .addComponent(tfMano, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(tfCalle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(tfPortal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(tfPiso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(tfMano, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Teléfonos"));

        jLabel10.setText("Personal");

        jLabel11.setText("Empresa *");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addComponent(tfTPersonal, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfTEmpresa, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(tfTPersonal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(tfTEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jLabel12.setText("Salario");

        jLabel14.setText("Tipo *");

        bAlta.setText("ALTA");
        bAlta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAltaActionPerformed(evt);
            }
        });

        bBaja.setText("BAJA");
        bBaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBajaActionPerformed(evt);
            }
        });

        bModificar.setText("MODIFICAR");
        bModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bModificarActionPerformed(evt);
            }
        });

        cbTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Logística", "Administración" }));

        jLabel15.setText("Centro *");

        jCheckBox2.setText("Fecha nacimiento");
        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });

        dcFNacimiento.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel14)
                            .addComponent(jLabel15)
                            .addComponent(jCheckBox2))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfSalario, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbCentro, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dcFNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(tfDni, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(tfApeUno, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(tfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(tfApeDos, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1)))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bAlta)
                            .addComponent(bBaja)
                            .addComponent(bModificar))
                        .addGap(71, 71, 71))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(bSalir)
                        .addGap(60, 60, 60))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bSalir)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(tfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tfApeUno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(tfApeDos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bModificar)
                        .addGap(60, 60, 60))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(tfSalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bAlta))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(bBaja)
                                .addComponent(cbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBox2)
                            .addComponent(dcFNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(cbCentro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34))))
        );

        jPanel1.getAccessibleContext().setAccessibleName("Dirección *");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSalirActionPerformed
        GestionPartes.cerrarTrabajadores();
    }//GEN-LAST:event_bSalirActionPerformed

    private void bAltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAltaActionPerformed
        if (comprobarTextos()) {
            if (validarTexto()) {
                String a;
                if (dcFNacimiento.isEnabled()) {
                    int mes = dcFNacimiento.getSelectedDate().get(Calendar.MONTH)+1;
                    a= dcFNacimiento.getSelectedDate().get(Calendar.YEAR)+"/"+mes+"/"+dcFNacimiento.getSelectedDate().get(Calendar.DAY_OF_MONTH);
                }
                else
                    a = null;
                GestionPartes.crearTrabajadorNuevo(tfDni.getText(),tfNombre.getText(),tfApeUno.getText(),tfApeDos.getText(),tfCalle.getText(),tfPortal.getText(),tfPiso.getText(),tfMano.getText(),tfTPersonal.getText(),tfTEmpresa.getText(),tfSalario.getText(),cbTipo.getSelectedItem().toString(),a,cbCentro.getSelectedItem().toString());
                //String dni, String nombre, String apeUno, String apeDos, String calle, String portal, String piso, String mano, String tPersonal, String tEmpresa, String salario, String tipo, String fecha, String centro
            }
        }
        else borrarTextos();
    }//GEN-LAST:event_bAltaActionPerformed

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
        if (cheked) {
            dcFNacimiento.setEnabled(false);
            cheked=false;
        }
        else {
            dcFNacimiento.setEnabled(true);
            cheked=true;
        }
    }//GEN-LAST:event_jCheckBox2ActionPerformed

    private void tfDniFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfDniFocusLost
        mostrarDatos(tfDni.getText());
    }//GEN-LAST:event_tfDniFocusLost

    private void bModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bModificarActionPerformed
        if (comprobarTextos()) {
            if (validarTexto()) {
                //aqui jpanel comprobacion
                /* if true */
                GestionPartes.borrarTrabajador(tfDni.getText());
                String a;
                if (dcFNacimiento.isEnabled()) {
                    SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
                    a = sdf.format(dcFNacimiento.getSelectedDate());
                }
                else
                    a = null;
                GestionPartes.crearTrabajadorNuevo(tfDni.getText(),tfNombre.getText(),tfApeUno.getText(),tfApeDos.getText(),tfCalle.getText(),tfPortal.getText(),tfPiso.getText(),tfMano.getText(),tfTPersonal.getText(),tfTEmpresa.getText(),tfSalario.getText(),cbTipo.getSelectedItem().toString(),a,cbCentro.getSelectedItem().toString());
                /* *** */
            }
        }
        else mostrarDatos(JOptionPane.showInputDialog("Introduce el DNI del trabajador que quieres modificar"));
    }//GEN-LAST:event_bModificarActionPerformed

    private void bBajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBajaActionPerformed
        if (comprobarTextos()) {
            //aqui jpanel comprobacion
            /* if true */
            GestionPartes.borrarTrabajador(tfDni.getText());
            /* *** */
        }
        else mostrarDatos(JOptionPane.showInputDialog("Introduce el DNI del trabajador que quieres borrar"));
    }//GEN-LAST:event_bBajaActionPerformed

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
            java.util.logging.Logger.getLogger(DModificar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DModificar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DModificar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DModificar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DModificar dialog = new DModificar(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }
    
    public boolean validarTexto() {
        try {
            Pattern pat = Pattern.compile("^[0-9]{8}[A-Z]$");
            Matcher mat = pat.matcher(tfDni.getText());
            if (mat.matches()==false)
                throw new DatoLogicoException("dni");
            pat =  Pattern.compile("[0-9]");
            mat = pat.matcher(tfNombre.getText());
            if (mat.matches()==true)
                throw new DatoLogicoException("nombre");
            mat = pat.matcher(tfApeUno.getText());
            if (mat.matches()==true)
                throw new DatoLogicoException("primer apellido");
            mat = pat.matcher(tfApeDos.getText());
            if (mat.matches()==true)
                throw new DatoLogicoException("segundo apellido");
            mat = pat.matcher(tfCalle.getText());
            if (mat.matches()==true)
                throw new DatoLogicoException("calle");
            pat = Pattern.compile("^[0-9]{9}$");
            mat = pat.matcher(tfTEmpresa.getText());
            if (mat.matches()==false)
                throw new DatoLogicoException("telefono empresa");
            if (!tfTPersonal.getText().equals("")) {
                mat = pat.matcher(tfTPersonal.getText());
                if (mat.matches()==false)
                    throw new DatoLogicoException("telefono personal");
            }
            pat = Pattern.compile("^([0-9]{1}|[0-9]{2})$");
            mat = pat.matcher(tfPiso.getText());
            if (mat.matches()==false)
                throw new DatoLogicoException("piso");
            mat = pat.matcher(tfPortal.getText());
            if (mat.matches()==false)
                throw new DatoLogicoException("portal");
            pat = Pattern.compile("^(Izq|Dch|izq|dch)$");
            mat = pat.matcher(tfMano.getText());
            if (mat.matches()==false)
                throw new DatoLogicoException("mano");
            if (!tfSalario.getText().equals("")) {
                pat = Pattern.compile("^[0-9]{1,}(|.[0-9]{1,})$");
                mat = pat.matcher(tfSalario.getText());
                if (mat.matches()==false)
                    throw new DatoLogicoException("salario");
            }
            return true;
        } catch (DatoLogicoException e) {
            JOptionPane.showMessageDialog(this, "El campo de "+DatoLogicoException.getMensaje()+" no está bien escrito");
        }
        return false;
    }
    
    public void mostrarDatos(String dni) {
        if (GestionPartes.mostrarDatosTrabajador(dni)) {
            JOptionPane.showMessageDialog(this, "Se ha encontrado un trabajador con ese DNI");
            Trabajador tra = GestionPartes.getTrabajadorActual();
            tfNombre.setText(tra.getNombre());
            tfApeUno.setText(tra.getApeuno());
            tfApeDos.setText(tra.getApedos());
            tfCalle.setText(tra.getDireccion().getCalle());
            tfPortal.setText(tra.getDireccion().getNumero()+"");
            tfPiso.setText(tra.getDireccion().getPiso()+"");
            tfMano.setText(tra.getDireccion().getMano());
            if (tra.getTelefonoPersonal()!=null)
                tfTPersonal.setText(tra.getTelefonoPersonal());
            tfTEmpresa.setText(tra.getTelefonoEmpresa());
            if (tra.getSalario()!=null)
                tfSalario.setText(tra.getSalario()+"");
            if (tra.getTipo().equalsIgnoreCase("Logistica")) cbTipo.setSelectedIndex(0);
            else cbTipo.setSelectedIndex(1);
            /*if (tra.getFechaNac()!=null)
                poner fecha guay */
            cbCentro.setSelectedItem(tra.getCodigo().getNombre()); // ¿?¿?¿?
        }
    }
    
    public boolean comprobarTextos() {
        try {
            if (tfDni.getText().isEmpty())
                throw new VacioException("dni");
            if (tfNombre.getText().isEmpty())
                throw new VacioException("nombre");
            if (tfApeUno.getText().isEmpty())
                throw new VacioException("primer apellido");
            if (tfApeDos.getText().isEmpty())
                throw new VacioException("segundo apellido");
            if (tfCalle.getText().isEmpty())
                throw new VacioException("calle");
            if (tfPortal.getText().isEmpty())
                throw new VacioException("portal");
            if (tfPiso.getText().isEmpty())
                throw new VacioException("piso");
            if (tfMano.getText().isEmpty())
                throw new VacioException("mano");
            if (tfTEmpresa.getText().isEmpty())
                throw new VacioException("telefono empresa");
            if (cbCentro.getSelectedIndex()==-1)
                throw new VacioException("centro");
            return true;
        }
        catch (VacioException e){
            JOptionPane.showMessageDialog(this, "El campo de "+VacioException.getMensaje()+" está vacio");
        }
        return false;
    }
    
    public void borrarTextos() {
        Calendar c1 = Calendar.getInstance();
        tfDni.setText("");
        tfNombre.setText("");
        tfApeUno.setText("");
        tfApeDos.setText("");
        tfCalle.setText("");
        tfPortal.setText("");
        tfPiso.setText("");
        tfMano.setText("");
        tfTEmpresa.setText("");
        tfTPersonal.setText("");
        tfSalario.setText("");
        cbTipo.setSelectedIndex(-1);
        dcFNacimiento.setSelectedDate(c1);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAlta;
    private javax.swing.JButton bBaja;
    private javax.swing.JButton bModificar;
    private javax.swing.JButton bSalir;
    private javax.swing.JComboBox<String> cbCentro;
    private javax.swing.JComboBox<String> cbTipo;
    private datechooser.beans.DateChooserCombo dcFNacimiento;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField tfApeDos;
    private javax.swing.JTextField tfApeUno;
    private javax.swing.JTextField tfCalle;
    private javax.swing.JTextField tfDni;
    private javax.swing.JTextField tfMano;
    private javax.swing.JTextField tfNombre;
    private javax.swing.JTextField tfPiso;
    private javax.swing.JTextField tfPortal;
    private javax.swing.JTextField tfSalario;
    private javax.swing.JTextField tfTEmpresa;
    private javax.swing.JTextField tfTPersonal;
    // End of variables declaration//GEN-END:variables
    private ArrayList<String> centrosArray;
    private boolean cheked=false;
}
