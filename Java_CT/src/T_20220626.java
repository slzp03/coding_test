import java.util.Scanner;

public class T_20220626 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//참가인원
		int man = sc.nextInt();
		//인당 먹을수 있는 최대치
		int max = sc.nextInt();
		//초밥의 갯수
		int sushi = sc.nextInt();
		//결과
		int result = 0;
		
		//2차 가능한 최대 인원 구하기
		for(int i = man; i >= 0; i--) {
			if(sushi <= i * (max-1)) {
				result = i;
				break;
			}
			sushi -= max;
		}
		System.out.println(result);
	}
}
