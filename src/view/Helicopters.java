package view;

import controller.Controller;
import javax.swing.JOptionPane;
import model.DefenseObserver;


public class Helicopters extends javax.swing.JFrame implements DefenseObserver{
    
    private Controller controller;
    private MainController mainController;
    private int soldirsCount;
    private int ammo;

    public Helicopters(Controller controller, MainController mainController) {
        initComponents();
        setLocationRelativeTo(this);
        setTitle("Helicopter");
        setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        sliderHeli = new javax.swing.JSlider();
        lblArea = new javax.swing.JLabel();
        btnMissHeli = new javax.swing.JButton();
        btnShtHeli = new javax.swing.JButton();
        btnLOHeli = new javax.swing.JButton();
        MsgHeli = new java.awt.TextArea();
        txtFieldHeli = new javax.swing.JTextField();
        btnSndHeli = new javax.swing.JButton();
        ChkBHeli = new javax.swing.JCheckBox();
        jSpinner1 = new javax.swing.JSpinner();
        jSpinner2 = new javax.swing.JSpinner();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Helicopter");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        sliderHeli.setOrientation(javax.swing.JSlider.VERTICAL);
        sliderHeli.setValue(0);
        jPanel1.add(sliderHeli, new org.netbeans.lib.awtextra.AbsoluteConstraints(716, 37, -1, 440));

        lblArea.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblArea.setForeground(new java.awt.Color(0, 0, 0));
        lblArea.setText("Area Not Cleard");
        jPanel1.add(lblArea, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 205, -1));

        btnMissHeli.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnMissHeli.setText("Missile Operation");
        jPanel1.add(btnMissHeli, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 187, 41));

        btnShtHeli.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnShtHeli.setText("Shoot");
        jPanel1.add(btnShtHeli, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 187, 41));

        btnLOHeli.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnLOHeli.setText("Laser Operation");
        jPanel1.add(btnLOHeli, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 187, 41));
        jPanel1.add(MsgHeli, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 201, 666, 190));

        txtFieldHeli.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jPanel1.add(txtFieldHeli, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 430, 580, -1));

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
        jPanel1.add(ChkBHeli, new org.netbeans.lib.awtextra.AbsoluteConstraints(506, 109, -1, -1));
        jPanel1.add(jSpinner1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 80, 49, -1));
        jPanel1.add(jSpinner2, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 40, 49, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Solder Count");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 43, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Ammo Count");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(506, 75, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/bakcImg.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, 100));

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

    }//GEN-LAST:event_btnSndHeliActionPerformed

    private void ChkBHeliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChkBHeliActionPerformed

    }//GEN-LAST:event_ChkBHeliActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox ChkBHeli;
    private java.awt.TextArea MsgHeli;
    private javax.swing.JButton btnLOHeli;
    private javax.swing.JButton btnMissHeli;
    private javax.swing.JButton btnShtHeli;
    private javax.swing.JButton btnSndHeli;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JSpinner jSpinner2;
    private javax.swing.JLabel lblArea;
    private javax.swing.JSlider sliderHeli;
    private javax.swing.JTextField txtFieldHeli;
    // End of variables declaration//GEN-END:variables

@Override
    public void updateMessage(String message) {
        MsgHeli.append(message + "\n");
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
        if (ChkBHeli.isSelected() == true) {
            sliderHeli.setValue(value);
            lblArea.setText(value + "");
            if (value >= 0 || 30 <= value) {
                btnShtHeli.setEnabled(true);
                btnMissHeli.setEnabled(false);
                btnLOHeli.setEnabled(false);
            }
            if (value >= 31 || 60 <= value) {
                btnLOHeli.setEnabled(true);
                btnShtHeli.setEnabled(true);
                btnMissHeli.setEnabled(false);
            }

            if (value >= 61) {
                btnMissHeli.setEnabled(true);
                btnLOHeli.setEnabled(true);
                btnShtHeli.setEnabled(true);
            }
        }
    }

    public String getSoldierCount() {
        return soldirsCount + "";
    }

    public String getAmmoCount() {
        return ammo + "";
    }

    public String getPosition() {
        return sliderHeli.getValue() + "";
    }

    public void sendPrivateMessage(String message) {
        MsgHeli.append(message + "\n");
    }
}
    
