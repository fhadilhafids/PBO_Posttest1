/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package postttest1;

/**
 *
 * @author Mohammad Fhadil
 */


public class property {
    public String pemilik,tipe;
    public int luas_bangunan, luas_tanah, harga;
    
    public property(String pemilik, String tipe, int luas_bangunan, int luas_tanah, int harga){
        this.pemilik = pemilik;
        this.tipe = tipe;
        this.luas_bangunan = luas_bangunan;
        this.luas_tanah = luas_tanah;
        this.harga = harga;
    }
    
    public void getpemilik(String pemilik){
        this.pemilik = pemilik;
    }
    
    public void gettipe( String tipe){
        this.tipe = tipe;
    }
    public void getluas_bangunan(int luas_bangunan){
        this.luas_bangunan = luas_bangunan;
    }
    
    public void getluas_tanah(int luas_tanah){
        this.luas_tanah = luas_tanah;
    }
    
    public void getharga(int harga){
        this.harga = harga;
    }
      
    public void display(){
          System.out.println("==================");
          System.out.println("Nama Pemilik   :  " + this.pemilik );
          System.out.println("Tipe Bangunan  : " + this.tipe);
          System.out.println("Luas Bangunan  : " + this.luas_bangunan);
          System.out.println("Luas Tanah     :  " + this.luas_tanah );
          System.out.println("Harga Property : " + this.harga);
          System.out.println("==================");
    }
}
