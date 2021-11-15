package com.shoessys.entity;

public class SanPham {

    private String maSP;
    private String maThuongHieu;
    private String tenSP;
    private double donGia;
    private int soLuong;
    private String anhSP;
    private String chiTiet;

    public SanPham(String maSP, String maThuongHieu, String tenSP, double donGia, int soLuong, String anhSP, String chiTiet) {
        this.maSP = maSP;
        this.maThuongHieu = maThuongHieu;
        this.tenSP = tenSP;
        this.donGia = donGia;
        this.soLuong = soLuong;
        this.anhSP = anhSP;
        this.chiTiet = chiTiet;
    }

    public SanPham() {
    }

    public String getMaSP() {
        return maSP;
    }

    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    public String getMaThuongHieu() {
        return maThuongHieu;
    }

    public void setThuongHieu(String maThuongHieu) {
        this.maThuongHieu = maThuongHieu;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public String getAnhSP() {
        return anhSP;
    }

    public void setAnhSP(String anhSP) {
        this.anhSP = anhSP;
    }

    public String getChiTiet() {
        return chiTiet;
    }

    public void setChiTiet(String chiTiet) {
        this.chiTiet = chiTiet;
    }

}
