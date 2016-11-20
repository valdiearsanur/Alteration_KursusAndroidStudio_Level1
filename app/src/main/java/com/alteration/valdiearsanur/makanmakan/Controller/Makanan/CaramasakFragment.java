package com.alteration.valdiearsanur.makanmakan.Controller.Makanan;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.alteration.valdiearsanur.makanmakan.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class CaramasakFragment extends Fragment {

    String caramasak;
    private TextView text_caramasak;

    public void setCaraMasak(String caramasaknya) {
        caramasak = caramasaknya;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_caramasak, container, false);

        text_caramasak = (TextView) view.findViewById(R.id.text_caramasak);
        text_caramasak.setText(caramasak);

        return view;
    }
}
