package hw2;
//• 請設計一隻Java程式,輸出結果為以下:

//A
//BB
//CCC
//DDDD
//EEEEE
//FFFFFF

public class Q7 {
	public static void main(String args[]) {
		// char A = 'A';
		int count = 0;
		for (int i = 65; i <= 70; i++) {
			count++;
			for (int k = 1; k <= count; k++) {
				System.out.print((char) i);
			}
			System.out.println();
		}

	}
}
