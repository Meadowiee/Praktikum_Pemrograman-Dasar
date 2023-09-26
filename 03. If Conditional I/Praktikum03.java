package praktikumiii;

import java.util.Scanner;

public class Praktikum03 {

 public static void main (String[] args){

 Scanner input = new Scanner (System.in);

 int item, cashback = 0, bonus = 0;

 

 // Input

 System.out.println("======== Selamat Datang di Toko 

Charlie ========");

 System.out.print("Banyak Pembelian Barang : ");

 item = input.nextInt();

 

System.out.println("==============================================

==");
 // Proses

 if (item > 0) {

 // Cashback proses

 if (item % 7 == 0) {

 cashback = item / 7 * 5500;

 System.out.println("Cashback: Rp" + cashback);

 } else {

 System.out.println("Cashback: -");

 }

 // Bonus proses

 if (item >= 3) {

 bonus = item / 3;

 System.out.println("Tambahan Barang: " + bonus);

 } else {

 System.out.println("Tambahan Barang: -");

 }

 // Total barang

 System.out.println("Jumlah Barang: " + (item + 

bonus));

 } else {

 System.out.println("ERROR - Inputan harus lebih dari 

0");

} 

 }

}
