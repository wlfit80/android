package ga.freenas.list;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//       normalMethod();
        //获取控件
        ListView lv =  findViewById(R.id.lv);
    }

    private void normalMethod() {
        LinearLayout containerL1 = findViewById(R.id.container_ll);
        //动态添加TextView
        int MAX_CHILD_COUNT=100;
        for (int i = 0; i < MAX_CHILD_COUNT; i++) {
            TextView tv = new TextView(this);
            //为TextView设置高宽
            tv.setLayoutParams(new LinearLayout.LayoutParams(
                    LinearLayout.LayoutParams.MATCH_PARENT,
                    LinearLayout.LayoutParams.WRAP_CONTENT));
            //设置字体大小
            tv.setTextSize(30); //px
            tv.setTextColor(0xFFFF0000);
            tv.setText("测试"+i);
            //将TextView添加到容器里面来
            containerL1.addView(tv);
        }
    }
}
