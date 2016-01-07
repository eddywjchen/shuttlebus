package com.oocl.ita.shuttlebusschedule;

import android.app.Activity;
import android.app.ListActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Window;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by WEIWE on 1/7/2016.
 */
public class RegisterActivity extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        setTheme(android.R.style.Theme_Black_NoTitleBar);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register);
    }


}
