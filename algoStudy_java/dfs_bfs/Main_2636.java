import java.io.*;
import java.util.*;

class Point{
    int r,c;

    Point(int r, int c){
        this.r= r;
        this.c =c;
    }
}

public class Main_2636 {
    static int row,col;
    static int arr[][];
    static boolean temp[][];
    static int hour;    // 시간 체크
    static int cheese,ans;     // 치즈 개수 체크
    static int deltax[] = {-1,0,1,0};
    static int deltay[] = {0,1,0,-1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        row = Integer.parseInt(st.nextToken());
        col = Integer.parseInt(st.nextToken());

        arr = new int [row][col];



        for(int r = 0; r<row; r++){
            st = new StringTokenizer(br.readLine());
            for(int c=0; c<col; c++){
                arr[r][c] = Integer.parseInt(st.nextToken());
                if(arr[r][c]==1){   // 처음 치즈 개수 세기
                    cheese++;
                }
            }
        }

        while(cheese!=0){
            hour++;
            ans=cheese;
            cheese_bfs();
        }

        System.out.println(hour);
        System.out.println(ans);


    }

    public static void cheese_bfs(){

        Queue<Point> queue = new LinkedList<>();

        queue.offer(new Point(0,0));
        temp = new boolean [row][col];
        temp[0][0] = true;

        while(!queue.isEmpty()){

            Point now = queue.poll();

            for(int i=0 ; i<4; i++){
                int nr = now.r + deltax[i];
                int nc = now.c + deltay[i];

                if(nr<0||nc<0||nr>=row||nc>=col||temp[nr][nc]){
                    continue;
                }

                if(arr[nr][nc]==1){
                    cheese--;
                    arr[nr][nc]=0;
                }
                else if(arr[nr][nc]==0){
                    queue.offer(new Point(nr,nc));
                }

                temp[nr][nc]=true;
            }

        }

    }
}
