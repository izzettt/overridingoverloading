/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package overloading;

/**
 *
 * @author MOKLET-2
 */
public class biodata {
    
String nama;
    String kelasabsen;
    String alamat;
    
    void Biodata(String ka, String a) {
        kelasabsen = ka;
        System.out.println("Kelas/Absen : "+kelasabsen);
        alamat = a;
        System.out.println("Alamat      : "+alamat);
    }
    void Biodata(String nama) {
        System.out.println("Nama Antum  : "+nama);
    }
    
}
