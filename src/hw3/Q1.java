package hw3;

import java.util.Scanner;

//• 請設計一隻程式,使用者輸入三個數字後,輸出結果會為正三角形、等腰三角形、其它三角形或不是三角形,如圖示結果:
//
//(提示:Scanner,三角形成立條件,判斷式if else)
//(進階功能:加入直角三角形的判斷)

public class Q1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the first length of triangle: ");
		int i = sc.nextInt();

		System.out.println("Please enter the second length of triangle: ");
		int j = sc.nextInt();

		System.out.println("Please enter the last length of triangle");
		int k = sc.nextInt();
		
		if (i + j > k && i + k > j && j + k > i) {
			if (i == j && j == k) {
				System.out.println("This is an equilateral triangle.");// 正三角形
			} else if (i == j || i == k || j == k) {
				System.out.println("This is an isosceles triangle.");// 等腰三角形
			} else {
				System.out.println("This is a triangle. ");
			}
		} else {
			System.out.println("This is not a triangle.");
		}

		sc.close();
	}

}
