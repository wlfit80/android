package ga.freenas.database;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class MainActivity extends AppCompatActivity {
    private ContactDao mDao;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //1. 创建一个文件对象
        File file = new File(getFilesDir(), "haHa.txt");
        //2. 执行创建
//            file.createNewFile();
        //2.1 第二种方法执行创建
//            FileOutputStream fos = new FileOutputStream(file);
        //3. 创建一个数据库文件SQLiteOpenHelper它是一个帮助类
        DbOpenHleper helper= new DbOpenHleper(this);
        mDao=new ContactDao(this);
        System.out.println("git");

    }

    public void insertContact(View view) {
        mDao.insertContact("zhangsan","150999999");
    }

    public void updateContact(View view) {
        mDao.updateContact("zhansan", "13333251245");
    }

    public void deleteContact(View view) {
        mDao.deleteContact("shansan");
    }

    public void selectContact(View view) {
        mDao.queryContact("15011111111");
    }
}
