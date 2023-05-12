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

public class MainDosen extends Fragment {

    private ListView mListView;
    private ArrayList<Dosen> mDosenList;
    private DosenListAdapter mAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.activity_dosen, container, false);


        mListView = (ListView) rootView.findViewById(R.id.list_view);

        mDosenList = new ArrayList<>();
        mDosenList.add(new Dosen("Dede", "Komputer Grafik", R.drawable.male, "NIDN:0110099201 Email:dede@dosen.id"));
        mDosenList.add(new Dosen("Edi", "Mobile Programming", R.drawable.male, "NIDN:0220099202 Email:Edi@dosen.id"));
        mDosenList.add(new Dosen("Ikhsan", "Teknik Kompilasi", R.drawable.male, "NIDN:0330099203 Email:@iksandosen.id"));
        mDosenList.add(new Dosen("Joko", "Rekayasa Perangkat Lunak", R.drawable.male, "NIDN:0440099204 Email:joko@dosen.id"));
        mDosenList.add(new Dosen("Khotib", "Sistem Informasi Manajemen", R.drawable.male, "NIDN:0550099205 Email:khotib@dosen.id"));
        mDosenList.add(new Dosen("Maulana", "Pemrograman Web", R.drawable.male, "NIDN:0660099206 Email:maulana@dosen.id"));
        mDosenList.add(new Dosen("Mirza", "Kecerdasan Buatan", R.drawable.male, "NIDN:0770099207 Email:mirza@dosen.id"));
        mDosenList.add(new Dosen("Nurjaya", "Kerja Praktek", R.drawable.male, "NIDN:0880099208 Email:nurjaya@dosen.id"));

        mAdapter = new DosenListAdapter(getActivity(), mDosenList);
        mListView.setAdapter(mAdapter);


        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Dosen dosen = mDosenList.get(position);
                Toast.makeText(getActivity(), dosen.getNama() + " (" + dosen.getJurusan() + ")\n" + dosen.getKeterangan(), Toast.LENGTH_LONG).show();
            }
        });
        return rootView;
    }
}