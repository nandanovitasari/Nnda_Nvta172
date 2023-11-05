import java.util.Scanner;

public class ProgramTerusMenerus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a, b;
        
        while (true) {
            System.out.print("Masukkan nilai a: ");
            a = sc.nextInt();
            System.out.print("Masukkan nilai b: ");
            b = sc.nextInt();
            
            if (b == 1) {
                for (int i = 1; i <= 10; i++) {
                    System.out.println(i);
                }
            } else if (b == 2) {
                for (int i = a; i <= 10; i++) {
                    System.out.println(i);
                }
            } else {
                System.out.println("Input b tidak valid. Harus 1 atau 2.");
            }
            
            System.out.print("Apakah Anda ingin melanjutkan? (ya/tidak): ");
            String lanjut = sc.next();
            
            if (!lanjut.equalsIgnoreCase("ya")) {
                break;
            }
        }
    }
}
