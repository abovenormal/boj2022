import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DP_연습문제2_한세환 {

    static int n;
    public static void main(String[] args) throws IOException {
        BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());

        int [] dp = new int[n+1];

        dp[1] = 2;
        dp[2] = 5;

        for(int i=3;i<=n;i++){
            dp[i] = 2 * dp[i-1] + dp[i-2];
        }

        System.out.println(dp[n]);
    }
}
