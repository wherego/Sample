package com.sample;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.sample.aidl.AIDLActivity;
import com.sample.bezier.BezierActivity;
import com.sample.dagger.DaggerActivity;
import com.sample.jni.Test;
import com.sample.recycler.RecyclerActivity;
import com.sample.retrofit.RetrofitActivity;
import com.sample.sensor.SensorActivity;
import com.sample.view.CustomViewActivity;
import com.sample.zxing.ZxingActivity;

/**
 * Created by Jam on 16-7-12
 * Description:
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Test.hello();
    }


    public void customView(View v) {
        startActivity(new Intent(this, CustomViewActivity.class));
    }

    public void recycler(View v) {
        startActivity(new Intent(this, RecyclerActivity.class));
    }

    public void bezier(View v) {
        startActivity(new Intent(this, BezierActivity.class));
    }

    public void dagger(View v) {
        startActivity(new Intent(this, DaggerActivity.class));
    }

    public void zxing(View v) {
        startActivity(new Intent(this, ZxingActivity.class));
    }

    public void retrofit(View v) {
        startActivity(new Intent(this, RetrofitActivity.class));
    }

    public void sensor(View v) {
        startActivity(new Intent(this, SensorActivity.class));
    }

    public void aidl(View v) {
        startActivity(new Intent(this, AIDLActivity.class));
    }
}



