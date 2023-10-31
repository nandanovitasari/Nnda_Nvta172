package Day17;
public class Day17{
    static int factorial(int n){
        if (n==0) {
            return 1;
        }else{
            return (n*factorial(n-1));
        }
        }
    public static void main(String[] args) {
        int n=1;
        int faktorial=factorial(n);
        System.out.println("factorial("+n+") = "+faktorial);
    }
    }

            

