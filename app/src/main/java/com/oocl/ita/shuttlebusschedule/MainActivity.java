package com.oocl.ita.shuttlebusschedule;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

import com.oocl.ita.shuttlebusschedule.entity.User;
import com.oocl.ita.shuttlebusschedule.service.UserService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_station_statistics);
        setStationStatisticsMockupData();
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

    private final class ItemClickListener implements AdapterView.OnItemClickListener {

        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            ListView listView = (ListView) parent;
            HashMap<String, Object> data = (HashMap<String, Object>) listView.getItemAtPosition(position);
            String personId = data.get("id").toString();
            Toast.makeText(getApplicationContext(), personId, Toast.LENGTH_LONG).show();

        }
    }

    private void setStationStatisticsMockupData() {
        ListView listView = (ListView) this.findViewById(R.id.stationStatisticsView);
        UserService userService = new UserService();
        List<User> users = userService.getScrollData();
        List<HashMap<String, Object>> data = new ArrayList<HashMap<String,Object>>();
        for(User user : users){
            HashMap<String, Object> item = new HashMap<String, Object>();
//            item.put("id", user.getId());
            item.put("username", user.getUsername());
//            item.put("dept", user.getDept());
            item.put("boardingStation", user.getBoardingStation());
            item.put("egressStation", user.getEgressStation());
            data.add(item);
        }
        SimpleAdapter adapter = new SimpleAdapter(this, data, R.layout.user_item,
                new String[]{"username", "boardingStation", "egressStation"}, new int[]{R.id.username, R.id.boardingStation, R.id.egressStation});
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new ItemClickListener());

    }
}
