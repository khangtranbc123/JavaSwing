/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.demoduan1.model;
/**
 *
 * @author balis
 */
public class Auth {

    public static NhanVien user = null;

    public static void clear() {
        Auth.user = null;
    }

    public static boolean isLogin() {
        return Auth.user != null;
    }

    public static boolean isManager() {
        boolean isManager;
        if (user.getVaiTro()==1){
            isManager = true;
        } else {
            isManager = false;
        }
        return Auth.isLogin() && isManager;
    }
}