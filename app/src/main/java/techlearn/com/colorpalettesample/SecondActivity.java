package techlearn.com.colorpalettesample;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.graphics.Palette;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import java.util.List;

import static android.support.v7.graphics.Palette.*;
import static techlearn.com.colorpalettesample.R.id.button1;

public class SecondActivity extends AppCompatActivity {

      LinearLayout ll;
      Palette palette;
    List<Palette.Swatch> swatchList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        ll= (LinearLayout) findViewById(R.id.parent_layout);
        Bitmap myBitmap = BitmapFactory.decodeResource(getResources(), R.drawable.birds);
        palette =Palette.from(myBitmap).generate();
        swatchList=palette.getSwatches();


        //creating 16 buttons using for loop
        for (int i = 0; i < swatchList.size(); i++) {
            View childView = getLayoutInflater().inflate(R.layout.each_item, null);
            Button btn= (Button)childView.findViewById(button1);
            ll.addView(childView);

            btn.setBackgroundColor(swatchList.get(i).getRgb());
            btn.setText(""+swatchList.get(i));
        }
    }


}
