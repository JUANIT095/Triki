/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiktak;

import java.awt.Color;
import javax.swing.JLabel;

/**
 *
 * @author ojigb
 */
public class Vista extends javax.swing.JFrame {

    /**
     * Creates new form Vista
     */
    boolean estado = true;// si es true se puede escribir :D
    String siguientejuego="O";
    String turno = "X";
    JLabel lbs[] = new JLabel[9];
    int vs[][] = {
        {1, 2, 3},
        {4, 5, 6},
        {7, 8, 9},
        {1, 4, 7},
        {2, 5, 8},
        {3, 6, 9},
        {1, 5, 9},
        {3, 5, 7}
    };

    public Vista() {
        initComponents();

        this.setLocationRelativeTo(null);
        lbs[0] = lb_1;
        lbs[1] = lb_2;
        lbs[2] = lb_3;
        lbs[3] = lb_4;
        lbs[4] = lb_5;
        lbs[5] = lb_6;
        lbs[6] = lb_7;
        lbs[7] = lb_8;
        lbs[8] = lb_9;

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lb_1 = new javax.swing.JLabel();
        lb_2 = new javax.swing.JLabel();
        lb_3 = new javax.swing.JLabel();
        lb_6 = new javax.swing.JLabel();
        lb_5 = new javax.swing.JLabel();
        lb_4 = new javax.swing.JLabel();
        lb_8 = new javax.swing.JLabel();
        lb_9 = new javax.swing.JLabel();
        lb_7 = new javax.swing.JLabel();
        Reincio = new javax.swing.JButton();
        lb_turno = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        puntajeX = new javax.swing.JLabel();
        PuntajeO = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Triki");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));

        jPanel2.setBackground(new java.awt.Color(51, 51, 255));

        lb_1.setBackground(new java.awt.Color(255, 153, 153));
        lb_1.setFont(new java.awt.Font("Viner Hand ITC", 1, 36)); // NOI18N
        lb_1.setForeground(new java.awt.Color(51, 51, 51));
        lb_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lb_1.setOpaque(true);
        lb_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lb_1MousePressed(evt);
            }
        });

        lb_2.setBackground(new java.awt.Color(255, 153, 153));
        lb_2.setFont(new java.awt.Font("Viner Hand ITC", 1, 36)); // NOI18N
        lb_2.setForeground(new java.awt.Color(51, 51, 51));
        lb_2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lb_2.setOpaque(true);
        lb_2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lb_2MousePressed(evt);
            }
        });

        lb_3.setBackground(new java.awt.Color(255, 153, 153));
        lb_3.setFont(new java.awt.Font("Viner Hand ITC", 1, 36)); // NOI18N
        lb_3.setForeground(new java.awt.Color(51, 51, 51));
        lb_3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lb_3.setOpaque(true);
        lb_3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lb_3MousePressed(evt);
            }
        });

        lb_6.setBackground(new java.awt.Color(255, 153, 153));
        lb_6.setFont(new java.awt.Font("Viner Hand ITC", 1, 36)); // NOI18N
        lb_6.setForeground(new java.awt.Color(51, 51, 51));
        lb_6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lb_6.setOpaque(true);
        lb_6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lb_6MousePressed(evt);
            }
        });

        lb_5.setBackground(new java.awt.Color(255, 153, 153));
        lb_5.setFont(new java.awt.Font("Viner Hand ITC", 1, 36)); // NOI18N
        lb_5.setForeground(new java.awt.Color(51, 51, 51));
        lb_5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lb_5.setOpaque(true);
        lb_5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lb_5MousePressed(evt);
            }
        });

        lb_4.setBackground(new java.awt.Color(255, 153, 153));
        lb_4.setFont(new java.awt.Font("Viner Hand ITC", 1, 36)); // NOI18N
        lb_4.setForeground(new java.awt.Color(51, 51, 51));
        lb_4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lb_4.setOpaque(true);
        lb_4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lb_4MousePressed(evt);
            }
        });

        lb_8.setBackground(new java.awt.Color(255, 153, 153));
        lb_8.setFont(new java.awt.Font("Viner Hand ITC", 1, 36)); // NOI18N
        lb_8.setForeground(new java.awt.Color(51, 51, 51));
        lb_8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_8.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lb_8.setOpaque(true);
        lb_8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lb_8MousePressed(evt);
            }
        });

        lb_9.setBackground(new java.awt.Color(255, 153, 153));
        lb_9.setFont(new java.awt.Font("Viner Hand ITC", 1, 36)); // NOI18N
        lb_9.setForeground(new java.awt.Color(51, 51, 51));
        lb_9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_9.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lb_9.setOpaque(true);
        lb_9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lb_9MousePressed(evt);
            }
        });

        lb_7.setBackground(new java.awt.Color(255, 153, 153));
        lb_7.setFont(new java.awt.Font("Viner Hand ITC", 1, 36)); // NOI18N
        lb_7.setForeground(new java.awt.Color(51, 51, 51));
        lb_7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_7.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lb_7.setOpaque(true);
        lb_7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lb_7MousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(lb_1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(lb_2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(lb_3, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(lb_4, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(lb_5, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(lb_6, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(lb_7, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(lb_8, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(lb_9, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb_1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_3, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb_4, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_5, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_6, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb_7, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_8, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_9, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        Reincio.setBackground(new java.awt.Color(255, 153, 153));
        Reincio.setForeground(new java.awt.Color(0, 204, 255));
        Reincio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/sincronizacion.png"))); // NOI18N
        Reincio.setBorderPainted(false);
        Reincio.setContentAreaFilled(false);
        Reincio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Reincio.setOpaque(false);
        Reincio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReincioActionPerformed(evt);
            }
        });

        lb_turno.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lb_turno.setForeground(new java.awt.Color(51, 51, 51));
        lb_turno.setText("Turno de X");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("X:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("O:");

        puntajeX.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        puntajeX.setForeground(new java.awt.Color(51, 51, 51));
        puntajeX.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        puntajeX.setText("0");

        PuntajeO.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        PuntajeO.setForeground(new java.awt.Color(51, 51, 51));
        PuntajeO.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        PuntajeO.setText("0");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lb_turno, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(177, 177, 177)
                                .addComponent(Reincio, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(jLabel1)
                        .addGap(6, 6, 6)
                        .addComponent(puntajeX)
                        .addGap(34, 34, 34)
                        .addComponent(jLabel2)
                        .addGap(11, 11, 11)
                        .addComponent(PuntajeO)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb_turno, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(Reincio, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(puntajeX)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PuntajeO, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lb_1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_1MousePressed
        presionar(1);
    }//GEN-LAST:event_lb_1MousePressed

    private void lb_2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_2MousePressed
        presionar(2);
    }//GEN-LAST:event_lb_2MousePressed

    private void lb_3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_3MousePressed
        presionar(3);
    }//GEN-LAST:event_lb_3MousePressed

    private void lb_6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_6MousePressed
        presionar(6);
    }//GEN-LAST:event_lb_6MousePressed

    private void lb_5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_5MousePressed
        presionar(5);
    }//GEN-LAST:event_lb_5MousePressed

    private void lb_4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_4MousePressed
        presionar(4);
    }//GEN-LAST:event_lb_4MousePressed

    private void lb_8MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_8MousePressed
        presionar(8);
    }//GEN-LAST:event_lb_8MousePressed

    private void lb_9MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_9MousePressed
        presionar(9);
    }//GEN-LAST:event_lb_9MousePressed

    private void lb_7MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_7MousePressed
        presionar(7);
    }//GEN-LAST:event_lb_7MousePressed

    private void ReincioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReincioActionPerformed
        for (JLabel lb : lbs) {
            lb.setText("");
            lb.setBackground(Color.decode("#FF9999"));   
        }
        turno=siguientejuego;
        if(siguientejuego.equals("O")){
            siguientejuego="X";          
        }else{
            siguientejuego="O";
        }
        lb_turno.setText("Turno --> "+turno);
        estado=true;
    }//GEN-LAST:event_ReincioActionPerformed

    public void presionar(int casilla) {
        if (lbs[casilla - 1].getText().equals("")&& estado) {
            lbs[casilla - 1].setText(turno);
            cambiarturno();
            comprobarGanador();
        }
    }

    public void cambiarturno() {
        if (turno.equals("X")) {
            turno = "O";
        } else {
            turno = "X";
        }
        lb_turno.setText("Turno --> "+turno);
    }
    

    public void comprobarGanador() {
        for (int i = 0; i < vs.length; i++) {
            if (lbs[vs[i][0] - 1].getText().equals("X")
                    && lbs[vs[i][1] - 1].getText().equals("X")
                    && lbs[vs[i][2] - 1].getText().equals("X")) {

                lbs[vs[i][0] - 1].setBackground(Color.green);
                lbs[vs[i][1] - 1].setBackground(Color.green);
                lbs[vs[i][2] - 1].setBackground(Color.green);
                puntajeX.setText(Integer.toString(Integer.parseInt(puntajeX.getText())+1));
                lb_turno.setText("Ha ganado X");
                estado=false;

            }
            if (lbs[vs[i][0] - 1].getText().equals("O")
                    && lbs[vs[i][1] - 1].getText().equals("O")
                    && lbs[vs[i][2] - 1].getText().equals("O")) {
                
                lbs[vs[i][0] - 1].setBackground(Color.green);
                lbs[vs[i][1] - 1].setBackground(Color.green);
                lbs[vs[i][2] - 1].setBackground(Color.green);
                PuntajeO.setText(Integer.toString(Integer.parseInt(PuntajeO.getText())+1));
                lb_turno.setText("Ha ganado O");
                estado=false;
            }

        }
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
    private javax.swing.JLabel PuntajeO;
    private javax.swing.JButton Reincio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lb_1;
    private javax.swing.JLabel lb_2;
    private javax.swing.JLabel lb_3;
    private javax.swing.JLabel lb_4;
    private javax.swing.JLabel lb_5;
    private javax.swing.JLabel lb_6;
    private javax.swing.JLabel lb_7;
    private javax.swing.JLabel lb_8;
    private javax.swing.JLabel lb_9;
    private javax.swing.JLabel lb_turno;
    private javax.swing.JLabel puntajeX;
    // End of variables declaration//GEN-END:variables
}
