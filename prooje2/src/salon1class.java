
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Toshiba
 */
public class salon1class {
    private String ad;
    private String soyad;
    private String eposta;
    private String tarih;
    private double odeme;
    private int id;

    public salon1class(int id,String ad, String soyad, String eposta, String tarih, double odeme) {
        this.id = id;
        this.ad = ad;
        this.soyad = soyad;
        this.eposta = eposta;
        this.tarih = tarih;
        this.odeme = odeme;
         

    }

    salon1class() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getEposta() {
        return eposta;
    }

    public void setEposta(String eposta) {
        this.eposta = eposta;
    }

    public String getTarih() {
        return tarih;
    }

    public void setTarih(String tarih) {
        this.tarih = tarih;
    }

    public double getOdeme() {
        return odeme;
    }

    public void setOdeme(double odeme) {
        this.odeme = odeme;
    }
    
  public int getId(){
      return id;
  }
    public void setId(int id){
        this.id=id;
    }
}
