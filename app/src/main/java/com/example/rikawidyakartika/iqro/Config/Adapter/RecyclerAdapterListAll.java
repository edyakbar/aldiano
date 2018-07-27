package com.example.rikawidyakartika.iqro.Config.Adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.example.rikawidyakartika.iqro.Config.Config;
import com.example.rikawidyakartika.iqro.Config.Modul.ResultAll;
import com.example.rikawidyakartika.iqro.R;
import com.example.rikawidyakartika.iqro.list.DetailMadrasahActivity;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by edy akbar on 27/07/2018.
 */

public class RecyclerAdapterListAll extends RecyclerView.Adapter<RecyclerAdapterListAll.ViewHolder> {
    private ArrayList<ResultAll> result;
    private Context context;

    public RecyclerAdapterListAll(ArrayList<ResultAll> result, Context context) {
        this.context = context;
        this.result = result;
    }

    @Override
    public RecyclerAdapterListAll.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.recycler_row_list, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final RecyclerAdapterListAll.ViewHolder viewHolder, int i) {
        viewHolder.t_nama.setText(result.get(i).getNama_madrasah());
        viewHolder.t_alamat.setText(result.get(i).getAlamat());


        Glide.with(context).load(Config.URL_IMG+result.get(i).getGambar())
                .thumbnail(0.5f)
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .placeholder(R.mipmap.ic_launcher)
                .crossFade()
                .error(R.mipmap.ic_launcher)
                .into(viewHolder.img_list);
    }

    @Override
    public int getItemCount() {
        return result.size();
    }

    public void setFilter(ArrayList<ResultAll> models) {
        result = new ArrayList<>();
        result.addAll(models);
        notifyDataSetChanged();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        @BindView(R.id.t_nama)
        TextView t_nama;
        @BindView(R.id.t_alamat)
        TextView t_alamat;
        @BindView(R.id.img_recycler)
        ImageView img_list;
        @BindView(R.id.cardview)
        CardView cardView;

        public ViewHolder(View view) {
            super(view);
            ButterKnife.bind(this, view);
            view.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            if (v == cardView) {
                int i = getAdapterPosition();
                Context context = v.getContext();
                Intent intent = new Intent(context, DetailMadrasahActivity.class);
                intent.putExtra("id_madrasah", result.get(i).getId_madrasah());
                intent.putExtra("nama_madrasah", result.get(i).getNama_madrasah());
                intent.putExtra("alamat", result.get(i).getAlamat());
                intent.putExtra("kepala_sekolah", result.get(i).getKepala_sekolah());
                intent.putExtra("jumlah_guru", result.get(i).getJumlah_guru());
                intent.putExtra("jumlah_santri", result.get(i).getJmlah_santri());
                intent.putExtra("lt", result.get(i).getLatitude());
                intent.putExtra("lg", result.get(i).getLongitude());
                intent.putExtra("gambar", result.get(i).getGambar());
                intent.putExtra("detail", result.get(i).getDetail());


                context.startActivity(intent);
            }
        }
    }
}
