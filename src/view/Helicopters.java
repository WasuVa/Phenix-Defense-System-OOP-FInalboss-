package view;

import controller.Controller;
import javax.swing.JOptionPane;
import model.DefenseObserver;


public class Helicopters extends javax.swing.JFrame implements DefenseObserver{
    
    private Controller controller;
    private MainController mainController;
    private int ammo=1000;

    public Helicopters(Controller controller, MainController mainController) {
        initComponents();
        setLocationRelativeTo(this);
        setTitle("Helicopter");
        setResizable(false);
        ammoSpin.setValue(1000);
        
    }
    
@Override
    public void updateMessage(String message) {
        txtHelli.append(message + "\n");
    }

    @Override
    public void clearArea(boolean clear) {
        if (clear == true) {
            lblWorn.setText("Area Cleared");
            redpnl.setVisible(false);
            greenpnl.setVisible(true);
        } else {
            lblWorn.setText("Area Not Cleared");
            redpnl.setVisible(true);
            greenpnl.setVisible(false);
        }
    }

    @Override
    public void buttonEnable(int value) {
        if (ChkBHeli.isSelected() == true) {
            sliderHeli.setValue(value);
            if (value<=25) {
                lblWorn2.setText("LOW");
            }else if (value<=65) {
                lblWorn2.setText("MEDIUM");
            }else{
                lblWorn2.setText("CRITICAL");
            }
            if (value >= 0 || 30 <= value) {
                btnShtHeli1.setEnabled(true);
                btnMissHeli.setEnabled(false);
                btnLOHeli.setEnabled(false);
            }
            if (value >= 31 || 65 <= value) {
                btnLOHeli.setEnabled(true);
                btnShtHeli1.setEnabled(true);
                btnMissHeli.setEnabled(false);
            }
            if (value >= 65) {
                btnMissHeli.setEnabled(true);
                btnLOHeli.setEnabled(true);
                btnShtHeli1.setEnabled(true);
            }
        }
    }
    
    public String getAmmoCount() {
        return ammo + "";
    }

    public String getPosition() {
        return sliderHeli.getValue() + "";
    }

    public void sendPrivateMessage(String message) {
        txtHelli.append(message + "\n");
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        sliderHeli = new javax.swing.JSlider();
        lblWorn = new javax.swing.JLabel();
        btnMissHeli = new javax.swing.JButton();
        btnReload = new javax.swing.JButton();
        btnLOHeli = new javax.swing.JButton();
        txtHelli = new java.awt.TextArea();
        btnSndHeli = new javax.swing.JButton();
        ChkBHeli = new javax.swing.JCheckBox();
        ammoSpin = new javax.swing.JSpinner();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        redpnl = new javax.swing.JPanel();
        greenpnl = new javax.swing.JPanel();
        MsgHeli = new javax.swing.JTextField();
        btnShtHeli1 = new javax.swing.JButton();
        lblWorn2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Helicopter");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        sliderHeli.setOrientation(javax.swing.JSlider.VERTICAL);
        sliderHeli.setValue(0);
        jPanel1.add(sliderHeli, new org.netbeans.lib.awtextra.AbsoluteConstraints(716, 37, -1, 440));

        lblWorn.setBackground(new java.awt.Color(255, 51, 0));
        lblWorn.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblWorn.setForeground(new java.awt.Color(0, 0, 0));
        lblWorn.setText("Area Not Cleard");
        jPanel1.add(lblWorn, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 205, -1));

        btnMissHeli.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnMissHeli.setText("Missile Operation");
        btnMissHeli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMissHeliActionPerformed(evt);
            }
        });
        jPanel1.add(btnMissHeli, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 187, 41));

        btnReload.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnReload.setText("RELOAD");
        btnReload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReloadActionPerformed(evt);
            }
        });
        jPanel1.add(btnReload, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 70, -1, 41));

        btnLOHeli.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnLOHeli.setText("Laser Operation");
        btnLOHeli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLOHeliActionPerformed(evt);
            }
        });
        jPanel1.add(btnLOHeli, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 187, 41));
        jPanel1.add(txtHelli, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 201, 666, 190));

        btnSndHeli.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnSndHeli.setForeground(new java.awt.Color(0, 0, 0));
        btnSndHeli.setText("Send");
        btnSndHeli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSndHeliActionPerformed(evt);
            }
        });
        jPanel1.add(btnSndHeli, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 430, 80, -1));

        ChkBHeli.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        ChkBHeli.setForeground(new java.awt.Color(0, 0, 0));
        ChkBHeli.setText("Position");
        ChkBHeli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChkBHeliActionPerformed(evt);
            }
        });
        jPanel1.add(ChkBHeli, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 140, -1, -1));
        jPanel1.add(ammoSpin, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 40, 49, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Ammo Count");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 40, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/bakcImg.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, 100));

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

        jPanel1.add(redpnl, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, 140, 30));

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

        jPanel1.add(greenpnl, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, 90, -1));
        jPanel1.add(MsgHeli, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 426, 590, 40));

        btnShtHeli1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnShtHeli1.setText("Shoot");
        btnShtHeli1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShtHeli1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnShtHeli1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 187, 41));

        lblWorn2.setBackground(new java.awt.Color(255, 51, 0));
        lblWorn2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblWorn2.setForeground(new java.awt.Color(0, 0, 0));
        lblWorn2.setText("--------");
        jPanel1.add(lblWorn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 10, 190, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 778, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 495, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSndHeliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSndHeliActionPerformed
        mainController.getHelicoperMessage(MsgHeli.getText());
        txtHelli.append("Me :"+MsgHeli.getText()+"\n");
        MsgHeli.setText("");
    }//GEN-LAST:event_btnSndHeliActionPerformed

    private void ChkBHeliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChkBHeliActionPerformed
        lblWorn2.setText("--------");
    }//GEN-LAST:event_ChkBHeliActionPerformed

    private void btnReloadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReloadActionPerformed
        ammo=(int)ammoSpin.getValue();
        JOptionPane.showMessageDialog(this, "Reloaded....");
        if (ammo>19) {
            btnShtHeli1.setEnabled(true);
        }if (ammo>49) {
            btnLOHeli.setEnabled(true);
        }if (ammo>99) {
            btnMissHeli.setEnabled(true);
        }
    }//GEN-LAST:event_btnReloadActionPerformed

    private void btnShtHeli1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShtHeli1ActionPerformed
        if (ammo>=20) {
            ammo-=20;
            ammoSpin.setValue(ammo);
            JOptionPane.showMessageDialog(this, "TARGETED(AMMO)");
        }else{
            JOptionPane.showMessageDialog(this, "RUNNING OUT AMMO...\n Need Reaload");
            btnShtHeli1.setEnabled(false);
        }
    }//GEN-LAST:event_btnShtHeli1ActionPerformed

    private void btnLOHeliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLOHeliActionPerformed
        if (ammo>=50) {
            ammo-=50;
            ammoSpin.setValue(ammo);
            JOptionPane.showMessageDialog(this, "TARGETED(LASER)");
        }else{
            JOptionPane.showMessageDialog(this, "RUNNING OUT AMMO...\n Need Reaload");
            btnLOHeli.setEnabled(false);
        }
    }//GEN-LAST:event_btnLOHeliActionPerformed

    private void btnMissHeliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMissHeliActionPerformed
        if (ammo>=100) {
            ammo-=100;
            ammoSpin.setValue(ammo);
            JOptionPane.showMessageDialog(this, "TARGETED(MISSILE)");
        }else{
            JOptionPane.showMessageDialog(this, "RUNNING OUT AMMO...\n Need Reaload");
            btnMissHeli.setEnabled(false);
        }
    }//GEN-LAST:event_btnMissHeliActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox ChkBHeli;
    private javax.swing.JTextField MsgHeli;
    private javax.swing.JSpinner ammoSpin;
    private javax.swing.JButton btnLOHeli;
    private javax.swing.JButton btnMissHeli;
    private javax.swing.JButton btnReload;
    private javax.swing.JButton btnShtHeli1;
    private javax.swing.JButton btnSndHeli;
    private javax.swing.JPanel greenpnl;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblWorn;
    private javax.swing.JLabel lblWorn2;
    private javax.swing.JPanel redpnl;
    private javax.swing.JSlider sliderHeli;
    private java.awt.TextArea txtHelli;
    // End of variables declaration//GEN-END:variables
}
