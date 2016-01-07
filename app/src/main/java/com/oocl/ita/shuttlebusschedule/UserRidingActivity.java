package com.oocl.ita.shuttlebusschedule;

import android.app.ListActivity;
import android.os.Bundle;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by WEIWE on 1/7/2016.
 */
public class UserRidingActivity extends ListActivity {
    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        SimpleAdapter adapter = new SimpleAdapter(this,getData(),R.layout.user_riding_summary,
                new String[]{"userName","dept","station"},
                new int[]{R.id.userName,R.id.dept,R.id.station});
        setListAdapter(adapter);
    }

    //test
    private List<Map<String, Object>> getData() {
        List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("userName", "aaa");
        map.put("dept", "bbb");
        map.put("station", "ccc");
        list.add(map);

        map = new HashMap<String, Object>();
        map.put("userName", "aaa");
        map.put("dept", "bbb");
        map.put("station", "ccc");
        list.add(map);

        map = new HashMap<String, Object>();
        map.put("userName", "aaa");
        map.put("dept", "bbb");
        map.put("station", "ccc");
        list.add(map);

        return list;
    }
}
