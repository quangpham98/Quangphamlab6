package com.example.quangphamlab6;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements PaletteFragment.ColorInteraction {

    PaletteFragment paletteFragment;
    CanvasFragment canvasFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Create 2 fragments objects
        paletteFragment = new PaletteFragment();
        canvasFragment = new CanvasFragment();

        //Set fragments to 2 containers
        getSupportFragmentManager().beginTransaction().add(R.id.paletteFragment, paletteFragment).commit();
        getSupportFragmentManager().beginTransaction().add(R.id.canvasFragment, canvasFragment).commit();

    }

    //Send color from palette to canvas fragment
    @Override
    public void sendColor(int position) {
        canvasFragment.updateBackgroundColor(position);
    }

}