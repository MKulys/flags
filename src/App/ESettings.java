package App;

import java.io.*;

public class ESettings extends javax.swing.JFrame {

    final String fname = "settings.txt";
    final String defaultCNumber = "10";
    final String defaultSetting = "0";
    
    //Sets new variables
    String cnumber = defaultCNumber;
    String setting = defaultSetting;

    public ESettings() {
        initComponents();
        load();
    }

    public int getCNum() {
        return Integer.valueOf(cnumber);
    }

    public int getMode() {
        return Integer.valueOf(setting);
    }

    void check() {
        try {
            int n = Integer.valueOf(jTextFieldCount.getText());
            if (n > 0) {
                cnumber = "" + n;
            } else {
                cnumber = defaultCNumber;
            }
        } catch (NumberFormatException e) {
            cnumber = defaultCNumber;
        }
        jTextFieldCount.setText(cnumber);

        try {
            int m = Integer.valueOf(jTextFieldMode.getText());
            if (m >= 0 && m < 3) {
                setting = "" + m;
            } else {
                setting = defaultSetting;
            }
        } catch (NumberFormatException e) {
            setting = defaultSetting;
        }
        jTextFieldMode.setText(setting);

        this.repaint();
    }

    void save() {
        try {
            PrintWriter fout = new PrintWriter(
                    new BufferedWriter(new FileWriter(fname)));
            fout.println(cnumber);
            fout.println(setting);
            fout.close();
        } catch (IOException e) {
        }
    }

    void load() {
        try {
            BufferedReader fin = new BufferedReader(new FileReader(fname));
            jTextFieldCount.setText(fin.readLine());
            jTextFieldMode.setText(fin.readLine());
            check();
        } catch (IOException e) {
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonBack = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldCount = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldMode = new javax.swing.JTextField();
        jButtonSave = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        jButtonBack.setText("Back");
        jButtonBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBackActionPerformed(evt);
            }
        });

        jLabel1.setText("Countries per round:");

        jTextFieldCount.setText("10");

        jLabel2.setText("Game mode:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("0 is default, 1 ignores capitalization,");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("2 allows one letter to be misspelled");

        jTextFieldMode.setText("0");

        jButtonSave.setText("Save");
        jButtonSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSaveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonBack)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonSave))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldCount, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                            .addComponent(jTextFieldMode)))
                    .addComponent(jLabel4)
                    .addComponent(jLabel3))
                .addContainerGap(111, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonBack)
                    .addComponent(jButtonSave))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jTextFieldCount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2))
                    .addComponent(jTextFieldMode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(1, 1, 1)
                .addComponent(jLabel4)
                .addContainerGap(109, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBackActionPerformed
        //Attempt to make settings work
        check();

        //Sets one screen invisible, the other one visible
        setVisible(false);
        AStart.frameStart.setVisible(true);
    }//GEN-LAST:event_jButtonBackActionPerformed

    private void jButtonSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSaveActionPerformed
        //Attempt to make settings work
        check();
        save();
    }//GEN-LAST:event_jButtonSaveActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBack;
    private javax.swing.JButton jButtonSave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    public javax.swing.JTextField jTextFieldCount;
    public javax.swing.JTextField jTextFieldMode;
    // End of variables declaration//GEN-END:variables
}
