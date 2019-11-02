package ga.freenas.qqlogin;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MainActivity extends AppCompatActivity {
    private EditText username;
    private EditText password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        username = findViewById(R.id.username);
        password = findViewById(R.id.password);
        readData();
    }

    private void readData(){
        try {
            //读取用户密码
            File  file = new File(getFilesDir(),"/qqUsername.txt");
            if (file.exists() && file.length() > 0){
                //显示到控件里面去,
                BufferedReader reader = new BufferedReader(new FileReader(file));
                String line = reader.readLine();
                if (line.contains("#")){
                    String[] datas = line.split("#");
                    username.setText(datas[0]);
                    password.setText(datas[1]);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public void loginClick(View view){
        String username = this.username.getText().toString();
        String password = this.password.getText().toString();
        if (TextUtils.isEmpty(username) || TextUtils.isEmpty(password)){
            Toast.makeText(this, "请填写用户或密码", Toast.LENGTH_LONG).show();
            return;
        }
        //登录保存数据
        saveData(username,password);
    }


    /**
     * 将数据保存到手机里面
     * @param username
     * @param password
     */
    private void saveData(String username, String password) {
        //把文件保存到cache目录下
        try {
            File file = new File(getFilesDir(),"/qqUsername.txt");
            //字符流(当将字符串写进文件里的时候会考虑到)
            BufferedWriter writer = new BufferedWriter(new FileWriter(file));
            writer.write(username+"#"+password);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
