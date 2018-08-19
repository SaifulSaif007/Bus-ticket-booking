package com.example.user.sbmv2;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;

import android.support.v4.app.ActivityCompat;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.view.View;


import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;


public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }
    public void onzoom(View view)
    {
        if(view.getId() == R.id.zi)
        {
            mMap.animateCamera(CameraUpdateFactory.zoomIn());
        }
        if(view.getId() == R.id.zo)
        {
            mMap.animateCamera(CameraUpdateFactory.zoomOut());
        }
    }

    public void chng(View view)
    {
        if(mMap.getMapType() == GoogleMap.MAP_TYPE_NORMAL)
        {
            mMap.setMapType(GoogleMap.MAP_TYPE_SATELLITE);
        }
        else
            mMap.setMapType(GoogleMap.MAP_TYPE_NORMAL);
    }

    public void next(View v){
        Intent intent = new Intent(getApplicationContext(),DataActivity.class);
        startActivity(intent);
    }


    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            // TODO: Consider call
            return;
        }
        mMap.setMyLocationEnabled(true);

        LatLng mohakhali = new LatLng(23.778200, 90.397718);
        mMap.addMarker(new MarkerOptions().position(mohakhali).title("Marker in Mohakhali"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(mohakhali));

        LatLng gabtoli = new LatLng(23.782604, 90.342936);
        mMap.addMarker(new MarkerOptions().position(gabtoli).title("Marker in Gabtoli"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(gabtoli));

        LatLng saidabad = new LatLng(23.715828, 90.427237);
        mMap.addMarker(new MarkerOptions().position(saidabad).title("Marker in Saidabad"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(saidabad));

        LatLng kolabagan = new LatLng(23.747523, 90.380511);
        mMap.addMarker(new MarkerOptions().position(kolabagan).title("Marker in Kolabagan"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(kolabagan));

        LatLng TT_para = new LatLng(23.724955, 90.428710);
        mMap.addMarker(new MarkerOptions().position(TT_para).title("Marker in TT para"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(TT_para));
    }
}
