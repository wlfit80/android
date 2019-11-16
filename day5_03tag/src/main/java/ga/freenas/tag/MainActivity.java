package ga.freenas.tag;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button mBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnClick(View view) {
        mBtn = findViewById(R.id.btn);
        mBtn.setTag("haHa");
        mBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String tag = (String) v.getTag();
                Toast.makeText(MainActivity.this,tag, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
