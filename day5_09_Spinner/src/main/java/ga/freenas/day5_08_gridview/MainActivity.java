package ga.freenas.day5_08_gridview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.MediatorLiveData;

import android.os.Bundle;
import android.widget.GridView;
import android.widget.Spinner;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private Spinner mSpinner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //1. 有一个列表
        mSpinner = findViewById(R.id.sp);
        //创建一些数据
        ArrayList<String> dataS = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            dataS.add("测试"+i);
        }
        //3.将数据导入到listView
        MyAdapter adapter= new MyAdapter(dataS);
        mSpinner.setAdapter(adapter);

    }
}
