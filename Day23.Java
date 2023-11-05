import java.util.LinkedList;
import java.util.Scanner;

class Data {
    String nama;
    int umur;

    public Data(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }

    @Override
    public String toString() {
        return "Nama: " + nama + ", Umur: " + umur;
    }
}

public class ProgramLinkedList {
    public static void main(String[] args) {
        LinkedList<Data> dataList = new LinkedList<>();

        // Menambahkan data ke LinkedList
        dataList.add(new Data("John Doe", 25));
        dataList.add(new Data("Jane Doe", 30));
        dataList.add(new Data("Bob Smith", 35));

        // Menampilkan data
        System.out.println("Data awal:");
        for (Data data : dataList) {
            System.out.println(data);
        }

        // Memperbarui data
        dataList.get(0).umur = 26;

        // Menambahkan data baru
        dataList.add(new Data("Mary Johnson", 40));

        // Menghapus data
        dataList.remove(2);

        // Menampilkan data setelah perubahan
        System.out.println("\nData setelah perubahan:");
        for (Data data : dataList) {
            System.out.println(data);
        }
    }
}
