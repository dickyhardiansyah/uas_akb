package id.dicky.uas_10116148;

/*
    Nama : Dicky Hardiansyah
    NIM  : 10116148
    KELAS : AKB-4
    Tanggal Pengerjaan : 15 Agustus 2019
*/

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class profil extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_profil, container, false);
        return view;
    }
}
