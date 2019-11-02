package ga.freenas.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.provider.BaseColumns;
import android.util.Log;

class DbOpenHleper extends SQLiteOpenHelper implements BaseColumns {
    //1. 数据库名
    public static  final String DB_NAME="contact.db";
    //2. 数据库版本
    public  static  final int DB_VERSION=1;
    //3. 数据库表内容
    public static  final String TABLE_NAME="contactinfo";
    public static  final String _USERNAME="username";
    public static  final String _PHONE="phone";

    //factory 用来创建游标对象的工厂类
    public DbOpenHleper(Context  context)  {
        super(context,DB_NAME,null,DB_VERSION);
    }

    //如果没有contactkinfo这个文件就会
    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL("create table "+TABLE_NAME+" ("+_ID+" integer primary key autoincrement," +
                _USERNAME+" text,"+_PHONE+" text);");
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        Log.v("520it", "onUpgrade"+"  oldVersion="
                +i+ "newVersion="+i1);
    }
}
