/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package handphone;

/**
 *
 * @author 'KoalaX'
 * NAMA     : Fiqri Akbar Pratama
 * KELAS    : PBO1/IF1
 * NIM      : 10118020
 * Deksripsi Program : Program ini berisi program untuk menampilkan Spesifikasi
 * dari beberapa handphone yang berbeda
 * 
 */
public class Handphone {
    
    protected String manufacture;
    protected String operatingSystem;
    protected String model;
    protected int harga;
    
    public Handphone(String man, String os, String model, int harga){
      this.manufacture = man;
      this.operatingSystem = os;
      this.model = model;
      this.harga = harga;
      
    }
    
    public void displayProduct(){
        System.out.println("Manufaktur : "+manufacture);
        System.out.println("OS : "+operatingSystem);
        System.out.println("Model : "+model);
        System.out.println("Harga : "+harga);
           
    }
    
}
