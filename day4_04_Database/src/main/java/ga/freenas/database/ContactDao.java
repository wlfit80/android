package ga.freenas.database;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

class ContactDao {
    private  DbOpenHleper mHelper;
    private SQLiteDatabase db;
    public ContactDao(Context context) {
        mHelper=new DbOpenHleper(context);
    }


    public void insertContact(String username, String phone) {
        db = mHelper.getWritableDatabase();
        db.execSQL("insert into "+DbOpenHleper.TABLE_NAME+"" +
                "("+DbOpenHleper._USERNAME+","+DbOpenHleper._PHONE+")" +
                " values (?,?)",new String[]{username,phone});
    }

    public void updateContact(String username , String newPhone) {
        db.execSQL("update contactinfo set phone=? where username=?;", new String[]{newPhone,username});
    }

    public void deleteContact(String username) {
        db.execSQL("delete from contactinfo where username=?;",
                new String[]{username});
    }

    public void queryContact(String phone) {
        Cursor cursor = db.rawQuery("select username from contactinfo where phone=?;",
                new String[]{phone});
        while (cursor.moveToNext()){
            String username = cursor.getString(0);
            Log.v("520it", username);
        }
    }
}
