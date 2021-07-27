/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanukl1;

/**
 *
 * @author erisa
 */
public class LatihanUKL1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       int awal = 3; //nilai dari suku pertama
       int selisih = 5; //selisih antar suku
       int jumlahSuku = 10; //banyaknya suku
       int sukuSaatIni = awal; //perhitungan dimulai suku pertama
       int jumlahDeret = 0; //variabel untuk menghitung jumlah deret
       
       
       for(int a =1; a <= jumlahSuku; a++){ // perulangan suku ke-
           System.out.println("suku ke- " +a+ " adalah " +sukuSaatIni); //menampilkan deret aritmatika
          
           jumlahDeret += sukuSaatIni; //menghitung jumlah setiap suku
           sukuSaatIni += selisih; //untuk memberi selisih antar suku
           
         
           
           
       }
        System.out.println("Jumlah Deret : "+ jumlahDeret); //menampilkan jumlah deret
       
       
       
       
       
       
      /* 
       System.out.println(" ");
       for(int a = 3; a<= 50; a+=5){
           System.out.print(a + " ");
           jumlah = jumlah +a;
          */
           
           
           
       }
       
    }
    

