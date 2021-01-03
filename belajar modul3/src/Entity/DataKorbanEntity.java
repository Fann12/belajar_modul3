package Entity;

import java.util.Date;

public class DataKorbanEntity extends KorbanEntity {
    private KorbanEntity korban;
    private int indexStatus;

    public DataKorbanEntity(int indexStatus, KorbanEntity korban) {
        this.indexStatus = indexStatus;
        this.korban = korban;
    }

      public KorbanEntity getKorban() {
        return korban;
    }

    public void setKorban(KorbanEntity korban) {
        this.korban = korban;
    }

    public int getIndexStatus() {
        return indexStatus;
    }

    public void setIndexStatus(int indexStatus) {
        this.indexStatus = indexStatus;
    }
        
}
    

