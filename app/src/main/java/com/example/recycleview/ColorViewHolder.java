package com.example.recycleview;


import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ColorViewHolder extends RecyclerView.ViewHolder {
    Context context;
    TextView tv;
    public ColorViewHolder(@NonNull View itemView) {
        super(itemView);
        tv = itemView.findViewById(R.id.color);
        context = itemView.getContext();
    }

    void bindTo(String color) {
        Resources res = context.getResources();
        String packageName = context.getPackageName();
        int colorId = res.getIdentifier(color, "color", packageName);
        if (colorId != 0)
            tv.setBackgroundColor(res.getColor(colorId));
        tv.setText("color: " + color);
    }

}
