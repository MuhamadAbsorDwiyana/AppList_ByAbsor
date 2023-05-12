package com.uts.loginpage;

// MainActivity.java

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

public class MainAdmin extends Fragment {

    //...
    private Context mContext;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

        // Menginisialisasi objek Context
        mContext = context;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_admin, container, false);

        Button btnLogout = view.findViewById(R.id.btn_logout);
        btnLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Lakukan proses logout di sini
                // ...

                // Kembali ke MainActivity
                Intent intent = new Intent(getActivity(), MainActivity.class);
                startActivity(intent);

                // Hancurkan sesi fragment yang sedang berjalan
                getActivity().finish();
            }
        });

        Button btnExit = view.findViewById(R.id.btn_exit);
        btnExit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getActivity().finish();
            }
        });


        Button btnOpenCamera = view.findViewById(R.id.btn_open_camera);
        btnOpenCamera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Buat Intent untuk membuka aplikasi kamera
                Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);

                // Jalankan Intent
                if (intent.resolveActivity(getContext().getPackageManager()) != null) {
                    startActivity(intent);
                } else {
                    Toast.makeText(mContext, "Izin kamera belum diberikan atau tidak ada aplikasi kamera yang sesuai", Toast.LENGTH_SHORT).show();
                }
            }
        });

        return view;
    }

    //...

}