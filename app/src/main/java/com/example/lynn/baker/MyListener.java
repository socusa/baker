package com.example.lynn.baker;

import android.graphics.Color;
import android.view.View;

import static com.example.lynn.baker.MainActivity.*;

public class MyListener implements View.OnClickListener {

    public int color() {
        int red = (int)(255*Math.random());
        int green = (int)(255*Math.random());
        int blue = (int)(255*Math.random());

        return(Color.argb(255,red,green,blue));
    }

    @Override
    public void onClick(View view) {

    }
}
