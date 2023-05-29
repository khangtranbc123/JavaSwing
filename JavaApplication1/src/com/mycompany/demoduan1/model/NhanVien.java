/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.demoduan1.model;

/**
 *
 * @author Admin
 */

public class NhanVien {
    private String MaNV;
    private String MatKhau;
    private String HoTen;
    private Boolean vaiTro;

    @Override
    public String toString() {
        return "NhanVien{" + "MaNV=" + MaNV + ", MatKhau=" + MatKhau + ", HoTen=" + HoTen + ", vaiTro=" + vaiTro + '}';
    }

    public String getMaNV() {
        return MaNV;
    }

    public void setMaNV(String MaNV) {
        this.MaNV = MaNV;
    }

    public String getMatKhau() {
        return MatKhau;
    }

    public void setMatKhau(String MatKhau) {
        this.MatKhau = MatKhau;
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String HoTen) {
        this.HoTen = HoTen;
    }

    public Boolean getVaiTro() {
        return vaiTro;
    }

    public void setVaiTro(Boolean vaiTro) {
        this.vaiTro = vaiTro;
    }

   
    
    
}
