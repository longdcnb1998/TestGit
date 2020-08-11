package com.example.testsqlite;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;
import java.util.List;

public class NhanVienDAO {

    public NhanVienDBHelper helper;
    public SQLiteDatabase database;

    public NhanVienDAO(Context context) {
       helper = new NhanVienDBHelper(context);
    }

    public void open(){
        helper.getWritableDatabase();
    }

    public void close(){
        helper.close();
    }

    public boolean insert (NhanVien nhanVien){
        SQLiteDatabase database =
        ContentValues values = new ContentValues();
        values.put(NhanVienDBHelper.id, nhanVien.getId());
        values.put(NhanVienDBHelper.username, nhanVien.getUsername());
        values.put(NhanVienDBHelper.password, nhanVien.getPassword());
        values.put(NhanVienDBHelper.ChucVu, nhanVien.getChucVu());
        values.put(NhanVienDBHelper.PhongBan, nhanVien.getPhongBan());
        values.put(NhanVienDBHelper.type,nhanVien.getType());
        long add_result = database.insert(NhanVienDBHelper.database_name,null,values);
        if (add_result !=0){
            return true;
        }
        return false;
    }

    public boolean update (NhanVien nhanVien){
        ContentValues values = new ContentValues();
        values.put(NhanVienDBHelper.id, nhanVien.getId());
        values.put(NhanVienDBHelper.username, nhanVien.getUsername());
        values.put(NhanVienDBHelper.password, nhanVien.getPassword());
        values.put(NhanVienDBHelper.ChucVu, nhanVien.getChucVu());
        values.put(NhanVienDBHelper.PhongBan, nhanVien.getPhongBan());
        values.put(NhanVienDBHelper.type,nhanVien.getType());
//        long add_result = database.update(NhanVienDBHelper.database_name,null,values);
//        if (add_result !=0){
//            return true;
//        }
        return false;
    }

    public List<NhanVien> getAllNhanVien(){
        List<NhanVien> list = new ArrayList<>();
        String queryNhanVien  = "SELECT * FROM "+NhanVienDBHelper.database_name;


        return list;
    }

}
