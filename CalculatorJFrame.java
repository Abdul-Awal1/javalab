package mycalculator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Yeasmin Jahan
 */
public class CalculatorJFrame extends javax.swing.JFrame {

  double num1,num2,result;
  String operator,answer;
    public CalculatorJFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField_display = new javax.swing.JTextField();
        jButton_1 = new javax.swing.JButton();
        jButton_2 = new javax.swing.JButton();
        jButton_3 = new javax.swing.JButton();
        jButton_4 = new javax.swing.JButton();
        jButton_5 = new javax.swing.JButton();
        jButton_6 = new javax.swing.JButton();
        jButton_7 = new javax.swing.JButton();
        jButton_8 = new javax.swing.JButton();
        jButton_9 = new javax.swing.JButton();
        jButton_plus = new javax.swing.JButton();
        jButton_multipication = new javax.swing.JButton();
        jButton_divition = new javax.swing.JButton();
        jButton_minus = new javax.swing.JButton();
        jButton_zero = new javax.swing.JButton();
        jButton_equal = new javax.swing.JButton();
        jButton_Clear = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextField_display.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_displayActionPerformed(evt);
            }
        });

        jButton_1.setText("1");
        jButton_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_1ActionPerformed(evt);
            }
        });

        jButton_2.setText("2");
        jButton_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_2ActionPerformed(evt);
            }
        });

        jButton_3.setText("3");
        jButton_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_3ActionPerformed(evt);
            }
        });

        jButton_4.setText("4");
        jButton_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_4ActionPerformed(evt);
            }
        });

        jButton_5.setText("5");
        jButton_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_5ActionPerformed(evt);
            }
        });

        jButton_6.setText("6");
        jButton_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_6ActionPerformed(evt);
            }
        });

        jButton_7.setText("7");
        jButton_7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_7ActionPerformed(evt);
            }
        });

        jButton_8.setText("8");
        jButton_8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_8ActionPerformed(evt);
            }
        });

        jButton_9.setText("9");
        jButton_9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_9ActionPerformed(evt);
            }
        });

        jButton_plus.setText("+");
        jButton_plus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_plusActionPerformed(evt);
            }
        });

        jButton_multipication.setText("*");
        jButton_multipication.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_multipicationActionPerformed(evt);
            }
        });

        jButton_divition.setText("/");
        jButton_divition.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_divitionActionPerformed(evt);
            }
        });

        jButton_minus.setText("-");
        jButton_minus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_minusActionPerformed(evt);
            }
        });

        jButton_zero.setText("0");
        jButton_zero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_zeroActionPerformed(evt);
            }
        });

        jButton_equal.setText("=");
        jButton_equal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_equalActionPerformed(evt);
            }
        });

        jButton_Clear.setText("C");
        jButton_Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ClearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField_display)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton_zero)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton_Clear, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton_equal, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton_divition, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(4, 4, 4))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jButton_1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jButton_2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jButton_3))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jButton_4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jButton_5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jButton_6)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton_7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton_8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton_9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton_multipication, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButton_plus, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
                                    .addComponent(jButton_minus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(50, 50, 50))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jTextField_display, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_1)
                    .addComponent(jButton_2)
                    .addComponent(jButton_3)
                    .addComponent(jButton_plus))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_4)
                    .addComponent(jButton_5)
                    .addComponent(jButton_6)
                    .addComponent(jButton_minus))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_7)
                    .addComponent(jButton_8)
                    .addComponent(jButton_9)
                    .addComponent(jButton_multipication))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_divition)
                    .addComponent(jButton_zero)
                    .addComponent(jButton_equal)
                    .addComponent(jButton_Clear))
                .addContainerGap(58, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_2ActionPerformed
        String s =jTextField_display.getText();
         if(s.startsWith("0"))
        jTextField_display.setText("2");
       else
        jTextField_display.setText(s+"2");
    }//GEN-LAST:event_jButton_2ActionPerformed

    private void jButton_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_5ActionPerformed
        String s =jTextField_display.getText();
         if(s.startsWith("0"))
        jTextField_display.setText("5");
       else
        jTextField_display.setText(s+"5");
    }//GEN-LAST:event_jButton_5ActionPerformed

    private void jButton_8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_8ActionPerformed
        String s =jTextField_display.getText(); 
         if(s.startsWith("0"))
        jTextField_display.setText("8");
       else
        jTextField_display.setText(s+"8");
    }//GEN-LAST:event_jButton_8ActionPerformed

    private void jButton_equalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_equalActionPerformed
       num2=Double.parseDouble(jTextField_display.getText());
       switch(operator)
       {
           case "+":
               result=num1+num2;
               answer=String.format("%.0f",result);
                jTextField_display.setText(answer);
                break;
                
                
           case "-":
               result=num1-num2;
               answer=String.format("%.0f",result);
                jTextField_display.setText(answer);
                break;
                
                
           case "*":
               result=num1*num2;
              answer=String.format("%.0f",result);
                jTextField_display.setText(answer);
                break;
                
                
           case "/":
               double result=(num1)/num2;
                answer=String.format("%.0f",result);
                jTextField_display.setText(answer);
                break;
                
                
                
                
                
                
       }
    }//GEN-LAST:event_jButton_equalActionPerformed

    private void jButton_divitionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_divitionActionPerformed
        num1=Double.parseDouble(jTextField_display.getText());
        jTextField_display.setText("");
        operator="/";
    }//GEN-LAST:event_jButton_divitionActionPerformed

    private void jButton_9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_9ActionPerformed
        String s =jTextField_display.getText();
         if(s.startsWith("0"))
        jTextField_display.setText("9");
       else
        jTextField_display.setText(s+"9");
    }//GEN-LAST:event_jButton_9ActionPerformed

    private void jButton_7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_7ActionPerformed
       String s =jTextField_display.getText();
        if(s.startsWith("0"))
        jTextField_display.setText("7");
       else
        jTextField_display.setText(s+"7");
    }//GEN-LAST:event_jButton_7ActionPerformed

    private void jTextField_displayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_displayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_displayActionPerformed

    private void jButton_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_1ActionPerformed
       String s =jTextField_display.getText();
        if(s.startsWith("0"))
        jTextField_display.setText("1");
       else
        jTextField_display.setText(s+"1");
    }//GEN-LAST:event_jButton_1ActionPerformed

    private void jButton_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_3ActionPerformed
        String s =jTextField_display.getText();
         if(s.startsWith("0"))
        jTextField_display.setText("3");
       else
        jTextField_display.setText(s+"3");
    }//GEN-LAST:event_jButton_3ActionPerformed

    private void jButton_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_4ActionPerformed
        String s =jTextField_display.getText(); 
         if(s.startsWith("0"))
        jTextField_display.setText("4");
       else
           jTextField_display.setText(s+"4");
    }//GEN-LAST:event_jButton_4ActionPerformed

    private void jButton_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_6ActionPerformed
        String s =jTextField_display.getText();
         if(s.startsWith("0"))
        jTextField_display.setText("6");
       else
           jTextField_display.setText(s+"6");
    }//GEN-LAST:event_jButton_6ActionPerformed

    private void jButton_zeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_zeroActionPerformed
       String s =jTextField_display.getText();
       if(s.startsWith("0"))
        jTextField_display.setText("0");
       else
            jTextField_display.setText(s+"0");
    }//GEN-LAST:event_jButton_zeroActionPerformed

    private void jButton_plusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_plusActionPerformed
        num1=Double.parseDouble(jTextField_display.getText());
        jTextField_display.setText("");
        operator="+";
    }//GEN-LAST:event_jButton_plusActionPerformed

    private void jButton_minusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_minusActionPerformed
        num1=Double.parseDouble(jTextField_display.getText());
        jTextField_display.setText("");
        operator="-";
    }//GEN-LAST:event_jButton_minusActionPerformed

    private void jButton_multipicationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_multipicationActionPerformed
        num1=Double.parseDouble(jTextField_display.getText());
        jTextField_display.setText("");
        operator="*";
    }//GEN-LAST:event_jButton_multipicationActionPerformed

    private void jButton_ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ClearActionPerformed
         jTextField_display.setText("");
    }//GEN-LAST:event_jButton_ClearActionPerformed

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
            java.util.logging.Logger.getLogger(CalculatorJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalculatorJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalculatorJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalculatorJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalculatorJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_1;
    private javax.swing.JButton jButton_2;
    private javax.swing.JButton jButton_3;
    private javax.swing.JButton jButton_4;
    private javax.swing.JButton jButton_5;
    private javax.swing.JButton jButton_6;
    private javax.swing.JButton jButton_7;
    private javax.swing.JButton jButton_8;
    private javax.swing.JButton jButton_9;
    private javax.swing.JButton jButton_Clear;
    private javax.swing.JButton jButton_divition;
    private javax.swing.JButton jButton_equal;
    private javax.swing.JButton jButton_minus;
    private javax.swing.JButton jButton_multipication;
    private javax.swing.JButton jButton_plus;
    private javax.swing.JButton jButton_zero;
    private javax.swing.JTextField jTextField_display;
    // End of variables declaration//GEN-END:variables
}
