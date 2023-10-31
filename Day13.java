package Day13;
public class Day13 {
    public static void main(String[] args) {
        String kata1 = "Halo, dunia!";
        String kata2 = new String("Ini adalah objek String");

        String gabung = kata1 + " " + kata2;
        int panjangStr1 = kata1.length();
        char karakterPertama = kata1.charAt(0);
        String str3 = kata1.substring(0, 4) + "John";

        System.out.println(kata1);
        System.out.println(kata2);
        System.out.println(gabung);
        System.out.println("Panjang str1: " + panjangStr1);
        System.out.println("Karakter pertama str1: " + karakterPertama);
        System.out.println(str3);
        System.out.println("==========================StringBuffer=========================");
          StringBuffer buffer = new StringBuffer("Halo");

        // Menambahkan teks ke StringBuffer
        buffer.append(", dunia!");

        // Mengubah teks pada indeks tertentu
        buffer.setCharAt(1, 'E');

        // Menghapus teks pada indeks tertentu
        buffer.delete(0, 4);

        System.out.println(buffer);
    }
}

    

