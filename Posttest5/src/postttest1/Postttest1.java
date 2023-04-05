package postttest1;

import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import javax.swing.JOptionPane;

public class Postttest1 {
    
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

                    property property1 = new property(pemilik, tipe, luas_bangunan, luas_tanah, harga) {};
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
                        Ruangan ruangan = new Ruangan();
                        ruangan.isiRuangan();
                        ruangan.isiFurniture();
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

   
