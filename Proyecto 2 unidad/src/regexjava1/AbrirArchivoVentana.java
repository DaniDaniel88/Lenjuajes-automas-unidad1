package regexjava1;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.util.Scanner;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AbrirArchivoVentana extends javax.swing.JFrame {

    JFileChooser seleccionar = new JFileChooser();
    File archivo;
    FileInputStream entrada;
    FileOutputStream salida;

    /**
     * Creates new form AbrirArchivoVentana
     */
    public AbrirArchivoVentana() {
        initComponents();
    }

    public String abrirArchivo(File archivo) {
        String documento = "";
        try {
            entrada = new FileInputStream(archivo);
            int ascc1;
            while ((ascc1 = entrada.read()) != -1) {
                char caracter = (char) ascc1;
                documento += caracter;
            }
        } catch (Exception e) {
        }
        return documento;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AbrirTxt = new javax.swing.JButton();
        palabrasSimilares = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TxtArea = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        buscarReemplazar = new javax.swing.JButton();
        Mayuscula = new javax.swing.JButton();
        resultado = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        expresionMatematica = new javax.swing.JButton();
        palabarasRepetidas = new javax.swing.JButton();
        minuscula = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        AbrirTxt.setBackground(new java.awt.Color(255, 102, 102));
        AbrirTxt.setFont(new java.awt.Font("Broadway", 0, 11)); // NOI18N
        AbrirTxt.setForeground(new java.awt.Color(0, 102, 102));
        AbrirTxt.setText("Open File");
        AbrirTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AbrirTxtActionPerformed(evt);
            }
        });

        palabrasSimilares.setText("Palabras Similares");
        palabrasSimilares.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                palabrasSimilaresActionPerformed(evt);
            }
        });

        TxtArea.setColumns(20);
        TxtArea.setRows(5);
        jScrollPane1.setViewportView(TxtArea);

        jLabel1.setText("Lista de opciones");

        buscarReemplazar.setText("Buscar y reemplazar");
        buscarReemplazar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarReemplazarActionPerformed(evt);
            }
        });

        Mayuscula.setText("Mayusculas");
        Mayuscula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MayusculaActionPerformed(evt);
            }
        });

        resultado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resultadoActionPerformed(evt);
            }
        });

        jLabel2.setText("Resultado de la seleccion");

        expresionMatematica.setText("Expresion matematica");
        expresionMatematica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                expresionMatematicaActionPerformed(evt);
            }
        });

        palabarasRepetidas.setText("Eliminar Palabras repetidas");
        palabarasRepetidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                palabarasRepetidasActionPerformed(evt);
            }
        });

        minuscula.setText("Minisculas");
        minuscula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minusculaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(resultado, javax.swing.GroupLayout.PREFERRED_SIZE, 672, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(4, 4, 4))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 464, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AbrirTxt, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(palabarasRepetidas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(palabrasSimilares, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(buscarReemplazar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Mayuscula, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(expresionMatematica, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(minuscula, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AbrirTxt)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(palabrasSimilares)
                        .addGap(18, 18, 18)
                        .addComponent(palabarasRepetidas)
                        .addGap(18, 18, 18)
                        .addComponent(buscarReemplazar)
                        .addGap(18, 18, 18)
                        .addComponent(Mayuscula)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(minuscula)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(expresionMatematica))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(resultado, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AbrirTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AbrirTxtActionPerformed
        if (seleccionar.showDialog(null, "abrir") == JFileChooser.APPROVE_OPTION) {
            archivo = seleccionar.getSelectedFile();
            if (archivo.canRead()) {
                if (archivo.getName().endsWith("txt")) {
                    String documento = abrirArchivo(archivo);
                    TxtArea.setText(documento);
                } else {
                    JOptionPane.showMessageDialog(null, "Archivo no compatible");
                }
            }
        }
    }//GEN-LAST:event_AbrirTxtActionPerformed

    private void palabrasSimilaresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_palabrasSimilaresActionPerformed
        String texto = "";
        texto = this.TxtArea.getText();
        String resulTex = texto;

        String Concatenar = "";

        String[] cadenas = resulTex.split("[ ]");

        String array[] = new String[cadenas.length];//para almacenar las palabras extraidas del texto dinamicamente
        int contar = 0;
        for (int i = 0; i < cadenas.length; i++) {
            array[i] = cadenas[i];
            contar = cadenas.length;

        }

        int x = 0;

        for (x = 0; x < contar; x++) {

            Pattern pat = Pattern.compile("(\\bArb+[a-zA-Z]+\\b)");//Patron para encotrar las palabras
            Matcher mat = pat.matcher(array[x]);
            if (mat.matches()) {
                //al detectar  la cadena o palabra no tiene un vocal al final ,, aumentaria ´+1
                Concatenar += " " + array[x];
            } else {

            }
        }
        resultado.setText(String.valueOf(Concatenar));

    }//GEN-LAST:event_palabrasSimilaresActionPerformed

    private void buscarReemplazarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarReemplazarActionPerformed
        String texto = "";
        texto = this.TxtArea.getText();
        String resulTex = texto;

        String Concatenar = "";
       
        StringBuffer buscar = new StringBuffer("Nota no pongan comas solo espacio");
        String patronBuscado = Pattern.quote(buscar.toString());

        StringBuffer reemplazar = new StringBuffer("No esposible poner comas ya que no los reconocera como caracter");
        String patronReemplazo = Matcher.quoteReplacement(reemplazar.toString());

        Pattern pat = Pattern.compile(patronBuscado, Pattern.CASE_INSENSITIVE | Pattern.UNICODE_CASE);
        Matcher mat = pat.matcher(resulTex);

        if (mat.find()) {
            resulTex = mat.replaceAll(patronReemplazo);
        } else {

        }
        resultado.setText(String.valueOf(resulTex));
    }//GEN-LAST:event_buscarReemplazarActionPerformed

    private void resultadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resultadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_resultadoActionPerformed

    private void expresionMatematicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_expresionMatematicaActionPerformed
        String texto = "";
        texto = this.TxtArea.getText();
        String resulTex = texto;

        String Concatenar = "";

        String[] cadenas = resulTex.split("[ ]");

        String array[] = new String[cadenas.length];//para almacenar las palabras extraidas del texto dinamicamente
        int contar = 0;
        for (int i = 0; i < cadenas.length; i++) {
            array[i] = cadenas[i];
            contar = cadenas.length;

        }

        int x = 0;

        for (x = 0; x < contar; x++) {

            Pattern pat = Pattern.compile("[0-9]+[+|*|/|*][0-9]+[=][0-9]+");//^Mu.+
            Matcher mat = pat.matcher(array[x]);
            if (mat.matches()) {
                Concatenar += " " + array[x];
            } else {

            }
        }
        resultado.setText(String.valueOf(Concatenar));

    }//GEN-LAST:event_expresionMatematicaActionPerformed

    private void palabarasRepetidasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_palabarasRepetidasActionPerformed

        String texto = "";
        texto = this.TxtArea.getText();
        String resulTex = texto;

        final String regex = "\\b(\\w+)(?> +\\1)+\\b";
        final Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);

        final String reemplazo = "$1";

        Matcher m = p.matcher(resulTex);

        //Se reemplazan todas las ocurrencias
        resulTex = m.replaceAll(reemplazo);
        resultado.setText(String.valueOf(resulTex));
    }//GEN-LAST:event_palabarasRepetidasActionPerformed

    private void MayusculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MayusculaActionPerformed
        String texto = "";
        texto = this.TxtArea.getText();
        String resulTex = texto;

        String Concatenar = "";

        String[] cadenas = resulTex.split("[ ]");

        String array[] = new String[cadenas.length];//para almacenar las palabras extraidas del texto dinamicamente
        int contar = 0;
        for (int i = 0; i < cadenas.length; i++) {
            array[i] = cadenas[i];
            contar = cadenas.length;

        }

        int x = 0;

        for (x = 0; x < contar; x++) {

            Pattern pat = Pattern.compile("[a-z A-Z]");//^Mu.+
            Matcher mat = pat.matcher(array[x]);
            if (mat.matches()) {
                
                Concatenar += " " + array[x];
                
               
            } 
                
            else
            {
               
            }
            resultado.setText(String.valueOf(resulTex.toUpperCase()));
        }

        
    }//GEN-LAST:event_MayusculaActionPerformed

    private void minusculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minusculaActionPerformed
        // TODO add your handling code here: String texto = "";
        String texto = "";
        texto = this.TxtArea.getText();
        String resulTex = texto;

        String Concatenar = "";

        String[] cadenas = resulTex.split("[ ]");

        String array[] = new String[cadenas.length];//para almacenar las palabras extraidas del texto dinamicamente
        int contar = 0;
        for (int i = 0; i < cadenas.length; i++) {
            array[i] = cadenas[i];
            contar = cadenas.length;

        }

        int x = 0;

        for (x = 0; x < contar; x++) {

            Pattern pat = Pattern.compile("[a-z A-Z]");//^Mu.+
            Matcher mat = pat.matcher(array[x]);
            if (mat.matches()) {
                
                Concatenar += " " + array[x];
                
               
            } 
                
            else
            {
               
            }
            resultado.setText(String.valueOf(resulTex.toLowerCase()));
        }
    }//GEN-LAST:event_minusculaActionPerformed

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
            java.util.logging.Logger.getLogger(AbrirArchivoVentana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AbrirArchivoVentana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AbrirArchivoVentana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AbrirArchivoVentana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AbrirArchivoVentana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AbrirTxt;
    private javax.swing.JButton Mayuscula;
    private javax.swing.JTextArea TxtArea;
    private javax.swing.JButton buscarReemplazar;
    private javax.swing.JButton expresionMatematica;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton minuscula;
    private javax.swing.JButton palabarasRepetidas;
    private javax.swing.JButton palabrasSimilares;
    private javax.swing.JTextField resultado;
    // End of variables declaration//GEN-END:variables
}
