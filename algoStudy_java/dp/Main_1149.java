import java.io.*;
import java.util.*;

public class Main_1149_한세환 {

    static int n,ans;
    static int houses[][];
    static int cost[][];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        houses = new int[n][3];
        cost = new int[n][3];

        for(int i=0; i<n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());

            for(int j=0;j<3;j++){
                houses[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for(int i=0; i<n; i++) {
            for (int j = 0; j < 3; j++) {
                if(i==0){
                   cost[i][j] = houses[i][j];
                }
                else{
                switch (j){
                    case 0:
                        cost[i][j] = Math.min(cost[i-1][1],cost[i-1][2]) + houses[i][j];
                        break;
                    case 1:
                        cost[i][j] = Math.min(cost[i-1][0],cost[i-1][2]) + houses[i][j];
                        break;
                    case 2:
                        cost[i][j] += Math.min(cost[i-1][0],cost[i-1][1]) + houses[i][j];
                        break;
                }
                }
            }
        }
        ans = Math.min(cost[n-1][0],cost[n-1][1]);
        ans = Math.min(ans,cost[n-1][2]);

        System.out.println(ans);

    }
}
