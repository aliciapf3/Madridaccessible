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
 * {@link Fragment} that displays a list of attractions places.
 */
public class AttractionsFragment extends Fragment {


    public AttractionsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.place_list, container, false);


        // Create a list of places
        final ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place(R.string.palacio_real, R.string.description_palacio_real,
                R.drawable.palacio_real));
        places.add(new Place(R.string.puerta_del_sol, R.string.description_puerta_del_sol,
                R.drawable.puerta_del_sol));
        places.add(new Place(R.string.biblioteca_nacional, R.string.description_biblioteca_nacional,
                R.drawable.biblioteca_nacional));
        places.add(new Place(R.string.puerta_de_alcala, R.string.description_puerta_de_alcala,
                R.drawable.puerta_de_alcala));
        places.add(new Place(R.string.catedral_la_almudena, R.string.description_catedral_la_almudena,
                R.drawable.catedral_la_almudena));
        places.add(new Place(R.string.cibeles, R.string.description_cibeles,
                R.drawable.cibeles));
        places.add(new Place(R.string.correos, R.string.description_correos,
                R.drawable.correos));
        places.add(new Place(R.string.templo_de_debod, R.string.description_templo_de_debod,
                R.drawable.templo_de_debod));
        places.add(new Place(R.string.iglesia_los_jeronimos, R.string.description_iglesia_los_jeronimos,
                R.drawable.iglesia_los_jeronimos));


        // Create an {@link PlaceAdapter}, whose data source is a list of {@link Places. The
        // adapter knows how to create list items for each item in the list.
        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places, R.color.category_attractions);

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

