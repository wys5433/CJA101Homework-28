package hw2;
//• 請設計一隻Java程式,輸出結果為以下:

//1 2 3 4 5 6 7 8 9 10
//1 2 3 4 5 6 7 8 9
//1 2 3 4 5 6 7 8
//1 2 3 4 5 6 7
//1 2 3 4 5 6
//1 2 3 4 5
//1 2 3 4
//1 2 3
//1 2
//1

public class Q6 {
	public static void main(String args[]) {
		int count = 10;// 每列的數字個數
		for (int i = 1; i <= 10; i++) {// 外層迴圈控制行數
			for (int j = 1; j <= count; j++) {
				System.out.print(j + " ");
			}
			count--;// 換行
			System.out.println();// 每列減少一個數字
		}
		
	}
}
