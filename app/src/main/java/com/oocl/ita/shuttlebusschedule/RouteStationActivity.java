package com.oocl.ita.shuttlebusschedule;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Spinner;

import com.oocl.ita.shuttlebusschedule.service.StationService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by WEIWE on 1/7/2016.
 */
public class RouteStationActivity extends ListActivity {
    private StationService service;
    private ArrayAdapter<String> adapter;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.search_route_station);
        service = new StationService();
        List<Map<String, String>> stations = service.getData();
        SimpleAdapter routeStationAdapter = new SimpleAdapter(this, stations, R.layout.route_station_summary,
                new String[]{"routeName", "stationName", "regularCount", "realTimeCount", "changeCount"},
                new int[]{R.id.routeName, R.id.stationName, R.id.regularCount, R.id.realTimeCount, R.id.changeCount});
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

    private void InitSpinner(Spinner spinner, String[] route){
        //将可选内容与ArrayAdapter连接起来
        adapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,route);

        //设置下拉列表的风格
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        //将adapter 添加到spinner中
        spinner.setAdapter(adapter);

        //添加事件Spinner事件监听
        spinner.setOnItemSelectedListener(new SpinnerSelectedListener());

        //设置默认值
        spinner.setVisibility(View.VISIBLE);
    }

    //使用数组形式操作
    class SpinnerSelectedListener implements AdapterView.OnItemSelectedListener {

        public void onItemSelected(AdapterView<?> parent, View arg1, int pos,
                                   long id) {
        }

        public void onNothingSelected(AdapterView<?> arg0) {
        }
    }
}
