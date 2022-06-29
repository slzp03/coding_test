import java.util.Scanner;

public class T_20220626_02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int dp[] = new int[41];
		dp[0]=1;
		dp[1]=1;
		dp[2]=2;
		for(int i=3; i<dp.length;i++) {
			dp[i] = dp[i-1] + dp[i-2];
		}
		
		int result = 1;
		int beforeSeat = 0;
		for(int i = 0; i < m; i++) {
			int temp = sc.nextInt();
			result *= dp[temp - beforeSeat -1];
			beforeSeat = temp;
		}
		result *= dp[n - beforeSeat];
		
		System.out.println(result);
		
	}
	

}
