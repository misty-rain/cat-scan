package com.mistyrian.cat_scan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.mistyrian.library.CaptureActivity;
import com.mistyrian.library.utils.Constants;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent intent = new Intent(MainActivity.this, CaptureActivity.class);
        startActivityForResult(intent, Constants.SCAN_SUCCESS);

    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode != 0) {
            if (resultCode == Constants.SCAN_SUCCESS) {
                String resultStr = data.getStringExtra("resultStr");
                Toast.makeText(MainActivity.this,resultStr,Toast.LENGTH_SHORT).show();
            }
        }

    }

}