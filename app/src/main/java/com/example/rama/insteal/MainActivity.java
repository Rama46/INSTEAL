package com.example.rama.insteal;

import android.content.Intent;
import android.os.Handler;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.Toast;

import com.synnapps.carouselview.CarouselView;
//import com.synnapps.carouselview.ImageClickListener;
import com.synnapps.carouselview.ImageListener;



public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    CarouselView carouselView;
    CardView card1;
    CardView card2;
    CardView card3;
    CardView card4;
    CardView card5;
    CardView card6;
    boolean doubleBackToExitPressedOnce = false;

    int[] sampleImages = {R.drawable.carousel1, R.drawable.carousel2, R.drawable.carousel3,R.drawable.carousel4,R.drawable.carousel5};

    @Override
    protected void onCreate(Bundle savedInstanceState) {



        super.onCreate(savedInstanceState);
        Window window = this.getWindow();

// clear FLAG_TRANSLUCENT_STATUS flag:
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);

// add FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS flag to the window
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);

// finally change the color
        window.setStatusBarColor(ContextCompat.getColor(this,R.color.colorPrimaryDark));
        setContentView(R.layout.activity_main);

        carouselView = (CarouselView) findViewById(R.id.carouselView);
        carouselView.setPageCount(sampleImages.length);
        carouselView.setImageListener(imagelistener);

        card1= (CardView) findViewById(R.id.card_view);
        card2= (CardView) findViewById(R.id.card_view2);
        card3= (CardView) findViewById(R.id.card_view3);
        card4= (CardView) findViewById(R.id.card_view4);
        card5= (CardView) findViewById(R.id.card_view5);
        card6= (CardView) findViewById(R.id.card_view6);



    }

    ImageListener imagelistener= new ImageListener() {
        @Override
        public void setImageForPosition(int position, ImageView imageView) {
            imageView.setImageResource(sampleImages[position]);
        }
    };


    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.card_view:

                Intent intent = new Intent(MainActivity.this, ListFaskes.class);
                startActivity(intent);

            break;

            case R.id.card_view2:
                Intent intent2 = new Intent(MainActivity.this, ListFaskes.class);
                startActivity(intent2);

                break;

            case R.id.card_view3:
                Intent intent3 = new Intent(MainActivity.this, ListFaskes.class);
                startActivity(intent3);

                break;

            case R.id.card_view4:
                Intent intent4 = new Intent(MainActivity.this, ListFaskes.class);
                startActivity(intent4);

                break;

            case R.id.card_view5:
                Intent intent5 = new Intent(MainActivity.this, ListFaskes.class);
                startActivity(intent5);

                break;

            case R.id.card_view6:
                Intent intent6 = new Intent(MainActivity.this, ListFaskes.class);
                startActivity(intent6);
                break;
        }
    }





    @Override
    public void onBackPressed() {
        if (doubleBackToExitPressedOnce) {
            super.onBackPressed();
            return;
        }
        this.doubleBackToExitPressedOnce = true;
        Toast.makeText(this, "Please click BACK again to exit", Toast.LENGTH_SHORT).show();

        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                doubleBackToExitPressedOnce=false;
            }
        }, 2000);



    }
}
