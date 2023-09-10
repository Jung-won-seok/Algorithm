import java.io.*;
import java.util.Scanner;

public class Beak_11399 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); //사람 수
        int temp = 0;
        int Person[] = new int[N]; //사람 줄
        for (int i = 0; i < N; i++) {
            Person[i] = sc.nextInt();
        }
        for (int i = 1; i < N; i++) { //최솟값 배열을 위한 오름차순 배열
            for (int j = i - 1; j >= 0; j--) {
                if (Person[i] <= Person[j]) {
                    temp = Person[i];
                    for (int k = i-1 ; k>=j ; k--) {
                        Person[k + 1] = Person[k];
                    }
                    Person[j] = temp;
                }
            }
        }
        for (int i = 0; i < N; i++) {
            System.out.println(Person[i]);
        }
    }
}
