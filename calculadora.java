/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareacalculadora;

/**
 *
 * @author Usuario1
 */
public class calculadora extends javax.swing.JFrame {
   
    String memoria1;
    String signo;
    String memoria2;
    

    /**
     * Creates new form calculadora
     */
    public calculadora() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtpantalla = new javax.swing.JTextField();
        jButton7 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        jLabelcalcu = new javax.swing.JLabel();
        jLabelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImages(null);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtpantalla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpantallaActionPerformed(evt);
            }
        });
        getContentPane().add(txtpantalla, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 357, 30));

        jButton7.setBackground(new java.awt.Color(0, 51, 51));
        jButton7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setText("Salir");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 0, 80, 30));

        jButton1.setBackground(new java.awt.Color(0, 153, 153));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("4");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 60, 56));

        jButton2.setBackground(new java.awt.Color(0, 153, 153));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("1");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 60, 56));

        jButton3.setBackground(new java.awt.Color(0, 153, 153));
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("0");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, 60, 56));

        jButton4.setBackground(new java.awt.Color(0, 153, 153));
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("7");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 60, 56));

        jButton5.setBackground(new java.awt.Color(0, 153, 153));
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("5");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 250, 60, 56));

        jButton6.setBackground(new java.awt.Color(0, 153, 153));
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("2");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, 60, 56));

        jButton11.setBackground(new java.awt.Color(0, 153, 153));
        jButton11.setForeground(new java.awt.Color(255, 255, 255));
        jButton11.setText("+/-");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 390, 60, 56));

        jButton12.setBackground(new java.awt.Color(0, 153, 153));
        jButton12.setForeground(new java.awt.Color(255, 255, 255));
        jButton12.setText("8");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 320, 60, 56));

        jButton13.setBackground(new java.awt.Color(0, 153, 153));
        jButton13.setForeground(new java.awt.Color(255, 255, 255));
        jButton13.setText("6");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 250, 60, 56));

        jButton14.setBackground(new java.awt.Color(0, 153, 153));
        jButton14.setForeground(new java.awt.Color(255, 255, 255));
        jButton14.setText("3");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton14, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 180, 60, 56));

        jButton15.setBackground(new java.awt.Color(0, 153, 153));
        jButton15.setForeground(new java.awt.Color(255, 255, 255));
        jButton15.setText(".");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton15, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 390, 60, 56));

        jButton16.setBackground(new java.awt.Color(0, 153, 153));
        jButton16.setForeground(new java.awt.Color(255, 255, 255));
        jButton16.setText("9");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton16, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 320, 60, 56));

        jButton17.setBackground(new java.awt.Color(0, 153, 153));
        jButton17.setForeground(new java.awt.Color(255, 255, 255));
        jButton17.setText("+");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton17, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 250, 60, 56));

        jButton18.setBackground(new java.awt.Color(0, 153, 153));
        jButton18.setForeground(new java.awt.Color(255, 255, 255));
        jButton18.setText("-");
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton18, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 180, 60, 56));

        jButton19.setBackground(new java.awt.Color(0, 153, 153));
        jButton19.setForeground(new java.awt.Color(255, 255, 255));
        jButton19.setText("/");
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton19, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 390, 60, 56));

        jButton20.setBackground(new java.awt.Color(0, 153, 153));
        jButton20.setForeground(new java.awt.Color(255, 255, 255));
        jButton20.setText("*");
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton20, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 320, 60, 56));

        jButton21.setBackground(new java.awt.Color(0, 153, 153));
        jButton21.setForeground(new java.awt.Color(255, 255, 255));
        jButton21.setText("C");
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton21, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 180, 60, 56));

        jButton22.setBackground(new java.awt.Color(0, 153, 153));
        jButton22.setForeground(new java.awt.Color(255, 255, 255));
        jButton22.setText("=");
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton22, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 390, 60, 56));

        jButton23.setBackground(new java.awt.Color(0, 153, 153));
        jButton23.setForeground(new java.awt.Color(255, 255, 255));
        jButton23.setText("1/x");
        jButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton23ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton23, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 320, 60, 56));

        jButton24.setBackground(new java.awt.Color(0, 153, 153));
        jButton24.setForeground(new java.awt.Color(255, 255, 255));
        jButton24.setText("CE");
        jButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton24ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton24, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 250, 60, 56));

        jLabelcalcu.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelcalcu.setForeground(new java.awt.Color(255, 255, 255));
        jLabelcalcu.setText("Calculadora");
        getContentPane().add(jLabelcalcu, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, 110, 60));

        jLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/3.jpg"))); // NOI18N
        getContentPane().add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 470));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        txtpantalla.setText(txtpantalla.getText()+"0");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        txtpantalla.setText(txtpantalla.getText()+"7");
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
        Double num;
        String cadena;
        cadena=txtpantalla.getText();
        if(cadena.length()>0){
            num=(-1)*Double.parseDouble(cadena);
            txtpantalla.setText(num.toString());
        }
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        // TODO add your handling code here
        txtpantalla.setText(txtpantalla.getText()+"8");
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        // TODO add your handling code here:
        String cadena;
        cadena=txtpantalla.getText();
        
        if(cadena.length()<0){
            txtpantalla.setText("0.");
        }else{
            if(!existepunto(txtpantalla.getText())){
                txtpantalla.setText(txtpantalla.getText()+".");
            }
        }
        
    }//GEN-LAST:event_jButton15ActionPerformed

    public static boolean existepunto(String cadena){
        boolean resultado;
        resultado=false;
        
        for (int i = 0; i <cadena.length(); i++) {
            if(cadena.substring(i, i+1).equals(".")){
                resultado=true;
                break;
            }
            
        }
        return resultado;
    }
    
    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        // TODO add your handling code here:
        txtpantalla.setText(txtpantalla.getText()+"9");
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
        // TODO add your handling code here:
          if(!txtpantalla.getText().equals("")){
            memoria1=txtpantalla.getText();
            signo="/";
            txtpantalla.setText("");
        }
    }//GEN-LAST:event_jButton19ActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
        // TODO add your handling code here:
          if(!txtpantalla.getText().equals("")){
            memoria1=txtpantalla.getText();
            signo="*";
            txtpantalla.setText("");
        }
    }//GEN-LAST:event_jButton20ActionPerformed

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
        // TODO add your handling code here:
          String resultado;
          memoria2= txtpantalla.getText();
          if(!memoria2.equals("")){
              resultado=calculadora(memoria1,memoria2,signo);
              txtpantalla.setText(resultado);
          }


    }//GEN-LAST:event_jButton22ActionPerformed
      public static String calculadora(String memoria1, String memoria2, String signo){
          Double resultado=0.0;
          String respuesta;
          
          if(signo.equals("-")){
              resultado=Double.parseDouble(memoria1)-Double.parseDouble(memoria2);
          }
          if(signo.equals("+")){
              resultado=Double.parseDouble(memoria1)+Double.parseDouble(memoria2);
          }
          if(signo.equals("*")){
              resultado=Double.parseDouble(memoria1)*Double.parseDouble(memoria2);
          }
          if(signo.equals("/")){
              resultado=Double.parseDouble(memoria1)/Double.parseDouble(memoria2);
          }
          respuesta=resultado.toString();
          return respuesta;
      }
    
    
    private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton23ActionPerformed
        // TODO add your handling code here:
        String cadena;
        Double num;
        cadena=txtpantalla.getText();
        if(cadena.length()>0){
            num=1/(Double.parseDouble(cadena));
            txtpantalla.setText(num.toString());
        }
    }//GEN-LAST:event_jButton23ActionPerformed

    private void txtpantallaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpantallaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpantallaActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
// TODO add your handling code here:
   txtpantalla.setText(txtpantalla.getText()+"1");

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        txtpantalla.setText(txtpantalla.getText()+"2");
        
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        // TODO add your handling code here:
        txtpantalla.setText(txtpantalla.getText()+"3");
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        txtpantalla.setText(txtpantalla.getText()+"4");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        txtpantalla.setText(txtpantalla.getText()+"5");
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        txtpantalla.setText(txtpantalla.getText()+"6");
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
        // TODO add your handling code here:
        String cadena;
        cadena=txtpantalla.getText();
        if(cadena.length()>0){
            cadena=cadena.substring(0, cadena.length()-1);
            txtpantalla.setText(cadena);
        }
    }//GEN-LAST:event_jButton21ActionPerformed

    private void jButton24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton24ActionPerformed
        // TODO add your handling code here:
        txtpantalla.setText("");
    }//GEN-LAST:event_jButton24ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        // TODO add your handling code here:
        if(!txtpantalla.getText().equals("")){
            memoria1=txtpantalla.getText();
            signo="-";
            txtpantalla.setText("");
        }
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        // TODO add your handling code here:
          if(!txtpantalla.getText().equals("")){
            memoria1=txtpantalla.getText();
            signo="+";
            txtpantalla.setText("");
        }
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton7ActionPerformed

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
            java.util.logging.Logger.getLogger(calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new calculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JLabel jLabelcalcu;
    private javax.swing.JTextField txtpantalla;
    // End of variables declaration//GEN-END:variables
}
