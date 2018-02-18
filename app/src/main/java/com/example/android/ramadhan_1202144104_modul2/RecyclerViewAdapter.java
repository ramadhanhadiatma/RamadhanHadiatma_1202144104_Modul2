package com.example.android.ramadhan_1202144104_modul2;
import android.content.Intent;
import android.support.design.widget.Snackbar;
import android.support.v7.widget.RecyclerView;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;

    public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {
        private ArrayList<String> judulList;
        private ArrayList<Integer> hargaList;
        private ArrayList<Integer> gambarList;

        public RecyclerViewAdapter(ArrayList<String> judulList,ArrayList<Integer> hargaList, ArrayList<Integer>gambarList){
            this.judulList = judulList;
            this.hargaList = hargaList;
        }

        public class ViewHolder extends RecyclerView.ViewHolder {
            private TextView JudulMenu, HargaMenu;
            private ImageView Menu;
            private RelativeLayout ItemList;

            public ViewHolder(View itemView) {
                super(itemView);
                JudulMenu = itemView.findViewById(R.id.menumakan);
                HargaMenu = itemView.findViewById(R.id.harga);
                Menu = itemView.findViewById(R.id.menu);
                ItemList = itemView.findViewById(R.id.item_list);
            }

        }

        @Override
        public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            //membuat view untuk menyipkan dan memasang layout yang akan digunakan pada recycleview
            View V = LayoutInflater.from(parent.getContext()).inflate(R.layout.view_design,parent,false);
            ViewHolder VH = new ViewHolder(V);
            return VH;
        }

        @Override
        public void onBindViewHolder(ViewHolder holder, int position) {
            //memasukkan nilai/value pada view-view yang telah dibuat
            final String Nama = judulList.get(position);
            holder.JudulMenu.setText(judulList.get(position));
            holder.HargaMenu.setText("Harga Rp. "+position);
            holder.Menu.setImageResource(gambarList.get(position));
        }

        @Override
        public int getItemCount() {
            //Menghitung ukuran/jumlah data yang akan ditampilkan
            return judulList.size();
        }


    }
