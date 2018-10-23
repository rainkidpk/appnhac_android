package com.thv.hoangvu.appnhac.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.thv.hoangvu.appnhac.Model.BaiHat;
import com.thv.hoangvu.appnhac.R;

import java.util.ArrayList;

public class DanhSachBaiHatAdapter extends RecyclerView.Adapter<DanhSachBaiHatAdapter.ViewHolder>{

    Context context;
    ArrayList<BaiHat> mangBaiHat;

    public DanhSachBaiHatAdapter(Context context, ArrayList<BaiHat> mangBaiHat) {
        this.context = context;
        this.mangBaiHat = mangBaiHat;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View view = layoutInflater.inflate(R.layout.dong_danh_sach_bai_hat,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        BaiHat baiHat = mangBaiHat.get(position);
        holder.txtCaSi.setText(baiHat.getCaSi());
        holder.txtTenBaiHat.setText(baiHat.getTenBaiHat());
        holder.txtIndex.setText(position + 1 + "");

    }

    @Override
    public int getItemCount() {
        return mangBaiHat.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        TextView txtIndex, txtTenBaiHat, txtCaSi;
        ImageView imgLuotThich;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            txtCaSi = itemView.findViewById(R.id.textviewtencasi);
            txtIndex = itemView.findViewById(R.id.textviewdanhsachindex);
            txtTenBaiHat = itemView.findViewById(R.id.textviewtenbaihat);
            imgLuotThich = itemView.findViewById(R.id.imageviewluotthichdanhsachbaihat);

        }
    }
}
