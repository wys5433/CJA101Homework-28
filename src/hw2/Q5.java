package hw2;
//• 阿文很熱衷大樂透 (1 ~ 49),但他不喜歡有4的數字,不論是個位數或是十位數。請設計一隻程式,

//輸出結果為阿文可以選擇的數字有哪些?總共有幾個?

public class Q5 {
	public static void main(String args[]) {
		int count = 0;
		for (int i = 1; i < 50; i++) {
			if (!hasFour(i)) {
				System.out.print(i + " ");
				count++;
			}

		}
		System.out.print("總共會有" + count + "個樂透數字");
	}

	public static boolean hasFour(int num) {

		while (num > 0) {
			if (num % 10 == 4) {
				return true;
			} else {
				num = num / 10;
			}

		}
		return false;
	}
}
