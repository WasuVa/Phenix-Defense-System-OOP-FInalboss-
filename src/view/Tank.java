package view;

import controller.Controller;
import javax.swing.JOptionPane;
import model.DefenseObserver;

public class Tank extends javax.swing.JFrame implements DefenseObserver{
    
    private Controller controller;
    private MainController mainController;
    private int soldirsCount;
    private int ammo=5000;
    private int battery=1000;
    private int missile=100;
    private int fuel;

    public Tank(Controller controller, MainController mainController) {
        initComponents();
        setLocationRelativeTo(this);
        this.setResizable(false);
        this.controller = controller;
        this.mainController = mainController;
        btnShoot.setEnabled(false);
        btnMissile.setEnabled(false);
        btnLaser.setEnabled(false);
        btnRotate.setEnabled(false);
        slidertank.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnLaser = new javax.swing.JButton();
        btnSndTnk = new javax.swing.JButton();
        potion = new javax.swing.JCheckBox();
        ammospiner = new javax.swing.JSpinner();
        jLabel3 = new javax.swing.JLabel();
        slidertank = new javax.swing.JSlider();
        lblArea = new javax.swing.JLabel();
        btnMissile = new javax.swing.JButton();
        txtTank = new java.awt.TextArea();
        btnShoot = new javax.swing.JButton();
        Msgtank = new javax.swing.JTextField();
        btnRotate = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        redpnl = new javax.swing.JPanel();
        greenpnl = new javax.swing.JPanel();
        lblWorn = new javax.swing.JLabel();
        btnReload = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        btryspiner = new javax.swing.JSpinner();
        jLabel6 = new javax.swing.JLabel();
        msilspiner = new javax.swing.JSpinner();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Tank");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnLaser.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnLaser.setText("Laser Operation");
        btnLaser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLaserActionPerformed(evt);
            }
        });
        jPanel1.add(btnLaser, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, 187, 41));

        btnSndTnk.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnSndTnk.setForeground(new java.awt.Color(0, 0, 0));
        btnSndTnk.setText("Send");
        btnSndTnk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSndTnkActionPerformed(evt);
            }
        });
        jPanel1.add(btnSndTnk, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 400, -1, -1));

        potion.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        potion.setForeground(new java.awt.Color(0, 0, 0));
        potion.setText("Position");
        jPanel1.add(potion, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 180, -1, -1));
        jPanel1.add(ammospiner, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 20, 49, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Ammo Count");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 20, -1, -1));

        slidertank.setOrientation(javax.swing.JSlider.VERTICAL);
        slidertank.setValue(0);
        jPanel1.add(slidertank, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 30, -1, 398));

        lblArea.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblArea.setForeground(new java.awt.Color(0, 0, 0));
        lblArea.setText("Area Not Cleard");
        jPanel1.add(lblArea, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 205, -1));

        btnMissile.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnMissile.setText("Missile Operation");
        jPanel1.add(btnMissile, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, 187, 41));
        jPanel1.add(txtTank, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 228, 675, 160));

        btnShoot.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnShoot.setText("Shoot");
        btnShoot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShootActionPerformed(evt);
            }
        });
        jPanel1.add(btnShoot, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, 187, 41));

        Msgtank.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jPanel1.add(Msgtank, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, 595, -1));

        btnRotate.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnRotate.setText("Rotate Shooting");
        btnRotate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRotateActionPerformed(evt);
            }
        });
        jPanel1.add(btnRotate, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, 187, 41));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/bakcImg.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, 100));

        redpnl.setBackground(new java.awt.Color(204, 0, 0));

        javax.swing.GroupLayout redpnlLayout = new javax.swing.GroupLayout(redpnl);
        redpnl.setLayout(redpnlLayout);
        redpnlLayout.setHorizontalGroup(
            redpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 140, Short.MAX_VALUE)
        );
        redpnlLayout.setVerticalGroup(
            redpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        jPanel1.add(redpnl, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, 140, 30));

        greenpnl.setBackground(new java.awt.Color(0, 204, 51));

        javax.swing.GroupLayout greenpnlLayout = new javax.swing.GroupLayout(greenpnl);
        greenpnl.setLayout(greenpnlLayout);
        greenpnlLayout.setHorizontalGroup(
            greenpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
        );
        greenpnlLayout.setVerticalGroup(
            greenpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        jPanel1.add(greenpnl, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, 90, -1));

        lblWorn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblWorn.setForeground(new java.awt.Color(0, 0, 0));
        lblWorn.setText("--------");
        jPanel1.add(lblWorn, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 10, 205, -1));

        btnReload.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnReload.setText("RELOAD");
        btnReload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReloadActionPerformed(evt);
            }
        });
        jPanel1.add(btnReload, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 120, -1, 41));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Battry Capacity");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 50, -1, -1));
        jPanel1.add(btryspiner, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 50, 49, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Missile Count");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 80, -1, -1));
        jPanel1.add(msilspiner, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 80, 49, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 810, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 455, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSndTnkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSndTnkActionPerformed
        mainController.getHelicoperMessage(Msgtank.getText());
        txtTank.append("Me :"+Msgtank.getText()+"\n");
        Msgtank.setText("");
    }//GEN-LAST:event_btnSndTnkActionPerformed

    private void btnShootActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShootActionPerformed
        if (ammo>=100) {
            ammo-=100;
            ammospiner.setValue(ammo);
            JOptionPane.showMessageDialog(this, "TARGETED(AMMO)");
        }else{
            JOptionPane.showMessageDialog(this, "RUNNING OUT AMMO...\n Need Reaload");
            btnShoot.setEnabled(false);
        }
    }//GEN-LAST:event_btnShootActionPerformed

    private void btnReloadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReloadActionPerformed
        ammo=(int)ammospiner.getValue();
        battery=(int)btryspiner.getValue();
        missile=(int)msilspiner.getValue();
        JOptionPane.showMessageDialog(this, "Reloaded....");
        if (ammo>99) {
            btnShoot.setEnabled(true);
        }if (ammo>299) {
            btnRotate.setEnabled(true);
        }if (battery>99) {
            btnLaser.setEnabled(true);
        }if (missile>1) {
            btnMissile.setEnabled(true);
        }
    }//GEN-LAST:event_btnReloadActionPerformed

    private void btnRotateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRotateActionPerformed
        if (ammo>=300) {
            ammo-=300;
            ammospiner.setValue(ammo);
            JOptionPane.showMessageDialog(this, "TARGETED(AMMO)");
        }else{
            JOptionPane.showMessageDialog(this, "RUNNING OUT AMMO...\n Need Reaload");
            btnShoot.setEnabled(false);
        }
    }//GEN-LAST:event_btnRotateActionPerformed

    private void btnLaserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLaserActionPerformed
        if (battery>=300) {
            battery-=300;
            ammospiner.setValue(ammo);
            JOptionPane.showMessageDialog(this, "TARGETED(AMMO)");
        }else{
            JOptionPane.showMessageDialog(this, "RUNNING OUT AMMO...\n Need Reaload");
            btnShoot.setEnabled(false);
        }
    }//GEN-LAST:event_btnLaserActionPerformed

    @Override
    public void updateMessage(String message) {
        txtTank.append(message + "\n");
    }

    @Override
    public void clearArea(boolean clear) {
        if (clear == true) {
            lblArea.setText("Area Cleared");
            redpnl.setVisible(false);
            greenpnl.setVisible(true);
        } else {
            lblArea.setText("Area Not Cleared");
            redpnl.setVisible(true);
            greenpnl.setVisible(false);
        }
    }

    @Override
    public void buttonEnable(int value) {
        if (potion.isSelected() == true) {
            slidertank.setValue(value);
            if (value<=25) {
                lblWorn.setText("LOW");
            }else if (value<=65) {
                lblWorn.setText("MEDIUM");
            }else{
                lblWorn.setText("CRITICAL");
            }
            if (value >= 0 || 30 <= value) {
                btnShoot.setEnabled(true);
                btnRotate.setEnabled(true);
                btnLaser.setEnabled(false);
                btnMissile.setEnabled(false);
            }
            if (value >= 31 || 65 <= value) {
                btnShoot.setEnabled(true);
                btnRotate.setEnabled(true);
                btnLaser.setEnabled(true);
                btnMissile.setEnabled(false);
            }
            if (value >= 65) {
                btnShoot.setEnabled(true);
                btnRotate.setEnabled(true);
                btnLaser.setEnabled(true);
                btnMissile.setEnabled(true);
            }
        }
    }

    public String getSoldierCount() {
        return soldirsCount + "";
    }

    public String getAmmoCount() {
        return ammo + "";
    }

    public String getFuel() {
        return fuel + "";
    }

    public String getPosition() {
        return slidertank.getValue() + "";
    }

    public void sendPrivateMessage(String message) {
        txtTank.append(message + "\n");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Msgtank;
    private javax.swing.JSpinner ammospiner;
    private javax.swing.JButton btnLaser;
    private javax.swing.JButton btnMissile;
    private javax.swing.JButton btnReload;
    private javax.swing.JButton btnRotate;
    private javax.swing.JButton btnShoot;
    private javax.swing.JButton btnSndTnk;
    private javax.swing.JSpinner btryspiner;
    private javax.swing.JPanel greenpnl;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblArea;
    private javax.swing.JLabel lblWorn;
    private javax.swing.JSpinner msilspiner;
    private javax.swing.JCheckBox potion;
    private javax.swing.JPanel redpnl;
    private javax.swing.JSlider slidertank;
    private java.awt.TextArea txtTank;
    // End of variables declaration//GEN-END:variables

}
