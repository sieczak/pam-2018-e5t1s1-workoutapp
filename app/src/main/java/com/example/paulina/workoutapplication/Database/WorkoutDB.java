package com.example.paulina.workoutapplication.Database;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQueryBuilder;

import com.readystatesoftware.sqliteasset.SQLiteAssetHelper;

public class WorkoutDB extends SQLiteAssetHelper {


    private static final String DB_Name="workoutDB.db";
    private static final int DB_VER=1;


    public WorkoutDB(Context context) {
        super(context, DB_Name, context.getFilesDir().getPath()+"/databases",  null, DB_VER);
    }

    public int getSettingMode()
    {
        SQLiteDatabase db = getWritableDatabase();
        SQLiteQueryBuilder qb = new SQLiteQueryBuilder();

        String[] sqlSelect = {"Mode"};
        String sqlTable = "Setting";

        qb.setTables(sqlTable);
        Cursor c = qb.query(db,sqlSelect,null,null,null,null,null);
        c.moveToFirst();
        return c.getInt(c.getColumnIndex("Mode"));

    }

    public void saveSettingMode(int value)
    {
        SQLiteDatabase db = getReadableDatabase();
        String query="UPDATE Setting SET MODE = " +value;
        db.execSQL(query);

    }
}
