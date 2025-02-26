/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package myTest;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 *
 * @author Josua EL
 */
public class QUIZ20077 extends javax.swing.JFrame {

    /**
     * Creates new form QUIZ20077
     */
    private Ball ball;
    private Timer timer;
    private boolean isPaused = false;
    private BallPanel ballPanel;
    
    public QUIZ20077() {
        initComponents();
        ball = new Ball(50, 50, 20, 5, 5);
        ballPanel = new BallPanel(ball);
        
        
    }
    
    public class Ball {
        private int x, y, radius;
        private int xVelocity, yVelocity;

        public Ball(int x, int y, int radius, int xVelocity, int yVelocity) {
            this.x = x;
            this.y = y;
            this.radius = radius;
            this.xVelocity = xVelocity;
            this.yVelocity = yVelocity;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }

        public int getRadius() {
            return radius;
        }

        public void move(JPanel panel) {
            x += xVelocity;
            y += yVelocity;
            
            if (x <= 0 || x >= panel.getWidth() - radius) {
                xVelocity = -xVelocity;
            }
            if (y <= 0 || y >= panel.getHeight() - radius) {
                yVelocity = -yVelocity;
            }
        }
    }
    
    public class BallPanel extends JPanel {
        private Ball ball;

        public BallPanel(Ball ball) {
            this.ball = ball;
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.setColor(Color.RED);
            g.fillOval(ball.getX(), ball.getY(), ball.getRadius(), ball.getRadius());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bounchingPannel = new javax.swing.JPanel();
        startButton = new javax.swing.JToggleButton();
        pauseButton = new javax.swing.JToggleButton();
        resumeButton = new javax.swing.JToggleButton();
        exitButton = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bounchingPannel.setBackground(new java.awt.Color(0, 51, 102));
        bounchingPannel.setPreferredSize(new java.awt.Dimension(500, 400));

        javax.swing.GroupLayout bounchingPannelLayout = new javax.swing.GroupLayout(bounchingPannel);
        bounchingPannel.setLayout(bounchingPannelLayout);
        bounchingPannelLayout.setHorizontalGroup(
            bounchingPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );
        bounchingPannelLayout.setVerticalGroup(
            bounchingPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );

        startButton.setText("START");
        startButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startButtonActionPerformed(evt);
            }
        });

        pauseButton.setText("PAUSE");
        pauseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pauseButtonActionPerformed(evt);
            }
        });

        resumeButton.setText("RESUME");
        resumeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resumeButtonActionPerformed(evt);
            }
        });

        exitButton.setText("EXIT");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(bounchingPannel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(startButton, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56)
                        .addComponent(pauseButton, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57)
                        .addComponent(resumeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(exitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(bounchingPannel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(startButton, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pauseButton, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(resumeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(exitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void startButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startButtonActionPerformed
        timer = new Timer(30, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!isPaused) {
                    ball.move(bounchingPannel);
                    bounchingPannel.repaint();
                }
            }
        });
        timer.start();
    }//GEN-LAST:event_startButtonActionPerformed

    private void pauseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pauseButtonActionPerformed
        // TODO add your handling code here:
        isPaused = true;
    }//GEN-LAST:event_pauseButtonActionPerformed

    private void resumeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resumeButtonActionPerformed
        // TODO add your handling code here:
        isPaused = false;
    }//GEN-LAST:event_resumeButtonActionPerformed

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_exitButtonActionPerformed

    public class BallPanel extends JPanel {
        private Ball ball;

        public BallPanel(Ball ball) {
            this.ball = ball;
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.setColor(Color.RED);
            g.fillOval(ball.getX(), ball.getY(), ball.getRadius(), ball.getRadius());
        }
    }
    
    
    public class Ball {
        private int x, y, radius;
        private int xVelocity, yVelocity;

        public Ball(int x, int y, int radius, int xVelocity, int yVelocity) {
            this.x = x;
            this.y = y;
            this.radius = radius;
            this.xVelocity = xVelocity;
            this.yVelocity = yVelocity;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }

        public int getRadius() {
            return radius;
        }

        public void move(JPanel panel) {
            x += xVelocity;
            y += yVelocity;
            
            if (x <= 0 || x >= panel.getWidth() - radius) {
                xVelocity = -xVelocity;
            }
            if (y <= 0 || y >= panel.getHeight() - radius) {
                yVelocity = -yVelocity;
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
            java.util.logging.Logger.getLogger(QUIZ20077.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QUIZ20077.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QUIZ20077.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QUIZ20077.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QUIZ20077().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bounchingPannel;
    private javax.swing.JToggleButton exitButton;
    private javax.swing.JToggleButton pauseButton;
    private javax.swing.JToggleButton resumeButton;
    private javax.swing.JToggleButton startButton;
    // End of variables declaration//GEN-END:variables
}
