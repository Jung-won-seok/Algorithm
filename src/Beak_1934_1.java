import java.io.*;
import java.util.Scanner;

public class Beak_1934_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0 ; i<t ; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int result = a*b/gcd(a,b);
            System.out.println(result);
        }
    }

    private static int gcd(int a, int b) {
        if(b==0)
            return a;
        else
            return gcd(b, a%b);
    }
}
