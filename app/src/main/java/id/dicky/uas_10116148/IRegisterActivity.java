package id.dicky.uas_10116148;

/*
    Nama : Dicky Hardiansyah
    NIM  : 10116148
    KELAS : AKB-4
    Tanggal Pengerjaan : 15 Agustus 2019
*/

public interface IRegisterActivity {

    void checkInputan();
    boolean cekPassword(String Password, String confirmPassword);
    boolean cekUser(String Username);

}