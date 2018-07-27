package com.example.rikawidyakartika.iqro.list;

import android.app.AlertDialog;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.example.rikawidyakartika.iqro.Config.Config;
import com.example.rikawidyakartika.iqro.R;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

import butterknife.BindView;
import butterknife.ButterKnife;

public class DetailMadrasahActivity extends AppCompatActivity implements OnMapReadyCallback {
    LatLng PETA;
    Double lt, lg;
    String id_madrasah, nama_madrasah,alamat,detail,kepala_sekolah,jumlah_guru,jumlah_santri,gambar;
    @BindView(R.id.nama)
    TextView t_nama;
    @BindView(R.id.alamat) TextView t_alamat;
    @BindView(R.id.profil) TextView t_profil;
    @BindView(R.id.kepala_sekolah) TextView t_kepala_sekolah;
    @BindView(R.id.jumlah_guru) TextView t_jumlah_guru;
    @BindView(R.id.jumlah_santri) TextView t_jumlah_santri;

    @BindView(R.id.img)
    ImageView img;
    private Context context;
    AlertDialog.Builder dialog;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_madrasah);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ButterKnife.bind(this);

        Bundle b = getIntent().getExtras();
        id_madrasah = b.getString("id_madrasah");
        nama_madrasah = b.getString("nama_madrasah");
        alamat = b.getString("alamat");
        detail = b.getString("detail");
        kepala_sekolah = b.getString("kepala_sekolah");
        jumlah_guru = b.getString("jumlah_guru");
        jumlah_santri = b.getString("jumlah_santri");


        gambar = b.getString("gambar");
        lt = Double.valueOf(b.getString("lt"));
        lg = Double.valueOf(b.getString("lg"));
        PETA = new LatLng(lt, lg);

        t_nama.setText(nama_madrasah);
        t_alamat.setText(alamat);
        t_kepala_sekolah.setText(kepala_sekolah);
        t_profil.setText(detail);
        t_jumlah_guru.setText(jumlah_guru);
        t_jumlah_santri.setText(jumlah_santri);
        Glide.with(this).load(Config.URL_IMG+gambar)
                .thumbnail(0.5f)
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .crossFade()
                .placeholder(R.mipmap.ic_launcher)
                .error(R.mipmap.ic_launcher)
                .into(img);
        getSupportActionBar().setTitle(nama_madrasah);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);




    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        Marker ragunan = googleMap.addMarker(new MarkerOptions().position(PETA).title(nama_madrasah).snippet(alamat));
        googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(PETA, 15));
        if (ActivityCompat.checkSelfPermission(this, android.Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this, android.Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {

            return;
        }
        googleMap.setMyLocationEnabled(true);
        googleMap.getUiSettings().setCompassEnabled(true);
        googleMap.getUiSettings().setZoomControlsEnabled(true);
        googleMap.getUiSettings().setMyLocationButtonEnabled(true);
        googleMap.getUiSettings().setTiltGesturesEnabled(true);
    }

}
