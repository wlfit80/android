package ga.freenas.sd;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Environment;
import android.view.View;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void downloadClick(View view) {
        //1. 获取SDstorage存储目录是否存在
        String state = Environment.getExternalStorageState();
        if (state.equals(Environment.MEDIA_MOUNTED)){
            //如果为true,创建一个空文件
            File directory = Environment.getExternalStorageDirectory();
            File file = new File(directory,"葫芦娃.avi");
            //字节流
            try {
                FileOutputStream stream = new FileOutputStream(file);
                byte[] buff = new byte[1024 * 1024];
                for (int i = 0; i < 10; i++) {
                    stream.write(buff);
                }
                stream.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
