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
public class DeskripsiFragment extends Fragment {

    private String deskripsi;
    private TextView text_deskripsi;

    public void setDeskripsi(String deskripsinya) {
        deskripsi = deskripsinya;
    }

    public DeskripsiFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_deskripsi, container, false);

        text_deskripsi = (TextView) view.findViewById(R.id.text_deksripsi);
        text_deskripsi.setText(deskripsi);

        return view;
    }

}
