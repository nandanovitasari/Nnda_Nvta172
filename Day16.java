package Day16;
import java.util.ArrayList;
public class Day16 {
    public static void main(String[] args) {
        ArrayList data=new ArrayList();
        data.add("mobil");
        data.add(20);
        data.add(5.5);
        data.add('@');
        System.out.println(data);
        //menghapus mobil dari ArrayList
        data.remove("mobil");
        System.out.println(data);
        //ukuran linkedList
        int ukuran = data.size();
        System.out.println("ukuran LinkedList = "+ukuran);
    }
}
