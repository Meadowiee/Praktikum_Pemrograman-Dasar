import java.util.Scanner;

public class Praktikum02 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        String sentence1, sentence2, sentence3;
      
        // Input
        System.out.println("Masukkan kalimat pertama: ");
        sentence1 = input.nextLine();
        System.out.println("Masukkan kalimat kedua: ");
        sentence2 = input.nextLine();
        System.out.println("Masukkan kalimat ketiga: ");
        sentence3 = input.nextLine();
      
        // Output
        System.out.println(sentence1 + "\n" + sentence2 + "\n\t" + sentence3);
    }
    
}
