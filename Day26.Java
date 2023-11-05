import java.util.Scanner;

public class ProgramPencarianArray {
    public static void main(String[] args) {
        int[] arrayAngka = {5, 8, 10, 15, 20}; // Contoh array dengan beberapa angka
        
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            System.out.print("Masukkan angka yang ingin dicari: ");
            int angkaCari = sc.nextInt();
            
            boolean ditemukan = false;
            
            // Mencari angka dalam array
            for (int i = 0; i < arrayAngka.length; i++) {
                if (arrayAngka[i] == angkaCari) {
                    ditemukan = true;
                    break;
                }
            }
            
            if (ditemukan) {
                System.out.println("Angka ditemukan");
            } else {
                System.out.println("Angka yang Anda cari tidak ditemukan");
                break;
            }
        }
    }
}

