package com.uts.loginpage;

// MainActivity.java

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import java.util.ArrayList;

public class MainMahasiswa extends Fragment {

    private ListView mListView;
    private ArrayList<Mahasiswa> mMahasiswaList;
    private MahasiswaListAdapter mAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.activity_mahasiswa, container, false);


        mListView = (ListView) rootView.findViewById(R.id.list_view);

        mMahasiswaList = new ArrayList<>();
        mMahasiswaList.add(new Mahasiswa("Absor", "Teknik Informatika", R.drawable.male, "Mahasiswa semester 6 dengan IPK 3.75"));
        mMahasiswaList.add(new Mahasiswa("Aep", "Teknik Informatika", R.drawable.male, "Mahasiswa semester 6 dengan IPK 3.85"));
        mMahasiswaList.add(new Mahasiswa("Agusti", "Teknik Informatika", R.drawable.male, "Mahasiswa semester 6 dengan IPK 3.60"));
        mMahasiswaList.add(new Mahasiswa("Alfeina", "Sistem Informasi", R.drawable.female, "Mahasiswa semester 6 dengan IPK 3.90"));
        mMahasiswaList.add(new Mahasiswa("Annisa", "Sistem Informasi", R.drawable.female, "Mahasiswa semester 6 dengan IPK 3.80"));
        mMahasiswaList.add(new Mahasiswa("Khofifah", "Sistem Informasi", R.drawable.female, "Mahasiswa semester 6 dengan IPK 3.50"));
        mMahasiswaList.add(new Mahasiswa("Jonathan", "Teknik Informatika", R.drawable.male, "Mahasiswa semester 5 dengan IPK 3.20"));
        mMahasiswaList.add(new Mahasiswa("Putri", "Sistem Informasi", R.drawable.male, "Mahasiswa semester 5 dengan IPK 3.65"));
        mMahasiswaList.add(new Mahasiswa("Rama", "Sistem Informasi", R.drawable.male, "Mahasiswa semester 7 dengan IPK 3.95"));
        mMahasiswaList.add(new Mahasiswa("Yohanes", "Teknik Informatika", R.drawable.male, "Mahasiswa semester 5 dengan IPK 3.70"));

        mAdapter = new MahasiswaListAdapter(getActivity(), mMahasiswaList);
        mListView.setAdapter(mAdapter);


        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Mahasiswa mahasiswa = mMahasiswaList.get(position);
                Toast.makeText(getActivity(), mahasiswa.getNama() + " (" + mahasiswa.getJurusan() + ")\n" + mahasiswa.getKeterangan(), Toast.LENGTH_LONG).show();
            }
        });
        return rootView;
    }
}