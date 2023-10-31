package mobil;
public class mobil {
    private String nama;
    public mobil(String nama){
        this.nama=nama;
    }
    public void cetakNama(){
        System.out.println("nama = "+nama);
    }
    public static void main(String[] args) {
        mobil objek = new mobil("PANTER");
        objek.cetakNama();
    }
}
