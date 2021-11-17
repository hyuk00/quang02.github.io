package com.shoessys.ui;

import com.shoessys.DAO.KhachHangDAO;
import com.shoessys.entity.KhachHang;
import com.shoessys.utils.Auth;
import com.shoessys.utils.MsgBox;
import com.shoessys.utils.XDate;
import java.awt.Color;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

public class KhachHangJInternalFrame extends javax.swing.JInternalFrame {

    KhachHangDAO dao = new KhachHangDAO();
    int row = -1;
    int index = 0;

    public KhachHangJInternalFrame(Color color) {
        initComponents();
        init();
        pn2.setBackground(color);
        pn3.setBackground(color);
        pn4.setBackground(color);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        pn1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        tabs = new javax.swing.JTabbedPane();
        pn2 = new javax.swing.JPanel();
        pn4 = new javax.swing.JPanel();
        txtTimKiem = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDanhSach = new javax.swing.JTable();
        btnPrePage = new javax.swing.JButton();
        lblChiSo = new javax.swing.JLabel();
        btnNextPage = new javax.swing.JButton();
        pn3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtMaKhachHang = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtTenKhachHang = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtSDT = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        rdoNam = new javax.swing.JRadioButton();
        rdoNu = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        DCNgaySinh = new com.toedter.calendar.JDateChooser();
        txtEmail = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtDiemThuong = new javax.swing.JTextField();
        btnThem = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnVoHieuHoa = new javax.swing.JButton();
        btnMoi = new javax.swing.JButton();
        btnLast = new javax.swing.JButton();
        btnNext = new javax.swing.JButton();
        btnPre = new javax.swing.JButton();
        btnFirst = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        txtMaNV = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setTitle("ShoesSys StartUp - Quản Lí Khách Hàng");
        setToolTipText("");

        pn1.setBackground(new java.awt.Color(255, 204, 204));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Khách Hàng");

        tabs.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        pn4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tìm Kiếm", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        txtTimKiem.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTimKiemKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout pn4Layout = new javax.swing.GroupLayout(pn4);
        pn4.setLayout(pn4Layout);
        pn4Layout.setHorizontalGroup(
            pn4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtTimKiem)
                .addContainerGap())
        );
        pn4Layout.setVerticalGroup(
            pn4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        tblDanhSach.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã KH", "Tên KH", "SĐT", "Email", "Ngày Sinh", "Giới Tính", "Điểm", "Mã NV"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblDanhSach.setToolTipText("EduSys - Quản Lí Khách Hàng");
        tblDanhSach.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDanhSachMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblDanhSach);

        btnPrePage.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnPrePage.setText("<<");
        btnPrePage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrePageActionPerformed(evt);
            }
        });

        lblChiSo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblChiSo.setText("1");

        btnNextPage.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnNextPage.setText(">>");
        btnNextPage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextPageActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pn2Layout = new javax.swing.GroupLayout(pn2);
        pn2.setLayout(pn2Layout);
        pn2Layout.setHorizontalGroup(
            pn2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pn4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pn2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 623, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(pn2Layout.createSequentialGroup()
                .addGap(234, 234, 234)
                .addComponent(btnPrePage)
                .addGap(18, 18, 18)
                .addComponent(lblChiSo)
                .addGap(18, 18, 18)
                .addComponent(btnNextPage)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pn2Layout.setVerticalGroup(
            pn2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn2Layout.createSequentialGroup()
                .addComponent(pn4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pn2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPrePage)
                    .addComponent(lblChiSo)
                    .addComponent(btnNextPage))
                .addGap(0, 27, Short.MAX_VALUE))
        );

        tabs.addTab("Danh Sách", pn2);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Mã Khách Hàng");

        txtMaKhachHang.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Tên Khách Hàng");

        txtTenKhachHang.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Số Điện Thoại");

        txtSDT.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Giới Tính");

        buttonGroup1.add(rdoNam);
        rdoNam.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        rdoNam.setSelected(true);
        rdoNam.setText("Nam");

        buttonGroup1.add(rdoNu);
        rdoNu.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        rdoNu.setText("Nữ");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Ngày Sinh");

        DCNgaySinh.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtEmail.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Email");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Điểm Thưởng");

        txtDiemThuong.setEditable(false);
        txtDiemThuong.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtDiemThuong.setText("0");

        btnThem.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnSua.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        btnVoHieuHoa.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnVoHieuHoa.setText("Vô Hiệu Hóa");
        btnVoHieuHoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoHieuHoaActionPerformed(evt);
            }
        });

        btnMoi.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnMoi.setText("Mới");
        btnMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMoiActionPerformed(evt);
            }
        });

        btnLast.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnLast.setText(">|");
        btnLast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLastActionPerformed(evt);
            }
        });

        btnNext.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnNext.setText(">>");
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        btnPre.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnPre.setText("<<");
        btnPre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPreActionPerformed(evt);
            }
        });

        btnFirst.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnFirst.setText("|<");
        btnFirst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFirstActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Mã Nhân Viên");

        txtMaNV.setEditable(false);
        txtMaNV.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        javax.swing.GroupLayout pn3Layout = new javax.swing.GroupLayout(pn3);
        pn3.setLayout(pn3Layout);
        pn3Layout.setHorizontalGroup(
            pn3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pn3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pn3Layout.createSequentialGroup()
                        .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnVoHieuHoa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnFirst, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnPre, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnLast, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pn3Layout.createSequentialGroup()
                        .addGroup(pn3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(txtMaKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addGroup(pn3Layout.createSequentialGroup()
                                .addComponent(rdoNam)
                                .addGap(18, 18, 18)
                                .addComponent(rdoNu))
                            .addComponent(jLabel4)
                            .addComponent(txtSDT, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(txtDiemThuong, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pn3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTenKhachHang)
                            .addGroup(pn3Layout.createSequentialGroup()
                                .addGroup(pn3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel3)
                                    .addComponent(DCNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtMaNV, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        pn3Layout.setVerticalGroup(
            pn3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pn3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pn3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtMaKhachHang)
                    .addComponent(txtTenKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pn3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pn3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(DCNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pn3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rdoNam)
                        .addComponent(rdoNu)))
                .addGap(18, 18, 18)
                .addGroup(pn3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pn3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtSDT, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                    .addComponent(txtEmail))
                .addGap(18, 18, 18)
                .addGroup(pn3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pn3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtDiemThuong, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                    .addComponent(txtMaNV))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addGroup(pn3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVoHieuHoa, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLast, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPre, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFirst, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
        );

        tabs.addTab("Chi Tiết", pn3);

        javax.swing.GroupLayout pn1Layout = new javax.swing.GroupLayout(pn1);
        pn1.setLayout(pn1Layout);
        pn1Layout.setHorizontalGroup(
            pn1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn1Layout.createSequentialGroup()
                .addGap(237, 237, 237)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(tabs)
        );
        pn1Layout.setVerticalGroup(
            pn1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tabs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pn1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pn1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtTimKiemKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTimKiemKeyReleased
        timkiem();
    }//GEN-LAST:event_txtTimKiemKeyReleased

    private void tblDanhSachMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDanhSachMouseClicked
        if (evt.getClickCount() == 2) {
            this.row = tblDanhSach.getSelectedRow();
            this.edit();
        }
    }//GEN-LAST:event_tblDanhSachMouseClicked

    private void btnPrePageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrePageActionPerformed
        prePage();
        lblChiSo.setText(index + 1 + "");
    }//GEN-LAST:event_btnPrePageActionPerformed

    private void btnNextPageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextPageActionPerformed
        nextPage();
        lblChiSo.setText(index + 1 + "");
    }//GEN-LAST:event_btnNextPageActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        if (checkForm()) {
            insert();
        }
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        if (checkForm()) {
            update();
        }
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnVoHieuHoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoHieuHoaActionPerformed
        vohieuhoa();
    }//GEN-LAST:event_btnVoHieuHoaActionPerformed

    private void btnMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMoiActionPerformed
        clearForm();
    }//GEN-LAST:event_btnMoiActionPerformed

    private void btnFirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFirstActionPerformed
        first();
    }//GEN-LAST:event_btnFirstActionPerformed

    private void btnPreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPreActionPerformed
        prev();
    }//GEN-LAST:event_btnPreActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        next();
    }//GEN-LAST:event_btnNextActionPerformed

    private void btnLastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLastActionPerformed
        last();
    }//GEN-LAST:event_btnLastActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser DCNgaySinh;
    private javax.swing.JButton btnFirst;
    private javax.swing.JButton btnLast;
    private javax.swing.JButton btnMoi;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnNextPage;
    private javax.swing.JButton btnPre;
    private javax.swing.JButton btnPrePage;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnVoHieuHoa;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblChiSo;
    private javax.swing.JPanel pn1;
    private javax.swing.JPanel pn2;
    private javax.swing.JPanel pn3;
    private javax.swing.JPanel pn4;
    private javax.swing.JRadioButton rdoNam;
    private javax.swing.JRadioButton rdoNu;
    private javax.swing.JTabbedPane tabs;
    private javax.swing.JTable tblDanhSach;
    private javax.swing.JTextField txtDiemThuong;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtMaKhachHang;
    private javax.swing.JTextField txtMaNV;
    private javax.swing.JTextField txtSDT;
    private javax.swing.JTextField txtTenKhachHang;
    private javax.swing.JTextField txtTimKiem;
    // End of variables declaration//GEN-END:variables
    void init() {
        this.setResizable(false);
        tabs.setSelectedIndex(0);
        fillTable(0);
        lblChiSo.setText(index + 1 + "");
        this.row = -1;
        updateStatus();
        txtMaNV.setText(Auth.user.getMaNV());

        TableColumnModel mol = tblDanhSach.getColumnModel();
        mol.getColumn(0).setMaxWidth(55);
        mol.getColumn(1).setMaxWidth(170);
        mol.getColumn(2).setMaxWidth(115);
        mol.getColumn(3).setMaxWidth(160);
        mol.getColumn(4).setMaxWidth(80);
        mol.getColumn(5).setMaxWidth(70);
        mol.getColumn(6).setMaxWidth(50);
        mol.getColumn(7).setMaxWidth(80);
        tblDanhSach.setColumnModel(mol);

    }

    void insert() {
        KhachHang kh = getForm();
        try {
            dao.insert(kh);
            this.fillTable(0);
            this.clearForm();
            MsgBox.alert(this, "Thêm mới thành công !!");
            lblChiSo.setText(1 + "");
        } catch (Exception e) {
            e.printStackTrace();
            MsgBox.alert(this, "Mã KH đã tồn tại !!");
        }
    }

    void update() {
        KhachHang kh = getForm();
        try {
            dao.update(kh);
            this.fillTable(0);
            MsgBox.alert(this, "Sửa thành công !!");
            lblChiSo.setText(1 + "");
        } catch (Exception e) {
            e.printStackTrace();
            MsgBox.alert(this, "Sửa thất bại !!");
        }

    }

    void vohieuhoa() {
        if (!Auth.isManager()) {
            MsgBox.alert(this, "Bạn không có quyền vô hiệu hóa khách hàng !!");
        } else {
            String maKH = txtMaKhachHang.getText();
            if (MsgBox.confirm(this, "Bạn thực sự muốn vô hiệu hóa nhân viên này ?")) {
                try {
                    dao.vohieuhoa(maKH);
                    fillTable(0);
                    clearForm();
                    MsgBox.alert(this, "Vô hiệu hóa thành công !!");
                    lblChiSo.setText(1 + "");
                } catch (Exception e) {
                    e.printStackTrace();
                    MsgBox.alert(this, "Vô hiệu hóa thất bại !!");
                }
            }
        }
    }

    void clearForm() {
        txtMaKhachHang.setText("");
        txtTenKhachHang.setText("");
        txtSDT.setText("");
        txtEmail.setText("");
        DCNgaySinh.setDate(null);
        txtDiemThuong.setText("0");
        txtMaNV.setText(Auth.user.getMaNV());
        this.row = -1;
        this.updateStatus();
    }

    void edit() {
        String makh = (String) tblDanhSach.getValueAt(row, 0);
        KhachHang kh = dao.selectById(makh);
        setForm(kh);
        tabs.setSelectedIndex(1);
        updateStatus();
    }

    void first() {
        this.row = 0;
        this.edit();
    }

    void prev() {
        if (this.row > 0) {
            this.row--;
            this.edit();
        }
    }

    void next() {
        if (this.row < tblDanhSach.getRowCount() - 1) {
            this.row++;
            this.edit();
        }
    }

    void last() {
        this.row = tblDanhSach.getRowCount() - 1;
        this.edit();
    }

    void fillTable(int index) {
        DefaultTableModel mol = (DefaultTableModel) tblDanhSach.getModel();
        mol.setRowCount(0);
        try {
            List<KhachHang> listkh = dao.selectPage(index);
            for (KhachHang kh : listkh) {
                Object[] row = {kh.getMaKH(), kh.getTenKH(), kh.getsDT(), kh.getEmail(), kh.getNgaySinh(),
                    kh.isGioiTinh() ? "Nam" : "Nữ", kh.getDiemThuong(), kh.getMaNV()};
                mol.addRow(row);
            }
            lblChiSo.setText(index + 1 + "");
        } catch (Exception e) {
            e.printStackTrace();
            MsgBox.alert(this, "Lỗi truy vấn dữ liệu !");
        }
    }
    List<KhachHang> list = dao.selectAll();
    double count = (list.size() / 5);

    void updatePage() {
        boolean page = (this.index >= 0);
        boolean fpage = (this.index == 0);
        boolean lpage = (this.index == Math.round(count));
        btnNextPage.setEnabled(page && !lpage);
        btnPrePage.setEnabled(page && !fpage);
    }

    void prePage() {
        if (index > 0) {
            index--;
            fillTable(index);
            updatePage();
        }
    }

    void nextPage() {
        if (index < count) {
            index++;
            fillTable(index);
            updatePage();
        }
    }

    void setForm(KhachHang kh) {
        txtMaKhachHang.setText(kh.getMaKH());
        txtTenKhachHang.setText(String.valueOf(kh.getTenKH()));
        rdoNam.setSelected(kh.isGioiTinh());
        DCNgaySinh.setDate(XDate.toDate(kh.getNgaySinh(), "yyyy-MM-dd"));
        txtSDT.setText(kh.getsDT());
        txtEmail.setText(kh.getEmail());
        txtDiemThuong.setText(kh.getDiemThuong() + "");
        txtMaNV.setText(kh.getMaNV());
    }

    KhachHang getForm() {
        KhachHang kh = new KhachHang();
        kh.setMaKH(txtMaKhachHang.getText());
        kh.setTenKH(txtTenKhachHang.getText());
        kh.setGioiTinh(rdoNam.isSelected());
        kh.setNgaySinh(XDate.toString(DCNgaySinh.getDate(), "yyyy-MM-dd"));
        kh.setsDT(txtSDT.getText());
        kh.setEmail(txtEmail.getText());
        kh.setDiemThuong(Integer.parseInt(txtDiemThuong.getText()));
        kh.setMaNV(Auth.user.getMaNV());
        return kh;
    }

    void updateStatus() {
        boolean edit = (this.row >= 0);
        boolean first = (this.row == 0);
        boolean last = (this.row == tblDanhSach.getRowCount() - 1);
        //trạng thái form
        txtMaKhachHang.setEditable(!edit);
        btnThem.setEnabled(!edit);
        btnSua.setEnabled(edit);
        btnVoHieuHoa.setEnabled(edit);
        //trạng thái điều hướng
        btnFirst.setEnabled(edit && !first);
        btnPre.setEnabled(edit && !first);
        btnNext.setEnabled(edit && !last);
        btnLast.setEnabled(edit && !last);
    }

    void timkiem() {
        this.fillTable(0);
        this.row = -1;
        this.updateStatus();
    }

    boolean checkForm() {
        if (txtMaKhachHang.getText().equals("")) {
            MsgBox.alert(this, "Không để trống mã khách hàng");
            txtMaKhachHang.requestFocus();
            return false;
        } else if (txtTenKhachHang.getText().equals("")) {
            MsgBox.alert(this, "Không để trống họ tên");
            txtTenKhachHang.requestFocus();
            return false;
//        } else if (txtTenNV.getText().equals("")) {
//            MsgBox.alert(this, "Không để trống họ tên");
//            txtTenNV.requestFocus();
//            return false;
//        } else if (txtTenNV.getText().equals("")) {
//            MsgBox.alert(this, "Không để trống họ tên");
//            txtTenNV.requestFocus();
//            return false;
        } else {
            return true;
        }
    }
}
