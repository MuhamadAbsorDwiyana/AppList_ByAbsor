package com.uts.loginpage;

// DosenListAdapter.java

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class DosenListAdapter extends BaseAdapter {

    private Context mContext;
    private ArrayList<Dosen> mDosenList;

    public DosenListAdapter(Context context, ArrayList<Dosen> dosenList) {
        mContext = context;
        mDosenList = dosenList;
    }

    @Override
    public int getCount() {
        return mDosenList.size();
    }

    @Override
    public Object getItem(int position) {
        return mDosenList.get(position);
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

        Dosen dosen = (Dosen) getItem(position);

        ImageView fotoImageView = (ImageView) convertView.findViewById(R.id.foto_image_view);
        fotoImageView.setImageResource(dosen.getFoto());

        TextView namaTextView = (TextView) convertView.findViewById(R.id.nama_text_view);
        namaTextView.setText(dosen.getNama());

        TextView jurusanTextView = (TextView) convertView.findViewById(R.id.jurusan_text_view);
        jurusanTextView.setText(dosen.getJurusan());

        return convertView;
    }
}
