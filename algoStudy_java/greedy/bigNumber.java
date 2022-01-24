package greedy;

import java.util.Scanner;

public class bigNumber {

	public static void main(String[] args) {
		int N,M,k;
		
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();	// 배열의 크기
		M = sc.nextInt();	// 숫자가 더해져야하는 총 횟수
		k = sc.nextInt();	// 한 숫자가 최대 몇번 더해질 수 있는지
		
		int max1 = 0;		// 가장 큰 수
		int max2 = 0;		// 두번째로 큰 수 
		int ans = 0;		// 답 저장
		
		int arr[] = new int [N];
		
		for(int i=0;i<N;i++) {
			arr[i] = sc.nextInt();

		}
		
		for(int i=0;i<N;i++) {
			
			if(arr[i]>max1) {
				int temp = max1;
				max1 = arr[i];
				max2 = temp;
			}
			else if(arr[i]==max1) {
				max2 = arr[i];
			}
			
			if(arr[i]<max1 && arr[i]>=max2) {
				max2=arr[i];
			}
			
		}
		
		
		ans = max1 * (M/k)*k + max2*(M%k);
		
		System.out.println("답 : " + ans);
		
		sc.close();
	}

}
