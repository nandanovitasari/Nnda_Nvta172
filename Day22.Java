import java.util.Scanner;

public class Day22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nilai angka = ");
        int nilai = sc.nextInt();
        
        if (nilai >= 90 && nilai <= 100){
            System.out.println("Nilai huruf = A");
        } else if (nilai >= 80 && nilai < 90){
            System.out.println("Nilai huruf = B ");
        } else if (nilai >= 70 && nilai < 80) {
            System.out.println("Nilai huruf = C ");
        } else if (nilai >= 60 && nilai < 70) {
            System.out.println("Nilai huruf = D");
        } else if (nilai < 60) {
            System.out.println("Nilai huruf = E");
        } else {
            System.out.println("Nilai tidak valid");
        }
    }
}
