import com.j256.ormlite.field.DataType;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.field.types.LongStringType;
import com.j256.ormlite.table.DatabaseTable;

import java.util.Date;


@DatabaseTable(tableName = "Usterka")
public class Usterka {

    @DatabaseField(canBeNull = false )
    private Date data;

    @DatabaseField(canBeNull = false)
    private String nazwa;

    @DatabaseField(canBeNull = false)
    private Date odbior;

    @DatabaseField(canBeNull = false)
    private int wycena;

    @DatabaseField(canBeNull = true)
    private String opis;

    @DatabaseField(canBeNull = false, generatedId = true, unique = true)
    private int id_usterki;

    @DatabaseField(canBeNull = false)
    private int id_sam;

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public Date getOdbior() {
        return odbior;
    }

    public void setOdbior(Date odbior) {
        this.odbior = odbior;
    }

    public int getWycena() {
        return wycena;
    }

    public void setWycena(int wycena) {
        this.wycena = wycena;
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    public int getId_usterki() {
        return id_usterki;
    }

    public void setId_usterki(int id_usterki) {
        this.id_usterki = id_usterki;
    }

    public int getId_sam() {
        return id_sam;
    }

    public void setId_sam(int id_sam) {
        this.id_sam = id_sam;
    }

    public Usterka(){

    }
}