package view;

import controller.Controller;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import model.DefenseObserver;
import view.Submarine;
import view.Tank;


public class MainController extends javax.swing.JFrame implements DefenseObserver {

    private Controller controller;
    private Submarine submarine;
    private Tank tank;
    private Helicopters helicopter;

    public MainController(Controller controller) {
        initComponents();
        this.controller = controller;
        submarine = new Submarine(controller, this);
        tank = new Tank(controller, this);
        helicopter = new Helicopters(controller, this);
        controller.add(tank);
        controller.add(submarine);
        controller.add(helicopter);
        txtMsgViewer.setEditable(false);
    }
    @Override
    public void updateMessage(String message) {
    }

    @Override
    public void clearArea(boolean clear) {
    }

    @Override
    public void buttonEnable(int value) {
    }

    public void getHelicoperMessage(String text) {
        txtMsgViewer.append(text + "\n");
    }

    public void getTankMessage(String text) {
        txtMsgViewer.append(text + "\n");
    }

    public void getSubmarineMessage(String text) {
        txtMsgViewer.append(text + "\n");
    }

    public void playSound(String path) {
        try {
            AudioInputStream audio = AudioSystem.getAudioInputStream(getClass().getResource(path));
            Clip clip = AudioSystem.getClip();
            clip.open(audio);
            clip.start();
        } catch (Exception ex) {
            Logger.getLogger(MainController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        bropBoxMC = new javax.swing.JComboBox<>();
        btnExit = new javax.swing.JButton();
        checkMC = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        btnSndMain = new javax.swing.JButton();
        jSlider1 = new javax.swing.JSlider();
        txtMsgMain = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtMsgViewerII = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtMsgViewer = new javax.swing.JTextArea();
        btnArmy1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bropBoxMC.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        bropBoxMC.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ALL", "Helicopter", "Tank", "Submarine" }));
        jPanel1.add(bropBoxMC, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 142, -1));

        btnExit.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnExit.setForeground(new java.awt.Color(204, 0, 0));
        btnExit.setText("EXIT");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        jPanel1.add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 10, 100, -1));

        checkMC.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        checkMC.setForeground(new java.awt.Color(0, 0, 0));
        checkMC.setText("Send Private");
        jPanel1.add(checkMC, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 190, -1, -1));

        jCheckBox2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jCheckBox2.setForeground(new java.awt.Color(0, 0, 0));
        jCheckBox2.setText("Area Clear");
        jPanel1.add(jCheckBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 50, -1, -1));

        btnSndMain.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnSndMain.setForeground(new java.awt.Color(0, 0, 0));
        btnSndMain.setText("Send");
        btnSndMain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSndMainActionPerformed(evt);
            }
        });
        jPanel1.add(btnSndMain, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 170, -1, -1));

        jSlider1.setPaintLabels(true);
        jSlider1.setPaintTicks(true);
        jSlider1.setValue(0);
        jPanel1.add(jSlider1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 379, -1));

        txtMsgMain.setBackground(new java.awt.Color(204, 204, 204));
        txtMsgMain.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jPanel1.add(txtMsgMain, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 100, 300, 50));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/bakcImg.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, 100));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Position");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 60, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("--");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 120, 240, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Fuel Amount      :");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, 120, 30));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Ammo Amount :");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, 110, 30));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Soldier Count    :");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, 120, 30));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("--");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 60, 240, 30));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("--");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 90, 240, 30));

        jButton3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 0, 0));
        jButton3.setText("Collect Information");
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, -1, -1));

        txtMsgViewerII.setColumns(20);
        txtMsgViewerII.setRows(5);
        jScrollPane1.setViewportView(txtMsgViewerII);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 240, 340, 160));

        txtMsgViewer.setColumns(20);
        txtMsgViewer.setRows(5);
        jScrollPane4.setViewportView(txtMsgViewer);

        jPanel1.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, 340, 160));

        btnArmy1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnArmy1.setForeground(new java.awt.Color(0, 0, 0));
        btnArmy1.setText("ARMY");
        btnArmy1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnArmy1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnArmy1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 10, 100, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 814, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 425, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSndMainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSndMainActionPerformed
        String message = "Controller - " + txtMsgMain.getText();
        if (bropBoxMC.getSelectedIndex() == 0) {
            txtMsgViewerII.append(message + "\n");
            controller.updateUnites(message);
            txtMsgMain.setText("");
        } else {
            if (bropBoxMC.getSelectedIndex() == 1) {
                helicopter.updateMessage(message);
                txtMsgMain.setText("");
                txtMsgViewerII.append(message + "\n");
            }
            if (bropBoxMC.getSelectedIndex() == 2) {
                tank.updateMessage(message);
                txtMsgMain.setText("");
                txtMsgViewerII.append(message + "\n");
            }
            if (bropBoxMC.getSelectedIndex() == 3) {
                submarine.updateMessage(message);
                txtMsgMain.setText("");
                txtMsgViewerII.append(message + "\n");
            }
        }
    }//GEN-LAST:event_btnSndMainActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        this.dispose();
        helicopter.dispose();
        submarine.dispose();
        tank.dispose();
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnArmy1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnArmy1ActionPerformed
        helicopter.setVisible(true);
        submarine.setVisible(true);
        tank.setVisible(true);
    }//GEN-LAST:event_btnArmy1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> bropBoxMC;
    private javax.swing.JButton btnArmy1;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnSndMain;
    private javax.swing.JCheckBox checkMC;
    private javax.swing.JButton jButton3;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSlider jSlider1;
    private javax.swing.JTextField txtMsgMain;
    private javax.swing.JTextArea txtMsgViewer;
    private javax.swing.JTextArea txtMsgViewerII;
    // End of variables declaration//GEN-END:variables
}
