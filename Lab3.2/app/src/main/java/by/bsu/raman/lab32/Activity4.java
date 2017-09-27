package by.bsu.raman.lab32;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity4 extends AppCompatActivity {

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_4);
        button = (Button)findViewById(R.id.button15);
    }

    public void onClickButtonNew(View view) {
        button.setBackgroundColor(Color.parseColor("#42f45f"));
    }
}
