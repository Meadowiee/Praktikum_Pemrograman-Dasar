package praktikumiii;

import java.util.Scanner;

public class Praktikum04 {

 public static void main (String[] args){

 Scanner input = new Scanner (System.in);

 int item, discount = 0, time;

 // Input

 System.out.println("======== TOKO BUAH A ========");

 System.out.print("Enter jumlah pembelian: ");

 item = input.nextInt();

 System.out.print("Enter menit: ");

 time = input.nextInt();

 System.out.println("=============================");

 

 // Proses

 if (item > 0 && time > 0) {

 if (item <= 150) {

 if (time <= 7*60) {

 if (time >= 40) {

 discount = ((time / 40) * 5000 * item);

 }

System.out.println("Jumlah Pembelian: " + 

item);

 System.out.println("Stok tersisa: " + (150 -

item));
System.out.println("Jumlah Pembelian: " + 

(item * 100000 - discount));

 } else {

 System.out.println("Toko telah tutup!");

 }

 }

 } else {

 System.out.println("ERROR - Inputan Invalid!");

 }

 }

}

Output :
