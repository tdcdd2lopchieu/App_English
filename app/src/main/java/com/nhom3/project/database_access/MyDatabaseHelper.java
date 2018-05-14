package com.nhom3.project.database_access;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Toast;

import java.util.ArrayList;

import com.nhom3.project.data_models.NhanSu;

/**
 * Created by IT on 10/25/2017.
 */

public class MyDatabaseHelper extends SQLiteOpenHelper {
    private static  final String DB_NAME = "project";
    private static  final int BD_VERSION = 1;

    public  static  final  String DB_TABLE_USER= "user";
    private static  final  String COLUM_ID = "_id";
    private static  final  String COLUM_NAME = "ho_ten";
    private static  final  String COLUM_DEGREE = "bang_cap";
    private static  final  String COLUM_HOBBIES = "so_thich";

    public MyDatabaseHelper(Context context) {
        super(context, DB_NAME, null,BD_VERSION);
    }

    @Override

    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(
                "CREATE TABLE " + DB_TABLE_USER + "(" +
                        COLUM_ID + " INTEGER PRIMARY KEY AUTOINCREMENT," +
                        COLUM_NAME + " TEXT," +
                        COLUM_DEGREE + " INTEGER," +
                        COLUM_HOBBIES + " TEXT)"
        );
    }

    public void saveDatabase (ArrayList<NhanSu> nhanSus)
    {
        SQLiteDatabase db = getWritableDatabase();
        for (NhanSu nhanVien:nhanSus)
        {
            ContentValues values = new ContentValues();
            values.put(COLUM_NAME,nhanVien.getName());
            values.put(COLUM_DEGREE,nhanVien.getDegreen());
            values.put(COLUM_HOBBIES,nhanVien.getHobby());
            db.insert(DB_TABLE_USER,null,values);
        }
        db.close();
    }

    public  void  loadDatabse(ArrayList<NhanSu> nhanSus)
    {
        SQLiteDatabase db = getWritableDatabase();
        Cursor cursor = db.query(DB_TABLE_USER,new String[] {COLUM_NAME,COLUM_DEGREE,COLUM_HOBBIES}, null,null,null,null,null);

        if(cursor.moveToFirst())
        {
            do {
                String name = cursor.getString(cursor.getColumnIndex(COLUM_NAME));
                int degree = Integer.parseInt(cursor.getString(cursor.getColumnIndex(COLUM_DEGREE)));
                String hobby = cursor.getString(cursor.getColumnIndex(COLUM_HOBBIES));
                nhanSus.add(new NhanSu(name,degree,hobby));

            }while (cursor.moveToNext());
        }

        db.close();
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
