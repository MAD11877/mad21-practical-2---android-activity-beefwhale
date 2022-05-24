package com.example.madpractical;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity{

    User test = new User();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView2 = findViewById(R.id.textView2);
        textView2.setText("Hello World!");

        TextView textView3 = findViewById(R.id.textView3);
        textView3.setText("Lorem ipsum dolor sit amet, consectetur adipiscing elit, " +
                "sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.");

    }

    public void onClick(View view) {
        Button btn_flw = findViewById(R.id.followedbutton);
        if(view.getId() == R.id.followedbutton) {

            if (test.followed == false){
                test.followed = true;
                btn_flw.setText("Followed");
            }
            else{
                test.followed = false;
                btn_flw.setText("Follow");
            }
        }
    }

}

