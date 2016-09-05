package techlearn.com.colorpalettesample;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.graphics.Palette;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private LinearLayout mainLayout;
    private Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8;
    private Button clearButton, nextButton;
    Palette palette;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initUI();

        Bitmap myBitmap = BitmapFactory.decodeResource(getResources(), R.drawable.birds);
        palette = Palette.from(myBitmap).generate();

    }

    private void initUI() {

        mainLayout= (LinearLayout) findViewById(R.id.main_layout);
        btn1 = (Button) findViewById(R.id.brn_1);
        btn2 = (Button) findViewById(R.id.brn_2);
        btn3 = (Button) findViewById(R.id.brn_3);
        btn4 = (Button) findViewById(R.id.brn_4);
        btn5 = (Button) findViewById(R.id.brn_5);
        btn6 = (Button) findViewById(R.id.brn_6);
        btn7 = (Button) findViewById(R.id.brn_7);
        btn8 = (Button) findViewById(R.id.brn_8);

        setListeners();

    }

    private void setListeners() {

        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn8.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){

            case R.id.brn_1:
                mainLayout.setBackgroundColor(palette.getVibrantColor(Color.WHITE));
                btn1.setBackgroundColor(palette.getVibrantColor(Color.BLACK));
                break;

            case R.id.brn_2:
                mainLayout.setBackgroundColor(palette.getLightVibrantColor(Color.WHITE));
                btn2.setBackgroundColor(palette.getLightVibrantColor(Color.BLACK));
                break;

            case R.id.brn_3:
                mainLayout.setBackgroundColor(palette.getDarkVibrantColor(Color.WHITE));
                btn3.setBackgroundColor(palette.getDarkVibrantColor(Color.BLACK));
                break;

            case R.id.brn_4:
                mainLayout.setBackgroundColor(palette.getMutedColor(Color.WHITE));
                btn4.setBackgroundColor(palette.getMutedColor(Color.BLACK));
                break;

            case R.id.brn_5:
                mainLayout.setBackgroundColor(palette.getLightMutedColor(Color.WHITE));
                btn5.setBackgroundColor(palette.getLightMutedColor(Color.BLACK));
                break;

            case R.id.brn_6:
                mainLayout.setBackgroundColor(palette.getDarkMutedColor(Color.WHITE));
                btn6.setBackgroundColor(palette.getDarkMutedColor(Color.BLACK));
                break;

            case R.id.brn_7:
                Intent inten=new Intent(MainActivity.this, MainActivity.class);
                startActivity(inten);
                finish();
                break;

            case R.id.brn_8:

                Intent intent=new Intent(MainActivity.this, SecondActivity.class);
                startActivity(intent);
                break;

        }

    }

}
