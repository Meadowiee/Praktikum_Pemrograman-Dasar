import java.util.Scanner; 
 
public class Praktikum03 { 
 
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in); 
        String userSentence; 
      
        // Input
        System.out.println("Ketikkan pesan anda: ");
        userSentence = input.nextLine(); 
         
        System.out.println(""); 
      
        // Output
        System.out.println("\"" + userSentence + "\""); 
    } 
     
}
