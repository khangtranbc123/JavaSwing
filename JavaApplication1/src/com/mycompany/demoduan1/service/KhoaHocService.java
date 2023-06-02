/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.demoduan1.service;

import com.mycompany.demoduan1.icon.hellper.dao.CrudMethod;
import com.mycompany.demoduan1.icon.hellper.dao.KhoaHocDAO;
import com.mycompany.demoduan1.model.KhoaHoc;
import java.util.List;

/**
 *
 * @author Admin
 */
public class KhoaHocService extends CrudMethod<KhoaHoc, Integer>{
    KhoaHocDAO khoaHocDAO = new KhoaHocDAO();

    @Override
    public void insert(KhoaHoc entity) {
        khoaHocDAO.insert(entity);
    }

    @Override
    public void update(KhoaHoc entity) {
        khoaHocDAO.update(entity);
    }

    @Override
    public List<KhoaHoc> selectAll() {
        return khoaHocDAO.selectAll();
    }

  

    @Override
    public void delete(Integer id) {
        khoaHocDAO.delete(id);
    }

    @Override
    public KhoaHoc selectById(Integer id) {
        return khoaHocDAO.selectById(id);
    }

    @Override
    protected List<KhoaHoc> selectBySQL(String sql, Object... args) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
