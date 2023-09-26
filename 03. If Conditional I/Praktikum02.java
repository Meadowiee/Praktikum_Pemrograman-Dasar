package praktikumiii;

import java.util.Scanner;

public class Praktikum02 {

 public static void main (String[] args){

 Scanner input = new Scanner(System.in);

 double laptop, buku, kotak, hp, total;

 String index = null, status;

 

 // Input

 System.out.println("======== Indeks Berat Barang Bawaan 

Tasku ========");

 System.out.print("Banyak laptop : ");

 laptop = input.nextDouble();

 System.out.print("Banyak Buku Tulis : ");

 buku = input.nextDouble();

 System.out.print("Banyak Kotak Pensil : ");

 kotak = input.nextDouble();

 System.out.print("Banyak Smartphone : ");

 hp = input.nextDouble();

 

System.out.println("==============================================

====");

 

 // Berat total

 laptop = laptop * 850.56;

 buku = buku * 250.11;

 kotak = kotak * 25.31;

 hp = hp * 200.00;

 total = laptop + buku + kotak + hp;

 

 // Indeks Berat barang
 if (total >= 0 && total <= 2000) {

 // Kondisi 1 - aman

 if (total >= 1500 && total <= 2000) {

 index = "4";

 } else if (total > 1000 && total < 1500) {

 index = "3";

 } else if (total >= 500 && total <1000) {

 index = "2";

 } else if (total > 0 && total <500) {

 index = "1";

 } else if (total == 0) {

 index = "0";

 }

 System.out.println("Indeks Berat Barang : " + index);

 System.out.println("Bawaan barang tidak melebihi 

ketentuan");

 } else if (total > 2000){

 // Kondisi 2 - over

 System.out.println("Index Berat Barang : 5");

 System.out.println("Berat barang melebihi 

ketentuan.");

 } else if (total < 0 || laptop < 0 || buku < 0 ||kotak < 0 

|| hp < 0){

 // Kondisi 3 - input < 0

 System.out.println("ERROR - Tidak diperkenankan 

bilangan negatif!");

 }

 }

}
