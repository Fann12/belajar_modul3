package Entity;

import java.util.Date;

public class KorbanEntity {

   protected String nik,nama,pekerjaan,goldarah,agama,jeniskelamin,notelp,bantuan;
   protected Date TglLahir;

    public KorbanEntity(String nik, String nama, String pekerjaan, String goldarah, 
            String agama, String jeniskelamin, String notelp, String bantuan, 
            Date TglLahir) {
        this.nik = nik;
        this.nama = nama;
        this.pekerjaan = pekerjaan;
        this.goldarah = goldarah;
        this.agama = agama;
        this.jeniskelamin = jeniskelamin;
        this.notelp = notelp;
        this.bantuan = bantuan;
        this.TglLahir = TglLahir;
    }
   
   public KorbanEntity (){
   }

    public String getNik() {
        return nik;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getPekerjaan() {
        return pekerjaan;
    }

    public void setPekerjaan(String pekerjaan) {
        this.pekerjaan = pekerjaan;
    }

    public String getGoldarah() {
        return goldarah;
    }

    public void setGoldarah(String goldarah) {
        this.goldarah = goldarah;
    }

    public String getAgama() {
        return agama;
    }

    public void setAgama(String agama) {
        this.agama = agama;
    }

    public String getJeniskelamin() {
        return jeniskelamin;
    }

    public void setJeniskelamin(String jeniskelamin) {
        this.jeniskelamin = jeniskelamin;
    }

    public String getNotelp() {
        return notelp;
    }

    public void setNotelp(String notelp) {
        this.notelp = notelp;
    }

    public String getBantuan() {
        return bantuan;
    }

    public void setBantuan(String bantuan) {
        this.bantuan = bantuan;
    }

    public Date getTglLahir() {
        return TglLahir;
    }

    public void setTglLahir(Date TglLahir) {
        this.TglLahir = TglLahir;
    }  
}  