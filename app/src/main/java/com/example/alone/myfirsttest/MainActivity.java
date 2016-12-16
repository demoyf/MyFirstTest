package com.example.alone.myfirsttest;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;
import com.squareup.picasso.Target;

public class MainActivity extends AppCompatActivity {
    private ImageView mImageView;
    private String mString =
            "http://119.29.194.92:8080/movie/18814143901/critic/Mn8ZTwEs9AMfXK0yadJk20161207.jpg";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mImageView = (ImageView) findViewById(R.id.image_view);
        Picasso.with(this).load(mString).into(new Target() {
            @Override
            public void onBitmapLoaded(Bitmap bitmap, Picasso.LoadedFrom from) {
                Log.d("xyf", "bitmap width " + bitmap.getWidth() + ", height:" + bitmap.getHeight());
            }

            @Override
            public void onBitmapFailed(Drawable errorDrawable) {
                Log.d("xyf", "failed");
            }

            @Override
            public void onPrepareLoad(Drawable placeHolderDrawable) {

            }
        });
    }
}
