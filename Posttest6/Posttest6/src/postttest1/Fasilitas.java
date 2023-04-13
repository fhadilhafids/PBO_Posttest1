/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package postttest1;



/**
 *
 * @author Mohammad Fhadil
 */
public abstract class Fasilitas extends property{

    public Fasilitas(String pemilik, String tipe, int luas_bangunan, int luas_tanah, int harga) {
        super(pemilik, tipe, luas_bangunan, luas_tanah, harga);
    }


    
    abstract void isiFurniture();
    abstract void isiRuangan();
}
