package com.example.dell.riderapp.Helper;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

import com.example.dell.riderapp.R;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.Marker;

public class CustomerInfoWindow implements GoogleMap.InfoWindowAdapter {
    View view;

    public CustomerInfoWindow(Context context) {
        view = LayoutInflater.from(context).inflate(R.layout.customer_rider_infor_windown, null);
    }

    @Override
    public View getInfoWindow(Marker marker) {
        TextView txtPickupTitle = ((TextView) view.findViewById(R.id.txtPickup));
        txtPickupTitle.setText(marker.getTitle());

        TextView txtPickupSnippet = ((TextView) view.findViewById(R.id.txtPickupSnippet));
        txtPickupSnippet.setText(marker.getSnippet());

        return view;
    }

    @Override
    public View getInfoContents(Marker marker) {
        return null;
    }
}
