
package formularioalumno;

import javax.swing.JOptionPane;

public class Formulario extends javax.swing.JFrame {

    public Formulario() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        Nombre = new javax.swing.JLabel();
        Apellido = new javax.swing.JLabel();
        Teléfono = new javax.swing.JLabel();
        DNI = new javax.swing.JLabel();
        TextoNombre = new javax.swing.JTextField();
        TextoApellidos = new javax.swing.JTextField();
        NumTelefono = new javax.swing.JTextField();
        NumDNI = new javax.swing.JTextField();
        ValidaNumero = new javax.swing.JButton();
        ValidaDNI = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        jLabel1.setText("Formulario");

        jButton1.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        jButton1.setText("Enviar ");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153), 3), "Datos del Usuario", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Yu Gothic UI Light", 0, 18))); // NOI18N

        Nombre.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        Nombre.setText("Nombre");

        Apellido.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        Apellido.setText("Apellidos");

        Teléfono.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        Teléfono.setText("Teléfono");

        DNI.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        DNI.setText("DNI");

        TextoNombre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153), 3));

        TextoApellidos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153), 3));

        NumTelefono.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153), 3));
        NumTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NumTelefonoActionPerformed(evt);
            }
        });

        NumDNI.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153), 3));
        NumDNI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NumDNIActionPerformed(evt);
            }
        });

        ValidaNumero.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        ValidaNumero.setText("validar");
        ValidaNumero.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ValidaNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ValidaNumeroActionPerformed(evt);
            }
        });

        ValidaDNI.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        ValidaDNI.setText("validar");
        ValidaDNI.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ValidaDNI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ValidaDNIActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(Teléfono, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Apellido, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(TextoApellidos, javax.swing.GroupLayout.DEFAULT_SIZE, 333, Short.MAX_VALUE)
                            .addComponent(NumTelefono)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(DNI, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60)
                        .addComponent(NumDNI))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(TextoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ValidaDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ValidaNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Nombre)
                    .addComponent(TextoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Apellido)
                    .addComponent(TextoApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Teléfono)
                    .addComponent(NumTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ValidaNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DNI)
                    .addComponent(NumDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ValidaDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    /*METODO PARA VALIDACION DE NUMEROS EN LA ENTRADA NUMERO*/
    public static boolean validaNum(String datos){
        return datos.matches("[1-9]{9}");
        
    }//VALIDANUM
    
    /*FORMATO DNI QUE CONSTA DE NUEVE NUMEROS Y UNA LETRA*/
    private boolean validaDNI(String dni) {
        if (dni.length() == 9 && Character.isLetter(dni.charAt(8))) {
            String letraMayuscula = dni.substring(8).toUpperCase();
            if (soloNumeros(dni) && letraDNI(dni).equals(letraMayuscula)) {
                return true;
            }
        }else{
            
        }
        return false;
    }//VALIDADNI
    
    
    
    /*VALIDACIÓN DE SOLAMENTE NÚMEROS del DNI*/
    private boolean soloNumeros(String dni) {
        try {
            Integer.parseInt(dni.substring(0, 8)); 
            /*AQUI SE VERIFICA SI LOS PRIMERO 8 CARACTERES DEL STRING SON NUMERO*/
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }//SOLONUMEROS
    
    
    
    /*LETRAS CORRESPONDENTES AL DNI*/
    private String letraDNI(String dni) {
        int miDNI = Integer.parseInt(dni.substring(0, 8)); // Convertir los primeros 8 dígitos a número entero
        int resto = miDNI % 23;
        String[] asignacionLetra = {"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"};
        return asignacionLetra[resto];
    }//LETRADNI
    
    
    
    private void NumTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NumTelefonoActionPerformed
    }//GEN-LAST:event_NumTelefonoActionPerformed
    private void NumDNIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NumDNIActionPerformed
    }//GEN-LAST:event_NumDNIActionPerformed



    private void ValidaNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ValidaNumeroActionPerformed
        if(!validaNum(NumTelefono.getText().trim())){
            //TRIM PARA QUE NO EXISTA ESPACIOS EN BLANCO
            /*LA NEGACION SIRVE PARA QUE EL JOPTIONPANE SE PUEDA ACTIVAR BIEN, EN CASO DE
            NO ESTAR NEGADA, NADA MAS INICIAR EL CODIGO SALTARIA EL ERROR*/
            JOptionPane.showMessageDialog(rootPane,
                "Los datos introducidos en 'Numeros' son incorrectos"
                + "\n Por favor asegure de:"
                + "\n -Que conste de nueve numeros"
                + "\n -No introducir letras o caracteres especiales");
        }else{
            JOptionPane.showMessageDialog(rootPane, "Numero válido.");
        }
        //VALIDANUMEROACT...
    }//GEN-LAST:event_ValidaNumeroActionPerformed

    
    
    private void ValidaDNIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ValidaDNIActionPerformed
        String dniIngresado = NumDNI.getText().trim(); // SE OBTIENE EL DNI EN CADENA DE TEXTO

        if (validaDNI(dniIngresado)) {
            JOptionPane.showMessageDialog(rootPane, "DNI válido.");
        } else {
            JOptionPane.showMessageDialog(rootPane, "Numero de DNI inválido. "
                + "\nVerifica que esté bien escrito.");
        }
        //VALIDARDNIACT...
    }//GEN-LAST:event_ValidaDNIActionPerformed

    
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
   String nombre = TextoNombre.getText().trim();
    String apellidos = TextoApellidos.getText().trim();
    String telefono = NumTelefono.getText().trim();
    String dni = NumDNI.getText().trim();

    /*COMPROBAR SI LOS CAMPOS ESTAN REALMENTE LLENOS*/
    if (nombre.isEmpty() || apellidos.isEmpty() || telefono.isEmpty() || dni.isEmpty()) {
        JOptionPane.showMessageDialog(this, 
            "Por favor, completa todos los campos antes de enviar.", 
            "Advertencia", 
            JOptionPane.WARNING_MESSAGE);
        return; // No continúa con el envío de datos si algún campo está vacío
    }

    /*VARIABLES PARA MENSAJE DE ERROR, ACUMULARLAS EN ESE CASO*/
    StringBuilder mensajesError = new StringBuilder();

    /*ES LA MISMA VALIDACION, TAMBIEN LLAMA AL MÉTODO, 
    PERO SOLO ES PARA SALTAR EL AVISO EN CASO DE ERROR*/
    if (!validaNum(telefono)) {
        mensajesError.append("El número de teléfono es incorrecto.\n");
    }

    /*VALIDACION DEL DNI EN BOTON ENVIAR*/
    if (!validaDNI(dni)) {
        mensajesError.append("El DNI es inválido.\n");
    }

    // Si hay mensajes de error, los mostramos
    if (mensajesError.length() > 0) {
        JOptionPane.showMessageDialog(this, 
            mensajesError.toString(), 
            "Información", 
            JOptionPane.INFORMATION_MESSAGE);
        return; // No continúa si hay errores
    }

    // Si todas las validaciones pasaron, se procede a enviar los datos
    StringBuilder mensaje = new StringBuilder();
    mensaje.append("Datos del Usuario:\n");
    mensaje.append("Nombre: ").append(nombre).append("\n");
    mensaje.append("Apellidos: ").append(apellidos).append("\n");
    mensaje.append("Teléfono: ").append(telefono).append("\n");
    mensaje.append("DNI: ").append(dni).append("\n");

    JOptionPane.showMessageDialog(this, mensaje.toString(), "Información del Usuario", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jButton1ActionPerformed


    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {     
                new Formulario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Apellido;
    private javax.swing.JLabel DNI;
    private javax.swing.JLabel Nombre;
    private javax.swing.JTextField NumDNI;
    private javax.swing.JTextField NumTelefono;
    private javax.swing.JLabel Teléfono;
    private javax.swing.JTextField TextoApellidos;
    private javax.swing.JTextField TextoNombre;
    private javax.swing.JButton ValidaDNI;
    private javax.swing.JButton ValidaNumero;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
