package App;

import java.awt.Color;
import java.io.*;
import javax.swing.*;
import javax.swing.border.*;
import java.util.*;

public class CCountry extends javax.swing.JFrame {

    int k, score, regime;
    String current = "Lithuania";
    String strFolder;
    File[] set;
    Vector<String> list = new Vector<String>();


    public CCountry(String strFolder, int size) {
        initComponents();
        setContinent(strFolder, size);
    }

    public CCountry() {
        this("Europe", 3);
    }

    public void setContinent(String strFolder, int size) {
        regime = AStart.frameSettings.getMode();
        k = 0;
        this.strFolder = strFolder;
        TitledBorder border = (TitledBorder)(jPanel1.getBorder());
        border.setTitle(strFolder);
        File folder = new File(strFolder);
        File[] listOfFiles = folder.listFiles();
        if (size > listOfFiles.length) {
            size = listOfFiles.length;
        }
        
        //Arranging random country flags in an array
        
        set = new File[size];
        for (int i = 0; i < size; i++) {
            int p;
            do {
                p = (int) (Math.random() * listOfFiles.length);
            } while (listOfFiles[p] == null);

            set[i] = listOfFiles[p];
            listOfFiles[p] = null;
        }
        next();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Europe", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 24))); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/newpackage/Lithuania.png"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Which country is this?");

        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jButton1.setText("Check");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 110, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addGap(239, 239, 239))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1))
                                .addGap(161, 161, 161))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addGap(53, 53, 53)
                        .addComponent(jLabel2)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addGap(192, 192, 192))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(31, 31, 31)))
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        String textFieldValue = jTextField1.getText();
        System.out.println(textFieldValue);
    }//GEN-LAST:event_jTextField1ActionPerformed

    
    //Determines the game mode based on the value of regime variable
    
    private boolean myEqual(String a, String b) {
        if (regime == 2) {
            if (a.length() != b.length()) {
                return false;
            }
            int error = 0;
            for (int i = 0; i < a.length(); i++) {
                if (a.charAt(i) != b.charAt(i)) {
                    error++;
                    if (error > 1) {
                        return false;
                    }
                }
            }
            return true;
        }
        if (regime == 1) {
            a = a.toLowerCase();
            b = b.toLowerCase();
        }
        return a.equals(b);
    }

    //Counts the score, changes the background, allows the user to continue to another flag
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (jButton1.getText().equals("Check")) {
            String answer = jTextField1.getText();
            if (myEqual(answer, current)) {
                jPanel1.setBackground(Color.green);
                score++;
            } else {
                jPanel1.setBackground(Color.red);
                list.add(current);
            }
            jButton1.setText("Next");
        } else {
            jButton1.setText("Check");
            jPanel1.setBackground(Color.LIGHT_GRAY);
            jTextField1.setText("");
            next();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        setVisible(false);
        AStart.frameContinents.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    
    //Displays the flags from the array or opens the score screen
    
    public void next() {

        if (k < set.length) {
            jLabel2.setIcon(new ImageIcon(set[k].getAbsolutePath()));
            String country = set[k].getName();
            String[] p = country.split("\\.");
            current = p[0];
            k++;
        } else {
            setVisible(false);
            new CScore(list.toArray(), "Your Score: " + score + "/" + set.length, strFolder).setVisible(true);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
