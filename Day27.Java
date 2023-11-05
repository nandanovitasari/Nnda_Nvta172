public class ProgramNilaiTerbesar {
    public static void main(String[] args) {
        int[] data = {1, 7, 8, 9, 0, 9, 4, 3, 1, 9};
        
        int nilaiTerbesar = data[0];
        
        // Mencari nilai terbesar dalam array
        for (int i = 1; i < data.length; i++) {
            if (data[i] > nilaiTerbesar) {
                nilaiTerbesar = data[i];
            }
        }
        
        System.out.println("Nilai terbesar adalah: " + nilaiTerbesar);
        
        System.out.print("Nilai terbesar dalam array adalah: ");
        for (int i = 0; i < data.length; i++) {
            if (data[i] == nilaiTerbesar) {
                System.out.print(data[i] + " ");
            }
        }
    }
}
