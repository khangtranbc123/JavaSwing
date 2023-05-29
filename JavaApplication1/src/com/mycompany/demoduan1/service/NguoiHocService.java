/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.demoduan1.service;

import com.mycompany.demoduan1.hellper.MsgBox;
import com.mycompany.demoduan1.icon.hellper.dao.NguoiHocDAO;
import com.mycompany.demoduan1.model.NguoiHoc;
import java.util.List;

/**
 *
 * @author Admin
 */
public class NguoiHocService {
    NguoiHocDAO nguoiHocDAO = new NguoiHocDAO();
    
    public List<NguoiHoc> getList(String maNH){
        List<NguoiHoc> res = nguoiHocDAO.selectByKeyword(maNH);
        return res;
    }
    public NguoiHoc getById(String maNH) {
        NguoiHoc nguoiHoc = nguoiHocDAO.selectById(maNH);
        return nguoiHoc;
    }
    public void insert(NguoiHoc nguoiHoc) {
        try {
            nguoiHocDAO.insert(nguoiHoc);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void update(NguoiHoc nguoiHoc) {
            nguoiHocDAO.update(nguoiHoc);
    }
    public void delete(String maNH) {
        nguoiHocDAO.delete(maNH);
    }
}
