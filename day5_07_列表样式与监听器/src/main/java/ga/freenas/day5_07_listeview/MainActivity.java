package ga.freenas.day5_07_listeview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AbsListView;
import android.widget.ListView;
import android.widget.NumberPicker;

import java.util.ArrayList;

import static android.widget.AbsListView.OnScrollListener.SCROLL_STATE_FLING;
import static android.widget.AbsListView.OnScrollListener.SCROLL_STATE_IDLE;
import static android.widget.NumberPicker.OnScrollListener.SCROLL_STATE_TOUCH_SCROLL;

public class MainActivity extends AppCompatActivity {
    private MyAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView lv = findViewById(R.id.lv); //获取控件
        adapter=  new MyAdapter(this);
        //系统内部自动帮你回调了多次getCount() /getView()
        lv.setAdapter(adapter);

        //2. 数据是从后台服务器发回来(延迟)
        ArrayList<String> dataS = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            dataS.add("测试"+i);
        }
        adapter.setDataS(dataS);
        //调用了该方法系统就会再次调用getCount()/getView()
        adapter.notifyDataSetChanged();


        //lv的滚动监听器

    }
}
