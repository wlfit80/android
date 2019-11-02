package ga.freenas.storage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Environment;
import android.util.Log;

import java.io.File;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //内部存储 /data
        //获取系统SDK卡目录
        File dataDirectory = Environment.getDataDirectory();
        Log.v("freenas", dataDirectory.getAbsolutePath());

        /**
         *获取stroage目录
         */
        File storage = Environment.getExternalStorageDirectory().getAbsoluteFile();
        System.out.println(storage + "....................");


    }
}
