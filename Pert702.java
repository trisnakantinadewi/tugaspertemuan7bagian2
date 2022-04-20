/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pert702;

/**
 *
 * @author trisnakantina 20103001
 */
public class Pert702 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Buah B = new Buah ();
        B.setNama("Anggur");
        B.setWarna("Unggu");
        B.setHarga(15000);
        B.TampilInfo();
        
        Apel A = new Apel ();
        A.setNama("Apel Merah");
        A.setWarna("Merah");
        A.setHarga(20000);
        A.TampilInfo();
    }
    
}
