package com.example.android.madridaccessible;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * {@link Fragment} that displays a list of restaurnts places.
 */
public class RestaurantsFragment extends Fragment {


    public RestaurantsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.place_list, container, false);


        // Create a list of places
        final ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place(R.string.platea, R.string.description_platea,
                R.drawable.platea));
        places.add(new Place(R.string.sumo, R.string.description_sumo,
                R.drawable.sumo));
        places.add(new Place(R.string.km_de_pizza, R.string.description_km_de_pizza,
                R.drawable.km_de_pizza));
        places.add(new Place(R.string.la_mordida, R.string.description_la_mordida,
                R.drawable.la_mordida));
        places.add(new Place(R.string.harina, R.string.description_harina,
                R.drawable.harina));
        places.add(new Place(R.string.nicoletta, R.string.description_nicoletta,
                R.drawable.nicoletta));
        places.add(new Place(R.string.el_perro_y_la_galleta, R.string.description_el_perro_y_la_galleta,
                R.drawable.el_perro_y_la_galleta));
        places.add(new Place(R.string.diverxo, R.string.description_diverxo,
                R.drawable.diverxo));


        // Create an {@link PlaceAdapter}, whose data source is a list of {@link Places. The
        // adapter knows how to create list items for each item in the list.
        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places, R.color.category_restaurants);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // place_list.xml layout file.
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link PlaceAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Place} in the list.
        listView.setAdapter(adapter);

        return rootView;


    }

}

