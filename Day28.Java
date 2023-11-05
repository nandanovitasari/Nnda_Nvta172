import java.util.Vector;
import java.util.ArrayList;

public class Day28 {
    public static void main(String[] args) {
        // Menggunakan Vector
        Vector<Object> vectorData = new Vector<Object>();
        vectorData.add(12);
        vectorData.add(46.4138729);
        vectorData.add("gajah");
        vectorData.add('j');
        vectorData.add(24);
        vectorData.add('#');
        vectorData.add("jerapah");
        vectorData.add(22.7);

        System.out.println("Menggunakan Vector:");
        for (Object obj : vectorData) {
            System.out.println(obj);
        }

        System.out.println("\n==================\n");

        // Menggunakan ArrayList
        ArrayList<Object> arrayListData = new ArrayList<Object>();
        arrayListData.add(12);
        arrayListData.add(46.4138729);
        arrayListData.add("gajah");
        arrayListData.add('j');
        arrayListData.add(24);
        arrayListData.add('#');
        arrayListData.add("jerapah");
        arrayListData.add(22.7);

        System.out.println("Menggunakan ArrayList:");
        for (Object obj : arrayListData) {
            System.out.println(obj);
        }
    }
}
