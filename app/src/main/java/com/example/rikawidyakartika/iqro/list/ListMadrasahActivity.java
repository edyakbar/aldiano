package com.example.rikawidyakartika.iqro.list;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.view.MenuItemCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SearchView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.example.rikawidyakartika.iqro.Config.Adapter.RecyclerAdapterListAll;
import com.example.rikawidyakartika.iqro.Config.Config;
import com.example.rikawidyakartika.iqro.Config.Modul.ResultAll;
import com.example.rikawidyakartika.iqro.Config.Modul.UserAPIService;
import com.example.rikawidyakartika.iqro.Config.Modul.Value;
import com.example.rikawidyakartika.iqro.R;

import java.util.ArrayList;
import java.util.Arrays;

import butterknife.BindView;
import butterknife.ButterKnife;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ListMadrasahActivity extends AppCompatActivity implements SearchView.OnQueryTextListener {
    private ProgressDialog pDialog;
    private MenuItem mSearchMenuItem;
    private ArrayList<ResultAll> resultAlls;
    private RecyclerAdapterListAll adapter;
    @BindView(R.id.card_recycler_view)
    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_madrasah);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ButterKnife.bind(this);

        getSupportActionBar().setTitle("List Madrasah");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        initViews();



    }


    private void initViews(){
        recyclerView.setHasFixedSize(true);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        getData();
    }

    private void getData(){
        pDialog = new ProgressDialog(this);
        pDialog.setCancelable(false);
        pDialog.setMessage("Loading ...");
        pDialog.show();
        UserAPIService api = Config.getRetrofit().create(UserAPIService.class);
        Call<Value> call = api.getJSON();
        call.enqueue(new Callback<Value>() {
            @Override
            public void onResponse(Call<Value> call, Response<Value> response) {
               pDialog.dismiss();
                String value1 = response.body().getStatus();
                if (value1.equals("1")){
                    Value value = response.body();
                    resultAlls = new ArrayList<>(Arrays.asList(value.getResult()));
                    adapter = new RecyclerAdapterListAll(resultAlls,getApplicationContext());
                    recyclerView.setAdapter(adapter);
                }else {
                    Toast.makeText(ListMadrasahActivity.this,"Maaf Data Tidak Ada",Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<Value> call, Throwable t) {
                pDialog.dismiss();
                Toast.makeText(ListMadrasahActivity.this,"Respon gagal",Toast.LENGTH_SHORT).show();
                Log.d("Hasil internet",t.toString());
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(final Menu menu) {
        getMenuInflater().inflate(R.menu.menu_search, menu);
        final MenuItem item = menu.findItem(R.id.action_search);
        final SearchView searchView = (SearchView) MenuItemCompat.getActionView(item);
        searchView.setOnQueryTextListener(this);

        MenuItemCompat.setOnActionExpandListener(item, new MenuItemCompat.OnActionExpandListener() {
            @Override
            public boolean onMenuItemActionCollapse(MenuItem item) {
                // Do something when collapsed
                adapter.setFilter(resultAlls);
                return true; // Return true to collapse action view
            }

            @Override
            public boolean onMenuItemActionExpand(MenuItem item) {
                // Do something when expanded
                return true; // Return true to expand action view
            }
        });
        return true;
    }

    @Override
    public boolean onQueryTextSubmit(String query) {
        return false;
    }

    @Override
    public boolean onQueryTextChange(String newText) {
        final ArrayList<ResultAll> filteredModelList = filter(resultAlls, newText);

        adapter.setFilter(filteredModelList);
        return true;
    }

    private ArrayList<ResultAll> filter(ArrayList<ResultAll> models, String query) {
        query = query.toLowerCase();final ArrayList<ResultAll> filteredModelList = new ArrayList<>();
        for (ResultAll model : models) {
            final String text = model.getNama_madrasah().toLowerCase();
            if (text.contains(query)) {
                filteredModelList.add(model);
            }
        }
        return filteredModelList;
    }



}
