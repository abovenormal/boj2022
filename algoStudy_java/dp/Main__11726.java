//import java.io.*;
//
//public class Main_11726 {  //       DP
//
//    static int N;
//    static int arr[];
//    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//    public static void main(String[] args) throws IOException {
//
//        N = Integer.parseInt(br.readLine());
//
//        arr = new int[N+1];
//
//        for(int i=2; i<=N; i++){
//
//
//
//        }
//
//    }
//}
import java.util.Scanner;

class Main_11726 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] dp = new int[n+2];
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i <= n; i++) {
            dp[i] = (dp[i-1] + dp[i-2])%10007;
        }
        System.out.println(dp[n]%10007);
    }
}