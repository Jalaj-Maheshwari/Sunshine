package app.com.android.sunshine;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    public MainActivityFragment() {
       ArrayList<String> forecast_enrty = new ArrayList<String>();
        forecast_enrty.add("Todday-Sunny-66/54");
        forecast_enrty.add("Monday-Smoky-76/44");
        forecast_enrty.add("Tuesday-foggy-86/54");
        forecast_enrty.add("Wednesday-rainy-26/54");
        forecast_enrty.add("Thursday-Rainy-46/34");
        forecast_enrty.add("Friday-Sunny-86/14");
        ListView list = (ListView)getView().findViewById(R.id.listview_forecast);
        ArrayAdapter<String> forecastAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,forecast_enrty);
        list.setAdapter(forecastAdapter);
        //solve this errors of R in red.
  //To understand from video and make out that what is wrong with this code?
        // basically its about creating a listview and then setting an arrayadapter to it for displaying the list of items.
        //Hence the arrayadapter takes the context,type of item and ArrayList made list of items to be displayed .
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        MainActivityFragment();
        return inflater.inflate(R.layout.fragment_main, container, false);


    }
}
