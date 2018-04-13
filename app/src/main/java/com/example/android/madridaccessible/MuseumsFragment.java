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
public class MuseumsFragment extends Fragment {


    public MuseumsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.place_list, container, false);



        // Create a list of places
        final ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place(R.string.museo_del_prado, R.string.description_museo_del_prado,
                R.drawable.museo_del_prado));
        places.add(new Place(R.string.museo_thyssen, R.string.description_museo_thyssen,
                R.drawable.museo_thyssen));
        places.add(new Place(R.string.museo_reina_sofia, R.string.description_museo_reina_sofia,
                R.drawable.museo_reina_sofia));
        places.add(new Place(R.string.museo_del_romanticismo, R.string.description_museo_del_romanticismo,
                R.drawable.museo_del_romanticismo));
        places.add(new Place(R.string.museo_del_ferrocarril, R.string.description_museo_del_ferrocarril,
                R.drawable.museo_del_ferrocarril));
        places.add(new Place(R.string.museo_ciencias_naturales, R.string.description_museo_ciencias_naturales,
                R.drawable.museo_ciencias_naturales));
        places.add(new Place(R.string.museo_arqueologico, R.string.description_museo_arqueologico,
                R.drawable.museo_arqueologico));
        places.add(new Place(R.string.museo_del_traje, R.string.description_museo_del_traje,
                R.drawable.museo_del_traje));


        // Create an {@link PlaceAdapter}, whose data source is a list of {@link Places. The
        // adapter knows how to create list items for each item in the list.
        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places, R.color.category_museums);

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

