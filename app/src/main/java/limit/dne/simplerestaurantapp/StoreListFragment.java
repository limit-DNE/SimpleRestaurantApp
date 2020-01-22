package limit.dne.simplerestaurantapp;


import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.fragment.app.ListFragment;

public class StoreListFragment extends ListFragment {


    public StoreListFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(inflater.getContext(), android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.stores)){
            @Override
            public View getView(int position, View convertView, ViewGroup parent){
                View view = super.getView(position, convertView, parent);
                TextView textView = (TextView) view.findViewById(android.R.id.text1);
                textView.setTextSize(21);
                textView.setTextColor(Color.WHITE);
                textView.setTypeface(Typeface.DEFAULT_BOLD);
                return view;
            }
        };
        setListAdapter(adapter);
        return super.onCreateView(inflater, container, savedInstanceState);
    }

}
