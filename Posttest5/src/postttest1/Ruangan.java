/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package postttest1;

import java.io.IOException;

/**
 *
 * @author Mohammad Fhadil
 */
public class Ruangan extends Fasilitas{

    public Ruangan(String pemilik, String tipe, int luas_bangunan, int luas_tanah, int harga) throws IOException {
        super(pemilik, tipe, luas_bangunan, luas_tanah, harga);
    }

        /**
     *
     */
    @Override
    public void isiRuangan(){
        System.out.println("Ruangan yang ada di dalam property ini:");
        System.out.println("1. Kamar Tidur 3");
        System.out.println("2. Kamar Mandi 4");
        System.out.println("3. Garasi Untuk 2 mobil");
        System.out.println("4. Dapur 2");
    }

    /**
     *
     */
    @Override
    public void isiFurniture(){
            System.out.println("Furniture yang include dalam pembelian property:");
            System.out.println("1. 2 Queen Bed dan 1 single bed");
            System.out.println("2. 1 Sectional Sofa");
            System.out.println("3. 1 Set Meja Makan Minimalis Modern");
    }
}
