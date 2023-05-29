/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.demoduan1.service;

import com.mycompany.demoduan1.icon.hellper.dao.NhanVienDAO;
import com.mycompany.demoduan1.model.Auth;
import com.mycompany.demoduan1.model.NhanVien;

/**
 *
 * @author Admin
 */
public class NhanVienService {
    public NhanVienDAO nhanVienDAO = new NhanVienDAO();
    public Integer login(NhanVien request) {
        NhanVien nhanVien = nhanVienDAO.selectById(request.getMaNV());
        if (nhanVien == null ) {
            return 1;
        } else if(request.getMatKhau().equals(nhanVien.getMatKhau())) {
            return 2;
        } else {
            Auth.user = nhanVien;
            return 3;
        }
    }
}
