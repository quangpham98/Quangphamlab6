package com.example.quangphamlab6;

import android.content.Context;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Spinner;



public class PaletteFragment extends Fragment {
    public PaletteFragment() {
            // Required empty public constructor
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                Bundle savedInstanceState) {

            // Inflate the layout for this fragment
            View v = inflater.inflate(R.layout.fragment_palette, container, false);

            //Set spinner, adapter and inner layout
            ColorAdapter colorAdapter = new ColorAdapter(v.getContext(), getResources().getStringArray(R.array.Colors));
            Spinner spinner = v.findViewById(R.id.spinner);
            spinner.setAdapter(colorAdapter);
            final ConstraintLayout paletteInnerLayout = v.findViewById(R.id.paletteinnerLayout);

            //Set listener, added boolean to avoid running immediately on start.
            spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

                private boolean isFirstChoice = true;

                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                    if (isFirstChoice) {
                        isFirstChoice = false;
                        return;
                    } else {
                        ((ColorInteraction) getActivity()).sendColor(position);
                    }
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {
                    paletteInnerLayout.setBackgroundColor(Color.YELLOW);
                }
            });
            return v;
        }

        public interface ColorInteraction {
            void sendColor(int position);
        }
    }