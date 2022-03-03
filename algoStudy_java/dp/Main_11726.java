import java.io.*;

public class Main_11726 {  //       DP

    static int N;
    static int arr[];
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        N = Integer.parseInt(br.readLine());

        arr = new int[N+2];

        arr[1] = 1;
        arr[2] = 2;

        for(int i=3; i<=N; i++){
            arr[i] = (arr[i-2] + arr[i-1])%10007;
        }

        System.out.println(arr[N]);

    }
}
