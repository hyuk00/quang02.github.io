package com.shoessys.DAO;

import com.shoessys.entity.NhaCungCap;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class NhaCungCapDAO extends ShoesSysDAO<NhaCungCap, String> {

    String SQL_Insert = "INSERT INTO dbo.NhaCungCap (MaNCC, TenNCC, DiaChi, SDT, Email)  VALUES (?,?,?,?,?)";
    String SQL_Update = "UPDATE dbo.NhaCungCap SET TenNCC=?, DiaChi=?, SDT=?, Email=? WHERE MaNCC=?";
    String SQL_Delete = "DELETE FROM dbo.NhaCungCap WHERE MaNCC=?";
    String SQL_SelectALL = "SELECT * FROM dbo.NhaCungCap";
    String SQL_SelectID = "SELECT * FROM dbo.NhaCungCap WHERE MaNCC=?";

    @Override
    public void insert(NhaCungCap entity) {
        try {
            jdbcHelper.JdbcHelper.update(SQL_Insert,
                    entity.getMaNCC(), entity.getTenNCC(), entity.getDiaChi(), entity.getsDT(), entity.getEmail());
        } catch (SQLException ex) {
            Logger.getLogger(NhaCungCapDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void update(NhaCungCap entity) {
        try {
            jdbcHelper.JdbcHelper.update(SQL_Update,
                    entity.getTenNCC(), entity.getDiaChi(), entity.getsDT(), entity.getEmail(), entity.getMaNCC());
        } catch (SQLException ex) {
            Logger.getLogger(NhaCungCapDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public List<NhaCungCap> selectAll() {
        return this.selectBySql(SQL_SelectALL);
    }

    @Override
    public NhaCungCap selectById(String id) {
        List<NhaCungCap> list = this.selectBySql(SQL_SelectID, id);
        return list.isEmpty() ? null : list.get(0);
    }

    @Override
    protected List<NhaCungCap> selectBySql(String sql, Object... args) {
        List<NhaCungCap> list = new ArrayList<>();
        try {
            ResultSet rs = jdbcHelper.JdbcHelper.query(sql, args);
            while (rs.next()) {
                NhaCungCap entity = new NhaCungCap();
                entity.setMaNCC(rs.getString("MaNCC"));
                entity.setTenNCC(rs.getString("TenNCC"));
                entity.setDiaChi(rs.getString("DiaChi"));
                entity.setsDT(rs.getString("SDT"));
                entity.setEmail(rs.getString("Email"));
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public List<NhaCungCap> selectPage(int index) {
        String sql = "SELECT * FROM dbo.NhaCungCap\n" +
                     "ORDER BY MaNCC OFFSET ? * 10 ROWS FETCH NEXT 10 ROWS ONLY;";
        return this.selectBySql(sql, index);
    }

}
