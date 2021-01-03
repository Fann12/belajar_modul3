package Utama;

import Entity.StatusEntity;
import Controller.*;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Main {
    private static KorbanController korban = new KorbanController();
    private static Scanner input = new Scanner (System.in);

    
     public static void main(String[] args){
        int loop=0;
        do{
           int pilih = 0 ;
           System.out.print("\n Sistem Informasi Korban Bencana Selamat" +
                            "\n 1. Daftar Korban" +
                            "\n 2. Login Korban" +
                            "\n 3. Update  "+
                            "\n  Pilihan Anda : ");
                        pilih = input.nextInt();
                                if(pilih == 1){
                                  daftar();
                              }else if(pilih == 2){
                              logindata();
                              }else if(pilih == 3){
                              updatestatus();
                              }else if(pilih == 4){
                              }else{
                                break;
            }
        }while (loop != 1);
     }
        
    static void daftar(){
        try{
        System.out.print("Input NIK = ");
        String nik = input.next();
        System.out.print("Input Nama = ");
        String nama = input.next();
        System.out.print("Input Pekerjaan = ");
        String pekerjaan = input.next();
        System.out.print("Input Golongan Darah = ");
        String goldar =  input.next();
        System.out.print("Input Agama = ");
        String agama =  input.next();
        System.out.print("Input Jenis Kelamin = ");
        String jeniskelamin =  input.next();
        System.out.print("Input No Telp = ");
        String notelp =  input.next();
        System.out.print("Input Tgl Lahir (mm/dd/yyyy) = ");
        Date tanggal = new Date(input.next());
        System.out.print("Bantuan = ");
        String bantuan = input.next();
        korban.insert(nik,nama,pekerjaan,goldar,
                agama,jeniskelamin,notelp,bantuan,tanggal);
        System.out.println("Daftar Sukses !!");
        }catch (Exception exception){
          System.out.println("Format Pengisian Salah !!");
        }
    }

    static void logindata(){
        System.out.print("NIK : ");
        String nik = input.next();
        System.out.print("Nama : ");
        String nama = input.next();
        korban.login(nik, nama);
        System.out.println("\n Data Dari "+korban.korban().getNama());
        int cek = korban.cekDataKorban(korban.korban().getNik());
        if (cek == -1){
            System.out.println("\n Status Anda Belom Di Daftarkan");
                daftarstatus();
        }else if(cek == -2){
            System.out.println("\n Status Anda Belom Di Daftarkan");
                daftarstatus();
        }else{
        System.out.println("Nama = "+korban.showDataKorban(cek).
                getKorban().getNama());
        System.out.println("NIK = "+korban.showDataKorban(cek).
                getKorban().getNik());
        System.out.println("Pekerjaan = "+korban.showDataKorban(cek).
                getKorban().getPekerjaan());
        System.out.println("Golongan Darah = "+korban.showDataKorban(cek).
                getKorban().getGoldarah());
        System.out.println("Agama = "+korban.showDataKorban(cek).
                getKorban().getAgama());
        System.out.println("Jenis Kelamin = "+korban.showDataKorban(cek).
                getKorban().getJeniskelamin());
        System.out.println("No Telp = "+korban.showDataKorban(cek).
                getKorban().getNotelp());
        System.out.println("Tanggal Lahir = "+new SimpleDateFormat("dd-MM-yyyy").
                format(korban.showDataKorban(cek)
                .getKorban().getTglLahir()));
        System.out.println("Status Korban = "+StatusEntity.status
                [korban.showDataKorban(cek).getIndexStatus()]);
        }
    }
    
    static void daftarstatus(){
        System.out.print("Pilih Status = \n");
        for(int i=0;i<StatusEntity.status.length;i++){
        System.out.println(i+". "+StatusEntity.status[i]);
        }
        System.out.print("Pilih Status = ");
           int  pilstatus = input.nextInt();
            korban.daftarstatus(pilstatus,korban.getData());
        }
   
    static void updatestatus(){
        System.out.print("Input NIK = ");
        String nik = input.next();
        korban.update(nik);
    }
}
