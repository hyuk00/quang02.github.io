package com.shoessys.ui;

import com.shoessys.DAO.NhaCungCapDAO;
import com.shoessys.entity.NhaCungCap;
import com.shoessys.utils.MsgBox;
import java.awt.Color;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

public class NhaCungCapJInternalFrame extends javax.swing.JInternalFrame {

    NhaCungCapDAO dao = new NhaCungCapDAO();
    int row = -1;
    int index = 0;

    public NhaCungCapJInternalFrame(Color color) {
        initComponents();
        pn2.setBackground(color);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pn1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        pn2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDanhSach = new javax.swing.JTable();
        btnPreDS = new javax.swing.JButton();
        btnNextDS = new javax.swing.JButton();
        lblChiSoDS = new javax.swing.JLabel();
        txtMaNCC = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtDiaChi = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtSDT = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtTenNCC = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        btnThem = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnVoHieuHoa = new javax.swing.JButton();
        btnMoi = new javax.swing.JButton();
        btnLast = new javax.swing.JButton();
        btnNext = new javax.swing.JButton();
        btnPre = new javax.swing.JButton();
        btnFirst = new javax.swing.JButton();

        setTitle("ShoesSys StartUp - Quản Lí Nhà Cung Cấp");

        pn1.setBackground(new java.awt.Color(255, 204, 204));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Nhà Cung Cấp");

        tblDanhSach.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Mã NCC", "Tên NCC", "Địa Chỉ", "Số Điện Thoại", "Email"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblDanhSach.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDanhSachMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblDanhSach);

        btnPreDS.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnPreDS.setText("<<");
        btnPreDS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPreDSActionPerformed(evt);
            }
        });

        btnNextDS.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnNextDS.setText(">>");
        btnNextDS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextDSActionPerformed(evt);
            }
        });

        lblChiSoDS.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblChiSoDS.setText("1");

        txtMaNCC.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Mã Nhà Cung Cấp");

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setText("Địa Chỉ");

        txtDiaChi.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setText("SĐT");

        txtSDT.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel16.setText("Tên Nhà Cung Cấp");

        txtTenNCC.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtEmail.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel17.setText("Email");

        btnThem.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnThem.setText("Thêm");
        btnThem.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnSua.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnSua.setText("Sửa");
        btnSua.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnVoHieuHoa.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnVoHieuHoa.setText("Vô Hiệu Hóa");
        btnVoHieuHoa.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnMoi.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnMoi.setText("Mới");
        btnMoi.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnLast.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnLast.setText(">|");
        btnLast.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnNext.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnNext.setText(">>");
        btnNext.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnPre.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnPre.setText("<<");
        btnPre.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnFirst.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnFirst.setText("|<");
        btnFirst.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout pn2Layout = new javax.swing.GroupLayout(pn2);
        pn2.setLayout(pn2Layout);
        pn2Layout.setHorizontalGroup(
            pn2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pn2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn2Layout.createSequentialGroup()
                        .addGroup(pn2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(pn2Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(18, 18, 18)
                                .addComponent(txtMaNCC))
                            .addGroup(pn2Layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(pn2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pn2Layout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtSDT, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel16))
                        .addGap(18, 18, 18)
                        .addGroup(pn2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pn2Layout.createSequentialGroup()
                                .addComponent(jLabel17)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtEmail))
                            .addGroup(pn2Layout.createSequentialGroup()
                                .addGap(0, 4, Short.MAX_VALUE)
                                .addComponent(txtTenNCC, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(pn2Layout.createSequentialGroup()
                        .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(pn2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pn2Layout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addComponent(btnPreDS)
                                .addGap(18, 18, 18)
                                .addComponent(lblChiSoDS)
                                .addGap(18, 18, 18)
                                .addComponent(btnNextDS))
                            .addGroup(pn2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnVoHieuHoa, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnFirst, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnPre, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnLast, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        pn2Layout.setVerticalGroup(
            pn2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pn2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtMaNCC, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16)
                    .addComponent(txtTenNCC, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pn2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txtDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(txtSDT, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pn2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPreDS)
                    .addComponent(btnNextDS)
                    .addComponent(lblChiSoDS))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(pn2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVoHieuHoa, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLast)
                    .addComponent(btnNext)
                    .addComponent(btnPre)
                    .addComponent(btnFirst))
                .addContainerGap())
        );

        javax.swing.GroupLayout pn1Layout = new javax.swing.GroupLayout(pn1);
        pn1.setLayout(pn1Layout);
        pn1Layout.setHorizontalGroup(
            pn1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn1Layout.createSequentialGroup()
                .addGroup(pn1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pn1Layout.createSequentialGroup()
                        .addGap(219, 219, 219)
                        .addComponent(jLabel1))
                    .addGroup(pn1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(pn2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pn1Layout.setVerticalGroup(
            pn1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pn2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pn1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pn1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPreDSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPreDSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPreDSActionPerformed

    private void btnNextDSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextDSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNextDSActionPerformed

    private void tblDanhSachMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDanhSachMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblDanhSachMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFirst;
    private javax.swing.JButton btnLast;
    private javax.swing.JButton btnMoi;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnNextDS;
    private javax.swing.JButton btnPre;
    private javax.swing.JButton btnPreDS;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnVoHieuHoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblChiSoDS;
    private javax.swing.JPanel pn1;
    private javax.swing.JPanel pn2;
    private javax.swing.JTable tblDanhSach;
    private javax.swing.JTextField txtDiaChi;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtMaNCC;
    private javax.swing.JTextField txtSDT;
    private javax.swing.JTextField txtTenNCC;
    // End of variables declaration//GEN-END:variables
    void init() {
        this.setResizable(false);
        this.fillTable(0);
        lblChiSoDS.setText(1 + "");
        this.row = -1;
        this.updateStatus();

        TableColumnModel mol = tblDanhSach.getColumnModel();
        mol.getColumn(0).setMaxWidth(70);
        mol.getColumn(1).setMaxWidth(170);
        mol.getColumn(2).setMaxWidth(120);
        mol.getColumn(3).setMaxWidth(100);
        mol.getColumn(4).setMaxWidth(110);
        tblDanhSach.setColumnModel(mol);
    }

    void fillTable(int index) {
        DefaultTableModel mol = (DefaultTableModel) tblDanhSach.getModel();
        mol.setRowCount(0);
        try {
            List<NhaCungCap> listncc = dao.selectPage(index);
            for (NhaCungCap ncc : listncc) {
                Object[] row = {ncc.getMaNCC(), ncc.getTenNCC(), ncc.getDiaChi(), ncc.getsDT(), ncc.getEmail()};
                mol.addRow(row);
            }
        } catch (Exception e) {
            e.printStackTrace();
            MsgBox.alert(this, "Lỗi truy vấn dữ liệu !");
        }
    }

    List<NhaCungCap> list = dao.selectAll();
    double count = (list.size() / 5);

    void updatePage() {
        boolean page = (this.index >= 0);
        boolean fpage = (this.index == 0);
        boolean lpage = (this.index == Math.round(count));
        btnNextDS.setEnabled(page && !lpage);
        btnPreDS.setEnabled(page && !fpage);
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

    void setForm(NhaCungCap ncc) {
        txtMaNCC.setText(ncc.getMaNCC());
        txtTenNCC.setText(ncc.getTenNCC());
        txtDiaChi.setText(ncc.getDiaChi());
        txtSDT.setText(ncc.getsDT());
        txtEmail.setText(ncc.getEmail());
    }

    NhaCungCap getForm() {
        NhaCungCap ncc = new NhaCungCap();
        ncc.setMaNCC(txtMaNCC.getText());
        ncc.setTenNCC(txtTenNCC.getText());
        ncc.setDiaChi(txtDiaChi.getText());
        ncc.setsDT(txtSDT.getText());
        ncc.setEmail(txtEmail.getText());
        return ncc;
    }

    void clearForm() {
        txtMaNCC.setText("");
        txtTenNCC.setText("");
        txtDiaChi.setText("");
        txtSDT.setText("");
        txtEmail.setText("");
        this.row = -1;
        this.updateStatus();
    }

    void updateStatus() {
        boolean edit = (this.row >= 0);
        boolean first = (this.row == 0);
        boolean last = (this.row == tblDanhSach.getRowCount() - 1);
        //trạng thái form
        txtMaNCC.setEditable(!edit);
        btnThem.setEnabled(!edit);
        btnSua.setEnabled(edit);
        btnVoHieuHoa.setEnabled(edit);
        //trạng thái điều hướng
        btnFirst.setEnabled(edit && !first);
        btnPre.setEnabled(edit && !first);
        btnNext.setEnabled(edit && !last);
        btnLast.setEnabled(edit && !last);
    }

    void insert() {
        NhaCungCap ncc = getForm();
        try {
            dao.insert(ncc);
            this.fillTable(0);
            lblChiSoDS.setText(1 + "");
            this.clearForm();
            MsgBox.alert(this, "Thêm mới thành công !!");
        } catch (Exception e) {
            e.printStackTrace();
            MsgBox.alert(this, "Thêm mới thất bại !!");
        }
    }

    void update() {
        NhaCungCap ncc = getForm();
        try {
            dao.update(ncc);
            this.fillTable(0);
            lblChiSoDS.setText(1 + "");
            MsgBox.alert(this, "Sửa thành công !!");
        } catch (Exception e) {
            e.printStackTrace();
            MsgBox.alert(this, "Sửa thất bại !!");
        }
    }

    void delete() {
        String mancc = txtMaNCC.getText();
        if (MsgBox.confirm(this, "Bạn thực sự muốn vô hiệu hóa nhà cung cấp này ?")) {
            try {
                dao.delete(mancc);
                fillTable(0);
                lblChiSoDS.setText(1 + "");
                clearForm();
                MsgBox.alert(this, "Vô hiệu hóa thành công !!");
            } catch (Exception e) {
                e.printStackTrace();
                MsgBox.alert(this, "Vô hiệu hóa thất bại !!");
            }
        }
    }

    void edit() {
        String mancc = (String) tblDanhSach.getValueAt(row, 0);
        NhaCungCap ncc = dao.selectById(mancc);
        setForm(ncc);
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

//    boolean checkForm() {
//        if (txtMaNCC.getText().equals("")) {
//            MsgBox.alert(this, "Không bỏ trống mã");
//            txtMaNCC.requestFocus();
//            return false;
//        } else if (txtTenNCC.getText().equals("")) {
//            MsgBox.alert(this, "Không bỏ trống tên nhà cung cấp");
//            txtTenNCC.requestFocus();
//            return false;
//        } else if (txtDiaChi.getText().equals("")) {
//            MsgBox.alert(this, "không để trống địa chỉ");
//            txtDiaChi.requestFocus();
//            return false;
//        } else if (txtSDT.getText().equals("")) {
//            MsgBox.alert(this, "không để trống số điện thoại");
//            txtSDT.requestFocus();
//            return false;
//        } else if (txtEmail.getText().equals("")) {
//            MsgBox.alert(this, "không để trống email");
//            txtEmail.requestFocus();
//            return false;
//        }
//    }
}

