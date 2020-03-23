package com.likhith.tomandjerry;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    /*fade out first pic and fade in second pic*/
    public void fade(View view)
    {

        ImageView iv1=findViewById(R.id.iv1);
        ImageView iv2=findViewById(R.id.iv2);
        /*alpha value ranges between 0 to 1
        0 to make image invisible
        in between value changes visibility
        1 to make image visible*/
        iv1.animate().alpha(0).setDuration(2000);
        iv2.animate().alpha(1).setDuration(2000);
        iv2.bringToFront();//it brings iv2 front
        iv1.invalidate();//it makes iv1 invalidate
    }


    /*fade out second pic and fade in first pic*/
    public void fade1(View view)
    {
        ImageView iv1=findViewById(R.id.iv1);
        ImageView iv2=findViewById(R.id.iv2);
        iv2.animate().alpha(0).setDuration(2000);
        iv1.animate().alpha(1).setDuration(2000);
        iv1.bringToFront();
        iv2.invalidate();
    }


    /*to move first image down by pixels*/
    public void movebypixelsupdown(View view)
    {
        ImageView iv1=findViewById(R.id.iv1);
        iv1.animate().translationYBy(1000f).setDuration(2000);//down

        //to move up give negative value
    }


    /*to move first image down by pixels*/
    public void movebypixelsleftright(View view)
    {
        ImageView iv1=findViewById(R.id.iv1);
        iv1.animate().translationXBy(1000f).setDuration(2000);//right
        //to move right give negative value
    }


    /*to rotate first image by degrees*/
    int currentangle=0;
    public void Rotatingimage(View view)
    {
        ImageView iv1=findViewById(R.id.iv1);
        iv1.animate().rotation(currentangle+360).setDuration(2000);//clockwise rotation
        //to rotate anti clock wise use negative angles
        currentangle=currentangle+360;
        //here we used currentangle variable,because if we don't use that there is a limitation that rotation can be used only once
        //instead of using currentangle variable you can use rotationBy() instead of rotation()
        /*when m is an angle,to make n rotations
          use n*m as rotating angle
         */
    }

    /*changing size of image
    this method changes image size to half in each click*/
    float currentsizex=1,currentsizey=1;
    public void changesize(View view)
    {
        ImageView iv1=findViewById(R.id.iv1);
        iv1.animate().scaleX(currentsizex/2).scaleY(currentsizey/2).setDuration(2000);
        currentsizex=currentsizex/2;
        currentsizey=currentsizey/2;
        //here we used currentsizex and currentsizey variable,because if we don't use that there is a limitation that scaleX and scaleY can be used only once
        //instead of using currentsizex and currentsizey variable you can use scaleXBy() and scaleYBy() instead of scaleX() and scaleY()
    }
}
