import java.util.Scanner;

public class JO562 {

	public static void main(String[] args) {
		int sum1 = 0, sum2 = 0;
		double avg = 0;

		Scanner sc = new Scanner(System.in);

		int[] arr = new int[10];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			if (i % 2 != 0) { // ¦����° �Էµ� ��
				sum1 += arr[i];
			} else // Ȧ����° �Էµ� ��
				sum2 += arr[i];
			avg = sum2 / 5.0;
		}
		System.out.println("sum : " + sum1);
		System.out.printf("avg : %.1f ", avg);
		sc.close();
	}
}
