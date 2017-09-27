package by.bsu.raman.lab32;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickButton1(View view) {
        Intent intent = new Intent(this, Activity2.class);
        startActivity(intent);
    }

    public void onClickButton2(View view) {
        Intent intent = new Intent(this, Activity3.class);
        startActivity(intent);
    }

    public void onClickButton3(View view) {
        Intent intent = new Intent(this, Activity4.class);
        startActivity(intent);
    }

    public void onClickButton4(View view) {
        finish();
        System.exit(0);
    }
}
