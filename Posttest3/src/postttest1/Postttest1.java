/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package postttest1;

/**
 *
 * @author Mohammad Fhadil
 */

import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import javax.swing.JOptionPane;

public class Postttest1 {
    class Ruangan extends property{

        public Ruangan(String pemilik, String tipe, int luas_bangunan, int luas_tanah, int harga) {
            super(pemilik, tipe, luas_bangunan, luas_tanah, harga);
        }
        static void isiRuangan(){
            System.out.println("Ruangan yang ada di dalam property ini:");
            System.out.println("1. Kamar Tidur 3");
            System.out.println("2. Kamar Mandi 4");
            System.out.println("3. Garasi Untuk 2 mobil");
            System.out.println("4. Dapur 2");
        }
    }

    class Furniture extends Ruangan{
        public Furniture(String pemilik, String tipe, int luas_bangunan, int luas_tanah, int harga) {
            super(pemilik, tipe, luas_bangunan, luas_tanah, harga);
        }

        static void isiFurniture(){
            System.out.println("Furniture yang include dalam pembelian property:");
            System.out.println("1. 2 Queen Bed dan 1 single bed");
            System.out.println("2. 1 Sectional Sofa");
            System.out.println("3. 1 Set Meja Makan Minimalis Modern");
        }
    }
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        ArrayList <property> listproperty = new ArrayList<>();
        

        String pemilik,tipe;
        int luas_bangunan, luas_tanah, harga;
        boolean loop = true;
        while (loop) {
            System.out.println("==========================");
            System.out.println("[1] Tambah Data Property ");
            System.out.println("[2] Lihat Data Property ");
            System.out.println("[3] Ubah Data Property ");
            System.out.println("[4] Hapus Data Property");
            System.out.println("[5] Exit\n");
            System.out.println("==========================");

            System.out.print("Pilih: ");
            int menu = Integer.parseInt(br.readLine());
            switch (menu){
                case 1:
                    System.out.print("Nama Pemilik: ");
                    pemilik = br.readLine();
                    System.out.print("Tipe Bangunan: ");
                    tipe = br.readLine();
                    System.out.print("Luas Bangunan: ");
                    luas_bangunan = Integer.parseInt(br.readLine());
                    System.out.print("Luas Tanah: ");
                    luas_tanah = Integer.parseInt(br.readLine());
                    System.out.print("Harga Property: ");
                    harga = Integer.parseInt(br.readLine());

                    property property1 = new property(pemilik, tipe, luas_bangunan, luas_tanah,harga);
                    listproperty.add(property1);
                    break;
        
                

                case 2 :
                    for (int i = 0; i < listproperty.size(); i++) {
                        System.out.println("==================");
                        System.out.println("Nama Pemilik   :  " + listproperty.get(i).getpemilik());
                        System.out.println("Tipe Bangunan  : " + listproperty.get(i).gettipe());
                        System.out.println("Luas Bangunan  : " + listproperty.get(i).getluas_bangunan());
                        System.out.println("Luas Tanah     :  " + listproperty.get(i).getluas_tanah());
                        System.out.println("Harga Property : " + listproperty.get(i).getharga());
                        System.out.println("==================");
                        Ruangan.isiRuangan();
                        Furniture.isiFurniture();
                    }
                    
                    break;
                case 3:
                    System.out.println("Nama Pemilik: "); 
                    String Ubah = br.readLine();
                    for (property prop : listproperty){
                        if(prop.pemilik.equals(Ubah)){
                            System.out.println(" Nama Pemilik   : "); 
                            prop.setPemilik(br.readLine());
                            System.out.println(" Tipe Bangunan  : "); 
                            prop.setTipe(br.readLine());
                            System.out.println(" Luas Bangunan  : "); 
                            prop.setLuas_bangunan(Integer.parseInt(br.readLine()));
                            System.out.println(" Luas Tanah     : "); 
                            prop.setLuas_tanah(Integer.parseInt(br.readLine()));
                            System.out.println(" Harga Property : "); 
                            prop.setHarga(Integer.parseInt(br.readLine()));
                        }
                    }
                    break;
            
                case 4 :
                    System.out.println("Data Property Yang Ingin Dihapus (Nama Pemilik Property) :");
                    String ubah = br.readLine();
                    for (int i = 0; i < listproperty.size(); i++){
                        if ((listproperty.get(i).pemilik.equals(ubah))){
                            listproperty.remove(i);

                        }
                    }
                    break;
                
                case 5 :
                    System.exit(0);
                    
                default :
                    System.out.println("Pilihan Tidak Valid!");
            
            }
        }
    }
}

   
