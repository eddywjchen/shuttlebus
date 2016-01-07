package com.oocl.ita.shuttlebusschedule.service;

import com.oocl.ita.shuttlebusschedule.MainActivity;
import com.oocl.ita.shuttlebusschedule.entity.Station;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by WEIWE on 1/7/2016.
 */
public class StationService {
    public StationService(MainActivity mainActivity) {
    }

    public List<Map<String, String>> getStations(int routeId, int stationId) {
        List<Station> stations = new ArrayList<>();

        List<Map<String, String>> station1 = new ArrayList<Map<String,String>>();
        for(Station station : stations){
            HashMap<String, String> item = new HashMap<String, String>();
            item.put("routeId", String.valueOf(station.getRouteId()));
            item.put("routeName", station.getRouteName());
            item.put("stationName", station.getStationName());
            item.put("regularCount", String.valueOf(station.getRegularUserCount()));
            item.put("realTimeCount", String.valueOf(station.getRealTimeUserCount()));
            item.put("changeCount", String.valueOf(station.getChangedCount()));
            station1.add(item);
        }
        return station1;
    }

    public List<Map<String, String>> getData() {
        List<Map<String, String>> list = new ArrayList<Map<String, String>>();

        Map<String, String> map = new HashMap<String, String>();
        map.put("routeName", "1");
        map.put("stationName", "tangjia");
        map.put("regularCount", "12");
        map.put("realTimeCount", "12");
        map.put("changeCount", "0");
        list.add(map);

        map = new HashMap<String, String>();
        map.put("routeName", "1");
        map.put("stationName", "tangjia");
        map.put("regularCount", "12");
        map.put("realTimeCount", "12");
        map.put("changeCount", "0");
        list.add(map);

        map = new HashMap<String, String>();
        map.put("routeName", "1");
        map.put("stationName", "tangjia");
        map.put("regularCount", "12");
        map.put("realTimeCount", "12");
        map.put("changeCount", "0");
        list.add(map);

        return list;
    }
}
