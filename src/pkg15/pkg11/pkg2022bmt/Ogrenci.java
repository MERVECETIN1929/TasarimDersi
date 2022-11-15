/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg15.pkg11.pkg2022bmt;

/**
 *
 * @author merve
 */
public class Ogrenci {

    private EnumBolum bolum;
    private SinavStratejisi sinavStratejisi;

    public Ogrenci(EnumBolum bolum) throws Exception {
        this.bolum = bolum;
        if (bolum == null) {
            throw new Exception("bölüm boş olamaz");
        }
        switch (bolum) {
            case SOZEL:
                sinavStratejisi = new SozelStratejisi();
                break;
            case SAYISAL:
                sinavStratejisi = new SayısaıStratejisi();
                break;
            case ESITAGIRLIK:
                sinavStratejisi = new EsitAgirlikStratejisi();
                break;
        }
    }

    public String getOncelikSiralamasi() {
        System.out.println(bolum + "Stratejisi");
        String siralama = "1. " + sinavStratejisi.getBirinci() + "çöz"
                + "2. " + sinavStratejisi.getIkinci() + " çöz"
                + "3. " + sinavStratejisi.getUcuncu() + " çöz"
                + "4. " + sinavStratejisi.getDorduncu();
        return siralama;
    }
}
