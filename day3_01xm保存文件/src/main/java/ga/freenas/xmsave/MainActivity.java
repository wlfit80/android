package ga.freenas.xmsave;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    private TextView tv1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void saveXmlClick(View view) {
        String passport = "shansan";
        String password = "123";
        try {
         //   XmlUtil.saveXmlByStringBuilder(this,passport,password);
            XmlUtil.saveXmlByXmlSerializer(this,passport, password);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
