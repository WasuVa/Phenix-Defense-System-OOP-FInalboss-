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
            lblWorn.setText(value + "");
            if (value >= 0 || 30 <= value) {
                btnShtHeli.setEnabled(true);
                btnMissHeli.setEnabled(false);
                btnLOHeli.setEnabled(false);
            }
            if (value >= 31 || 60 <= value) {
                btnLOHeli.setEnabled(true);
                btnShtHeli.setEnabled(false);
                btnMissHeli.setEnabled(false);
            }
            if (value >= 61) {
                btnMissHeli.setEnabled(true);
                btnLOHeli.setEnabled(false);
                btnShtHeli.setEnabled(false);
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
        txtHelli.append(message + "\n");
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        sliderHeli = new javax.swing.JSlider();
        lblWorn = new javax.swing.JLabel();
        btnMissHeli = new javax.swing.JButton();
        btnShtHeli = new javax.swing.JButton();
        btnLOHeli = new javax.swing.JButton();
        txtHelli = new java.awt.TextArea();
        btnSndHeli = new javax.swing.JButton();
        ChkBHeli = new javax.swing.JCheckBox();
        jSpinner1 = new javax.swing.JSpinner();
        jSpinner2 = new javax.swing.JSpinner();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        redpnl = new javax.swing.JPanel();
        greenpnl = new javax.swing.JPanel();
        MsgHeli = new javax.swing.JTextField();

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
        jPanel1.add(btnMissHeli, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 187, 41));

        btnShtHeli.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnShtHeli.setText("Shoot");
        jPanel1.add(btnShtHeli, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 187, 41));

        btnLOHeli.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnLOHeli.setText("Laser Operation");
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

    }//GEN-LAST:event_ChkBHeliActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox ChkBHeli;
    private javax.swing.JTextField MsgHeli;
    private javax.swing.JButton btnLOHeli;
    private javax.swing.JButton btnMissHeli;
    private javax.swing.JButton btnShtHeli;
    private javax.swing.JButton btnSndHeli;
    private javax.swing.JPanel greenpnl;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JSpinner jSpinner2;
    private javax.swing.JLabel lblWorn;
    private javax.swing.JPanel redpnl;
    private javax.swing.JSlider sliderHeli;
    private java.awt.TextArea txtHelli;
    // End of variables declaration//GEN-END:variables
}
