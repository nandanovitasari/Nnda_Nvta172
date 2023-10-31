import java.util.HashSet;
import java.util.HashMap;
public class Day19 {
    public static void main(String[] args) {
        HashSet<Integer>angka=new HashSet<>();
        angka.add(1);
        angka.add(2);
        angka.add(3);
        angka.add(4);
        angka.add(5);
        System.out.println(angka);
        
        HashMap<String,Integer>data=new HashMap<String,Integer>();
        data.put("satu",1);
        data.put("dua", 2);
        data.put("tiga", 3);
        
        for (String i:data.keySet()) {
            System.out.println("key: "+i+"value: "+data.get(i));
        }
        
    }
}
