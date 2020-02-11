package com.example.mymaps;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.Polyline;
import com.google.android.gms.maps.model.PolylineOptions;

public class checkPointActivity extends AppCompatActivity  {
    GoogleMap map;
    Button btnGetDirection;
    EditText sourceLatEditTxt, SourceLongEditTxt,destLatEditTxt,destLongEditTxt;
    MarkerOptions place1,place2;
    Polyline currentPolyline;
    String Slat,Slong,Dlat,Dlong;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_point);
        btnGetDirection = (Button)findViewById(R.id.btnGetDirections);
        MapFragment mapFragment = (MapFragment)getFragmentManager().findFragmentById(R.id.mapFrag);
        mapFragment.getMapAsync((OnMapReadyCallback) this);
        sourceLatEditTxt = (EditText)findViewById(R.id.EditTxtSource);
        destLatEditTxt = (EditText)findViewById(R.id.EditTxtDest);
        SourceLongEditTxt = (EditText)findViewById(R.id.EditTxtSource2);
        destLongEditTxt = (EditText)findViewById(R.id.EditTxtDest2);

        btnGetDirection.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Slat = sourceLatEditTxt.getText().toString();
                Slong = SourceLongEditTxt.getText().toString();
                Dlat = destLatEditTxt.getText().toString();
                Dlong = destLongEditTxt.getText().toString();
            }
        });




    }


}
