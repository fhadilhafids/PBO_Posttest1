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
    
    public  property(String pemilik, String tipe, int luas_bangunan, int luas_tanah, int harga){
        this.pemilik = pemilik;
        this.tipe = tipe;
        this.luas_bangunan = luas_bangunan;
        this.luas_tanah = luas_tanah;
        this.harga = harga;
    }



    public String getpemilik() {
        return pemilik;
    }

    public void setPemilik(String pemilik) {
        this.pemilik = pemilik;
    }

    public String gettipe() {
        return tipe;
    }

    public void setTipe(String tipe) {
        this.tipe = tipe;
    }

    public int getluas_bangunan() {
        return luas_bangunan;
    }

    public void setLuas_bangunan(int luas_bangunan) {
        this.luas_bangunan = luas_bangunan;
    }

    public int getluas_tanah() {
        return luas_tanah;
    }

    public void setLuas_tanah(int luas_tanah) {
        this.luas_tanah = luas_tanah;
    }

    public int getharga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }
     

//    public void display(){
//          System.out.println("==================");
//          System.out.println("Nama Pemilik   :  " + this.pemilik );
//          System.out.println("Tipe Bangunan  : " + this.tipe);
//          System.out.println("Luas Bangunan  : " + this.luas_bangunan);
//          System.out.println("Luas Tanah     :  " + this.luas_tanah );
//          System.out.println("Harga Property : " + this.harga);
//          System.out.println("==================");
//    }
}

//class Ruangan extends property{
//
//    public Ruangan(String pemilik, String tipe, int luas_bangunan, int luas_tanah, int harga) {
//        super(pemilik, tipe, luas_bangunan, luas_tanah, harga);
//    }
//    public void tipe(){
//        System.out.println("Ruangan yang ada di dalam property ini:");
//        System.out.println("1. Kamar Tidur 3");
//        System.out.println("2. Kamar Mandi 4");
//        System.out.println("3. Garasi Untuk 2 mobil");
//        System.out.println("4. Dapur 2");
//    }
//}
//
//class Furniture extends Ruangan{
//    public Furniture(String pemilik, String tipe, int luas_bangunan, int luas_tanah, int harga) {
//        super(pemilik, tipe, luas_bangunan, luas_tanah, harga);
//    }
//    
//    public void tipe1(){
//        System.out.println("Furniture yang include dalam pembelian property:");
//        System.out.println("1. 2 Queen Bed dan 1 single bed");
//        System.out.println("2. 1 Sectional Sofa");
//        System.out.println("3. 1 Set Meja Makan Minimalis Modern");
//    }
//}
