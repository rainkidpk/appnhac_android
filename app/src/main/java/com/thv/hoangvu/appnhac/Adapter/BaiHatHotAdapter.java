package com.thv.hoangvu.appnhac.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;
import com.thv.hoangvu.appnhac.Model.BaiHat;
import com.thv.hoangvu.appnhac.R;

import java.util.ArrayList;

public class BaiHatHotAdapter extends RecyclerView.Adapter<BaiHatHotAdapter.ViewHolder>{

    Context context;
    ArrayList<BaiHat> baiHatArrayList;

    public BaiHatHotAdapter(Context context, ArrayList<BaiHat> baiHatArrayList) {
        this.context = context;
        this.baiHatArrayList = baiHatArrayList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View view = layoutInflater.inflate(R.layout.dong_bai_hat_hot,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        BaiHat baiHat = baiHatArrayList.get(position);
        holder.txtCaSi.setText(baiHat.getCaSi());
        holder.txtTen.setText(baiHat.getTenBaiHat());
        Picasso.with(context).load(baiHat.getHinhBaiHat()).into(holder.imgHinh);

    }

    @Override
    public int getItemCount() {
        return baiHatArrayList.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder{

            TextView txtTen,txtCaSi;
            ImageView imgHinh, imgLuotThich;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            txtTen = itemView.findViewById(R.id.textviewbaihathot);
            txtCaSi = itemView.findViewById(R.id.textviewtencasibaihathot);
            imgHinh = itemView.findViewById(R.id.imageviewbaihathot);
            imgLuotThich = itemView.findViewById(R.id.imageviewluotthich);
        }
    }
}
