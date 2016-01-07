package com.oocl.ita.shuttlebusschedule;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import com.oocl.ita.shuttlebusschedule.entity.User;
import com.oocl.ita.shuttlebusschedule.service.StationService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainActivity extends AppCompatActivity {
    private StationService service;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_station_statistics);
        setStationStatisticsData();

        setRouteStationData();
        }

    private void setRouteStationData() {
        ListView listView = (ListView) this.findViewById(R.id.routeStationView);

        service = new StationService(this);
        List<Map<String, String>> stations = service.getData();
        SimpleAdapter routeStationAdapter = new SimpleAdapter(this, stations, R.layout.route_station_summary,
                new String[]{"routeId", "stationName", "regularUserCount","realTimeUserCount","changedCount"},
                new int[]{R.id.routeId, R.id.stationName, R.id.regularUserCount,R.id.realTimeUserCount,R.id.changedCount});
        listView.setAdapter(routeStationAdapter);
        listView.setOnItemClickListener(new ItemClickListener());
    }

    private final class ItemClickListener implements AdapterView.OnItemClickListener {

        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            ListView listView = (ListView) parent;
            HashMap<String, Object> data = (HashMap<String, Object>) listView.getItemAtPosition(position);
            Intent intent = new Intent("com.oocl.ita.shuttlebusschedule.GET_USER_RIDING_ACTION");
            startActivity(intent);
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

    private void setStationStatisticsData() {
        User user = new User();
    }
}
