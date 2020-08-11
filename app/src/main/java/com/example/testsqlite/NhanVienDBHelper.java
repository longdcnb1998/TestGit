package com.example.testsqlite;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class NhanVienDBHelper extends SQLiteOpenHelper {

    public static String database_name ="tb_nhan_vien";
    public static int database_version = 1;
    public static String id ="id";
    public static String username ="username";
    public static String password ="password";
    public static String ChucVu ="ChucVu";
    public static String PhongBan ="PhongBan";
    public static String type ="type";
    private String createTableNhanVien = "CREATE TABLE "+database_name+" ("+id+" PRIMARY KEY AUTOINCREMENT, "+username+" TEXT, "+password+" TEXT, "+ChucVu+" TEXT, "+PhongBan+" TEXT, "+type+" INTEGER )";

    public NhanVienDBHelper(@Nullable Context context) {
        super(context, database_name, null, database_version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(createTableNhanVien);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS "+database_name);
        onCreate(db);
    }
}
