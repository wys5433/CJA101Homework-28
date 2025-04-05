package hw3;

import java.util.Scanner;

//阿文很喜歡簽大樂透(1~49),但他是個善變的人,上次討厭數字是4,但這次他想要依心情決定討
//厭哪個數字,請您設計一隻程式,讓阿文可以輸入他不想要的數字(1~9),畫面會顯示他可以選擇
//的號碼與總數,如圖:
//
//(提示:Scanner)
//(進階挑戰:輸入不要的數字後,直接亂數印出6個號碼且不得重複)
public class Q3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int bad_number;
		while (true) {
			System.out.println("Please enter a number you don't like: ");
			if (!sc.hasNextInt()) {
				sc.next();
				System.out.println("Please enter a number");// 輸入數字以外的字母就會繼續跑這個while loop
				continue;//continue就是跳回去一開始while loop的頭，讓他再輸入一次正確的數字
			}
			bad_number = sc.nextInt();// 確定輸入的是數字
			if (bad_number < 1 || bad_number > 9) {
				System.out.println("Please enter a number between 1~9: ");
				continue;
			}
			break;
		}
		int count = 0;
		for (int i = 1; i <= 49; i++) {
			if (hasBadNumber(i, bad_number)) {
				continue;
			}
			System.out.print(i + " ");
			count++; //在算總共會有幾個數字可以用

		}
		System.out.print("總共會有" + count + "個樂透數字");
		sc.close();
	}

	public static boolean hasBadNumber(int num, int bad_number) {

		while (num > 0) {
			if (num % 10 == bad_number) {
				return true;//看個位數
			} else {
				num = num / 10;
				//看十位數
			}

		}
		return false;
	}

}