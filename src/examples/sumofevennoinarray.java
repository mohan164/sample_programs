package examples;

import java.util.Scanner;

public class sumofevennoinarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];
		int n, i, sum = 0;
		System.out.println("enter the no of values");
		n = sc.nextInt();
		System.out.println("enter the vales");
		for (i = 0; i <= n; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.println("sum of even nos of array are");
		for (i = 0; i <= n; i++) {
			if (arr[i] % 2 == 0) {
				sum = sum + arr[i];
			}

		}
		System.out.println(sum);
		System.out.println("sum of odd nos of array are");
		for (i = 0; i <= n; i++) {
			if (arr[i] % 2 != 0) {
				sum = sum + arr[i];
			}

		}
		System.out.println(sum);

		System.out.println("sum of even indexs of array are");

		for (i = 1; i < arr.length; i += 2) {
			System.out.println(arr[i]);
			sum = sum + arr[i];
		}
		System.out.println(sum);

	}

}
