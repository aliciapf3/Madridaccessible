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
 * {@link Fragment} that displays a list of museums places.
 */
public class ParksFragment extends Fragment {


    public ParksFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.place_list, container, false);


        // Create a list of places
        final ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place(R.string.parque_del_retiro, R.string.description_parque_del_retiro,
                R.drawable.parque_del_retiro));
        places.add(new Place(R.string.parque_del_capricho, R.string.description_parque_del_capricho,
                R.drawable.parque_del_capricho));
        places.add(new Place(R.string.jardin_botanico, R.string.description_jardin_botanico,
                R.drawable.jardin_botanico));
        places.add(new Place(R.string.jardines_del_moro, R.string.description_jardines_del_moro,
                R.drawable.jardines_del_moro));
        places.add(new Place(R.string.jardines_de_sabatini, R.string.description_jardines_de_sabatini,
                R.drawable.jardines_de_sabatini));
        places.add(new Place(R.string.jardines_de_la_rosaleda, R.string.description_jardines_de_la_rosaleda,
                R.drawable.jardines_de_la_rosaleda));
        places.add(new Place(R.string.quinta_de_los_molinos, R.string.description_quinta_de_los_molinos,
                R.drawable.quinta_de_los_molinos));
        places.add(new Place(R.string.casa_de_campo, R.string.description_casa_de_campo,
                R.drawable.casa_de_campo));



        // Create an {@link PlaceAdapter}, whose data source is a list of {@link Places. The
        // adapter knows how to create list items for each item in the list.
        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places, R.color.category_parks);

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
