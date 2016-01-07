package com.oocl.ita.shuttlebusschedule;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import com.oocl.ita.shuttlebusschedule.service.StationService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by WEIWE on 1/7/2016.
 */
public class RouteStationActivity extends ListActivity {
    private StationService service;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        service = new StationService();
        List<Map<String, String>> stations = service.getData();
        SimpleAdapter routeStationAdapter = new SimpleAdapter(this, stations, R.layout.route_station_summary,
                new String[]{"routeName", "stationName", "regularUserCount", "realTimeUserCount", "changedCount"},
                new int[]{R.id.routeName, R.id.stationName, R.id.regularUserCount, R.id.realTimeUserCount, R.id.changedCount});
        this.setListAdapter(routeStationAdapter);
        this.getListView().setOnItemClickListener(new ItemClickListener());
    }

    private final class ItemClickListener implements AdapterView.OnItemClickListener {

        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            ListView listView = (ListView) parent;
            HashMap<String, Object> data = (HashMap<String, Object>) listView.getItemAtPosition(position);
            Intent intent = new Intent("com.oocl.ita.shuttlebusschedule.GET_USER_RIDING_ACTION");
            //TODO
            startActivity(intent);
        }
    }
}
