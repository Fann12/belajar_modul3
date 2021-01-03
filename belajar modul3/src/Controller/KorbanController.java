package Controller;

import Entity.DataKorbanEntity;
import Entity.KorbanEntity;
import java.util.Date;

public class KorbanController implements ControllerInterfaces {
    int indexLogin=0;
    
        
    public KorbanEntity getData(){
        return AllObjectModel.korbanModel.getkorbanEntityArrayList(indexLogin);
       }
    
   public void daftarstatus (int indexStatus, KorbanEntity korban){
       AllObjectModel.datakorbanModel.insertDataDataKorban(new DataKorbanEntity(indexStatus,korban));
    }
    
    @Override
    public void login (String nik , String nama){
        indexLogin = AllObjectModel.korbanModel.cekData(nik, nama);
    }
      
    public void insert (String nik, String nama,
               String pekerjaan,String goldarah,String agama,
               String jeniskelamin,String notelp,
               String bantuan,Date TglLahir){
       AllObjectModel.korbanModel.insert(new KorbanEntity(nik,nama,pekerjaan,goldarah,
            agama,jeniskelamin, notelp,bantuan,TglLahir));
    }
    
     public KorbanEntity korban(){
        return AllObjectModel.korbanModel.getkorbanEntityArrayList(indexLogin);
    }
    
    public int cekDataKorban(String nik){
        int cek = AllObjectModel.datakorbanModel.cekData(nik, null);
        return cek;
    }
    
    public DataKorbanEntity showDataKorban (int index){
        return AllObjectModel.datakorbanModel.showDataKorban(index);
    }

    public void update(String nik) {
       AllObjectModel.datakorbanModel.update(nik);
    }
}
