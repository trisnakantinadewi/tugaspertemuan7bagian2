/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pert702;

/**
 *
 * @author trisnakantina 20103001
 */
public class Buah {
    private String nama, warna;
    private double harga;
    
    public void setNama (String N){
        this.nama = N;
    }
    public String getNama (){
        return this.nama;
    }
    public void setWarna (String color) {
        this.warna = color;
    }
    public String getWarna (){
        return this.warna;
    }
    public void setHarga (double H){
        this.harga = H;
    }
    public double getHarga (){
        return this.harga;
    }
    public void TampilInfo(){
        System.out.println("Informasi Data Harga Buah");
        System.out.println("Nama Buah : "+this.nama);
        System.out.println("Harga     : "+this.harga);
        System.out.println("Warna     : "+this.warna);
    }
    
}
