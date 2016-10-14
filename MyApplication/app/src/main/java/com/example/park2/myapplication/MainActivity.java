package com.example.park2.myapplication;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // hihihih
    }

    public void btnClickEvent1(View view){
        Toast.makeText(this ,"hello world11" ,Toast.LENGTH_LONG).show();
    }

    public void btnClickEvent2(View view){
        Toast.makeText(this ,"hello world222222" ,Toast.LENGTH_LONG).show();
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://m.naver.com"));
        startActivity(intent);
    }

    public void btnClickEvent3(View view){
        Toast.makeText(this ,"hello world333" ,Toast.LENGTH_LONG).show();
    }

    public void btnClickEvent4(View view){
        Intent intent = new Intent(this, MenuActivity.class);
        startActivity(intent);
    }

}
