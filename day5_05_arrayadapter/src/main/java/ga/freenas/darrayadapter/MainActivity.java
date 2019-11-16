package ga.freenas.darrayadapter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView listView = findViewById(R.id.lv);

        ArrayList<String> data = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            data.add("测试"+i);
        }

        /**
         * ArrayAdapter 当一个列表里面只有一个TextView就可以使用
         * resoutce 子项布局
         * textViewResourceId 就是要将每一个数据绑定到TextView
         * data 就是列表数据
         */
        ArrayAdapter<String > adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1,
                android.R.id.text1,
                data
        );
        listView.setAdapter(adapter);

    }
}
