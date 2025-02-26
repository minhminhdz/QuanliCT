package Playfail;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author quang
 */
public class frm_Playfair extends javax.swing.JFrame {

    /**
     * Creates new form 
     */
    public frm_Playfair() {
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

        btn_generateKeyMatrix = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_plaintext = new javax.swing.JTextArea();
        txt_key = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        txt_keyMatrix = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        txt_ciphertext = new javax.swing.JTextArea();
        btn_encrypt = new javax.swing.JButton();
        btn_decrypt = new javax.swing.JButton();
        btn_openfile = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btn_generateKeyMatrix.setText("Generate Key Matrix");
        btn_generateKeyMatrix.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_generateKeyMatrixActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Playfail Cipher Demo");

        jLabel2.setText("Plaintext");

        jLabel3.setText("Key");

        jLabel4.setText("Key Matrix");

        jLabel5.setText("Ciphertext");

        txt_plaintext.setColumns(20);
        txt_plaintext.setRows(5);
        jScrollPane1.setViewportView(txt_plaintext);

        txt_keyMatrix.setColumns(20);
        txt_keyMatrix.setRows(5);
        jScrollPane2.setViewportView(txt_keyMatrix);

        txt_ciphertext.setColumns(20);
        txt_ciphertext.setRows(5);
        jScrollPane3.setViewportView(txt_ciphertext);

        btn_encrypt.setText("Encrypt");
        btn_encrypt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_encryptActionPerformed(evt);
            }
        });

        btn_decrypt.setText("Decrypt");
        btn_decrypt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_decryptActionPerformed(evt);
            }
        });

        btn_openfile.setText("Open Ciphertext file");
        btn_openfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_openfileActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(252, 252, 252)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addGap(1, 1, 1))
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn_generateKeyMatrix)
                                .addGap(42, 42, 42)
                                .addComponent(btn_encrypt)
                                .addGap(37, 37, 37)
                                .addComponent(btn_decrypt)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_openfile, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1)
                            .addComponent(txt_key)
                            .addComponent(jScrollPane2)
                            .addComponent(jScrollPane3))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(233, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_key, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 39, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addGap(27, 27, 27)
                        .addComponent(jLabel5)
                        .addGap(125, 125, 125))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_generateKeyMatrix)
                            .addComponent(btn_encrypt)
                            .addComponent(btn_decrypt)
                            .addComponent(btn_openfile))
                        .addGap(49, 49, 49))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_generateKeyMatrixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_generateKeyMatrixActionPerformed
        
        String key = txt_key.getText();
        if (!key.isEmpty()) {
        PlayfairCipher playfairCipher = new PlayfairCipher(key);
        String keyMatrixString = playfairCipher.getKeyMatrixAsString();
        txt_keyMatrix.setText(keyMatrixString);
        } else {
        JOptionPane.showMessageDialog(this, "Please enter key to generate key matrix.");
        }
    }//GEN-LAST:event_btn_generateKeyMatrixActionPerformed

    private void btn_encryptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_encryptActionPerformed
        String plaintext = txt_plaintext.getText();
    String key = txt_key.getText();
    if (!plaintext.isEmpty() && !key.isEmpty()) {
        PlayfairCipher playfairCipher = new PlayfairCipher(key);
        String ciphertext = playfairCipher.encrypt(plaintext);
        JOptionPane.showMessageDialog(this, "Encrypted successfully.");
        txt_ciphertext.setText(ciphertext);
        saveToFile(ciphertext);
    } else {
        JOptionPane.showMessageDialog(this, "Please enter plaintext and key.");
    }
    }//GEN-LAST:event_btn_encryptActionPerformed

    private void btn_decryptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_decryptActionPerformed
        // Lấy văn bản mã hóa và khóa từ giao diện người dùng
        String ciphertext = txt_ciphertext.getText();
        String key = txt_key.getText();

    // Kiểm tra xem cả văn bản mã hóa và khóa đều không rỗng
    if (!ciphertext.isEmpty() && !key.isEmpty()) {
        // Tạo một đối tượng PlayfairCipher mới với khóa đã cho
        PlayfairCipher playfairCipher = new PlayfairCipher(key);
        // Giải mã văn bản mã hóa và lưu kết quả vào biến plaintext
        String plaintext = playfairCipher.decrypt(ciphertext);
        // Hiển thị thông báo thành công và đặt kết quả vào hộp văn bản
        JOptionPane.showMessageDialog(this, "Decrypted successfully.");
        txt_plaintext.setText(plaintext);
    } else {
        // Hiển thị thông báo yêu cầu nhập đầy đủ thông tin
        JOptionPane.showMessageDialog(this, "Please enter ciphertext and key.");
    }
    }//GEN-LAST:event_btn_decryptActionPerformed

    private void btn_openfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_openfileActionPerformed
        JFileChooser fileChooser = new JFileChooser();
    fileChooser.setFileFilter(new FileNameExtensionFilter("Text Files", "txt"));

    int userSelection = fileChooser.showOpenDialog(this);
    if (userSelection == JFileChooser.APPROVE_OPTION) {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileChooser.getSelectedFile()))) {
            String ciphertext = bufferedReader.readLine();
            txt_ciphertext.setText(ciphertext);
            JOptionPane.showMessageDialog(this, "File opened successfully.");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Error opening file: " + e.getMessage());
        }
    }
    }//GEN-LAST:event_btn_openfileActionPerformed
    private void saveToFile(String content) {
    JFileChooser fileChooser = new JFileChooser();
    fileChooser.setFileFilter(new FileNameExtensionFilter("Text Files", "txt"));

    int userSelection = fileChooser.showSaveDialog(this);
    if (userSelection == JFileChooser.APPROVE_OPTION) {
        try (FileWriter fileWriter = new FileWriter(fileChooser.getSelectedFile() + ".txt")) {
            fileWriter.write(content);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Error saving file: " + e.getMessage());
        }
    }
}
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
            java.util.logging.Logger.getLogger(frm_Playfair.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frm_Playfair.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frm_Playfair.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm_Playfair.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_Playfair().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_decrypt;
    private javax.swing.JButton btn_encrypt;
    private javax.swing.JButton btn_generateKeyMatrix;
    private javax.swing.JButton btn_openfile;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea txt_ciphertext;
    private javax.swing.JTextField txt_key;
    private javax.swing.JTextArea txt_keyMatrix;
    private javax.swing.JTextArea txt_plaintext;
    // End of variables declaration//GEN-END:variables
}
