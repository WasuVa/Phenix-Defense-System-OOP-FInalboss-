package view;

public class MainController extends javax.swing.JFrame {
    
    private final DefenceObserverableInterface defenceObserverbaleInterface;

    public MainController(DefenceObserverableInterface defenceObserverableInterface) {
        setTitle("Main Controller");
        setResizable(false);
        this.defenceObserverbaleInterface = defenceObserverableInterface;
        initComponents();
    }
    
    public MainController() {
        initComponents();
        this.defenceObserverbaleInterface = null;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        textArea1 = new java.awt.TextArea();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        btnSndMain = new javax.swing.JButton();
        jSlider1 = new javax.swing.JSlider();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        textArea2 = new java.awt.TextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jComboBox1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 142, -1));

        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("Collect Information");
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, -1, -1));

        textArea1.setEnabled(false);
        jPanel1.add(textArea1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 240, 360, 160));

        jCheckBox1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jCheckBox1.setForeground(new java.awt.Color(0, 0, 0));
        jCheckBox1.setText("Send Private");
        jPanel1.add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 190, -1, -1));

        jCheckBox2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jCheckBox2.setForeground(new java.awt.Color(0, 0, 0));
        jCheckBox2.setText("Area Clear");
        jPanel1.add(jCheckBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 50, -1, -1));

        btnSndMain.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnSndMain.setForeground(new java.awt.Color(0, 0, 0));
        btnSndMain.setText("Send");
        jPanel1.add(btnSndMain, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 170, -1, -1));

        jSlider1.setPaintLabels(true);
        jSlider1.setPaintTicks(true);
        jSlider1.setValue(0);
        jPanel1.add(jSlider1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 379, -1));

        jTextField1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 100, 300, 50));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/bakcImg.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, 100));

        textArea2.setEnabled(false);
        jPanel1.add(textArea2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 360, 160));

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

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSndMain;
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSlider jSlider1;
    private javax.swing.JTextField jTextField1;
    private java.awt.TextArea textArea1;
    private java.awt.TextArea textArea2;
    // End of variables declaration//GEN-END:variables
}
