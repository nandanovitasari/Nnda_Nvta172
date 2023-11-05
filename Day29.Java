public class Day29 {
    private String kode;
    private String nama;
    private int sks;
    private double nilai;

    // Constructor
    public Day29(String kode, String nama, int sks, double nilai) {
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
        this.nilai = nilai;
    }

    // Getter dan Setter untuk kode
    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    // Getter dan Setter untuk nama
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    // Getter dan Setter untuk sks
    public int getSks() {
        return sks;
    }

    public void setSks(int sks) {
        this.sks = sks;
    }

    // Getter dan Setter untuk nilai
    public double getNilai() {
        return nilai;
    }

    public void setNilai(double nilai) {
        this.nilai = nilai;
    }

    // Method untuk melakukan sorting berdasarkan kode
    public static void toSorting(Day29[] arrayDay29) {
        for (int i = 0; i < arrayDay29.length - 1; i++) {
            for (int j = 0; j < arrayDay29.length - i - 1; j++) {
                if (arrayDay29[j].getKode().compareTo(arrayDay29[j + 1].getKode()) > 0) {
                    // Tukar posisi
                    Day29 temp = arrayDay29[j];
                    arrayDay29[j] = arrayDay29[j + 1];
                    arrayDay29[j + 1] = temp;
                }
            }
        }
    }

    // Main method untuk menguji kelas
    public static void main(String[] args) {
        Day29[] data = {
            new Day29("CSE101", "Pemrograman Java", 3, 85.5),
            new Day29("MTH202", "Kalkulus", 4, 90.0),
            new Day29("ENG301", "Bahasa Inggris", 2, 75.8)
        };

        System.out.println("Data sebelum sorting:");
        for (Day29 item : data) {
            System.out.println("Kode: " + item.getKode() + ", Nama: " + item.getNama() +
                               ", SKS: " + item.getSks() + ", Nilai: " + item.getNilai());
        }

        // Lakukan sorting berdasarkan kode
        toSorting(data);

        System.out.println("\nData setelah sorting:");
        for (Day29 item : data) {
            System.out.println("Kode: " + item.getKode() + ", Nama: " + item.getNama() +
                               ", SKS: " + item.getSks() + ", Nilai: " + item.getNilai());
        }
    }
}
