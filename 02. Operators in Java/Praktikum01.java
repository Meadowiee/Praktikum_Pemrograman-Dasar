import java.util.Scanner; 
public class Praktikum01 { 
    public static void main(String[] args) { 
      
        Scanner input = new Scanner(System.in);  
        int panjangBalok, luasBalok, tinggiBalok, volumeBalok; 
      
        // Input
        System.out.println("Masukkan panjang, luas, dan tinggi balok!"); 
        System.out.print("Panjang: ");  
        panjangBalok = input.nextInt();  
        System.out.print("Luas   : "); 
        luasBalok = input.nextInt();  
        System.out.print("Tinggi : ");
        tinggiBalok = input.nextInt(); 
      
        // Process
        volumeBalok = panjangBalok * luasBalok * tinggiBalok;
      
        // Output
        System.out.println("Volume dari balok tersebut adalah " + volumeBalok); 
    } 
     
}
