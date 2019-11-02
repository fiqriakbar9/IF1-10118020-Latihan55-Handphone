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
public class BlackBerry extends Handphone {

    private String pinBB;
    
    public BlackBerry(String man, String os, String model, int harga) {
        super(man, os, model, harga);
    }
    
    public String getPinBB(){
        return pinBB;        
    }
    
    public void setPinBB(String pinBB){
         this.pinBB = pinBB;
    }

}
