package com.example.weatherforecast;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

   private RelativeLayout homeRL;
   private ProgressBar loadingPB;
   private TextView cityNameTV, temperatureTV, conditionTV;
   private RecyclerView weatherRV;
   private TextInputEditText cityEdt;
   private ImageView backIV, iconIV, searchIV;

   @Override
   protected void onCreate(Bundle savedInstaceState){
      super.onCreate(savedInstaceState);
      setContentView(R.layout.activity_main);

      homeRL = findViewById(R.id.idRLHome);
      loadingPB = findViewById(R.id.idPBLoading);
      cityNameTV = findViewById(R.id.idTVCityname);
      temperatureTV = findViewById(R.id.idTVTemperature);
      conditionTV = findViewById(R.id.idTVCondition);
      weatherRV = findViewById(R.id.idRVWeather);
      cityEdt = findViewById(R.id.idEdtCity);
      backIV = findViewById(R.id.idIVBack);
      iconIV = findViewById(R.id.idIVIcon);
      searchIV = findViewById(R.id.idIVSearch);
      


   }

}