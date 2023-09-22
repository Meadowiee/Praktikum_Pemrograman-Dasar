import java.util.Scanner; 
public class Praktikum04 { 
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        final double PI = 3.141592; 
        double jariLingkaran, luasLingkaran;
        int luasLingkaran2;
      
        // Input 
        System.out.print("Jari-jari lingkaran = ");
        jariLingkaran = input.nextDouble(); 
      
        // Proses 
        luasLingkaran = PI * jariLingkaran * jariLingkaran;
        luasLingkaran2 = (int)luasLingkaran; 
      
        // Output 
        System.out.println("Luas lingkaran = " + luasLingkaran2); 
    }  
}
