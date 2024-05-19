/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.applikasipenambahberatbadan;

/**
 *
 * @author Asus
 */
public class Halamanutama extends javax.swing.JFrame {

    /**
     * Creates new form Halamanutama
     */
    public Halamanutama() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        pria = new javax.swing.JButton();
        wanita = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        UMUR = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        olahraga = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        tinggi = new javax.swing.JTextField();
        berat = new javax.swing.JTextField();
        hasil = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        komentarhasil = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(153, 255, 153));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Aplikasi penambah berat badan");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pria.setText("Pria");
        pria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                priaActionPerformed(evt);
            }
        });

        wanita.setText("Wanita");
        wanita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wanitaActionPerformed(evt);
            }
        });

        jLabel2.setText("Pilih gender anda");

        jLabel3.setText("Masukkan usia");

        UMUR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UMURActionPerformed(evt);
            }
        });

        jLabel4.setText("Keseharian aktivitas");

        olahraga.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sangat jarang berolahraga", "Jarang berolahraga, 1-3 kali / minggu", "Cukup sering berolahraga, 3-5 kali / minggu", "Sering berolahraga, 6-7 kali / minggu" }));
        olahraga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                olahragaActionPerformed(evt);
            }
        });

        jLabel5.setText("Tinggi / Berat badan");

        hasil.setText("Hasil");
        hasil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hasilActionPerformed(evt);
            }
        });

        komentarhasil.setColumns(20);
        komentarhasil.setRows(5);
        jScrollPane1.setViewportView(komentarhasil);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(pria)
                                    .addGap(18, 18, 18)
                                    .addComponent(wanita))
                                .addComponent(jLabel2)
                                .addComponent(jLabel3)
                                .addComponent(UMUR))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(olahraga, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(12, 12, 12)
                                .addComponent(tinggi, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(berat, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(hasil))
                        .addGap(0, 61, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pria)
                    .addComponent(wanita))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(UMUR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(olahraga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tinggi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(berat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(hasil)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
String GENDER;
    private void priaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_priaActionPerformed
        // TODO add your handling code here:
        GENDER = "pria";
    }//GEN-LAST:event_priaActionPerformed

    private void wanitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wanitaActionPerformed
        // TODO add your handling code here:
        GENDER = "wanita";
    }//GEN-LAST:event_wanitaActionPerformed
    int umur;
    String komentar, infoolahraga;
    private void UMURActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UMURActionPerformed
        // TODO add your handling code here:
        umur = Integer.parseInt(UMUR.getText());
        if ((umur > 0)&&(umur < 12) && (GENDER == "pria")) {
            komentar = "Anda adalah anak laki-laki dibawah umur";
        } else if ((umur > 0) && (umur <= 12) && (GENDER == "wanita")) {
            komentar = "Anda adalah anak laki-laki dibawah umur";
        } else if ((umur > 13) && (umur <= 20) && (GENDER == "pria")) {
            komentar = "Anda adalah anak remaja laki-laki";
        } else if ((umur > 13) && (umur <= 20) && (GENDER == "wanita")) {
            komentar = "Anda adalah orang remaja perempuan";
        } else if ((umur > 20) && (umur <= 50) && (GENDER == "pria")) {
            komentar = "Anda adalah orang dewasa perempuan";
        } else if ((umur > 20) && (umur < 50) && (GENDER == "wanita")) {
            komentar = "Anda adalah orang dewasa laki-laki";
        } else if ((umur > 50) && (GENDER == "wanita")) {
            komentar = "anda adalah lansia perempuan";
        } else if ((umur > 50) && (GENDER == "pria")) {
            komentar = "anda adalah lansia laki-laki";
        }
    }//GEN-LAST:event_UMURActionPerformed

    private void olahragaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_olahragaActionPerformed
        // TODO add your handling code here:
        switch(olahraga.getSelectedIndex()){
            case 0:
            infoolahraga = "Sangat jarang berolahraga";
            break;
            case 1:
            infoolahraga = "jarang berolahraga";
            break;
            case 2:
            infoolahraga = "Cukup sering berolahraga";
            break;
            case 3:
            infoolahraga = "Sering berolahraga";
        }
    }//GEN-LAST:event_olahragaActionPerformed
double Tinggi;
double Berat ;
double infoTinggi;
double bmi = 0;
Double Target;
String info;
    private void hasilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hasilActionPerformed
        // TODO add your handling code here:
        infoTinggi = Double.parseDouble(tinggi.getText());
        Berat = Double.parseDouble(berat.getText());
        Tinggi = (infoTinggi+infoTinggi)/100;
        bmi = Berat / Tinggi ;
        if (bmi < 18){
            Target = 18 - bmi;
            String targetstring = Double.toString(Target);
            info = "Berat badan anda belum ideal, kekurangan berat badan sebesar "+targetstring;
    }   else if ((bmi > 18)&&(bmi <= 22)){
            info = "Berat badan anda sudah ideal";
    }   else if ((bmi > 22)){
            Target = bmi - 22;
            String targetstring = Double.toString(Target);
            info = "Berat badan anda belum ideal, kelebihan berat badan sebesar "+targetstring;
    }
        String umurstring = Integer.toString(umur);
        
        komentarhasil.setText("Gender : " + GENDER + "\n" + "Umur :" + (UMUR.getText()) + "\n" + "Olahraga :" + infoolahraga + "\n" + "Berat badan :" + Berat + "\n" + "Tinggi badan :" + infoTinggi + "\n" + "Target berat badan :" + info);
    }//GEN-LAST:event_hasilActionPerformed

        
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Halamanutama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Halamanutama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Halamanutama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Halamanutama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Halamanutama().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField UMUR;
    private javax.swing.JTextField berat;
    private javax.swing.JButton hasil;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea komentarhasil;
    private javax.swing.JComboBox<String> olahraga;
    private javax.swing.JButton pria;
    private javax.swing.JTextField tinggi;
    private javax.swing.JButton wanita;
    // End of variables declaration//GEN-END:variables
}