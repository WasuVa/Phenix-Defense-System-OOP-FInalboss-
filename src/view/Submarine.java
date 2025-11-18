package view;

import controller.Controller;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import javax.sound.sampled.Clip;
import model.DefenseObserver;

    public class Submarine extends javax.swing.JFrame implements DefenseObserver {

        private MainController mainController;
        private Controller controller;
        private int soldierCount;
        private int ammoCount;
        private int fuel;

    public Submarine(Controller controller, MainController mainController) {
        initComponents();
        setLocationRelativeTo(this);
        this.mainController = mainController;
        this.controller = controller;
        btnLO.setEnabled(false);
        btnMO.setEnabled(false);
        btnsht.setEnabled(false);
        btnRS.setEnabled(false);
    }

    @Override
    public void updateMessage(String message) {
        txtASub.append(message + "\n");
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
        if (checkBox.isSelected() == true) {
            jLabel1.setText(value + "");
            if (value >= 0 || 25 <= value) {
                btnsht.setEnabled(true);
                btnLO.setEnabled(false);
                btnMO.setEnabled(false);
                btnRS.setEnabled(false);
            }
            if (value >= 26 || 50 <= value) {
                btnsht.setEnabled(true);
                btnLO.setEnabled(true);
                btnMO.setEnabled(false);
                btnRS.setEnabled(false);
            }

            if (value >= 51 || 75 <= value) {
                btnsht.setEnabled(true);
                btnLO.setEnabled(true);
                btnMO.setEnabled(true);
                btnRS.setEnabled(false);
            }

            if (value >= 76) {
                btnsht.setEnabled(true);
                btnLO.setEnabled(true);
                btnMO.setEnabled(true);
                btnRS.setEnabled(true);
            }
        }
    }

    public String getSoldierCount() {
        return soldierCount + "";
    }

    public String getAmmoCount() {
        return ammoCount + "";
    }

    public String getFuel() {
        return fuel + "";
    }
    
    public void sendPrivateMessage(String message) {
        txtASub.append(message + "\n");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnsht = new javax.swing.JButton();
        jSlider1 = new javax.swing.JSlider();
        jSlider2 = new javax.swing.JSlider();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnSndSub = new javax.swing.JButton();
        Msgsub = new javax.swing.JTextField();
        txtASub = new java.awt.TextArea();
        checkBox = new javax.swing.JCheckBox();
        jSpinner1 = new javax.swing.JSpinner();
        jSpinner2 = new javax.swing.JSpinner();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnRS = new javax.swing.JButton();
        lblArea = new javax.swing.JLabel();
        btnMO = new javax.swing.JButton();
        btnLO = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Submarine");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnsht.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnsht.setText("Shoot");
        jPanel1.add(btnsht, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, 187, 41));

        jSlider1.setOrientation(javax.swing.JSlider.VERTICAL);
        jSlider1.setValue(0);
        jPanel1.add(jSlider1, new org.netbeans.lib.awtextra.AbsoluteConstraints(671, 77, -1, 348));

        jSlider2.setOrientation(javax.swing.JSlider.VERTICAL);
        jSlider2.setValue(0);
        jPanel1.add(jSlider2, new org.netbeans.lib.awtextra.AbsoluteConstraints(711, 77, -1, 348));

        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Energy");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(664, 55, 37, -1));

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Oxigen");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(708, 55, 43, -1));

        btnSndSub.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnSndSub.setForeground(new java.awt.Color(0, 0, 0));
        btnSndSub.setText("Send");
        btnSndSub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSndSubActionPerformed(evt);
            }
        });
        jPanel1.add(btnSndSub, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 410, -1, -1));

        Msgsub.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jPanel1.add(Msgsub, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, 528, -1));
        jPanel1.add(txtASub, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 610, 170));

        checkBox.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        checkBox.setForeground(new java.awt.Color(0, 0, 0));
        checkBox.setText("Position");
        jPanel1.add(checkBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(453, 130, -1, -1));
        jPanel1.add(jSpinner1, new org.netbeans.lib.awtextra.AbsoluteConstraints(579, 98, 49, -1));
        jPanel1.add(jSpinner2, new org.netbeans.lib.awtextra.AbsoluteConstraints(579, 64, 49, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Solder Count");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(457, 64, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Ammo Count");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(453, 96, -1, -1));

        btnRS.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnRS.setText("Rotate Shooting");
        jPanel1.add(btnRS, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 187, 41));

        lblArea.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblArea.setForeground(new java.awt.Color(0, 0, 0));
        lblArea.setText("Area Not Cleard");
        jPanel1.add(lblArea, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 205, -1));

        btnMO.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnMO.setText("Missile Operation");
        jPanel1.add(btnMO, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 187, 41));

        btnLO.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnLO.setText("Laser Operation");
        jPanel1.add(btnLO, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 187, 41));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/bakcImg.png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, 100));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 464, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSndSubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSndSubActionPerformed
        mainController.getHelicoperMessage(txtASub.getText());
        txtASub.append(Msgsub.getText()+"\n");
        txtASub.setText("");
    }//GEN-LAST:event_btnSndSubActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Msgsub;
    private javax.swing.JButton btnLO;
    private javax.swing.JButton btnMO;
    private javax.swing.JButton btnRS;
    private javax.swing.JButton btnSndSub;
    private javax.swing.JButton btnsht;
    private javax.swing.JCheckBox checkBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSlider jSlider1;
    private javax.swing.JSlider jSlider2;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JSpinner jSpinner2;
    private javax.swing.JLabel lblArea;
    private java.awt.TextArea txtASub;
    // End of variables declaration//GEN-END:variables
 }