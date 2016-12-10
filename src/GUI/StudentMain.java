package GUI;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Graphics;
import static java.lang.Thread.sleep;
import javax.swing.ImageIcon;


public class StudentMain extends javax.swing.JFrame {

    public StudentMain() {
        initComponents();
        addPanel();
        this.invalidate();
        this.validate();
        repaint();
        InfoThread newThread = new InfoThread();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pTieuDe = new javax.swing.JPanel();
        pLogo = new javax.swing.JPanel(){
            ImageIcon icon = new ImageIcon("src/Icon/logoBK_1.png");

            public void paintComponent(Graphics g){
                Dimension d = getSize();
                g.drawImage(icon.getImage(), 0, 0, d.width, d.height, null);
                setOpaque(false);
                super.paintComponent(g);
            }
        };
        pDHBK = new javax.swing.JPanel(){
            ImageIcon icon = new ImageIcon("src/Icon/ThuvienTaQuangBuu.jpg");

            public void paintComponent(Graphics g){
                Dimension d = getSize();
                g.drawImage(icon.getImage(), 0, 0, d.width, d.height, null);
                setOpaque(false);
                super.paintComponent(g);
            }
        };
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        pMain = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel(){
            ImageIcon icon = new ImageIcon("123.JPG");

            public void paintComponent(Graphics g){
                Dimension d = getSize();
                g.drawImage(icon.getImage(), 0, 0, d.width, d.height, null);
                setOpaque(false);
                super.paintComponent(g);
            }
        };
        jLabelPM = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        mMenu = new javax.swing.JMenuBar();
        mTrangChu = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        mInforUser = new javax.swing.JMenu();
        mDoiMatKhau = new javax.swing.JMenuItem();
        mThongTinCaNhan = new javax.swing.JMenuItem();
        javax.swing.JMenu mSearch = new javax.swing.JMenu();
        mTimKiemSinhVien = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 153, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setPreferredSize(new java.awt.Dimension(1366, 768));
        getContentPane().setLayout(null);

        pTieuDe.setPreferredSize(new java.awt.Dimension(1366, 142));

        pLogo.setBackground(new java.awt.Color(153, 153, 255));
        pLogo.setLayout(null);

        pDHBK.setBackground(new java.awt.Color(255, 255, 255));
        pDHBK.setPreferredSize(new java.awt.Dimension(1300, 0));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("Phần mềm quản lý sinh viên");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("Trường Đại Học Bách Khoa Hà Nội");

        javax.swing.GroupLayout pDHBKLayout = new javax.swing.GroupLayout(pDHBK);
        pDHBK.setLayout(pDHBKLayout);
        pDHBKLayout.setHorizontalGroup(
            pDHBKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pDHBKLayout.createSequentialGroup()
                .addGroup(pDHBKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pDHBKLayout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pDHBKLayout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(776, Short.MAX_VALUE))
        );
        pDHBKLayout.setVerticalGroup(
            pDHBKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pDHBKLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(5, 5, 5)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pTieuDeLayout = new javax.swing.GroupLayout(pTieuDe);
        pTieuDe.setLayout(pTieuDeLayout);
        pTieuDeLayout.setHorizontalGroup(
            pTieuDeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pTieuDeLayout.createSequentialGroup()
                .addComponent(pLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(pDHBK, javax.swing.GroupLayout.PREFERRED_SIZE, 1256, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pTieuDeLayout.setVerticalGroup(
            pTieuDeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(pDHBK, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        getContentPane().add(pTieuDe);
        pTieuDe.setBounds(0, 0, 1366, 108);

        pMain.setMinimumSize(new java.awt.Dimension(1368, 510));
        pMain.setPreferredSize(new java.awt.Dimension(1366, 510));
        pMain.setLayout(null);
        getContentPane().add(pMain);
        pMain.setBounds(0, 110, 1366, 510);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        jLabelPM.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelPM.setForeground(new java.awt.Color(0, 51, 204));
        jLabelPM.setText("Phần mềm quản lý sinh viên Trường Đại Học Bách Khoa Hà Nội");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(387, 387, 387)
                .addComponent(jLabelPM, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(463, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(jLabelPM, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 620, 1370, 60);

        mTrangChu.setText("Trang chủ");

        jMenuItem2.setText("jMenuItem2");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        mTrangChu.add(jMenuItem2);

        mMenu.add(mTrangChu);

        mInforUser.setText("Thông tin người dùng");

        mDoiMatKhau.setText("Đổi mật khẩu");
        mDoiMatKhau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mDoiMatKhauActionPerformed(evt);
            }
        });
        mInforUser.add(mDoiMatKhau);

        mThongTinCaNhan.setText("Thông tin cá nhân");
        mThongTinCaNhan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mThongTinCaNhanActionPerformed(evt);
            }
        });
        mInforUser.add(mThongTinCaNhan);

        mMenu.add(mInforUser);

        mSearch.setText("Tool");

        mTimKiemSinhVien.setText("Tìm Kiếm");
        mTimKiemSinhVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mTimKiemSinhVienActionPerformed(evt);
            }
        });
        mSearch.add(mTimKiemSinhVien);

        jMenuItem1.setText("Thêm mới");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        mSearch.add(jMenuItem1);

        mMenu.add(mSearch);

        jMenu1.setText("Đăng ký học tập");
        mMenu.add(jMenu1);

        setJMenuBar(mMenu);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void mDoiMatKhauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mDoiMatKhauActionPerformed
        // TODO add your handling code here:
        frmChangePassWord jChangePassword = new frmChangePassWord();
        jChangePassword.setVisible(true);
    }//GEN-LAST:event_mDoiMatKhauActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed

        pMain.removeAll();
        pMain.add(pnThem);
        pnThem.setBounds(0, 0, pMain.getWidth(), pMain.getHeight());
        this.invalidate();
        this.validate();
        repaint();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        pMain.removeAll();
        pMain.add(home);
        home.setBounds(0, 0, pMain.getWidth(), pMain.getHeight());
        this.invalidate();
        this.validate();
        repaint();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void mTimKiemSinhVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mTimKiemSinhVienActionPerformed
        pMain.removeAll();
        pMain.add(pnQLSV);
        pnQLSV.setBounds(0, 0, pMain.getWidth(), pMain.getHeight());
        this.invalidate();
        this.validate();
        repaint();
    }//GEN-LAST:event_mTimKiemSinhVienActionPerformed

    private void mThongTinCaNhanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mThongTinCaNhanActionPerformed
         pMain.removeAll();
        pMain.add(pInfo);
        pInfo.setBounds(0, 0, pMain.getWidth(), pMain.getHeight());
        this.invalidate();
        this.validate();
        repaint();
    }//GEN-LAST:event_mThongTinCaNhanActionPerformed
    pnThemMoi pnThem = new pnThemMoi();
    frmQuanLy pQL = new frmQuanLy();
    frmSearchStudent pSearchStudent = new frmSearchStudent();
    Home1 home = new Home1();
    panelQuanLySinhVien pnQLSV = new panelQuanLySinhVien();
    pnThongTinSV pInfo = new pnThongTinSV();

    private void addPanel() {
        pMain.add(home);
        home.setBounds(0, 0, pMain.getWidth(), pMain.getHeight());
        this.invalidate();
        this.validate();
        repaint();
    }

    public class InfoThread extends Thread {

        String s = jLabelPM.getText();

        public InfoThread() {
            start();
        }

        public void run() {
            int index = 0;
            while (true) {
                index++;
                jLabelPM.setText(s.substring(0, index < s.length() ? index : s.length()));
                if (index == s.length() + 20) {
                    index = 0;
                }
                try {
                    sleep(90);
                } catch (InterruptedException ex) {
                }
            }
        }
    }

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
            java.util.logging.Logger.getLogger(StudentMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelPM;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JMenuItem mDoiMatKhau;
    private javax.swing.JMenu mInforUser;
    private javax.swing.JMenuBar mMenu;
    private javax.swing.JMenuItem mThongTinCaNhan;
    private javax.swing.JMenuItem mTimKiemSinhVien;
    private javax.swing.JMenu mTrangChu;
    private javax.swing.JPanel pDHBK;
    private javax.swing.JPanel pLogo;
    private javax.swing.JPanel pMain;
    private javax.swing.JPanel pTieuDe;
    // End of variables declaration//GEN-END:variables
}
