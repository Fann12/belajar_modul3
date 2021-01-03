package Model;

import Entity.KorbanEntity;
import java.util.ArrayList;


public class KorbanModel implements Interfaces {
    private ArrayList<KorbanEntity> korbanEntityArrayList;
    
    public KorbanModel(){
        korbanEntityArrayList = new ArrayList<KorbanEntity>();
    }
public void insert(KorbanEntity korban){
    korbanEntityArrayList.add(korban);  
}

    @Override
 public void view(){
        for(KorbanEntity korbanEntity : korbanEntityArrayList){
            System.out.println("===========================================");
            System.out.println(" NIK : "+korbanEntity.getNik()+"\n Nama : "
            +korbanEntity.getNama()+"\n Pekerjaan : "+korbanEntity.getPekerjaan()+
            "\n Golongan Darah : "+korbanEntity.getGoldarah()+"\n Agama : "+korbanEntity.getAgama()+
            "\n Jenis Kelamin : "+korbanEntity.getJeniskelamin()+"\n No Telp : "
            +korbanEntity.getNotelp()+"\n Tanggal Lahir : "+korbanEntity.getTglLahir());
            System.out.println("===========================================");
        }
    }
 public int cekData(String nik, String nama){
        int loop = 0;
        while (!korbanEntityArrayList.get(loop).getNik().equals(nik) && 
                !korbanEntityArrayList.get(loop).getNama().equals(nama)){
            loop++;
        }
        return loop;
    }
    public KorbanEntity getkorbanEntityArrayList(int index){
        return korbanEntityArrayList.get(index);
    }
}

