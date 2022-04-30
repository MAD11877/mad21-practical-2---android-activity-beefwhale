package com.example.madpractical;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity{

    User test = new User();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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

