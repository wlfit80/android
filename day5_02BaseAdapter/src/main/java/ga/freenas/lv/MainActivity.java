package ga.freenas.lv;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ListView mListVew;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //1.有了一个列表
        mListVew = findViewById(R.id.lv);
        //2. 创建一个数据
        ArrayList<String> datas = new ArrayList<>();
        for (int i = 0; i < 150; i++) {
            datas.add("测试"+i);
        }
        //3. 将数据导入到ListView
        MyAdapter myAdapter = new MyAdapter(datas);
        mListVew.setAdapter(myAdapter);

    }
}
