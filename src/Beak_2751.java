import java.io.*;
import java.io.BufferedWriter;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Beak_2751 {

    public static int[] src;
    public static int[] tmp;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine()); //배열 갯수 입력
        src = new int[N];
        for(int i=0 ; i<N ; i++){
            src[i] = Integer.parseInt(br.readLine()); //배열src 입력
        }
        tmp = new int[src.length];

        mergeSort(0, src.length-1);
        for(int k=0 ; k<N; k++){
            bw.write(src[i]);
        }
        bw.flush();
        bw.close();
    }

    public static void mergeSort(int start, int end) {
        if (start<end) {
            int mid = (start+end) / 2;
            mergeSort(start, mid);
            mergeSort(mid+1, end);

            int p = start ;
            int q = mid + 1;
            int idx = p;

            while (p<=mid || q<=end) {
                if (q>end || (p<=mid && src[p]<src[q])) {
                    tmp[idx++] = src[p++];
                } else {
                    tmp[idx++] = src[q++];
                }
            }

            for (int i=start;i<=end;i++) {
                src[i]=tmp[i];
            }
        }
    }

    public static void printArray(int[] a) {
        for (int i=0;i<a.length;i++)
            System.out.print(a[i]+" ");
        System.out.println();
    }
}