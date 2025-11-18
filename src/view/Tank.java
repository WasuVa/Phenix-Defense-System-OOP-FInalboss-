package view;

import controller.Controller;
import model.DefenseObserver;

public class Tank extends javax.swing.JFrame implements DefenseObserver{
    
    private Controller controller;
    private MainController mainController;
    private int soldirsCount;
    private int ammo;
    private int fuel = 100;
    private boolean engineRunning;

    public Tank(Controller controller, MainController mainController) {
        initComponents();
        setLocationRelativeTo(this);
        this.controller = controller;
        txtTank.setEditable(false);
        this.mainController = mainController;
        btnShoot.setEnabled(false);
        btnMissile.setEnabled(false);
        btnLaser.setEnabled(false);
        btnRotate.setEnabled(false);
        jSlider1.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnLaser = new javax.swing.JButton();
        btnSndTnk = new javax.swing.JButton();
        potion = new javax.swing.JCheckBox();
        jSpinner1 = new javax.swing.JSpinner();
        jSpinner2 = new javax.swing.JSpinner();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSlider1 = new javax.swing.JSlider();
        lblArea = new javax.swing.JLabel();
        btnMissile = new javax.swing.JButton();
        txtTank = new java.awt.TextArea();
        btnShoot = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        btnRotate = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Tank");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnLaser.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnLaser.setText("Laser Operation");
        jPanel1.add(btnLaser, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, 187, 41));

        btnSndTnk.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnSndTnk.setForeground(new java.awt.Color(0, 0, 0));
        btnSndTnk.setText("Send");
        jPanel1.add(btnSndTnk, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 400, -1, -1));

        potion.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        potion.setForeground(new java.awt.Color(0, 0, 0));
        potion.setText("Position");
        jPanel1.add(potion, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 140, -1, -1));
        jPanel1.add(jSpinner1, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 70, 49, -1));
        jPanel1.add(jSpinner2, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 100, 49, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Solder Count");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(557, 66, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Ammo Count");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(557, 100, -1, -1));

        jSlider1.setOrientation(javax.swing.JSlider.VERTICAL);
        jSlider1.setValue(0);
        jPanel1.add(jSlider1, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 30, -1, 398));

        lblArea.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblArea.setForeground(new java.awt.Color(0, 0, 0));
        lblArea.setText("Area Not Cleard");
        jPanel1.add(lblArea, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 205, -1));

        btnMissile.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnMissile.setText("Missile Operation");
        jPanel1.add(btnMissile, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, 187, 41));
        jPanel1.add(txtTank, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 228, 675, 160));

        btnShoot.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnShoot.setText("Shoot");
        jPanel1.add(btnShoot, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, 187, 41));

        jTextField1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, 595, -1));

        btnRotate.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnRotate.setText("Rotate Shooting");
        jPanel1.add(btnRotate, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, 187, 41));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/bakcImg.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, 100));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 455, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLaser;
    private javax.swing.JButton btnMissile;
    private javax.swing.JButton btnRotate;
    private javax.swing.JButton btnShoot;
    private javax.swing.JButton btnSndTnk;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSlider jSlider1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JSpinner jSpinner2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lblArea;
    private javax.swing.JCheckBox potion;
    private java.awt.TextArea txtTank;
    // End of variables declaration//GEN-END:variables

    @Override
    public void updateMessage(String message) {
        txtTank.append(message + "\n");
    }

    @Override
    public void clearArea(boolean clear) {
        if (clear == true) {
            lblArea.setText("Area Cleared");
        } else {
            lblArea.setText("Area Not Cleared");
        }
    }

    @Override
    public void buttonEnable(int value) {
        if (potion.isSelected() == true) {
            jSlider1.setValue(value);
            jLabel3.setText(value + "");
            if (value >= 0 || 25 <= value) {
                btnShoot.setEnabled(true);
                btnMissile.setEnabled(false);
                btnLaser.setEnabled(false);
                btnRotate.setEnabled(false);
            }
            if (value >= 26 || 50 <= value) {
                btnShoot.setEnabled(false);
                btnMissile.setEnabled(true);
                btnLaser.setEnabled(false);
                btnRotate.setEnabled(false);
            }

            if (value >= 51 || 75 <= value) {
                btnShoot.setEnabled(false);
                btnMissile.setEnabled(false);
                btnLaser.setEnabled(true);
                btnRotate.setEnabled(false);
            }

            if (value >= 76) {
                btnShoot.setEnabled(false);
                btnMissile.setEnabled(false);
                btnLaser.setEnabled(false);
                btnRotate.setEnabled(true);
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
        return jSlider1.getValue() + "";
    }

    public void sendPrivateMessage(String message) {
        txtTank.append(message + "\n");
    }
}
