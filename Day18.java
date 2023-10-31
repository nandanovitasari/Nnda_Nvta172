import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

public class Day18 {
    //stack
    public static void main(String[] args) {
        Stack<Integer>nilai=new Stack<>();
        nilai.push(1);
        nilai.push(2);
        nilai.push(3);
        nilai.push(4);
        nilai.push(5);
        System.out.println(nilai);
        
        int value = nilai.pop();
        System.out.println("POP: "+value);
        System.out.println(nilai);
        
        value = nilai.peek();
        System.out.println("PEEK: "+value);
        System.out.println(nilai);
        
        nilai.push(3);
        nilai.push(5);
        System.out.println(nilai);
        
        //queue
        Queue<Integer>angka=new LinkedList<>();
        System.out.println(angka);
        angka.offer(6);
        angka.offer(7);
        angka.offer(8);
        angka.offer(9);
        angka.offer(10);
        
        System.out.println(angka);
        
        Integer value2 = angka.poll();
        System.out.println("POLL : "+value2);
        System.out.println(angka);
        
        value2 = angka.peek();
        System.out.println("PEEK: "+value);
        System.out.println(angka);
    }
}
