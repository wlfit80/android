package ga.freenas.xmsave;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    private TextView mXmlTv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mXmlTv = findViewById(R.id.textView);
    }

    public void parseXmlClick(View view) {
        try {
            String rs = XmlUtil.parseXmlFile(this);
            mXmlTv.setText(rs);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
