package id.dicky.uas_10116148;

/*
    Nama : Dicky Hardiansyah
    NIM  : 10116148
    KELAS : AKB-4
    Tanggal Pengerjaan : 15 Agustus 2019

    private int nim;
    private String nama;
    private String kelas;
    private String nohp;
    private String email;
    private String sosmed;
*/

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


public class MainActivity extends AppCompatActivity {
    private int waktu_loading=4000;

    //4000=4 detik

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                //setelah loading maka akan langsung berpindah ke home activity
                Intent home = new Intent(MainActivity.this, ActivityPager.class);
                startActivity(home);
                finish();

            }
        },waktu_loading);
    }
}