package Model;

import Entity.DataKorbanEntity;
import Entity.StatusEntity;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class DataKorbanModel implements Interfaces {
    private ArrayList<DataKorbanEntity> datakorbanArrayList;
    
    public DataKorbanModel(){
    datakorbanArrayList = new ArrayList<DataKorbanEntity>();
        }
    public void insertDataDataKorban(DataKorbanEntity datakorban){
        datakorbanArrayList.add(datakorban);
    }
    public ArrayList<DataKorbanEntity> getdatakorbanArrayList(){
        return datakorbanArrayList;
    }
    
    @Override
 public void view(){
        for(DataKorbanEntity datakorban : datakorbanArrayList){
        System.out.println("===========================================");
        System.out.println(" NIK : "+datakorban.getKorban().getNik()+"\n Nama : "
         +datakorban.getKorban().getNama()+"\n Pekerjaan : "+datakorban.getKorban().getPekerjaan()+
            "\n Golongan Darah : "+datakorban.getKorban().getGoldarah()+
            "\n Agama : "+datakorban.getKorban().getAgama()+"\n Jenis Kelamin : "
            +datakorban.getKorban().getJeniskelamin()+"\n No Telp : "
            +datakorban.getKorban().getNotelp()+"\n Tanggal Lahir : "
            +new SimpleDateFormat("dd-MM-yyyy").format(datakorban.getKorban().getTglLahir())+
            "\n Status : "+StatusEntity.status[datakorban.getIndexStatus()]);
        }   
    }
  public int cekData(String nik, String nama){
        int loop = 0;
        if(datakorbanArrayList.size() ==0){
            loop = -1;
        }else{
            for(int i = 0; i <datakorbanArrayList.size(); i++){
            if(datakorbanArrayList.get(i).getKorban().getNik().equals(nik) && datakorbanArrayList.get(i).getKorban().getNama().equals(nama)){
                loop = i;
                break;
            }else{
                loop = -2;
                }
            }
        }   return loop;
    }
  
    public DataKorbanEntity showDataKorban(int index){
        return datakorbanArrayList.get(index);
    }   
    
    private int carinik(String nik){
        int index=-1;
        for(int i=0;i <datakorbanArrayList.size();i++) {
           if(nik.equals(datakorbanArrayList.get(i).getKorban().getNik()))
               index=i;
       }
       return index;
    }
        public void update(String nik){
        Scanner input = new Scanner (System.in);
        if(carinik(nik)!=-1){
             for(int i=0;i<StatusEntity.status.length;i++){
                        System.out.println(i+". "+StatusEntity.status[i]);
                    }
            System.out.print("Update Status = ");
            int statusbaru=input.nextInt();
            datakorbanArrayList.get(carinik(nik)).setIndexStatus(statusbaru);
        }
        else {
            System.out.println("Data tidak Ditemukan");
        }
    }
}
