package by.bsu.raman.lab35;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements OnClickListener {

    private Button bgButton;
    public ConstraintLayout constraintLayout;
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bgButton = (Button) findViewById(R.id.background_button);
        constraintLayout = (ConstraintLayout) findViewById(R.id.main_layout);
        context = MainActivity.this;
        bgButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        final CharSequence[] items = {
                getText(R.string.red) ,
                getText(R.string.yellow),
                getText(R.string.green)
        };

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle(R.string.message);
        builder.setItems(items, new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int item) {
                switch (item) {
                    case 0: {
                        constraintLayout.setBackgroundResource(R.color.redColor);
                        Toast.makeText(context, R.string.red, Toast.LENGTH_LONG).show();
                        break;
                    }
                    case 1:{
                        constraintLayout.setBackgroundResource(R.color.yellowColor);
                        Toast.makeText(context, R.string.yellow,
                                Toast.LENGTH_LONG).show();
                        break;
                    }
                    case 2: {
                        constraintLayout.setBackgroundResource(R.color.greenColor);
                        Toast.makeText(context, R.string.green, Toast.LENGTH_LONG).show();
                        break;
                    }
                }
            }
        });
        AlertDialog alert = builder.create();
        alert.show();
    }
}
