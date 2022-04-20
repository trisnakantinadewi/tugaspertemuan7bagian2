/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pert702;

/**
 *
 * @author trisnakantina 20103001
 */
public class Apel extends Buah {
    private String nama, warna;
    private Double harga;
    
    @Override
    public void TampilInfo(){
        System.out.println("Informasi Data Harga Buah Apel");
        System.out.println("Nama Buah : "+this.getNama());
        System.out.println("Harga     : "+this.getHarga());
        System.out.println("Warna     : "+this.getWarna());
    }
}