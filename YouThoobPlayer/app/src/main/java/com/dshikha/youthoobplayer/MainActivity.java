package com.dshikha.youthoobplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity  implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setContentView(R.layout.activity_main);

        Button btnPlaySingle = (Button) findViewById(R.id.btnPlaySingle);
        Button btnStandAlone = (Button) findViewById(R.id.btnStandAlone);
        btnPlaySingle.setOnClickListener(this);
        btnStandAlone.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent intent=null;

        switch (v.getId())
        {
            case R.id.btnPlaySingle:
                intent= new Intent(this, YoutubeActivity.class);
                break;
            case R.id.btnStandAlone:
                intent= new Intent(this,StandAloneActivity.class);
                break;
            default:
        }

        if(intent!=null)
        {
            startActivity(intent);
        }
    }
}
