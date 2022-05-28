import java.util.Scanner;

public class B_20220528 {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		
		//N = ゴンドラの数
		int n = sc.nextInt();
		//M = 組の数
		int m = sc.nextInt();
		// gon = 各ゴンドラの最大人巣
		int gon[] = new int[n];
		// hito = 各組の人数
		int hito[] = new int[m];
		
		int temp = 0;
		for(int i=0; i<n+m; i++) {
			if(temp < n) {
				gon[temp] = sc.nextInt();
			} else{
				hito[temp-n] = sc.nextInt();
			}
			temp++;
		}
		
		// result
		int result[] = new int[n];

		int i = 0;
		int j = 0;
		while(true) {
			if(hito[i] > 0) {
				if(hito[i] <= gon[j]) {
					result[j] += hito[i];
					hito[i] -= hito[i];
				}else {
					result[j] += gon[j];
					hito[i] -= gon[j];
				}
				if(hito[i] == 0)i++;
			}
			j++;
			if(j >= n)j=0;
			if(i==m)break;
		}
		for(int x : result)System.out.println(x);
	}

}
