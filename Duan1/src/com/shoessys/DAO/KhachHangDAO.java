package com.shoessys.DAO;

import com.shoessys.entity.KhachHang;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class KhachHangDAO extends ShoesSysDAO<KhachHang, String> {

    String SQL_Insert = "INSERT INTO dbo.KhachHang (MaKH, TenKH, SDT, Email, NgaySinh, GioiTinh, TichDiem, MaNV)  VALUES (?,?,?,?,?,?,?,?)";
    String SQL_Update = "UPDATE dbo.KhachHang SET TenKH=?, SDT=?, Email=?, NgaySinh=?, GioiTinh=?, TichDiem=?, MaNV=? WHERE MaKH=?";
    String SQL_Delete = "DELETE FROM dbo.KhachHang WHERE MaKH=?";
    String SQL_SelectALL = "SELECT * FROM dbo.KhachHang";
    String SQL_SelectID = "SELECT * FROM dbo.KhachHang WHERE MaKH=?";

    @Override
    public void insert(KhachHang entity) {
        try {
            jdbcHelper.JdbcHelper.update(SQL_Insert, entity.getMaKH(), entity.getTenKH(), entity.getEmail(), entity.getNgaySinh(), entity.isGioiTinh(), entity.getDiemThuong(), entity.getMaNV());
        } catch (SQLException ex) {
            Logger.getLogger(KhachHangDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void update(KhachHang entity) {
        try {
            jdbcHelper.JdbcHelper.update(SQL_Update, entity.getTenKH(), entity.getsDT(), entity.getEmail(), entity.getNgaySinh(), entity.isGioiTinh(), entity.getDiemThuong(), entity.getMaNV(), entity.getMaKH());
        } catch (SQLException ex) {
            Logger.getLogger(KhachHangDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public List<KhachHang> selectAll() {
        return this.selectBySql(SQL_SelectALL);
    }

    @Override
    public KhachHang selectById(String id) {
        List<KhachHang> list = this.selectBySql(SQL_SelectID, id);
        return list.isEmpty() ? null : list.get(0);
    }

    @Override
    protected List<KhachHang> selectBySql(String sql, Object... args) {
        List<KhachHang> list = new ArrayList<>();
        try {
            ResultSet rs = jdbcHelper.JdbcHelper.query(sql, args);
            while(rs.next()){
                KhachHang entity = new KhachHang();
                entity.setMaKH(rs.getString("MaKH"));
                entity.setTenKH(rs.getString("TenKH"));
                entity.setsDT(rs.getString("SDT"));
                entity.setEmail(rs.getString("Email"));
                entity.setNgaySinh(rs.getString("NgaySinh"));
                entity.setGioiTinh(rs.getBoolean("GioiTinh"));
                entity.setDiemThuong(rs.getInt("TichDiem"));
                entity.setMaNV(rs.getString("MaNV"));
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
