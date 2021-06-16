/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View_User_Page;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

/**
 *
 * @author iwaya
 */
public class KonfirmasiPage extends javax.swing.JFrame {
    public static String Nama;
    public static String Mail;
    /**
     * Creates new form KonfirmasiPage
     */
    public KonfirmasiPage() {
        initComponents();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    public KonfirmasiPage(String NamaPengguna, String Email) {
        initComponents();
        Nama = NamaPengguna;
        Mail = Email;
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
        Masuk_Tombol = new javax.swing.JLabel();
        Logo_Picture = new javax.swing.JLabel();
        Latar_Picture = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(48, 57, 150));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Masuk_Tombol.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/KonfirmasiPage/Tombol Masuk 1.png"))); // NOI18N
        Masuk_Tombol.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Masuk_TombolMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Masuk_TombolMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Masuk_TombolMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Masuk_TombolMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                Masuk_TombolMouseReleased(evt);
            }
        });
        jPanel1.add(Masuk_Tombol, new org.netbeans.lib.awtextra.AbsoluteConstraints(334, 729, -1, -1));

        Logo_Picture.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/KonfirmasiPage/Logo.png"))); // NOI18N
        jPanel1.add(Logo_Picture, new org.netbeans.lib.awtextra.AbsoluteConstraints(192, 82, -1, -1));

        Latar_Picture.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/KonfirmasiPage/Gambar Latar.png"))); // NOI18N
        jPanel1.add(Latar_Picture, new org.netbeans.lib.awtextra.AbsoluteConstraints(328, 116, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1920, 1080));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Masuk_TombolMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Masuk_TombolMouseClicked
        ImageIcon MasukTombol_icon; /*Deklarasi variabel yang digunakan untuk memanggil ImageIcon*/
        MasukTombol_icon = new ImageIcon("src/Pictures/KonfirmasiPage/Tombol Masuk 3.png"); /*Format pemanggilan file ImageIcon yang ingin dipanggil*/
        Masuk_Tombol.setIcon(MasukTombol_icon); /*Pallete pada java (berupa JLabel) yang digunakan untuk melakukan set pada ImageIcon*/
        
        new LoginPage(Nama, Mail).setVisible(true); /*Deklarasi variabel pada form yang ingin dituju dan variabel tersebut menunjukkan nilai yang sama dengan form yang ingin dituju*/
        setVisible(false); /*Variabel tersebut akan menampilkan form yang dituju*/
    }//GEN-LAST:event_Masuk_TombolMouseClicked

    private void Masuk_TombolMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Masuk_TombolMouseEntered
        ImageIcon MasukTombol_icon; /*Deklarasi variabel yang digunakan untuk memanggil ImageIcon*/
        MasukTombol_icon = new ImageIcon("src/Pictures/KonfirmasiPage/Tombol Masuk 2.png"); /*Format pemanggilan file ImageIcon yang ingin dipanggil*/
        Masuk_Tombol.setIcon(MasukTombol_icon); /*Pallete pada java (berupa JLabel) yang digunakan untuk melakukan set pada ImageIcon*/
    }//GEN-LAST:event_Masuk_TombolMouseEntered

    private void Masuk_TombolMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Masuk_TombolMouseExited
        ImageIcon MasukTombol_icon; /*Deklarasi variabel yang digunakan untuk memanggil ImageIcon*/
        MasukTombol_icon = new ImageIcon("src/Pictures/KonfirmasiPage/Tombol Masuk 1.png"); /*Format pemanggilan file ImageIcon yang ingin dipanggil*/
        Masuk_Tombol.setIcon(MasukTombol_icon); /*Pallete pada java (berupa JLabel) yang digunakan untuk melakukan set pada ImageIcon*/
    }//GEN-LAST:event_Masuk_TombolMouseExited

    private void Masuk_TombolMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Masuk_TombolMousePressed
        ImageIcon MasukTombol_icon; /*Deklarasi variabel yang digunakan untuk memanggil ImageIcon*/
        MasukTombol_icon = new ImageIcon("src/Pictures/KonfirmasiPage/Tombol Masuk 4.png"); /*Format pemanggilan file ImageIcon yang ingin dipanggil*/
        Masuk_Tombol.setIcon(MasukTombol_icon); /*Pallete pada java (berupa JLabel) yang digunakan untuk melakukan set pada ImageIcon*/
    }//GEN-LAST:event_Masuk_TombolMousePressed

    private void Masuk_TombolMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Masuk_TombolMouseReleased
        ImageIcon MasukTombol_icon; /*Deklarasi variabel yang digunakan untuk memanggil ImageIcon*/
        MasukTombol_icon = new ImageIcon("src/Pictures/KonfirmasiPage/Tombol Masuk 1.png"); /*Format pemanggilan file ImageIcon yang ingin dipanggil*/
        Masuk_Tombol.setIcon(MasukTombol_icon); /*Pallete pada java (berupa JLabel) yang digunakan untuk melakukan set pada ImageIcon*/
    }//GEN-LAST:event_Masuk_TombolMouseReleased

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(KonfirmasiPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KonfirmasiPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KonfirmasiPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KonfirmasiPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KonfirmasiPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Latar_Picture;
    private javax.swing.JLabel Logo_Picture;
    private javax.swing.JLabel Masuk_Tombol;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
