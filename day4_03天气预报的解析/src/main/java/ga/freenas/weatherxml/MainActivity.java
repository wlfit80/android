package ga.freenas.weatherxml;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.AssetManager;
import android.os.Bundle;
import android.util.Xml;
import android.view.View;
import android.widget.TextView;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

import java.io.IOException;
import java.io.InputStream;

public class MainActivity extends AppCompatActivity {
    private TextView tv1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv1 =  findViewById(R.id.tv1);
    }

    public void parseXmlClick(View view) {
        String result = "";
        try {
            //1.找到文件
            AssetManager assets = getAssets();
            InputStream fis = assets.open("weather.xml");
            //2. 创建一个PUll解析器
            XmlPullParser pullParser = Xml.newPullParser();
            //3. 帮定流
            pullParser.setInput(fis,"utf-8");
            //4. 开始解析文档
            int eventType = pullParser.getEventType();
            // 5. 做一个循环
            while (eventType!=XmlPullParser.END_DOCUMENT){
                //7. 读取一行到result
                if (eventType==XmlPullParser.START_TAG && pullParser.getName().equals("string")){
                    result+=pullParser.nextText()+"\n";
                }
                eventType=pullParser.next();
            }

        } catch (IOException e) {
            e.printStackTrace();
        } catch (XmlPullParserException e) {
            e.printStackTrace();
        }
        tv1.setText(result);
    }
}
