package com.nirjhor.birthday;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by nirjhor on 5/21/2017.
 */

public class MyDBFunctions extends SQLiteOpenHelper{

    private static final String DatabaseName = "mydb";
    private static final String TableName = "mytab";


    private static final String Tab_Id = "id";
    private static final String Tab_Name = "name";
    private static final String Tab_Days = "days";



    public MyDBFunctions(Context context) {
        super(context, DatabaseName, null, 1);     //contex , factory = null, version = 1
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        String s = "create table "+TableName+"("+Tab_Id+"integer primary key,"+Tab_Name+"text,"+Tab_Days+"text)";


    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    //Adding Data to Database ---- --------- ----

    void addingDataToTable(DataTemp dataTemp)
    {

        SQLiteDatabase sqLiteDatabase = this.getWritableDatabase();

        ContentValues contentValues = new ContentValues();
    }
}
