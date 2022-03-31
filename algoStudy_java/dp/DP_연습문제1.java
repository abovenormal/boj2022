import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DP_연습문제1_한세환 {

    static int n;
    static int arr[];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());

        arr = new int[n+1];

        arr[1] = 2;
        arr[2] = 3;

        for(int i=3;i<=n;i++){
            arr[i] = arr[i-1]+arr[i-2];
        }

        /*
        *
          arr[0]=1, arr[1] =2, arr[2] = 3, arr[3] = 5;
          for(int i=4;i<=n;i++){
            arr[i] = 3*arr[i-3]+2*arr[i-4];
        }
        * */

        System.out.println(arr[n]);



    }
}
