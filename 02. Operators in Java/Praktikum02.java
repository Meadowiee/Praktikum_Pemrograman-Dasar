import java.util.Scanner; 
public class LatihanPraktikum2_02 { 
     public static void main(String[] args) {  
        
        Scanner input = new Scanner(System.in);
        String cekBilangan;
        int a, bilangan; 
       
        // Input 
        System.out.println("Tuliskan bilangan anda!");
        System.out.print("Bilangan: ");
        bilangan = input.nextInt(); 
       
        // Proses
        a = bilangan % 2; 
       
        // Output 
        cekBilangan = a == 0 ? "genap" : "ganjil"; 
        System.err.println(bilangan + " merupakan bilangan " + cekBilangan); 
    } 

}
