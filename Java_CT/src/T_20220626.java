import java.util.Scanner;

public class T_20220626 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//�����ο�
		int man = sc.nextInt();
		//�δ� ������ �ִ� �ִ�ġ
		int max = sc.nextInt();
		//�ʹ��� ����
		int sushi = sc.nextInt();
		//���
		int result = 0;
		
		//2�� ������ �ִ� �ο� ���ϱ�
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
