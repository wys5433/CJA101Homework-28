package hw4;

//• 有個一維陣列如下:
//{29, 100, 39, 41, 50, 8, 66, 77, 95, 15}
//請寫出一隻程式能輸出此陣列所有元素的平均值與大於平均值的元素
//(提示:陣列,length屬性)
public class Q1 {
	public static void main(String[] args) {
		int[] x = { 29, 100, 39, 41, 50, 8, 66, 77, 95, 15 };
		int sum = 0;
		for (int i = 0; i < x.length; i++) {
			sum += x[i];
		}
		int average = sum /= x.length;
		System.out.println(average);
		System.out.println("The number greater than average is: ");
		for (int i = 0; i < x.length; i++) {
			if (average < x[i]) {
				System.out.println(x[i]);
			}

		}
	}

}
