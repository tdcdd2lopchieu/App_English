package com.nhom3.project.database_access;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;

import com.nhom3.project.data_models.Questions;
import com.nhom3.project.data_models.Users;

/**
 * Created by IT on 10/25/2017.
 */

public class MyDatabaseHelper extends SQLiteOpenHelper {
    private static  final String DB_NAME = "appEng";
    private static  final int BD_VERSION = 1;

    //table users
    public  static  final  String DB_TABLE_USER= "users";
    private static  final  String COLUM_USER_ID = "_id";
    private static  final  String COLUM_NAME = "name";
    private static  final  String COLUM_TEST_ID = "test_id";

    //table questions
    public  static  final  String DB_TABLE_QUES= "questions";
    private static  final  String COLUM_QUES_ID = "_id";
    private  static  final  String COLUM_TYPE= "type";
    private  static  final  String COLUM_DESC= "description";
    private  static  final  String COLUM_CONTENT= "content";
    private  static  final  String COLUM_SCORE= "score";
    private  static  final  String COLUM_SOUND= "sound";
    private  static  final  String COLUM_IMG= "image";


    public MyDatabaseHelper(Context context) {
        super(context, DB_NAME, null,BD_VERSION);
    }

    @Override

    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(
                "CREATE TABLE " + DB_TABLE_USER + "(" +
                        COLUM_USER_ID + " INTEGER PRIMARY KEY AUTOINCREMENT," +
                        COLUM_NAME + " TEXT," +
                        COLUM_TEST_ID + " INTEGER)"
        );
        sqLiteDatabase.execSQL(
                "CREATE TABLE " + DB_TABLE_QUES + "(" +
                        COLUM_QUES_ID + " INTEGER PRIMARY KEY AUTOINCREMENT," +
                        COLUM_TYPE + " INTEGER," +
                        COLUM_DESC + " TEXT," +
                        COLUM_CONTENT + " TEXT," +
                        COLUM_SCORE + " INTEGER," +
                        COLUM_SOUND + " TEXT," +
                        COLUM_IMG + " TEXT)"
        );
    }


    public  void  loadDatabse(ArrayList<Questions> questions)
    {
        SQLiteDatabase db = getWritableDatabase();
        Cursor cursor = db.query(DB_TABLE_QUES,new String[] {COLUM_TYPE,COLUM_DESC,COLUM_CONTENT,COLUM_SCORE,COLUM_SOUND,COLUM_IMG}, null,null,null,null,null);

        if(cursor.moveToFirst())
        {
            do {
                int type = Integer.parseInt(cursor.getString(cursor.getColumnIndex(COLUM_TYPE)));
                int score = Integer.parseInt(cursor.getString(cursor.getColumnIndex(COLUM_SCORE)));
                String decs = cursor.getString(cursor.getColumnIndex(COLUM_DESC));
                String content = cursor.getString(cursor.getColumnIndex(COLUM_CONTENT));
                String sound = cursor.getString(cursor.getColumnIndex(COLUM_SOUND));
                String img = cursor.getString(cursor.getColumnIndex(COLUM_IMG));
                questions.add(new Questions(type,decs,content,score,sound,img));

            }while (cursor.moveToNext());
        }

        db.close();
    }

    public  void  saveUser(Users user)
    {
        SQLiteDatabase db = getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(COLUM_NAME,user.getUserName());
        values.put(COLUM_TEST_ID,0);
        db.insert(DB_TABLE_USER,null,values);

        db.close();
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
