package com.example.pagaralamtourismmaps;

import androidx.fragment.app.FragmentActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private static final LatLng PagarAlam = new LatLng(-4.125814, 103.271983);
    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);

        final Button pga = (Button) findViewById(R.id.pga);
        final Button normalView = (Button) findViewById(R.id.btnNormalView);
        final Button satelitView = (Button) findViewById(R.id.btnSatelitView);

        pga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(PagarAlam, 10));
            }
        });


        normalView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mMap.setMapType(GoogleMap.MAP_TYPE_NORMAL);
                normalView.setTag(R.id.btnNormalView);
                satelitView.setVisibility(View.VISIBLE);
                normalView.setVisibility(View.GONE);
            }
        });

        satelitView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mMap.setMapType(GoogleMap.MAP_TYPE_HYBRID);
                satelitView.setTag(R.id.btnSatelitView);
                normalView.setVisibility(View.VISIBLE);
                satelitView.setVisibility(View.GONE);
            }
        });
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(final GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Pagar Alam and move the camera
        LatLng AirTerjunLematang = new LatLng(-4.072735, 103.321704);
        LatLng AlunAlunSelatan = new LatLng(-4.026368, 103.239862);
        LatLng AlunAlunUtara = new LatLng(-4.012894, 103.248932);
        LatLng BalaiRegPendakianKampIV = new LatLng(-4.041615, 103.157013);
        LatLng Curup7Kenangan = new LatLng(-4.015061, 103.183256);
        LatLng CurupAlapAlap = new LatLng(-4.015494, 103.181303);
        LatLng CurupEmbun = new LatLng(-4.015820, 103.194081);
        LatLng CurupMangkok = new LatLng(-4.013589, 103.188362);
        LatLng CurupPintuLangit = new LatLng(-4.098696, 103.213349);
        LatLng CurupSendangDerajat = new LatLng(-4.014518, 103.184703);
        LatLng DempoPark = new LatLng(-4.012562, 103.190492);
        LatLng GreenParadise = new LatLng(-4.068537, 103.190882);
        LatLng HutanBambu = new LatLng(-4.011008, 103.195478);
        LatLng KebunJerukGerga = new LatLng(-4.079280, 103.160721);
        LatLng KolamAyekTalangTelok = new LatLng(-4.066745, 103.193602);
        LatLng KolamDempoPark = new LatLng(-4.013321, 103.187022);
        LatLng KolamRenangAirPerikan = new LatLng(-4.030713, 103.242950);
        LatLng KolamRenangTKSDModel  = new LatLng(-4.042865, 103.199294);
        LatLng LandingParalayang = new LatLng(-4.024241, 103.167892);
        LatLng LapanganOutbondTangga2001 = new LatLng(-4.038230, 103.189297);
        LatLng SitusMegalitManusiadililitUlar = new LatLng(-4.004801, 103.236380);
        LatLng SitusMegalitTegurWangi = new LatLng(-4.045861, 103.208201);
        LatLng OzielAmazingGarden = new LatLng(-4.049495, 103.245300);
        LatLng RumahAdatBaghi = new LatLng(-4.042411, 103.218613);
        LatLng RumahBatu = new LatLng(-4.004740, 103.236967);
        LatLng TamanBungaMrD = new LatLng(-4.067416, 103.319571);
        LatLng Tangga2001 = new LatLng(-4.037824, 103.190280);
        LatLng TebatMuaraTenang = new LatLng(-4.077150, 103.334629);
        LatLng TebatReban = new LatLng(-4.016713, 103.263158);
        LatLng TuguRimau = new LatLng(-4.024452, 103.154490);

        mMap.addMarker(new MarkerOptions().position(AirTerjunLematang).title("Air Terjun Lematang"));
        mMap.addMarker(new MarkerOptions().position(AlunAlunSelatan).title("Alun-Alun Selatan"));
        mMap.addMarker(new MarkerOptions().position(AlunAlunUtara).title("Alun-Alun Utara"));
        mMap.addMarker(new MarkerOptions().position(BalaiRegPendakianKampIV).title("Balai Registrasi Pendakian Kampung IV"));
        mMap.addMarker(new MarkerOptions().position(Curup7Kenangan).title("Curup 7 Kenangan"));
        mMap.addMarker(new MarkerOptions().position(CurupAlapAlap).title("Curup Alap-Alap"));
        mMap.addMarker(new MarkerOptions().position(CurupEmbun).title("Curup Embun"));
        mMap.addMarker(new MarkerOptions().position(CurupMangkok).title("Curup Mangkok"));
        mMap.addMarker(new MarkerOptions().position(CurupPintuLangit).title("Curup Pintu Langit"));
        mMap.addMarker(new MarkerOptions().position(CurupSendangDerajat).title("Curup Sendang Derajat"));
        mMap.addMarker(new MarkerOptions().position(DempoPark).title("Dempo Park"));
        mMap.addMarker(new MarkerOptions().position(GreenParadise).title("Green Paradise"));
        mMap.addMarker(new MarkerOptions().position(HutanBambu).title("Hutan Bambu"));
        mMap.addMarker(new MarkerOptions().position(KebunJerukGerga).title("Kebun Jeruk Gerga"));
        mMap.addMarker(new MarkerOptions().position(KolamAyekTalangTelok).title("Kolam Ayek Talang Telok"));
        mMap.addMarker(new MarkerOptions().position(KolamDempoPark).title("Kolam Dempo Park"));
        mMap.addMarker(new MarkerOptions().position(KolamRenangAirPerikan).title("Kolam Renang Air Perikan"));
        mMap.addMarker(new MarkerOptions().position(KolamRenangTKSDModel).title("Kolam Renang TK & SD Model"));
        mMap.addMarker(new MarkerOptions().position(LandingParalayang).title("Landing Paralayang"));
        mMap.addMarker(new MarkerOptions().position(LapanganOutbondTangga2001).title("Lapangan Outbond Tangga 2001"));
        mMap.addMarker(new MarkerOptions().position(SitusMegalitManusiadililitUlar).title("Situs Megalit Manusia dililit Ular"));
        mMap.addMarker(new MarkerOptions().position(SitusMegalitTegurWangi).title("Situs Megalit Tegur Wangi"));
        mMap.addMarker(new MarkerOptions().position(OzielAmazingGarden).title("Oziel Amazing Garden"));
        mMap.addMarker(new MarkerOptions().position(RumahAdatBaghi).title("Rumah Adat Baghi"));
        mMap.addMarker(new MarkerOptions().position(RumahBatu).title("Rumah Batu"));
        mMap.addMarker(new MarkerOptions().position(TamanBungaMrD).title("Taman Bunga Mr. D"));
        mMap.addMarker(new MarkerOptions().position(Tangga2001).title("Tangga 2001"));
        mMap.addMarker(new MarkerOptions().position(TebatMuaraTenang).title("Tebat Muara Tenang"));
        mMap.addMarker(new MarkerOptions().position(TebatReban).title("Tebat Reban"));
        mMap.addMarker(new MarkerOptions().position(TuguRimau).title("Tugu Rimau"));

        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(PagarAlam, 10));




    }
}
