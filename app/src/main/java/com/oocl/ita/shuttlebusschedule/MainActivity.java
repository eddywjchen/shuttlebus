package com.oocl.ita.shuttlebusschedule;

import android.app.ActivityGroup;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TabHost;
import android.widget.TextView;

import com.oocl.ita.shuttlebusschedule.entity.User;
import com.oocl.ita.shuttlebusschedule.service.StationService;
import com.oocl.ita.shuttlebusschedule.service.UserService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainActivity extends ActivityGroup {
    private StationService service;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TabHost tabHost = (TabHost) findViewById(R.id.tabHost);
        // 如果不是继承TabActivity，则必须在得到tabHost之后，添加标签之前调用tabHost.setup()

        tabHost.setup(this.getLocalActivityManager());
        // 这里content的设置采用了布局文件中的view
        Intent intent = new Intent(this, RouteStationActivity.class);
        Intent intent2 = new Intent(this, RegisterActivity.class);
        tabHost.addTab(tabHost.newTabSpec("tab1")
                .setIndicator("Home").setContent(intent2));

        tabHost.addTab(tabHost.newTabSpec("tab2").setIndicator("Summary")
                .setContent(intent));
        updateTab(tabHost);
        //setStationStatisticsMockupData();
        //setRouteStationData();
    }

    private void updateTab(TabHost tabHost) {
        for (int i = 0; i < tabHost.getTabWidget().getChildCount(); i++) {
            View view = tabHost.getTabWidget().getChildAt(i);
            TextView tv = (TextView) tabHost.getTabWidget().getChildAt(i).findViewById(android.R.id.title);
            tv.setTextSize(16);
            tv.setTypeface(Typeface.DEFAULT);
            tv.setTextColor(Color.WHITE);// 设置字体和风格
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

}
