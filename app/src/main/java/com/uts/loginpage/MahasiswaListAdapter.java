package com.uts.loginpage;

// MahasiswaListAdapter.java

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MahasiswaListAdapter extends BaseAdapter {

    private Context mContext;
    private ArrayList<Mahasiswa> mMahasiswaList;

    public MahasiswaListAdapter(Context context, ArrayList<Mahasiswa> mahasiswaList) {
        mContext = context;
        mMahasiswaList = mahasiswaList;
    }

    @Override
    public int getCount() {
        return mMahasiswaList.size();
    }

    @Override
    public Object getItem(int position) {
        return mMahasiswaList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(mContext).inflate(R.layout.list_item, parent, false);
        }

        Mahasiswa mahasiswa = (Mahasiswa) getItem(position);

        ImageView fotoImageView = (ImageView) convertView.findViewById(R.id.foto_image_view);
        fotoImageView.setImageResource(mahasiswa.getFoto());

        TextView namaTextView = (TextView) convertView.findViewById(R.id.nama_text_view);
        namaTextView.setText(mahasiswa.getNama());

        TextView jurusanTextView = (TextView) convertView.findViewById(R.id.jurusan_text_view);
        jurusanTextView.setText(mahasiswa.getJurusan());

        return convertView;
    }
}
