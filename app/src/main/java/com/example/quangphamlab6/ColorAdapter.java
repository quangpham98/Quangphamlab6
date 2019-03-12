package com.example.quangphamlab6;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class ColorAdapter extends BaseAdapter {

    private Context context;
    private String[] colorList;

    public ColorAdapter(Context context, String[] colorList) {
        this.context = context;
        this.colorList = colorList;
    }


    @Override
    public int getCount() {
        return colorList.length;
    }

    @Override
    public Object getItem(int position) {
        return colorList[position];
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        //Array of parsable colors in English
        String[] colors = {"MAGENTA", "WHITE", "GREEN", "RED", "BLUE", "YELLOW", "BLACK", "GRAY"};

        //Set color of the views of options in spinner
        TextView colorView = new TextView(this.context);
        colorView.setText(colorList[position]);
        colorView.setBackgroundColor(Color.parseColor(colors[position]));
        return colorView;
    }
}
