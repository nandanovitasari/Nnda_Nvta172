import java.util.Scanner;

public class Day30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan angka pertama: ");
        double angka1 = sc.nextDouble();

        System.out.print("Masukkan operator (+, -, *, /): ");
        char operator = sc.next().charAt(0);

        System.out.print("Masukkan angka kedua: ");
        double angka2 = sc.nextDouble();

        double hasil = 0.0;

        switch (operator) {
            case '+':
                hasil = angka1 + angka2;
                break;
            case '-':
                hasil = angka1 - angka2;
                break;
            case '*':
                hasil = angka1 * angka2;
                break;
            case '/':
                if (angka2 != 0) {
                    hasil = angka1 / angka2;
                } else {
                    System.out.println("Error: Pembagian oleh nol tidak diizinkan.");
                    return; // Menghentikan program jika terjadi error
                }
                break;
            default:
                System.out.println("Operator tidak valid.");
                return; // Menghentikan program jika operator tidak valid
        }

        System.out.println("Hasil: " + hasil);
    }
}
