import java.util.Scanner; 

public class LatihanPraktikumI { 
        
    public static void main(String[] args) { 

        Scanner input = new Scanner(System.in);
        String namaLengkap, NIM, programStudi;
         
        //Input 
        System.out.print("Nama Lengkap : ");
        namaLengkap = input.nextLine();
        System.out.print("NIM          : ");
        NIM = input.nextLine();
        System.out.print("Program Studi: ");
        programStudi = input.nextLine();
         
        System.out.println("");
         
        //Output 
        System.out.println("Selamat datang " + namaLengkap + " dengan NIM " + NIM + " di program studi " + programStudi + "."); 
    } 
     
}
